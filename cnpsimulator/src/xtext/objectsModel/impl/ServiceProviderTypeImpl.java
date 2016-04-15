/**
 */
package xtext.objectsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xtext.objectsModel.ObjectsModelPackage;
import xtext.objectsModel.ServiceProviderType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Provider Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderTypeImpl#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProviderTypeImpl extends MinimalEObjectImpl.Container implements ServiceProviderType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final int ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected int id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchy()
   * @generated
   * @ordered
   */
  protected static final int HIERARCHY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchy()
   * @generated
   * @ordered
   */
  protected int hierarchy = HIERARCHY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceProviderTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ObjectsModelPackage.Literals.SERVICE_PROVIDER_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SERVICE_PROVIDER_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(int newId)
  {
    int oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SERVICE_PROVIDER_TYPE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SERVICE_PROVIDER_TYPE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHierarchy()
  {
    return hierarchy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHierarchy(int newHierarchy)
  {
    int oldHierarchy = hierarchy;
    hierarchy = newHierarchy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SERVICE_PROVIDER_TYPE__HIERARCHY, oldHierarchy, hierarchy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__NAME:
        return getName();
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__ID:
        return getId();
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__DESCRIPTION:
        return getDescription();
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__HIERARCHY:
        return getHierarchy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__NAME:
        setName((String)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__ID:
        setId((Integer)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__HIERARCHY:
        setHierarchy((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__HIERARCHY:
        setHierarchy(HIERARCHY_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__ID:
        return id != ID_EDEFAULT;
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE__HIERARCHY:
        return hierarchy != HIERARCHY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", id: ");
    result.append(id);
    result.append(", description: ");
    result.append(description);
    result.append(", hierarchy: ");
    result.append(hierarchy);
    result.append(')');
    return result.toString();
  }

} //ServiceProviderTypeImpl
