/**
 */
package xtext.objectsModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xtext.objectsModel.GovernanceStrategy;
import xtext.objectsModel.ObjectsModel;
import xtext.objectsModel.ObjectsModelPackage;
import xtext.objectsModel.ServiceProvider;
import xtext.objectsModel.WorkItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objects Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xtext.objectsModel.impl.ObjectsModelImpl#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ObjectsModelImpl#getWorkItems <em>Work Items</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.ObjectsModelImpl#getGovernanceStrategies <em>Governance Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectsModelImpl extends MinimalEObjectImpl.Container implements ObjectsModel
{
  /**
   * The cached value of the '{@link #getServiceProviders() <em>Service Providers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceProviders()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> serviceProviders;

  /**
   * The cached value of the '{@link #getWorkItems() <em>Work Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkItems()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> workItems;

  /**
   * The cached value of the '{@link #getGovernanceStrategies() <em>Governance Strategies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGovernanceStrategies()
   * @generated
   * @ordered
   */
  protected EList<GovernanceStrategy> governanceStrategies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectsModelImpl()
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
    return ObjectsModelPackage.Literals.OBJECTS_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getServiceProviders()
  {
    if (serviceProviders == null)
    {
      serviceProviders = new EObjectContainmentEList<ServiceProvider>(ServiceProvider.class, this, ObjectsModelPackage.OBJECTS_MODEL__SERVICE_PROVIDERS);
    }
    return serviceProviders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getWorkItems()
  {
    if (workItems == null)
    {
      workItems = new EObjectContainmentEList<WorkItem>(WorkItem.class, this, ObjectsModelPackage.OBJECTS_MODEL__WORK_ITEMS);
    }
    return workItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GovernanceStrategy> getGovernanceStrategies()
  {
    if (governanceStrategies == null)
    {
      governanceStrategies = new EObjectContainmentEList<GovernanceStrategy>(GovernanceStrategy.class, this, ObjectsModelPackage.OBJECTS_MODEL__GOVERNANCE_STRATEGIES);
    }
    return governanceStrategies;
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
      case ObjectsModelPackage.OBJECTS_MODEL__SERVICE_PROVIDERS:
        return ((InternalEList<?>)getServiceProviders()).basicRemove(otherEnd, msgs);
      case ObjectsModelPackage.OBJECTS_MODEL__WORK_ITEMS:
        return ((InternalEList<?>)getWorkItems()).basicRemove(otherEnd, msgs);
      case ObjectsModelPackage.OBJECTS_MODEL__GOVERNANCE_STRATEGIES:
        return ((InternalEList<?>)getGovernanceStrategies()).basicRemove(otherEnd, msgs);
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
      case ObjectsModelPackage.OBJECTS_MODEL__SERVICE_PROVIDERS:
        return getServiceProviders();
      case ObjectsModelPackage.OBJECTS_MODEL__WORK_ITEMS:
        return getWorkItems();
      case ObjectsModelPackage.OBJECTS_MODEL__GOVERNANCE_STRATEGIES:
        return getGovernanceStrategies();
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
      case ObjectsModelPackage.OBJECTS_MODEL__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        getServiceProviders().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case ObjectsModelPackage.OBJECTS_MODEL__WORK_ITEMS:
        getWorkItems().clear();
        getWorkItems().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case ObjectsModelPackage.OBJECTS_MODEL__GOVERNANCE_STRATEGIES:
        getGovernanceStrategies().clear();
        getGovernanceStrategies().addAll((Collection<? extends GovernanceStrategy>)newValue);
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
      case ObjectsModelPackage.OBJECTS_MODEL__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        return;
      case ObjectsModelPackage.OBJECTS_MODEL__WORK_ITEMS:
        getWorkItems().clear();
        return;
      case ObjectsModelPackage.OBJECTS_MODEL__GOVERNANCE_STRATEGIES:
        getGovernanceStrategies().clear();
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
      case ObjectsModelPackage.OBJECTS_MODEL__SERVICE_PROVIDERS:
        return serviceProviders != null && !serviceProviders.isEmpty();
      case ObjectsModelPackage.OBJECTS_MODEL__WORK_ITEMS:
        return workItems != null && !workItems.isEmpty();
      case ObjectsModelPackage.OBJECTS_MODEL__GOVERNANCE_STRATEGIES:
        return governanceStrategies != null && !governanceStrategies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ObjectsModelImpl
