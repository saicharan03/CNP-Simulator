/**
 */
package xtext.objectsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xtext.objectsModel.Skill#getService <em>Service</em>}</li>
 *   <li>{@link xtext.objectsModel.Skill#getEfficiency <em>Efficiency</em>}</li>
 * </ul>
 * </p>
 *
 * @see xtext.objectsModel.ObjectsModelPackage#getSkill()
 * @model
 * @generated
 */
public interface Skill extends EObject
{
  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(Service)
   * @see xtext.objectsModel.ObjectsModelPackage#getSkill_Service()
   * @model
   * @generated
   */
  Service getService();

  /**
   * Sets the value of the '{@link xtext.objectsModel.Skill#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(Service value);

  /**
   * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Efficiency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Efficiency</em>' attribute.
   * @see #setEfficiency(double)
   * @see xtext.objectsModel.ObjectsModelPackage#getSkill_Efficiency()
   * @model
   * @generated
   */
  double getEfficiency();

  /**
   * Sets the value of the '{@link xtext.objectsModel.Skill#getEfficiency <em>Efficiency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Efficiency</em>' attribute.
   * @see #getEfficiency()
   * @generated
   */
  void setEfficiency(double value);

} // Skill
