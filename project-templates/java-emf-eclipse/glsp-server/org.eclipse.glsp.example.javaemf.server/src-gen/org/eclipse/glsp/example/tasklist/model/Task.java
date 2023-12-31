/**
 * Copyright (c) 2022 EclipseSource and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 */
package org.eclipse.glsp.example.tasklist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.Task#getCompartments <em>Compartments</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Connectable {

   /**
    * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.glsp.example.tasklist.model.Compartment}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Compartments</em>' containment reference list.
    * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getTask_Compartments()
    * @model containment="true"
    * @generated
    */
   EList<Compartment> getCompartments();
} // Task
