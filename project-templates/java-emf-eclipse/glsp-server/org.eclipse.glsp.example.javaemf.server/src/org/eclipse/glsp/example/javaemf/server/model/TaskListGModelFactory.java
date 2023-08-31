/********************************************************************************
 * Copyright (c) 2022 EclipseSource and others.
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
package org.eclipse.glsp.example.javaemf.server.model;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.example.javaemf.server.TaskListModelTypes;
import org.eclipse.glsp.example.tasklist.model.Compartment;
import org.eclipse.glsp.example.tasklist.model.Decision;
import org.eclipse.glsp.example.tasklist.model.JoinNode;
import org.eclipse.glsp.example.tasklist.model.Task;
import org.eclipse.glsp.example.tasklist.model.TaskList;
import org.eclipse.glsp.example.tasklist.model.Transition;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GCompartment;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GCompartmentBuilder;
import org.eclipse.glsp.graph.builder.impl.GEdgeBuilder;
import org.eclipse.glsp.graph.builder.impl.GEdgePlacementBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.graph.util.GraphUtil;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.notation.EMFNotationGModelFactory;

public class TaskListGModelFactory extends EMFNotationGModelFactory {

   @Override
   protected void fillRootElement(final EObject semanticModel, final Diagram notationModel, final GModelRoot newRoot) {
      TaskList taskList = TaskList.class.cast(semanticModel);
      GGraph graph = GGraph.class.cast(newRoot);
      if (notationModel.getSemanticElement() != null
         && notationModel.getSemanticElement().getResolvedSemanticElement() != null) {
         taskList.getTasks().stream()
            .map(this::createTaskNode)
            .forEachOrdered(graph.getChildren()::add);
         taskList.getTransitions().stream()
            .map(this::createTransitionEdge)
            .forEachOrdered(graph.getChildren()::add);
         taskList.getContainers().stream()
            .map(this::createCompartment)
            .forEachOrdered(graph.getChildren()::add);
         taskList.getDecisions().stream()
            .map(this::createTaskNodeDecision)
            .forEachOrdered(graph.getChildren()::add);
         taskList.getJoinNodes().stream()
            .map(this::createJoinNode)
            .forEachOrdered(graph.getChildren()::add);
      }
   }

   protected GNode createTaskNode(final Task task) {
      GNodeBuilder taskNodeBuilder = new GNodeBuilder(TaskListModelTypes.TASK)
         .id(idGenerator.getOrCreateId(task))
         .addCssClass("tasklist-node")
         /*
          * .add(new GCompartmentBuilder(TaskListModelTypes.TASK)
          * .addCssClass("container")
          * .add(new GLabelBuilder()
          * .text("Compartment")
          * .edgePlacement(new GEdgePlacementBuilder()
          * .side(GConstants.EdgeSide.BOTTOM)
          * .build())
          * .build())
          * .build())
          */
         .add(new GLabelBuilder(DefaultTypes.LABEL).text(task.getName()).id(task.getId() + "_label").build())
         .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5))
         .layoutOptions(new GLayoutOptions().vAlign(GConstants.VAlign.TOP));

      applyShapeData(task, taskNodeBuilder);
      return taskNodeBuilder.build();
   }

   protected GEdge createTransitionEdge(final Transition transition) {
      GEdgeBuilder transitionEdgeBuilder = new GEdgeBuilder(TaskListModelTypes.TRANSITION)
         .id(idGenerator.getOrCreateId(transition))
         .addCssClass("tasklist-edge")
         .sourceId(transition.getSource().getId())
         .targetId(transition.getTarget().getId());
      applyEdgeData(transition, transitionEdgeBuilder);
      return transitionEdgeBuilder.build();
   }

   protected GNode createTaskNodeDecision(final Decision decision) {
      GNodeBuilder taskNodeBuilder = new GNodeBuilder(TaskListModelTypes.DIAMOND)
         .id(idGenerator.getOrCreateId(decision))
         .addCssClass("decision-node")
         .size(GraphUtil.dimension(60, 60))
         .add(new GLabelBuilder(DefaultTypes.LABEL)
            .text(decision.getName())
            .id(decision.getId() + "_label").build())
         .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_TOP, 5));
      applyShapeData(decision, taskNodeBuilder);
      return taskNodeBuilder.build();
   }

   protected GCompartment createCompartment(final Compartment task) {
      GCompartmentBuilder buildComp = new GCompartmentBuilder(TaskListModelTypes.COMPARTMENT)
         .id(idGenerator.getOrCreateId(task))
         .layout(GConstants.Layout.FREEFORM)
         .type(DefaultTypes.NODE)
         .addCssClass("container")
         .add(
            new GLabelBuilder(DefaultTypes.LABEL)
               .text(task.getName())
               .id(task.getId() + "_label")
               .edgePlacement(new GEdgePlacementBuilder()
                  .side(GConstants.EdgeSide.TOP)
                  .position(0.5)
                  .build())
               .build());
      return buildComp.build();
   }

   protected GNode createJoinNode(final JoinNode node) {
      GNodeBuilder joinBuilder = new GNodeBuilder(TaskListModelTypes.RECTANGLE)
         .id(idGenerator.getOrCreateId(node))
         .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_TOP, 5))
         .addCssClass("join");

      applyShapeData(node, joinBuilder);
      return joinBuilder.build();
   }
}
