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

import xtext.objectsModel.GovernanceStrategy;
import xtext.objectsModel.Mechanism;
import xtext.objectsModel.ObjectsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Governance Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xtext.objectsModel.impl.GovernanceStrategyImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.GovernanceStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.GovernanceStrategyImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.GovernanceStrategyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.GovernanceStrategyImpl#getMechanisms <em>Mechanisms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GovernanceStrategyImpl extends MinimalEObjectImpl.Container implements GovernanceStrategy
{
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

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
  protected GovernanceStrategyImpl()
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
    return ObjectsModelPackage.Literals.GOVERNANCE_STRATEGY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.GOVERNANCE_STRATEGY__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.GOVERNANCE_STRATEGY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.GOVERNANCE_STRATEGY__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.GOVERNANCE_STRATEGY__DESCRIPTION, oldDescription, description));
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
      mechanisms = new EObjectContainmentEList<Mechanism>(Mechanism.class, this, ObjectsModelPackage.GOVERNANCE_STRATEGY__MECHANISMS);
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
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
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
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__ID:
        return getId();
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__NAME:
        return getName();
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__TYPE:
        return getType();
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        return getDescription();
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
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
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__ID:
        setId((Integer)newValue);
        return;
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__NAME:
        setName((String)newValue);
        return;
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__TYPE:
        setType((String)newValue);
        return;
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
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
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__ID:
        setId(ID_EDEFAULT);
        return;
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
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
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__ID:
        return id != ID_EDEFAULT;
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ObjectsModelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
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
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //GovernanceStrategyImpl
