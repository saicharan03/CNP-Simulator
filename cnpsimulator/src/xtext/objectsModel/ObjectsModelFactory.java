/**
 */
package xtext.objectsModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xtext.objectsModel.ObjectsModelPackage
 * @generated
 */
public interface ObjectsModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ObjectsModelFactory eINSTANCE = xtext.objectsModel.impl.ObjectsModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Objects Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objects Model</em>'.
   * @generated
   */
  ObjectsModel createObjectsModel();

  /**
   * Returns a new object of class '<em>Governance Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Governance Strategy</em>'.
   * @generated
   */
  GovernanceStrategy createGovernanceStrategy();

  /**
   * Returns a new object of class '<em>Mechanism</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mechanism</em>'.
   * @generated
   */
  Mechanism createMechanism();

  /**
   * Returns a new object of class '<em>Mechanism Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mechanism Attribute</em>'.
   * @generated
   */
  MechanismAttribute createMechanismAttribute();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Service Provider Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Provider Type</em>'.
   * @generated
   */
  ServiceProviderType createServiceProviderType();

  /**
   * Returns a new object of class '<em>Service Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Provider</em>'.
   * @generated
   */
  ServiceProvider createServiceProvider();

  /**
   * Returns a new object of class '<em>Asset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asset</em>'.
   * @generated
   */
  Asset createAsset();

  /**
   * Returns a new object of class '<em>Skill</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skill</em>'.
   * @generated
   */
  Skill createSkill();

  /**
   * Returns a new object of class '<em>Work Item Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Item Type</em>'.
   * @generated
   */
  WorkItemType createWorkItemType();

  /**
   * Returns a new object of class '<em>Work Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Item</em>'.
   * @generated
   */
  WorkItem createWorkItem();

  /**
   * Returns a new object of class '<em>Required Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Service</em>'.
   * @generated
   */
  RequiredService createRequiredService();

  /**
   * Returns a new object of class '<em>Impact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impact</em>'.
   * @generated
   */
  Impact createImpact();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ObjectsModelPackage getObjectsModelPackage();

} //ObjectsModelFactory
