/**
 */
package xtext.objectsModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objects Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xtext.objectsModel.ObjectsModel#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link xtext.objectsModel.ObjectsModel#getWorkItems <em>Work Items</em>}</li>
 *   <li>{@link xtext.objectsModel.ObjectsModel#getGovernanceStrategies <em>Governance Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @see xtext.objectsModel.ObjectsModelPackage#getObjectsModel()
 * @model
 * @generated
 */
public interface ObjectsModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Service Providers</b></em>' containment reference list.
   * The list contents are of type {@link xtext.objectsModel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Providers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Providers</em>' containment reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getObjectsModel_ServiceProviders()
   * @model containment="true"
   * @generated
   */
  EList<ServiceProvider> getServiceProviders();

  /**
   * Returns the value of the '<em><b>Work Items</b></em>' containment reference list.
   * The list contents are of type {@link xtext.objectsModel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Items</em>' containment reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getObjectsModel_WorkItems()
   * @model containment="true"
   * @generated
   */
  EList<WorkItem> getWorkItems();

  /**
   * Returns the value of the '<em><b>Governance Strategies</b></em>' containment reference list.
   * The list contents are of type {@link xtext.objectsModel.GovernanceStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Governance Strategies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Governance Strategies</em>' containment reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getObjectsModel_GovernanceStrategies()
   * @model containment="true"
   * @generated
   */
  EList<GovernanceStrategy> getGovernanceStrategies();

} // ObjectsModel
