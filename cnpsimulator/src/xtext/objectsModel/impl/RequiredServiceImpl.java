/**
 */
package xtext.objectsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xtext.objectsModel.ObjectsModelPackage;
import xtext.objectsModel.RequiredService;
import xtext.objectsModel.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xtext.objectsModel.impl.RequiredServiceImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.RequiredServiceImpl#getEfforts <em>Efforts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredServiceImpl extends MinimalEObjectImpl.Container implements RequiredService
{
  /**
   * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceType()
   * @generated
   * @ordered
   */
  protected Service serviceType;

  /**
   * The default value of the '{@link #getEfforts() <em>Efforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfforts()
   * @generated
   * @ordered
   */
  protected static final double EFFORTS_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getEfforts() <em>Efforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfforts()
   * @generated
   * @ordered
   */
  protected double efforts = EFFORTS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequiredServiceImpl()
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
    return ObjectsModelPackage.Literals.REQUIRED_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getServiceType()
  {
    if (serviceType != null && serviceType.eIsProxy())
    {
      InternalEObject oldServiceType = (InternalEObject)serviceType;
      serviceType = (Service)eResolveProxy(oldServiceType);
      if (serviceType != oldServiceType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectsModelPackage.REQUIRED_SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
      }
    }
    return serviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service basicGetServiceType()
  {
    return serviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceType(Service newServiceType)
  {
    Service oldServiceType = serviceType;
    serviceType = newServiceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.REQUIRED_SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getEfforts()
  {
    return efforts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEfforts(double newEfforts)
  {
    double oldEfforts = efforts;
    efforts = newEfforts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.REQUIRED_SERVICE__EFFORTS, oldEfforts, efforts));
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
      case ObjectsModelPackage.REQUIRED_SERVICE__SERVICE_TYPE:
        if (resolve) return getServiceType();
        return basicGetServiceType();
      case ObjectsModelPackage.REQUIRED_SERVICE__EFFORTS:
        return getEfforts();
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
      case ObjectsModelPackage.REQUIRED_SERVICE__SERVICE_TYPE:
        setServiceType((Service)newValue);
        return;
      case ObjectsModelPackage.REQUIRED_SERVICE__EFFORTS:
        setEfforts((Double)newValue);
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
      case ObjectsModelPackage.REQUIRED_SERVICE__SERVICE_TYPE:
        setServiceType((Service)null);
        return;
      case ObjectsModelPackage.REQUIRED_SERVICE__EFFORTS:
        setEfforts(EFFORTS_EDEFAULT);
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
      case ObjectsModelPackage.REQUIRED_SERVICE__SERVICE_TYPE:
        return serviceType != null;
      case ObjectsModelPackage.REQUIRED_SERVICE__EFFORTS:
        return efforts != EFFORTS_EDEFAULT;
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
    result.append(" (efforts: ");
    result.append(efforts);
    result.append(')');
    return result.toString();
  }

} //RequiredServiceImpl
