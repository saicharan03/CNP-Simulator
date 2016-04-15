/**
 */
package xtext.objectsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xtext.objectsModel.ObjectsModelPackage;
import xtext.objectsModel.Service;
import xtext.objectsModel.Skill;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xtext.objectsModel.impl.SkillImpl#getService <em>Service</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.SkillImpl#getEfficiency <em>Efficiency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SkillImpl extends MinimalEObjectImpl.Container implements Skill
{
  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected Service service;

  /**
   * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfficiency()
   * @generated
   * @ordered
   */
  protected static final double EFFICIENCY_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfficiency()
   * @generated
   * @ordered
   */
  protected double efficiency = EFFICIENCY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SkillImpl()
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
    return ObjectsModelPackage.Literals.SKILL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getService()
  {
    if (service != null && service.eIsProxy())
    {
      InternalEObject oldService = (InternalEObject)service;
      service = (Service)eResolveProxy(oldService);
      if (service != oldService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectsModelPackage.SKILL__SERVICE, oldService, service));
      }
    }
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service basicGetService()
  {
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setService(Service newService)
  {
    Service oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SKILL__SERVICE, oldService, service));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getEfficiency()
  {
    return efficiency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEfficiency(double newEfficiency)
  {
    double oldEfficiency = efficiency;
    efficiency = newEfficiency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.SKILL__EFFICIENCY, oldEfficiency, efficiency));
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
      case ObjectsModelPackage.SKILL__SERVICE:
        if (resolve) return getService();
        return basicGetService();
      case ObjectsModelPackage.SKILL__EFFICIENCY:
        return getEfficiency();
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
      case ObjectsModelPackage.SKILL__SERVICE:
        setService((Service)newValue);
        return;
      case ObjectsModelPackage.SKILL__EFFICIENCY:
        setEfficiency((Double)newValue);
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
      case ObjectsModelPackage.SKILL__SERVICE:
        setService((Service)null);
        return;
      case ObjectsModelPackage.SKILL__EFFICIENCY:
        setEfficiency(EFFICIENCY_EDEFAULT);
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
      case ObjectsModelPackage.SKILL__SERVICE:
        return service != null;
      case ObjectsModelPackage.SKILL__EFFICIENCY:
        return efficiency != EFFICIENCY_EDEFAULT;
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
    result.append(" (efficiency: ");
    result.append(efficiency);
    result.append(')');
    return result.toString();
  }

} //SkillImpl
