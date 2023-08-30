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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.glsp.example.tasklist.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "model";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://www.eclipse.org/glsp/examples/tasklist";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "example-model";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */

   ModelPackage eINSTANCE = org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl.init();

   /**
    * The meta object id for the '{@link org.eclipse.glsp.example.tasklist.model.impl.IdentifiableImpl <em>Identifiable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.glsp.example.tasklist.model.impl.IdentifiableImpl
    * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getIdentifiable()
    * @generated
    */
   int IDENTIFIABLE = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIABLE__ID = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIABLE__NAME = 1;

   /**
    * The number of structural features of the '<em>Identifiable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIABLE_FEATURE_COUNT = 2;

   /**
    * The number of operations of the '<em>Identifiable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIABLE_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl <em>Task List</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl
    * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getTaskList()
    * @generated
    */
   int TASK_LIST = 1;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST__ID = IDENTIFIABLE__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST__NAME = IDENTIFIABLE__NAME;

   /**
    * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST__TASKS = IDENTIFIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST__TRANSITIONS = IDENTIFIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Containers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST__CONTAINERS = IDENTIFIABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST__DECISIONS = IDENTIFIABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Join Nodes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST__JOIN_NODES = IDENTIFIABLE_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>Task List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */

   int TASK_LIST_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

   /**
    * The operation id for the '<em>Find By Id</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST___FIND_BY_ID__STRING = IDENTIFIABLE_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Get All</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST___GET_ALL = IDENTIFIABLE_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>Task List</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_LIST_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.eclipse.glsp.example.tasklist.model.impl.ConnectableImpl <em>Connectable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.glsp.example.tasklist.model.impl.ConnectableImpl
    * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getConnectable()
    * @generated
    */
   int CONNECTABLE = 6;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONNECTABLE__ID = IDENTIFIABLE__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONNECTABLE__NAME = IDENTIFIABLE__NAME;

   /**
    * The number of structural features of the '<em>Connectable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONNECTABLE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

   /**
    * The number of operations of the '<em>Connectable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONNECTABLE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.eclipse.glsp.example.tasklist.model.impl.TaskImpl <em>Task</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.glsp.example.tasklist.model.impl.TaskImpl
    * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getTask()
    * @generated
    */
   int TASK = 2;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK__ID = CONNECTABLE__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK__NAME = CONNECTABLE__NAME;

   /**
    * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK__COMPARTMENTS = CONNECTABLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Task</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_FEATURE_COUNT = CONNECTABLE_FEATURE_COUNT + 1;

   /**
    * The number of operations of the '<em>Task</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TASK_OPERATION_COUNT = CONNECTABLE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.eclipse.glsp.example.tasklist.model.impl.TransitionImpl <em>Transition</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.glsp.example.tasklist.model.impl.TransitionImpl
    * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getTransition()
    * @generated
    */
   int TRANSITION = 3;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TRANSITION__ID = IDENTIFIABLE__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TRANSITION__NAME = IDENTIFIABLE__NAME;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TRANSITION__SOURCE = IDENTIFIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TRANSITION__TARGET = IDENTIFIABLE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Transition</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TRANSITION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

   /**
    * The number of operations of the '<em>Transition</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TRANSITION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.eclipse.glsp.example.tasklist.model.impl.CompartmentImpl <em>Compartment</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.glsp.example.tasklist.model.impl.CompartmentImpl
    * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getCompartment()
    * @generated
    */
   int COMPARTMENT = 4;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARTMENT__ID = IDENTIFIABLE__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARTMENT__NAME = IDENTIFIABLE__NAME;

   /**
    * The number of structural features of the '<em>Compartment</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARTMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

   /**
    * The number of operations of the '<em>Compartment</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARTMENT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.eclipse.glsp.example.tasklist.model.impl.DecisionImpl <em>Decision</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.glsp.example.tasklist.model.impl.DecisionImpl
    * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getDecision()
    * @generated
    */
   int DECISION = 5;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION__ID = CONNECTABLE__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION__NAME = CONNECTABLE__NAME;

   /**
    * The number of structural features of the '<em>Decision</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_FEATURE_COUNT = CONNECTABLE_FEATURE_COUNT + 0;

   /**
    * The number of operations of the '<em>Decision</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DECISION_OPERATION_COUNT = CONNECTABLE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.eclipse.glsp.example.tasklist.model.impl.JoinNodeImpl <em>Join Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.glsp.example.tasklist.model.impl.JoinNodeImpl
    * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getJoinNode()
    * @generated
    */
   int JOIN_NODE = 7;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE__ID = CONNECTABLE__ID;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE__NAME = CONNECTABLE__NAME;

   /**
    * The number of structural features of the '<em>Join Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FEATURE_COUNT = CONNECTABLE_FEATURE_COUNT + 0;

   /**
    * The number of operations of the '<em>Join Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_OPERATION_COUNT = CONNECTABLE_OPERATION_COUNT + 0;

   /**
    * Returns the meta object for class '{@link org.eclipse.glsp.example.tasklist.model.Identifiable <em>Identifiable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Identifiable</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Identifiable
    * @generated
    */
   EClass getIdentifiable();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.glsp.example.tasklist.model.Identifiable#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Identifiable#getId()
    * @see #getIdentifiable()
    * @generated
    */
   EAttribute getIdentifiable_Id();

   /**
    * Returns the meta object for the attribute '{@link org.eclipse.glsp.example.tasklist.model.Identifiable#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Identifiable#getName()
    * @see #getIdentifiable()
    * @generated
    */
   EAttribute getIdentifiable_Name();

   /**
    * Returns the meta object for class '{@link org.eclipse.glsp.example.tasklist.model.TaskList <em>Task List</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Task List</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.TaskList
    * @generated
    */
   EClass getTaskList();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.example.tasklist.model.TaskList#getTasks <em>Tasks</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Tasks</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.TaskList#getTasks()
    * @see #getTaskList()
    * @generated
    */
   EReference getTaskList_Tasks();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.example.tasklist.model.TaskList#getTransitions <em>Transitions</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Transitions</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.TaskList#getTransitions()
    * @see #getTaskList()
    * @generated
    */
   EReference getTaskList_Transitions();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.example.tasklist.model.TaskList#getContainers <em>Containers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Containers</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.TaskList#getContainers()
    * @see #getTaskList()
    * @generated
    */
   EReference getTaskList_Containers();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.example.tasklist.model.TaskList#getDecisions <em>Decisions</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Decisions</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.TaskList#getDecisions()
    * @see #getTaskList()
    * @generated
    */
   EReference getTaskList_Decisions();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.example.tasklist.model.TaskList#getJoinNodes <em>Join Nodes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Join Nodes</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.TaskList#getJoinNodes()
    * @see #getTaskList()
    * @generated
    */
   EReference getTaskList_JoinNodes();

   /**
    * Returns the meta object for the '{@link org.eclipse.glsp.example.tasklist.model.TaskList#findById(java.lang.String) <em>Find By Id</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Find By Id</em>' operation.
    * @see org.eclipse.glsp.example.tasklist.model.TaskList#findById(java.lang.String)
    * @generated
    */
   EOperation getTaskList__FindById__String();

   /**
    * Returns the meta object for the '{@link org.eclipse.glsp.example.tasklist.model.TaskList#getAll() <em>Get All</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Get All</em>' operation.
    * @see org.eclipse.glsp.example.tasklist.model.TaskList#getAll()
    * @generated
    */
   EOperation getTaskList__GetAll();

   /**
    * Returns the meta object for class '{@link org.eclipse.glsp.example.tasklist.model.Task <em>Task</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Task</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Task
    * @generated
    */
   EClass getTask();

   /**
    * Returns the meta object for the containment reference list '{@link org.eclipse.glsp.example.tasklist.model.Task#getCompartments <em>Compartments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Compartments</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Task#getCompartments()
    * @see #getTask()
    * @generated
    */
   EReference getTask_Compartments();

   /**
    * Returns the meta object for class '{@link org.eclipse.glsp.example.tasklist.model.Transition <em>Transition</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Transition</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Transition
    * @generated
    */
   EClass getTransition();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.glsp.example.tasklist.model.Transition#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Source</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Transition#getSource()
    * @see #getTransition()
    * @generated
    */
   EReference getTransition_Source();

   /**
    * Returns the meta object for the reference '{@link org.eclipse.glsp.example.tasklist.model.Transition#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Target</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Transition#getTarget()
    * @see #getTransition()
    * @generated
    */
   EReference getTransition_Target();

   /**
    * Returns the meta object for class '{@link org.eclipse.glsp.example.tasklist.model.Compartment <em>Compartment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Compartment</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Compartment
    * @generated
    */
   EClass getCompartment();

   /**
    * Returns the meta object for class '{@link org.eclipse.glsp.example.tasklist.model.Decision <em>Decision</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Decision</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Decision
    * @generated
    */
   EClass getDecision();

   /**
    * Returns the meta object for class '{@link org.eclipse.glsp.example.tasklist.model.Connectable <em>Connectable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Connectable</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.Connectable
    * @generated
    */
   EClass getConnectable();

   /**
    * Returns the meta object for class '{@link org.eclipse.glsp.example.tasklist.model.JoinNode <em>Join Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Join Node</em>'.
    * @see org.eclipse.glsp.example.tasklist.model.JoinNode
    * @generated
    */
   EClass getJoinNode();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ModelFactory getModelFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each operation of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link org.eclipse.glsp.example.tasklist.model.impl.IdentifiableImpl <em>Identifiable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.eclipse.glsp.example.tasklist.model.impl.IdentifiableImpl
       * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getIdentifiable()
       * @generated
       */
      EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute IDENTIFIABLE__NAME = eINSTANCE.getIdentifiable_Name();

      /**
       * The meta object literal for the '{@link org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl <em>Task List</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.eclipse.glsp.example.tasklist.model.impl.TaskListImpl
       * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getTaskList()
       * @generated
       */
      EClass TASK_LIST = eINSTANCE.getTaskList();

      /**
       * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TASK_LIST__TASKS = eINSTANCE.getTaskList_Tasks();

      /**
       * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TASK_LIST__TRANSITIONS = eINSTANCE.getTaskList_Transitions();

      /**
       * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TASK_LIST__CONTAINERS = eINSTANCE.getTaskList_Containers();

      /**
       * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TASK_LIST__DECISIONS = eINSTANCE.getTaskList_Decisions();

      /**
       * The meta object literal for the '<em><b>Join Nodes</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TASK_LIST__JOIN_NODES = eINSTANCE.getTaskList_JoinNodes();

      /**
       * The meta object literal for the '<em><b>Find By Id</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation TASK_LIST___FIND_BY_ID__STRING = eINSTANCE.getTaskList__FindById__String();

      /**
       * The meta object literal for the '<em><b>Get All</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation TASK_LIST___GET_ALL = eINSTANCE.getTaskList__GetAll();

      /**
       * The meta object literal for the '{@link org.eclipse.glsp.example.tasklist.model.impl.TaskImpl <em>Task</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.eclipse.glsp.example.tasklist.model.impl.TaskImpl
       * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getTask()
       * @generated
       */
      EClass TASK = eINSTANCE.getTask();

      /**
       * The meta object literal for the '<em><b>Compartments</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TASK__COMPARTMENTS = eINSTANCE.getTask_Compartments();

      /**
       * The meta object literal for the '{@link org.eclipse.glsp.example.tasklist.model.impl.TransitionImpl <em>Transition</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.eclipse.glsp.example.tasklist.model.impl.TransitionImpl
       * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getTransition()
       * @generated
       */
      EClass TRANSITION = eINSTANCE.getTransition();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

      /**
       * The meta object literal for the '{@link org.eclipse.glsp.example.tasklist.model.impl.CompartmentImpl <em>Compartment</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.eclipse.glsp.example.tasklist.model.impl.CompartmentImpl
       * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getCompartment()
       * @generated
       */
      EClass COMPARTMENT = eINSTANCE.getCompartment();

      /**
       * The meta object literal for the '{@link org.eclipse.glsp.example.tasklist.model.impl.DecisionImpl <em>Decision</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.eclipse.glsp.example.tasklist.model.impl.DecisionImpl
       * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getDecision()
       * @generated
       */
      EClass DECISION = eINSTANCE.getDecision();

      /**
       * The meta object literal for the '{@link org.eclipse.glsp.example.tasklist.model.impl.ConnectableImpl <em>Connectable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.eclipse.glsp.example.tasklist.model.impl.ConnectableImpl
       * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getConnectable()
       * @generated
       */
      EClass CONNECTABLE = eINSTANCE.getConnectable();

      /**
       * The meta object literal for the '{@link org.eclipse.glsp.example.tasklist.model.impl.JoinNodeImpl <em>Join Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.eclipse.glsp.example.tasklist.model.impl.JoinNodeImpl
       * @see org.eclipse.glsp.example.tasklist.model.impl.ModelPackageImpl#getJoinNode()
       * @generated
       */
      EClass JOIN_NODE = eINSTANCE.getJoinNode();

   }

} // ModelPackage
