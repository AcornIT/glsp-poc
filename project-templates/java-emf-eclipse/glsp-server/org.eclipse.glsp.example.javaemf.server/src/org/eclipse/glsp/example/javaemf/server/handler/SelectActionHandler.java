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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.glsp.example.tasklist.model.Task;
import org.eclipse.glsp.example.tasklist.model.TaskList;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.server.actions.AbstractActionHandler;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.actions.SelectAction;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;

import com.google.inject.Inject;

public class SelectActionHandler extends AbstractActionHandler<SelectAction> {

   @Inject
   protected EMFNotationModelState modelState;

   @Override
   protected List<Action> executeAction(final SelectAction actualAction) {
      GModelElement source = (GModelElement) modelState.getIndex().getAll(actualAction.getSelectedElementsIDs());
      TaskList taskList = modelState.getSemanticModel(TaskList.class).orElseThrow();
      Task task = (Task) taskList.findById(source.getId());
      System.out.println(task);
      List<Action> list = new ArrayList<>();
      list.add(actualAction);

      return list;
   }

}
