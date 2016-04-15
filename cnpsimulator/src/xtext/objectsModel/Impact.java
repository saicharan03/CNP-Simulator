/**
 */
package xtext.objectsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xtext.objectsModel.Impact#getImpactWI <em>Impact WI</em>}</li>
 *   <li>{@link xtext.objectsModel.Impact#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link xtext.objectsModel.Impact#getRisk <em>Risk</em>}</li>
 * </ul>
 * </p>
 *
 * @see xtext.objectsModel.ObjectsModelPackage#getImpact()
 * @model
 * @generated
 */
public interface Impact extends EObject
{
  /**
   * Returns the value of the '<em><b>Impact WI</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impact WI</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impact WI</em>' reference.
   * @see #setImpactWI(WorkItem)
   * @see xtext.objectsModel.ObjectsModelPackage#getImpact_ImpactWI()
   * @model
   * @generated
   */
  WorkItem getImpactWI();

  /**
   * Sets the value of the '{@link xtext.objectsModel.Impact#getImpactWI <em>Impact WI</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impact WI</em>' reference.
   * @see #getImpactWI()
   * @generated
   */
  void setImpactWI(WorkItem value);

  /**
   * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Likelihood</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Likelihood</em>' attribute.
   * @see #setLikelihood(double)
   * @see xtext.objectsModel.ObjectsModelPackage#getImpact_Likelihood()
   * @model
   * @generated
   */
  double getLikelihood();

  /**
   * Sets the value of the '{@link xtext.objectsModel.Impact#getLikelihood <em>Likelihood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Likelihood</em>' attribute.
   * @see #getLikelihood()
   * @generated
   */
  void setLikelihood(double value);

  /**
   * Returns the value of the '<em><b>Risk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Risk</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Risk</em>' attribute.
   * @see #setRisk(double)
   * @see xtext.objectsModel.ObjectsModelPackage#getImpact_Risk()
   * @model
   * @generated
   */
  double getRisk();

  /**
   * Sets the value of the '{@link xtext.objectsModel.Impact#getRisk <em>Risk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Risk</em>' attribute.
   * @see #getRisk()
   * @generated
   */
  void setRisk(double value);

} // Impact
