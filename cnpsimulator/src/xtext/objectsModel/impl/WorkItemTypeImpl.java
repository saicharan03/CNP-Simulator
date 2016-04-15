/**
 */
package xtext.objectsModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xtext.objectsModel.Mechanism;
import xtext.objectsModel.ObjectsModelPackage;
import xtext.objectsModel.WorkItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xtext.objectsModel.impl.WorkItemTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemTypeImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemTypeImpl#getMechanisms <em>Mechanisms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkItemTypeImpl extends MinimalEObjectImpl.Container implements WorkItemType
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
   * The cached value of the '{@link #getMechanisms() <em>Mechanisms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechanisms()
   * @generated
   * @ordered
   */
  protected EList<Mechanism> mechanisms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkItemTypeImpl()
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
    return ObjectsModelPackage.Literals.WORK_ITEM_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM_TYPE__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM_TYPE__HIERARCHY, oldHierarchy, hierarchy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mechanism> getMechanisms()
  {
    if (mechanisms == null)
    {
      mechanisms = new EObjectContainmentEList<Mechanism>(Mechanism.class, this, ObjectsModelPackage.WORK_ITEM_TYPE__MECHANISMS);
    }
    return mechanisms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ObjectsModelPackage.WORK_ITEM_TYPE__MECHANISMS:
        return ((InternalEList<?>)getMechanisms()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ObjectsModelPackage.WORK_ITEM_TYPE__NAME:
        return getName();
      case ObjectsModelPackage.WORK_ITEM_TYPE__ID:
        return getId();
      case ObjectsModelPackage.WORK_ITEM_TYPE__DESCRIPTION:
        return getDescription();
      case ObjectsModelPackage.WORK_ITEM_TYPE__HIERARCHY:
        return getHierarchy();
      case ObjectsModelPackage.WORK_ITEM_TYPE__MECHANISMS:
        return getMechanisms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ObjectsModelPackage.WORK_ITEM_TYPE__NAME:
        setName((String)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM_TYPE__ID:
        setId((Integer)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM_TYPE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM_TYPE__HIERARCHY:
        setHierarchy((Integer)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM_TYPE__MECHANISMS:
        getMechanisms().clear();
        getMechanisms().addAll((Collection<? extends Mechanism>)newValue);
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
      case ObjectsModelPackage.WORK_ITEM_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM_TYPE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM_TYPE__HIERARCHY:
        setHierarchy(HIERARCHY_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM_TYPE__MECHANISMS:
        getMechanisms().clear();
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
      case ObjectsModelPackage.WORK_ITEM_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ObjectsModelPackage.WORK_ITEM_TYPE__ID:
        return id != ID_EDEFAULT;
      case ObjectsModelPackage.WORK_ITEM_TYPE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ObjectsModelPackage.WORK_ITEM_TYPE__HIERARCHY:
        return hierarchy != HIERARCHY_EDEFAULT;
      case ObjectsModelPackage.WORK_ITEM_TYPE__MECHANISMS:
        return mechanisms != null && !mechanisms.isEmpty();
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

} //WorkItemTypeImpl
