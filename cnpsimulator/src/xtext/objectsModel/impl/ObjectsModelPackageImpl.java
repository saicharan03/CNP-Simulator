/**
 */
package xtext.objectsModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xtext.objectsModel.Asset;
import xtext.objectsModel.GovernanceStrategy;
import xtext.objectsModel.Impact;
import xtext.objectsModel.Mechanism;
import xtext.objectsModel.MechanismAttribute;
import xtext.objectsModel.ObjectsModel;
import xtext.objectsModel.ObjectsModelFactory;
import xtext.objectsModel.ObjectsModelPackage;
import xtext.objectsModel.RequiredService;
import xtext.objectsModel.Service;
import xtext.objectsModel.ServiceProvider;
import xtext.objectsModel.ServiceProviderType;
import xtext.objectsModel.Skill;
import xtext.objectsModel.WorkItem;
import xtext.objectsModel.WorkItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectsModelPackageImpl extends EPackageImpl implements ObjectsModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectsModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass governanceStrategyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mechanismEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mechanismAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceProviderTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skillEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workItemTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass impactEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see xtext.objectsModel.ObjectsModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ObjectsModelPackageImpl()
  {
    super(eNS_URI, ObjectsModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ObjectsModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ObjectsModelPackage init()
  {
    if (isInited) return (ObjectsModelPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectsModelPackage.eNS_URI);

    // Obtain or create and register package
    ObjectsModelPackageImpl theObjectsModelPackage = (ObjectsModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ObjectsModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ObjectsModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theObjectsModelPackage.createPackageContents();

    // Initialize created meta-data
    theObjectsModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theObjectsModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ObjectsModelPackage.eNS_URI, theObjectsModelPackage);
    return theObjectsModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectsModel()
  {
    return objectsModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectsModel_ServiceProviders()
  {
    return (EReference)objectsModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectsModel_WorkItems()
  {
    return (EReference)objectsModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectsModel_GovernanceStrategies()
  {
    return (EReference)objectsModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGovernanceStrategy()
  {
    return governanceStrategyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGovernanceStrategy_Id()
  {
    return (EAttribute)governanceStrategyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGovernanceStrategy_Name()
  {
    return (EAttribute)governanceStrategyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGovernanceStrategy_Type()
  {
    return (EAttribute)governanceStrategyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGovernanceStrategy_Description()
  {
    return (EAttribute)governanceStrategyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGovernanceStrategy_Mechanisms()
  {
    return (EReference)governanceStrategyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMechanism()
  {
    return mechanismEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_Name()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_Value()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_Description()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMechanism_Attributes()
  {
    return (EReference)mechanismEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMechanismAttribute()
  {
    return mechanismAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanismAttribute_Attribute()
  {
    return (EAttribute)mechanismAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanismAttribute_Value()
  {
    return (EAttribute)mechanismAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Id()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Description()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Hierarchy()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceProviderType()
  {
    return serviceProviderTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProviderType_Name()
  {
    return (EAttribute)serviceProviderTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProviderType_Id()
  {
    return (EAttribute)serviceProviderTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProviderType_Description()
  {
    return (EAttribute)serviceProviderTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProviderType_Hierarchy()
  {
    return (EAttribute)serviceProviderTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceProvider()
  {
    return serviceProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProvider_Id()
  {
    return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProvider_Name()
  {
    return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProvider_Description()
  {
    return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_Type()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_AssignTo()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_OutsourceFrom()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_GovernanceStrategy()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_Resources()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsset()
  {
    return assetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsset_Name()
  {
    return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsset_Id()
  {
    return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsset_Description()
  {
    return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsset_SkillSet()
  {
    return (EReference)assetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkill()
  {
    return skillEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkill_Service()
  {
    return (EReference)skillEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSkill_Efficiency()
  {
    return (EAttribute)skillEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkItemType()
  {
    return workItemTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemType_Name()
  {
    return (EAttribute)workItemTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemType_Id()
  {
    return (EAttribute)workItemTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemType_Description()
  {
    return (EAttribute)workItemTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemType_Hierarchy()
  {
    return (EAttribute)workItemTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItemType_Mechanisms()
  {
    return (EReference)workItemTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkItem()
  {
    return workItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Name()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Id()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Description()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_Type()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_HasPredecessors()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_PdTasks()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_ScTasks()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_IsAggregationNode()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_SbTasks()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_UpTasks()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_HasImpacts()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_Impacts()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_RequiredAnalysis()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_RequiredServices()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Value()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_ArrivalTime()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_DueDate()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiredService()
  {
    return requiredServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequiredService_ServiceType()
  {
    return (EReference)requiredServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequiredService_Efforts()
  {
    return (EAttribute)requiredServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImpact()
  {
    return impactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImpact_ImpactWI()
  {
    return (EReference)impactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImpact_Likelihood()
  {
    return (EAttribute)impactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImpact_Risk()
  {
    return (EAttribute)impactEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectsModelFactory getObjectsModelFactory()
  {
    return (ObjectsModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    objectsModelEClass = createEClass(OBJECTS_MODEL);
    createEReference(objectsModelEClass, OBJECTS_MODEL__SERVICE_PROVIDERS);
    createEReference(objectsModelEClass, OBJECTS_MODEL__WORK_ITEMS);
    createEReference(objectsModelEClass, OBJECTS_MODEL__GOVERNANCE_STRATEGIES);

    governanceStrategyEClass = createEClass(GOVERNANCE_STRATEGY);
    createEAttribute(governanceStrategyEClass, GOVERNANCE_STRATEGY__ID);
    createEAttribute(governanceStrategyEClass, GOVERNANCE_STRATEGY__NAME);
    createEAttribute(governanceStrategyEClass, GOVERNANCE_STRATEGY__TYPE);
    createEAttribute(governanceStrategyEClass, GOVERNANCE_STRATEGY__DESCRIPTION);
    createEReference(governanceStrategyEClass, GOVERNANCE_STRATEGY__MECHANISMS);

    mechanismEClass = createEClass(MECHANISM);
    createEAttribute(mechanismEClass, MECHANISM__NAME);
    createEAttribute(mechanismEClass, MECHANISM__VALUE);
    createEAttribute(mechanismEClass, MECHANISM__DESCRIPTION);
    createEReference(mechanismEClass, MECHANISM__ATTRIBUTES);

    mechanismAttributeEClass = createEClass(MECHANISM_ATTRIBUTE);
    createEAttribute(mechanismAttributeEClass, MECHANISM_ATTRIBUTE__ATTRIBUTE);
    createEAttribute(mechanismAttributeEClass, MECHANISM_ATTRIBUTE__VALUE);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__ID);
    createEAttribute(serviceEClass, SERVICE__NAME);
    createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
    createEAttribute(serviceEClass, SERVICE__HIERARCHY);

    serviceProviderTypeEClass = createEClass(SERVICE_PROVIDER_TYPE);
    createEAttribute(serviceProviderTypeEClass, SERVICE_PROVIDER_TYPE__NAME);
    createEAttribute(serviceProviderTypeEClass, SERVICE_PROVIDER_TYPE__ID);
    createEAttribute(serviceProviderTypeEClass, SERVICE_PROVIDER_TYPE__DESCRIPTION);
    createEAttribute(serviceProviderTypeEClass, SERVICE_PROVIDER_TYPE__HIERARCHY);

    serviceProviderEClass = createEClass(SERVICE_PROVIDER);
    createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__ID);
    createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__NAME);
    createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__DESCRIPTION);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__TYPE);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__ASSIGN_TO);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__OUTSOURCE_FROM);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__GOVERNANCE_STRATEGY);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__RESOURCES);

    assetEClass = createEClass(ASSET);
    createEAttribute(assetEClass, ASSET__NAME);
    createEAttribute(assetEClass, ASSET__ID);
    createEAttribute(assetEClass, ASSET__DESCRIPTION);
    createEReference(assetEClass, ASSET__SKILL_SET);

    skillEClass = createEClass(SKILL);
    createEReference(skillEClass, SKILL__SERVICE);
    createEAttribute(skillEClass, SKILL__EFFICIENCY);

    workItemTypeEClass = createEClass(WORK_ITEM_TYPE);
    createEAttribute(workItemTypeEClass, WORK_ITEM_TYPE__NAME);
    createEAttribute(workItemTypeEClass, WORK_ITEM_TYPE__ID);
    createEAttribute(workItemTypeEClass, WORK_ITEM_TYPE__DESCRIPTION);
    createEAttribute(workItemTypeEClass, WORK_ITEM_TYPE__HIERARCHY);
    createEReference(workItemTypeEClass, WORK_ITEM_TYPE__MECHANISMS);

    workItemEClass = createEClass(WORK_ITEM);
    createEAttribute(workItemEClass, WORK_ITEM__NAME);
    createEAttribute(workItemEClass, WORK_ITEM__ID);
    createEAttribute(workItemEClass, WORK_ITEM__DESCRIPTION);
    createEReference(workItemEClass, WORK_ITEM__TYPE);
    createEAttribute(workItemEClass, WORK_ITEM__HAS_PREDECESSORS);
    createEReference(workItemEClass, WORK_ITEM__PD_TASKS);
    createEReference(workItemEClass, WORK_ITEM__SC_TASKS);
    createEAttribute(workItemEClass, WORK_ITEM__IS_AGGREGATION_NODE);
    createEReference(workItemEClass, WORK_ITEM__SB_TASKS);
    createEReference(workItemEClass, WORK_ITEM__UP_TASKS);
    createEAttribute(workItemEClass, WORK_ITEM__HAS_IMPACTS);
    createEReference(workItemEClass, WORK_ITEM__IMPACTS);
    createEReference(workItemEClass, WORK_ITEM__REQUIRED_ANALYSIS);
    createEReference(workItemEClass, WORK_ITEM__REQUIRED_SERVICES);
    createEAttribute(workItemEClass, WORK_ITEM__VALUE);
    createEAttribute(workItemEClass, WORK_ITEM__ARRIVAL_TIME);
    createEAttribute(workItemEClass, WORK_ITEM__DUE_DATE);

    requiredServiceEClass = createEClass(REQUIRED_SERVICE);
    createEReference(requiredServiceEClass, REQUIRED_SERVICE__SERVICE_TYPE);
    createEAttribute(requiredServiceEClass, REQUIRED_SERVICE__EFFORTS);

    impactEClass = createEClass(IMPACT);
    createEReference(impactEClass, IMPACT__IMPACT_WI);
    createEAttribute(impactEClass, IMPACT__LIKELIHOOD);
    createEAttribute(impactEClass, IMPACT__RISK);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(objectsModelEClass, ObjectsModel.class, "ObjectsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectsModel_ServiceProviders(), this.getServiceProvider(), null, "serviceProviders", null, 0, -1, ObjectsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectsModel_WorkItems(), this.getWorkItem(), null, "workItems", null, 0, -1, ObjectsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectsModel_GovernanceStrategies(), this.getGovernanceStrategy(), null, "governanceStrategies", null, 0, -1, ObjectsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(governanceStrategyEClass, GovernanceStrategy.class, "GovernanceStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGovernanceStrategy_Id(), ecorePackage.getEInt(), "id", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGovernanceStrategy_Name(), ecorePackage.getEString(), "name", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGovernanceStrategy_Type(), ecorePackage.getEString(), "type", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGovernanceStrategy_Description(), ecorePackage.getEString(), "description", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGovernanceStrategy_Mechanisms(), this.getMechanism(), null, "Mechanisms", null, 0, -1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mechanismEClass, Mechanism.class, "Mechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMechanism_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMechanism_Value(), ecorePackage.getEString(), "value", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMechanism_Description(), ecorePackage.getEString(), "description", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMechanism_Attributes(), this.getMechanismAttribute(), null, "attributes", null, 0, -1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mechanismAttributeEClass, MechanismAttribute.class, "MechanismAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMechanismAttribute_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, MechanismAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMechanismAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, MechanismAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_Hierarchy(), ecorePackage.getEInt(), "hierarchy", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceProviderTypeEClass, ServiceProviderType.class, "ServiceProviderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceProviderType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceProviderType_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ServiceProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceProviderType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceProviderType_Hierarchy(), ecorePackage.getEInt(), "hierarchy", null, 0, 1, ServiceProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceProviderEClass, ServiceProvider.class, "ServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceProvider_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceProvider_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_Type(), this.getServiceProviderType(), null, "type", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_AssignTo(), this.getServiceProvider(), null, "assignTo", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_OutsourceFrom(), this.getServiceProvider(), null, "outsourceFrom", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_GovernanceStrategy(), this.getGovernanceStrategy(), null, "governanceStrategy", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_Resources(), this.getAsset(), null, "resources", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAsset_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAsset_Description(), ecorePackage.getEString(), "description", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsset_SkillSet(), this.getSkill(), null, "skillSet", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSkill_Service(), this.getService(), null, "service", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSkill_Efficiency(), ecorePackage.getEDouble(), "efficiency", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workItemTypeEClass, WorkItemType.class, "WorkItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkItemType_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItemType_Id(), ecorePackage.getEInt(), "id", null, 0, 1, WorkItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItemType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItemType_Hierarchy(), ecorePackage.getEInt(), "hierarchy", null, 0, 1, WorkItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItemType_Mechanisms(), this.getMechanism(), null, "Mechanisms", null, 0, -1, WorkItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workItemEClass, WorkItem.class, "WorkItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Id(), ecorePackage.getEInt(), "id", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_Type(), this.getWorkItemType(), null, "type", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_HasPredecessors(), ecorePackage.getEBoolean(), "hasPredecessors", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_PdTasks(), this.getWorkItem(), null, "PdTasks", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_ScTasks(), this.getWorkItem(), null, "ScTasks", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_IsAggregationNode(), ecorePackage.getEBoolean(), "isAggregationNode", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_SbTasks(), this.getWorkItem(), null, "SbTasks", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_UpTasks(), this.getWorkItem(), null, "UpTasks", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_HasImpacts(), ecorePackage.getEBoolean(), "hasImpacts", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_Impacts(), this.getImpact(), null, "impacts", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_RequiredAnalysis(), this.getRequiredService(), null, "requiredAnalysis", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_RequiredServices(), this.getRequiredService(), null, "requiredServices", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_ArrivalTime(), ecorePackage.getEInt(), "arrivalTime", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_DueDate(), ecorePackage.getEInt(), "dueDate", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiredServiceEClass, RequiredService.class, "RequiredService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequiredService_ServiceType(), this.getService(), null, "serviceType", null, 0, 1, RequiredService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequiredService_Efforts(), ecorePackage.getEDouble(), "efforts", null, 0, 1, RequiredService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(impactEClass, Impact.class, "Impact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImpact_ImpactWI(), this.getWorkItem(), null, "impactWI", null, 0, 1, Impact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImpact_Likelihood(), ecorePackage.getEDouble(), "likelihood", null, 0, 1, Impact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImpact_Risk(), ecorePackage.getEDouble(), "risk", null, 0, 1, Impact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ObjectsModelPackageImpl
