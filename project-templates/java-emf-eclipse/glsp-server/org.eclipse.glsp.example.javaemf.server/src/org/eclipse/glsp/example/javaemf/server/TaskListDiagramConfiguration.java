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
package org.eclipse.glsp.example.javaemf.server;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.glsp.server.diagram.BaseDiagramConfiguration;
import org.eclipse.glsp.server.layout.ServerLayoutKind;
import org.eclipse.glsp.server.types.EdgeTypeHint;
import org.eclipse.glsp.server.types.ShapeTypeHint;

public class TaskListDiagramConfiguration extends BaseDiagramConfiguration {

   @Override
   public List<ShapeTypeHint> getShapeTypeHints() {
      // tasks can be moved, deleted and resized
      List<ShapeTypeHint> nodeHints = new ArrayList<>();
      nodeHints.add(new ShapeTypeHint(TaskListModelTypes.TASK, true, true, true, false));
      nodeHints.add(new ShapeTypeHint(TaskListModelTypes.DIAMOND, true, true, true, false));
      nodeHints.add(new ShapeTypeHint(TaskListModelTypes.COMPARTMENT, true, true, true, true));
      nodeHints.add(new ShapeTypeHint(TaskListModelTypes.RECTANGLE, true, true, true, false));
      return nodeHints;
   }

   @Override
   public List<EdgeTypeHint> getEdgeTypeHints() {
      List<EdgeTypeHint> edgeHints = new ArrayList<>();
      edgeHints.add(new EdgeTypeHint(TaskListModelTypes.TRANSITION, false, true, true,
         List.of(TaskListModelTypes.TASK, TaskListModelTypes.DIAMOND, TaskListModelTypes.RECTANGLE),
         List.of(TaskListModelTypes.TASK, TaskListModelTypes.DIAMOND, TaskListModelTypes.RECTANGLE)));
      return edgeHints;
   }

   @Override
   public ServerLayoutKind getLayoutKind() { return ServerLayoutKind.AUTOMATIC; }

}
