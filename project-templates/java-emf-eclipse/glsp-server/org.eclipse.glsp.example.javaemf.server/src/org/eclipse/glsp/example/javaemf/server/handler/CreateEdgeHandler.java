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
import org.eclipse.glsp.example.tasklist.model.Decision;
import org.eclipse.glsp.example.tasklist.model.ModelFactory;
import org.eclipse.glsp.example.tasklist.model.ModelPackage;
import org.eclipse.glsp.example.tasklist.model.Task;
import org.eclipse.glsp.example.tasklist.model.TaskList;
import org.eclipse.glsp.example.tasklist.model.Transition;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.emf.AbstractEMFCreateEdgeOperationHandler;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.Edge;
import org.eclipse.glsp.server.emf.model.notation.NotationFactory;
import org.eclipse.glsp.server.emf.model.notation.NotationPackage;
import org.eclipse.glsp.server.emf.model.notation.SemanticElementReference;
import org.eclipse.glsp.server.emf.model.notation.Shape;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.CreateEdgeOperation;

import com.google.inject.Inject;

public class CreateEdgeHandler extends AbstractEMFCreateEdgeOperationHandler {

   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreateEdgeHandler() {
      super(TaskListModelTypes.TRANSITION);
   }

   @Override
   public Optional<Command> createCommand(final CreateEdgeOperation operation) {
      GModelElement source = modelState.getIndex().get(operation.getSourceElementId()).orElseThrow();
      GModelElement target = modelState.getIndex().get(operation.getTargetElementId()).orElseThrow();

      if (source.getType().equals("node") && target.getType().equals("node")) {
         return Optional.of(createTaskAndEdge(source, target));
      } else if (source.getType().equals("node") && target.getType().equals("node:diamond")) {
         return Optional.of(createTaskAndEdgeDecision(source, target));
      } else if (source.getType().equals("node:diamond") && target.getType().equals("node")) {
         return Optional.of(createEdgeDecision(source, target));
      } else {
         return Optional.empty();
      }
   }

   @Override
   public String getLabel() { return "Transition"; }

   public Command createTaskAndEdge(final GModelElement source, final GModelElement target) {
      TaskList taskList = modelState.getSemanticModel(TaskList.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      Task sourceTask = taskList.getTasks().stream().filter(t -> t.getId().equals(source.getId())).findAny()
         .orElseThrow();
      Task targetTask = taskList.getTasks().stream().filter(t -> t.getId().equals(target.getId())).findAny()
         .orElseThrow();

      Transition newTransition = createTransition(sourceTask, targetTask);

      Command transitionCommand = AddCommand.create(editingDomain, taskList,
         ModelPackage.Literals.TASK_LIST__TRANSITIONS, newTransition);

      Shape sourceShape = (Shape) diagram.getElements().stream()
         .filter(ne -> ne.getSemanticElement().getElementId().equals(source.getId())).findAny().orElseThrow();
      Shape targetShape = (Shape) diagram.getElements().stream()
         .filter(ne -> ne.getSemanticElement().getElementId().equals(target.getId())).findAny().orElseThrow();

      Edge edge = createEdge(idGenerator.getOrCreateId(newTransition), sourceShape, targetShape);
      Command edgeCommand = AddCommand.create(editingDomain, diagram,
         NotationPackage.Literals.DIAGRAM__ELEMENTS, edge);

      CompoundCommand compoundCommand = new CompoundCommand();
      compoundCommand.append(transitionCommand);
      compoundCommand.append(edgeCommand);
      return compoundCommand;
   }

   protected Transition createTransition(final Task source, final Task target) {
      Transition newTransition = ModelFactory.eINSTANCE.createTransition();
      newTransition.setId(UUID.randomUUID().toString());
      newTransition.setSource(source);
      newTransition.setTarget(target);
      setInitialName(newTransition);
      return newTransition;
   }

   protected void setInitialName(final Transition transition) {
      Function<Integer, String> nameProvider = i -> transition.eClass().getName() + " " + i;
      int edgeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GEDGE, nameProvider);
      transition.setName(nameProvider.apply(edgeCounter));
   }

   // Decision
   public Command createTaskAndEdgeDecision(final GModelElement source, final GModelElement target) {
      TaskList taskList = modelState.getSemanticModel(TaskList.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      Task sourceTask = taskList.getTasks().stream().filter(t -> t.getId().equals(source.getId())).findAny()
         .orElseThrow();
      Decision targetDecision = taskList.getDecisions().stream().filter(t -> t.getId().equals(target.getId())).findAny()
         .orElseThrow();

      Transition newTransition = createTransition(sourceTask, targetDecision);
      Command transitionCommand = AddCommand.create(editingDomain, taskList,
         ModelPackage.Literals.TASK_LIST__TRANSITIONS, newTransition);

      Shape sourceShape = (Shape) diagram.getElements().stream()
         .filter(ne -> ne.getSemanticElement().getElementId().equals(source.getId())).findAny().orElseThrow();
      Shape targetShape = (Shape) diagram.getElements().stream()
         .filter(ne -> ne.getSemanticElement().getElementId().equals(target.getId())).findAny().orElseThrow();

      Edge edge = createEdge(idGenerator.getOrCreateId(newTransition), sourceShape, targetShape);
      Command edgeCommand = AddCommand.create(editingDomain, diagram,
         NotationPackage.Literals.DIAGRAM__ELEMENTS, edge);

      CompoundCommand compoundCommand = new CompoundCommand();
      compoundCommand.append(transitionCommand);
      compoundCommand.append(edgeCommand);
      return compoundCommand;
   }

   public Command createEdgeDecision(final GModelElement source, final GModelElement target) {
      TaskList taskList = modelState.getSemanticModel(TaskList.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      Decision sourceDecision = taskList.getDecisions().stream().filter(t -> t.getId().equals(source.getId())).findAny()
         .orElseThrow();
      Task targetTask = taskList.getTasks().stream().filter(t -> t.getId().equals(target.getId())).findAny()
         .orElseThrow();

      Transition newTransition = createTransition(sourceDecision, targetTask);
      Command transitionCommand = AddCommand.create(editingDomain, taskList,
         ModelPackage.Literals.TASK_LIST__TRANSITIONS, newTransition);

      Shape sourceShape = (Shape) diagram.getElements().stream()
         .filter(ne -> ne.getSemanticElement().getElementId().equals(source.getId())).findAny().orElseThrow();
      Shape targetShape = (Shape) diagram.getElements().stream()
         .filter(ne -> ne.getSemanticElement().getElementId().equals(target.getId())).findAny().orElseThrow();

      Edge edge = createEdge(idGenerator.getOrCreateId(newTransition), sourceShape, targetShape);
      Command edgeCommand = AddCommand.create(editingDomain, diagram,
         NotationPackage.Literals.DIAGRAM__ELEMENTS, edge);

      CompoundCommand compoundCommand = new CompoundCommand();
      compoundCommand.append(transitionCommand);
      compoundCommand.append(edgeCommand);
      return compoundCommand;
   }

   protected Edge createEdge(final String elementId, final Shape source, final Shape target) {
      Edge newTransition = NotationFactory.eINSTANCE.createEdge();
      newTransition.setSource(source);
      newTransition.setTarget(target);
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newTransition.setSemanticElement(reference);
      return newTransition;
   }

}
