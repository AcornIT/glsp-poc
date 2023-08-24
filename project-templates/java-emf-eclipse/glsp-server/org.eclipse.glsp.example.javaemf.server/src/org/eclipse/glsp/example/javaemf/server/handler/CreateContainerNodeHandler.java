/********************************************************************************
 * Copyright (c) 2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
package org.eclipse.glsp.example.javaemf.server.handler;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.example.javaemf.server.TaskListModelTypes;
import org.eclipse.glsp.example.tasklist.model.Compartment;
import org.eclipse.glsp.example.tasklist.model.ModelFactory;
import org.eclipse.glsp.example.tasklist.model.ModelPackage;
import org.eclipse.glsp.example.tasklist.model.Task;
import org.eclipse.glsp.example.tasklist.model.TaskList;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.graph.util.GraphUtil;
import org.eclipse.glsp.server.emf.AbstractEMFCreateNodeOperationHandler;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.NotationFactory;
import org.eclipse.glsp.server.emf.model.notation.NotationPackage;
import org.eclipse.glsp.server.emf.model.notation.SemanticElementReference;
import org.eclipse.glsp.server.emf.model.notation.Shape;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.CreateNodeOperation;

import com.google.inject.Inject;

public class CreateContainerNodeHandler extends AbstractEMFCreateNodeOperationHandler {

   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreateContainerNodeHandler() {
      super(TaskListModelTypes.COMPARTMENT);
   }

   @Override
   public Optional<Command> createCommand(final CreateNodeOperation operation) {
      GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
      Optional<GPoint> absoluteLocation = getLocation(operation);
      Optional<GPoint> relativeLocation = getRelativeLocation(operation, absoluteLocation, container);
      return Optional.of(createContainerAndShape(relativeLocation));
   }

   @Override
   public String getLabel() { return "Compartment"; }

   protected Command createContainerAndShape(final Optional<GPoint> relativeLocation) {
      TaskList taskList = modelState.getSemanticModel(TaskList.class).orElseThrow();
      Task task = modelState.getSemanticModel(Task.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      Compartment container = createCompartment();
      Command containerCommand = AddCommand.create(editingDomain, taskList,
         ModelPackage.Literals.TASK_LIST__CONTAINERS, container);

      Shape shape = createShape(idGenerator.getOrCreateId(container), relativeLocation);
      Command shapeCommand = AddCommand.create(editingDomain, diagram,
         NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);

      CompoundCommand compoundCommand = new CompoundCommand();
      compoundCommand.append(containerCommand);
      compoundCommand.append(shapeCommand);

      return compoundCommand;
   }

   protected Compartment createCompartment() {
      Compartment newCompartment = ModelFactory.eINSTANCE.createCompartment();
      newCompartment.setId(UUID.randomUUID().toString());
      setInitialName(newCompartment);
      return newCompartment;
   }

   protected void setInitialName(final Compartment container) {
      Function<Integer, String> nameProvider = i -> container.eClass().getName() + " " + i;
      int nodeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GCOMPARTMENT, nameProvider);
      container.setName(nameProvider.apply(nodeCounter));
   }

   protected Shape createShape(final String elementId, final Optional<GPoint> relativeLocation) {
      Shape newContainer = NotationFactory.eINSTANCE.createShape();
      newContainer.setPosition(relativeLocation.orElse(GraphUtil.point(0, 0)));
      newContainer.setSize(GraphUtil.dimension(70, 10));
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newContainer.setSemanticElement(reference);
      return newContainer;

   }

}
