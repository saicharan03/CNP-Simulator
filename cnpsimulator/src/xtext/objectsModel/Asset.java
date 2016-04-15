/**
 */
package xtext.objectsModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xtext.objectsModel.Asset#getName <em>Name</em>}</li>
 *   <li>{@link xtext.objectsModel.Asset#getId <em>Id</em>}</li>
 *   <li>{@link xtext.objectsModel.Asset#getDescription <em>Description</em>}</li>
 *   <li>{@link xtext.objectsModel.Asset#getSkillSet <em>Skill Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see xtext.objectsModel.ObjectsModelPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends EObject
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
   * @see xtext.objectsModel.ObjectsModelPackage#getAsset_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.objectsModel.Asset#getName <em>Name</em>}' attribute.
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
   * @see xtext.objectsModel.ObjectsModelPackage#getAsset_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link xtext.objectsModel.Asset#getId <em>Id</em>}' attribute.
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
   * @see xtext.objectsModel.ObjectsModelPackage#getAsset_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link xtext.objectsModel.Asset#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Skill Set</b></em>' containment reference list.
   * The list contents are of type {@link xtext.objectsModel.Skill}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skill Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skill Set</em>' containment reference list.
   * @see xtext.objectsModel.ObjectsModelPackage#getAsset_SkillSet()
   * @model containment="true"
   * @generated
   */
  EList<Skill> getSkillSet();

} // Asset
