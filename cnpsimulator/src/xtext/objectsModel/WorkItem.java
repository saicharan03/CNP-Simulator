/**
 */
package xtext.objectsModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xtext.objectsModel.WorkItem#getName <em>Name</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getId <em>Id</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getDescription <em>Description</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getType <em>Type</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#isHasPredecessors <em>Has Predecessors</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getPdTasks <em>Pd Tasks</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getScTasks <em>Sc Tasks</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#isIsAggregationNode <em>Is Aggregation Node</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getSbTasks <em>Sb Tasks</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getUpTasks <em>Up Tasks</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#isHasImpacts <em>Has Impacts</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getRequiredAnalysis <em>Required Analysis</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getValue <em>Value</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link xtext.objectsModel.WorkItem#getDueDate <em>Due Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem()
 * @model
 * @generated
 */
public interface WorkItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(WorkItemType)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_Type()
   * @model
   * @generated
   */
  WorkItemType getType();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(WorkItemType value);

  /**
   * Returns the value of the '<em><b>Has Predecessors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Predecessors</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Predecessors</em>' attribute.
   * @see #setHasPredecessors(boolean)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_HasPredecessors()
   * @model
   * @generated
   */
  boolean isHasPredecessors();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#isHasPredecessors <em>Has Predecessors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Predecessors</em>' attribute.
   * @see #isHasPredecessors()
   * @generated
   */
  void setHasPredecessors(boolean value);

  /**
   * Returns the value of the '<em><b>Pd Tasks</b></em>' reference list.
   * The list contents are of type {@link xtext.objectsModel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pd Tasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pd Tasks</em>' reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_PdTasks()
   * @model
   * @generated
   */
  EList<WorkItem> getPdTasks();

  /**
   * Returns the value of the '<em><b>Sc Tasks</b></em>' reference list.
   * The list contents are of type {@link xtext.objectsModel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sc Tasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sc Tasks</em>' reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_ScTasks()
   * @model
   * @generated
   */
  EList<WorkItem> getScTasks();

  /**
   * Returns the value of the '<em><b>Is Aggregation Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Aggregation Node</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Aggregation Node</em>' attribute.
   * @see #setIsAggregationNode(boolean)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_IsAggregationNode()
   * @model
   * @generated
   */
  boolean isIsAggregationNode();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#isIsAggregationNode <em>Is Aggregation Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Aggregation Node</em>' attribute.
   * @see #isIsAggregationNode()
   * @generated
   */
  void setIsAggregationNode(boolean value);

  /**
   * Returns the value of the '<em><b>Sb Tasks</b></em>' reference list.
   * The list contents are of type {@link xtext.objectsModel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sb Tasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sb Tasks</em>' reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_SbTasks()
   * @model
   * @generated
   */
  EList<WorkItem> getSbTasks();

  /**
   * Returns the value of the '<em><b>Up Tasks</b></em>' reference list.
   * The list contents are of type {@link xtext.objectsModel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Up Tasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Up Tasks</em>' reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_UpTasks()
   * @model
   * @generated
   */
  EList<WorkItem> getUpTasks();

  /**
   * Returns the value of the '<em><b>Has Impacts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Impacts</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Impacts</em>' attribute.
   * @see #setHasImpacts(boolean)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_HasImpacts()
   * @model
   * @generated
   */
  boolean isHasImpacts();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#isHasImpacts <em>Has Impacts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Impacts</em>' attribute.
   * @see #isHasImpacts()
   * @generated
   */
  void setHasImpacts(boolean value);

  /**
   * Returns the value of the '<em><b>Impacts</b></em>' containment reference list.
   * The list contents are of type {@link xtext.objectsModel.Impact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impacts</em>' containment reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_Impacts()
   * @model containment="true"
   * @generated
   */
  EList<Impact> getImpacts();

  /**
   * Returns the value of the '<em><b>Required Analysis</b></em>' reference list.
   * The list contents are of type {@link xtext.objectsModel.RequiredService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Analysis</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Analysis</em>' reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_RequiredAnalysis()
   * @model
   * @generated
   */
  EList<RequiredService> getRequiredAnalysis();

  /**
   * Returns the value of the '<em><b>Required Services</b></em>' reference list.
   * The list contents are of type {@link xtext.objectsModel.RequiredService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Services</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Services</em>' reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_RequiredServices()
   * @model
   * @generated
   */
  EList<RequiredService> getRequiredServices();

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(double)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_Value()
   * @model
   * @generated
   */
  double getValue();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(double value);

  /**
   * Returns the value of the '<em><b>Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrival Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrival Time</em>' attribute.
   * @see #setArrivalTime(int)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_ArrivalTime()
   * @model
   * @generated
   */
  int getArrivalTime();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#getArrivalTime <em>Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrival Time</em>' attribute.
   * @see #getArrivalTime()
   * @generated
   */
  void setArrivalTime(int value);

  /**
   * Returns the value of the '<em><b>Due Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Due Date</em>' attribute.
   * @see #setDueDate(int)
   * @see xtext.objectsModel.ObjectsModelPackage#getWorkItem_DueDate()
   * @model
   * @generated
   */
  int getDueDate();

  /**
   * Sets the value of the '{@link xtext.objectsModel.WorkItem#getDueDate <em>Due Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Due Date</em>' attribute.
   * @see #getDueDate()
   * @generated
   */
  void setDueDate(int value);

} // WorkItem
