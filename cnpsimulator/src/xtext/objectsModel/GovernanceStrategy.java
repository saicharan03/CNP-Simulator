/**
 */
package xtext.objectsModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Governance Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xtext.objectsModel.GovernanceStrategy#getId <em>Id</em>}</li>
 *   <li>{@link xtext.objectsModel.GovernanceStrategy#getName <em>Name</em>}</li>
 *   <li>{@link xtext.objectsModel.GovernanceStrategy#getType <em>Type</em>}</li>
 *   <li>{@link xtext.objectsModel.GovernanceStrategy#getDescription <em>Description</em>}</li>
 *   <li>{@link xtext.objectsModel.GovernanceStrategy#getMechanisms <em>Mechanisms</em>}</li>
 * </ul>
 * </p>
 *
 * @see xtext.objectsModel.ObjectsModelPackage#getGovernanceStrategy()
 * @model
 * @generated
 */
public interface GovernanceStrategy extends EObject
{
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
   * @see xtext.objectsModel.ObjectsModelPackage#getGovernanceStrategy_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link xtext.objectsModel.GovernanceStrategy#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

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
   * @see xtext.objectsModel.ObjectsModelPackage#getGovernanceStrategy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.objectsModel.GovernanceStrategy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see xtext.objectsModel.ObjectsModelPackage#getGovernanceStrategy_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link xtext.objectsModel.GovernanceStrategy#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see xtext.objectsModel.ObjectsModelPackage#getGovernanceStrategy_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link xtext.objectsModel.GovernanceStrategy#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Mechanisms</b></em>' containment reference list.
   * The list contents are of type {@link xtext.objectsModel.Mechanism}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mechanisms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mechanisms</em>' containment reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getGovernanceStrategy_Mechanisms()
   * @model containment="true"
   * @generated
   */
  EList<Mechanism> getMechanisms();

} // GovernanceStrategy
