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
import org.eclipse.glsp.example.tasklist.model.Compartment;
import org.eclipse.glsp.example.tasklist.model.Decision;
import org.eclipse.glsp.example.tasklist.model.ModelPackage;
import org.eclipse.glsp.example.tasklist.model.Task;
import org.eclipse.glsp.example.tasklist.model.TaskList;
import org.eclipse.glsp.example.tasklist.model.Transition;
import org.eclipse.glsp.example.tasklist.model.TransitionDecision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl#getTransitionsDecisions <em>Transitions Decisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskListImpl extends IdentifiableImpl implements TaskList {
   /**
    * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTasks()
    * @generated
    * @ordered
    */
   protected EList<Task> tasks;
   /**
    * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTransitions()
    * @generated
    * @ordered
    */
   protected EList<Transition> transitions;

   /**
    * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getContainers()
    * @generated
    * @ordered
    */
   protected EList<Compartment> containers;

   /**
    * The cached value of the '{@link #getDecisions() <em>Decisions</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDecisions()
    * @generated
    * @ordered
    */
   protected EList<Decision> decisions;

   /**
    * The cached value of the '{@link #getTransitionsDecisions() <em>Transitions Decisions</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTransitionsDecisions()
    * @generated
    * @ordered
    */
   protected EList<TransitionDecision> transitionsDecisions;

   protected TaskListImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return ModelPackage.Literals.TASK_LIST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<Task> getTasks() {
      if (tasks == null) {
         tasks = new EObjectContainmentEList<Task>(Task.class, this, ModelPackage.TASK_LIST__TASKS);
      }
      return tasks;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<Transition> getTransitions() {
      if (transitions == null) {
         transitions = new EObjectContainmentEList<Transition>(Transition.class, this, ModelPackage.TASK_LIST__TRANSITIONS);
      }
      return transitions;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<Compartment> getContainers() {
      if (containers == null) {
         containers = new EObjectContainmentEList<Compartment>(Compartment.class, this, ModelPackage.TASK_LIST__CONTAINERS);
      }
      return containers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<Decision> getDecisions() {
      if (decisions == null) {
         decisions = new EObjectContainmentEList<Decision>(Decision.class, this, ModelPackage.TASK_LIST__DECISIONS);
      }
      return decisions;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<TransitionDecision> getTransitionsDecisions() {
      if (transitionsDecisions == null) {
         transitionsDecisions = new EObjectContainmentEList<TransitionDecision>(TransitionDecision.class, this, ModelPackage.TASK_LIST__TRANSITIONS_DECISIONS);
      }
      return transitionsDecisions;
   }

   @Override
   public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
      final NotificationChain msgs) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
         case ModelPackage.TASK_LIST__TRANSITIONS:
            return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            return getTasks();
         case ModelPackage.TASK_LIST__TRANSITIONS:
            return getTransitions();
         case ModelPackage.TASK_LIST__CONTAINERS:
            return getContainers();
         case ModelPackage.TASK_LIST__DECISIONS:
            return getDecisions();
         case ModelPackage.TASK_LIST__TRANSITIONS_DECISIONS:
            return getTransitionsDecisions();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            getTasks().clear();
            getTasks().addAll((Collection<? extends Task>)newValue);
            return;
         case ModelPackage.TASK_LIST__TRANSITIONS:
            getTransitions().clear();
            getTransitions().addAll((Collection<? extends Transition>)newValue);
            return;
         case ModelPackage.TASK_LIST__CONTAINERS:
            getContainers().clear();
            getContainers().addAll((Collection<? extends Compartment>)newValue);
            return;
         case ModelPackage.TASK_LIST__DECISIONS:
            getDecisions().clear();
            getDecisions().addAll((Collection<? extends Decision>)newValue);
            return;
         case ModelPackage.TASK_LIST__TRANSITIONS_DECISIONS:
            getTransitionsDecisions().clear();
            getTransitionsDecisions().addAll((Collection<? extends TransitionDecision>)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            getTasks().clear();
            return;
         case ModelPackage.TASK_LIST__TRANSITIONS:
            getTransitions().clear();
            return;
         case ModelPackage.TASK_LIST__CONTAINERS:
            getContainers().clear();
            return;
         case ModelPackage.TASK_LIST__DECISIONS:
            getDecisions().clear();
            return;
         case ModelPackage.TASK_LIST__TRANSITIONS_DECISIONS:
            getTransitionsDecisions().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case ModelPackage.TASK_LIST__TASKS:
            return tasks != null && !tasks.isEmpty();
         case ModelPackage.TASK_LIST__TRANSITIONS:
            return transitions != null && !transitions.isEmpty();
         case ModelPackage.TASK_LIST__CONTAINERS:
            return containers != null && !containers.isEmpty();
         case ModelPackage.TASK_LIST__DECISIONS:
            return decisions != null && !decisions.isEmpty();
         case ModelPackage.TASK_LIST__TRANSITIONS_DECISIONS:
            return transitionsDecisions != null && !transitionsDecisions.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // TaskListImpl
