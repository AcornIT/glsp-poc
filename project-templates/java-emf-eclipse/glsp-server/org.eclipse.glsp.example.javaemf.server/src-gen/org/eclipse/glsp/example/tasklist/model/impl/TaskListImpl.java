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
package org.eclipse.glsp.example.tasklist.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.glsp.example.tasklist.model.Decision;
import org.eclipse.glsp.example.tasklist.model.ModelPackage;
import org.eclipse.glsp.example.tasklist.model.Task;
import org.eclipse.glsp.example.tasklist.model.TaskList;
import org.eclipse.glsp.example.tasklist.model.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl#getTasks <em>Tasks</em>}</li>
 * <li>{@link org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskListImpl extends IdentifiableImpl implements TaskList {
   /**
    * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getTasks()
    * @generated
    * @ordered
    */
   protected EList<Task> tasks;
   /**
    * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getTransitions()
    * @generated
    * @ordered
    */
   protected EList<Transition> transitions;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */

   protected EList<Decision> decisions;

   protected TaskListImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ModelPackage.Literals.TASK_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public EList<Task> getTasks() {
      if (tasks == null) {
         tasks = new EObjectContainmentEList<>(Task.class, this, ModelPackage.TASK_LIST__TASKS);
      }
      return tasks;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public EList<Transition> getTransitions() {
      if (transitions == null) {
         transitions = new EObjectContainmentEList<>(Transition.class, this,
            ModelPackage.TASK_LIST__TRANSITIONS);
      }
      return transitions;
   }

   @Override
   public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
      final NotificationChain msgs) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
         case ModelPackage.TASK_LIST__TRANSITIONS:
            return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
         case ModelPackage.TASK_LIST_DECISIONS:
            return ((InternalEList<?>) getDecisions()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            return getTasks();
         case ModelPackage.TASK_LIST__TRANSITIONS:
            return getTransitions();
         case ModelPackage.TASK_LIST_DECISIONS:
            return getDecisions();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(final int featureID, final Object newValue) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            getTasks().clear();
            getTasks().addAll((Collection<? extends Task>) newValue);
            return;
         case ModelPackage.TASK_LIST__TRANSITIONS:
            getTransitions().clear();
            getTransitions().addAll((Collection<? extends Transition>) newValue);
            return;
         case ModelPackage.TASK_LIST_DECISIONS:
            getDecisions().clear();
            getDecisions().addAll((Collection<? extends Decision>) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void eUnset(final int featureID) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            getTasks().clear();
            return;
         case ModelPackage.TASK_LIST__TRANSITIONS:
            getTransitions().clear();
            return;
         case ModelPackage.TASK_LIST_DECISIONS:
            getDecisions().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public boolean eIsSet(final int featureID) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            return tasks != null && !tasks.isEmpty();
         case ModelPackage.TASK_LIST__TRANSITIONS:
            return transitions != null && !transitions.isEmpty();
         case ModelPackage.TASK_LIST_DECISIONS:
            return decisions != null && !decisions.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   @Override
   public EList<Decision> getDecisions() {
      if (decisions == null) {
         decisions = new EObjectContainmentEList<>(Decision.class, this, ModelPackage.TASK_LIST_DECISIONS);
      }
      return decisions;
   }

} // TaskListImpl
