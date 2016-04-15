/**
 */
package xtext.objectsModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xtext.objectsModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectsModelFactoryImpl extends EFactoryImpl implements ObjectsModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ObjectsModelFactory init()
  {
    try
    {
      ObjectsModelFactory theObjectsModelFactory = (ObjectsModelFactory)EPackage.Registry.INSTANCE.getEFactory(ObjectsModelPackage.eNS_URI);
      if (theObjectsModelFactory != null)
      {
        return theObjectsModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ObjectsModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectsModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ObjectsModelPackage.OBJECTS_MODEL: return createObjectsModel();
      case ObjectsModelPackage.GOVERNANCE_STRATEGY: return createGovernanceStrategy();
      case ObjectsModelPackage.MECHANISM: return createMechanism();
      case ObjectsModelPackage.MECHANISM_ATTRIBUTE: return createMechanismAttribute();
      case ObjectsModelPackage.SERVICE: return createService();
      case ObjectsModelPackage.SERVICE_PROVIDER_TYPE: return createServiceProviderType();
      case ObjectsModelPackage.SERVICE_PROVIDER: return createServiceProvider();
      case ObjectsModelPackage.ASSET: return createAsset();
      case ObjectsModelPackage.SKILL: return createSkill();
      case ObjectsModelPackage.WORK_ITEM_TYPE: return createWorkItemType();
      case ObjectsModelPackage.WORK_ITEM: return createWorkItem();
      case ObjectsModelPackage.REQUIRED_SERVICE: return createRequiredService();
      case ObjectsModelPackage.IMPACT: return createImpact();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectsModel createObjectsModel()
  {
    ObjectsModelImpl objectsModel = new ObjectsModelImpl();
    return objectsModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GovernanceStrategy createGovernanceStrategy()
  {
    GovernanceStrategyImpl governanceStrategy = new GovernanceStrategyImpl();
    return governanceStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mechanism createMechanism()
  {
    MechanismImpl mechanism = new MechanismImpl();
    return mechanism;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MechanismAttribute createMechanismAttribute()
  {
    MechanismAttributeImpl mechanismAttribute = new MechanismAttributeImpl();
    return mechanismAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProviderType createServiceProviderType()
  {
    ServiceProviderTypeImpl serviceProviderType = new ServiceProviderTypeImpl();
    return serviceProviderType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProvider createServiceProvider()
  {
    ServiceProviderImpl serviceProvider = new ServiceProviderImpl();
    return serviceProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Asset createAsset()
  {
    AssetImpl asset = new AssetImpl();
    return asset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Skill createSkill()
  {
    SkillImpl skill = new SkillImpl();
    return skill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemType createWorkItemType()
  {
    WorkItemTypeImpl workItemType = new WorkItemTypeImpl();
    return workItemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItem createWorkItem()
  {
    WorkItemImpl workItem = new WorkItemImpl();
    return workItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredService createRequiredService()
  {
    RequiredServiceImpl requiredService = new RequiredServiceImpl();
    return requiredService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Impact createImpact()
  {
    ImpactImpl impact = new ImpactImpl();
    return impact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectsModelPackage getObjectsModelPackage()
  {
    return (ObjectsModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ObjectsModelPackage getPackage()
  {
    return ObjectsModelPackage.eINSTANCE;
  }

} //ObjectsModelFactoryImpl
