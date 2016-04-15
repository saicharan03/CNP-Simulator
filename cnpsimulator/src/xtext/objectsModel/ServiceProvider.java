/**
 */
package xtext.objectsModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xtext.objectsModel.ServiceProvider#getId <em>Id</em>}</li>
 *   <li>{@link xtext.objectsModel.ServiceProvider#getName <em>Name</em>}</li>
 *   <li>{@link xtext.objectsModel.ServiceProvider#getDescription <em>Description</em>}</li>
 *   <li>{@link xtext.objectsModel.ServiceProvider#getType <em>Type</em>}</li>
 *   <li>{@link xtext.objectsModel.ServiceProvider#getAssignTo <em>Assign To</em>}</li>
 *   <li>{@link xtext.objectsModel.ServiceProvider#getOutsourceFrom <em>Outsource From</em>}</li>
 *   <li>{@link xtext.objectsModel.ServiceProvider#getGovernanceStrategy <em>Governance Strategy</em>}</li>
 *   <li>{@link xtext.objectsModel.ServiceProvider#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see xtext.objectsModel.ObjectsModelPackage#getServiceProvider()
 * @model
 * @generated
 */
public interface ServiceProvider extends EObject
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
   * @see xtext.objectsModel.ObjectsModelPackage#getServiceProvider_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link xtext.objectsModel.ServiceProvider#getId <em>Id</em>}' attribute.
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
   * @see xtext.objectsModel.ObjectsModelPackage#getServiceProvider_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.objectsModel.ServiceProvider#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see xtext.objectsModel.ObjectsModelPackage#getServiceProvider_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link xtext.objectsModel.ServiceProvider#getDescription <em>Description</em>}' attribute.
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
   * @see #setType(ServiceProviderType)
   * @see xtext.objectsModel.ObjectsModelPackage#getServiceProvider_Type()
   * @model
   * @generated
   */
  ServiceProviderType getType();

  /**
   * Sets the value of the '{@link xtext.objectsModel.ServiceProvider#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ServiceProviderType value);

  /**
   * Returns the value of the '<em><b>Assign To</b></em>' reference list.
   * The list contents are of type {@link xtext.objectsModel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign To</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign To</em>' reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getServiceProvider_AssignTo()
   * @model
   * @generated
   */
  EList<ServiceProvider> getAssignTo();

  /**
   * Returns the value of the '<em><b>Outsource From</b></em>' reference list.
   * The list contents are of type {@link xtext.objectsModel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outsource From</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outsource From</em>' reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getServiceProvider_OutsourceFrom()
   * @model
   * @generated
   */
  EList<ServiceProvider> getOutsourceFrom();

  /**
   * Returns the value of the '<em><b>Governance Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Governance Strategy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Governance Strategy</em>' reference.
   * @see #setGovernanceStrategy(GovernanceStrategy)
   * @see xtext.objectsModel.ObjectsModelPackage#getServiceProvider_GovernanceStrategy()
   * @model
   * @generated
   */
  GovernanceStrategy getGovernanceStrategy();

  /**
   * Sets the value of the '{@link xtext.objectsModel.ServiceProvider#getGovernanceStrategy <em>Governance Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Governance Strategy</em>' reference.
   * @see #getGovernanceStrategy()
   * @generated
   */
  void setGovernanceStrategy(GovernanceStrategy value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link xtext.objectsModel.Asset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getServiceProvider_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Asset> getResources();

} // ServiceProvider
