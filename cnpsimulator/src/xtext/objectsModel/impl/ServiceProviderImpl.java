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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xtext.objectsModel.Asset;
import xtext.objectsModel.GovernanceStrategy;
import xtext.objectsModel.ObjectsModelPackage;
import xtext.objectsModel.ServiceProvider;
import xtext.objectsModel.ServiceProviderType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderImpl#getAssignTo <em>Assign To</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderImpl#getOutsourceFrom <em>Outsource From</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderImpl#getGovernanceStrategy <em>Governance Strategy</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ServiceProviderImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProviderImpl extends MinimalEObjectImpl.Container implements ServiceProvider
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ServiceProviderType type;

  /**
   * The cached value of the '{@link #getAssignTo() <em>Assign To</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignTo()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> assignTo;

  /**
   * The cached value of the '{@link #getOutsourceFrom() <em>Outsource From</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutsourceFrom()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> outsourceFrom;

  /**
   * The cached value of the '{@link #getGovernanceStrategy() <em>Governance Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGovernanceStrategy()
   * @generated
   * @ordered
   */
  protected GovernanceStrategy governanceStrategy;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Asset> resources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceProviderImpl()
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
    return ObjectsModelPackage.Literals.SERVICE_PROVIDER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SERVICE_PROVIDER__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SERVICE_PROVIDER__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SERVICE_PROVIDER__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProviderType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (ServiceProviderType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectsModelPackage.SERVICE_PROVIDER__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProviderType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ServiceProviderType newType)
  {
    ServiceProviderType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SERVICE_PROVIDER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getAssignTo()
  {
    if (assignTo == null)
    {
      assignTo = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, ObjectsModelPackage.SERVICE_PROVIDER__ASSIGN_TO);
    }
    return assignTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getOutsourceFrom()
  {
    if (outsourceFrom == null)
    {
      outsourceFrom = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, ObjectsModelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM);
    }
    return outsourceFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GovernanceStrategy getGovernanceStrategy()
  {
    if (governanceStrategy != null && governanceStrategy.eIsProxy())
    {
      InternalEObject oldGovernanceStrategy = (InternalEObject)governanceStrategy;
      governanceStrategy = (GovernanceStrategy)eResolveProxy(oldGovernanceStrategy);
      if (governanceStrategy != oldGovernanceStrategy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectsModelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY, oldGovernanceStrategy, governanceStrategy));
      }
    }
    return governanceStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GovernanceStrategy basicGetGovernanceStrategy()
  {
    return governanceStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGovernanceStrategy(GovernanceStrategy newGovernanceStrategy)
  {
    GovernanceStrategy oldGovernanceStrategy = governanceStrategy;
    governanceStrategy = newGovernanceStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY, oldGovernanceStrategy, governanceStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Asset> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Asset>(Asset.class, this, ObjectsModelPackage.SERVICE_PROVIDER__RESOURCES);
    }
    return resources;
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
      case ObjectsModelPackage.SERVICE_PROVIDER__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
      case ObjectsModelPackage.SERVICE_PROVIDER__ID:
        return getId();
      case ObjectsModelPackage.SERVICE_PROVIDER__NAME:
        return getName();
      case ObjectsModelPackage.SERVICE_PROVIDER__DESCRIPTION:
        return getDescription();
      case ObjectsModelPackage.SERVICE_PROVIDER__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case ObjectsModelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        return getAssignTo();
      case ObjectsModelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM:
        return getOutsourceFrom();
      case ObjectsModelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        if (resolve) return getGovernanceStrategy();
        return basicGetGovernanceStrategy();
      case ObjectsModelPackage.SERVICE_PROVIDER__RESOURCES:
        return getResources();
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
      case ObjectsModelPackage.SERVICE_PROVIDER__ID:
        setId((Integer)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__NAME:
        setName((String)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__TYPE:
        setType((ServiceProviderType)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        getAssignTo().clear();
        getAssignTo().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM:
        getOutsourceFrom().clear();
        getOutsourceFrom().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        setGovernanceStrategy((GovernanceStrategy)newValue);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Asset>)newValue);
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
      case ObjectsModelPackage.SERVICE_PROVIDER__ID:
        setId(ID_EDEFAULT);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__TYPE:
        setType((ServiceProviderType)null);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        getAssignTo().clear();
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM:
        getOutsourceFrom().clear();
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        setGovernanceStrategy((GovernanceStrategy)null);
        return;
      case ObjectsModelPackage.SERVICE_PROVIDER__RESOURCES:
        getResources().clear();
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
      case ObjectsModelPackage.SERVICE_PROVIDER__ID:
        return id != ID_EDEFAULT;
      case ObjectsModelPackage.SERVICE_PROVIDER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ObjectsModelPackage.SERVICE_PROVIDER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ObjectsModelPackage.SERVICE_PROVIDER__TYPE:
        return type != null;
      case ObjectsModelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        return assignTo != null && !assignTo.isEmpty();
      case ObjectsModelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM:
        return outsourceFrom != null && !outsourceFrom.isEmpty();
      case ObjectsModelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        return governanceStrategy != null;
      case ObjectsModelPackage.SERVICE_PROVIDER__RESOURCES:
        return resources != null && !resources.isEmpty();
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
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ServiceProviderImpl
