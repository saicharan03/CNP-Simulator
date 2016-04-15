/**
 */
package xtext.objectsModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xtext.objectsModel.ObjectsModelFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectsModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "objectsModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ObjectsModel.xtext";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "objectsModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ObjectsModelPackage eINSTANCE = xtext.objectsModel.impl.ObjectsModelPackageImpl.init();

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.ObjectsModelImpl <em>Objects Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.ObjectsModelImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getObjectsModel()
   * @generated
   */
  int OBJECTS_MODEL = 0;

  /**
   * The feature id for the '<em><b>Service Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTS_MODEL__SERVICE_PROVIDERS = 0;

  /**
   * The feature id for the '<em><b>Work Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTS_MODEL__WORK_ITEMS = 1;

  /**
   * The feature id for the '<em><b>Governance Strategies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTS_MODEL__GOVERNANCE_STRATEGIES = 2;

  /**
   * The number of structural features of the '<em>Objects Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTS_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.GovernanceStrategyImpl <em>Governance Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.GovernanceStrategyImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getGovernanceStrategy()
   * @generated
   */
  int GOVERNANCE_STRATEGY = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__TYPE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__MECHANISMS = 4;

  /**
   * The number of structural features of the '<em>Governance Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.MechanismImpl <em>Mechanism</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.MechanismImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getMechanism()
   * @generated
   */
  int MECHANISM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__VALUE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__ATTRIBUTES = 3;

  /**
   * The number of structural features of the '<em>Mechanism</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.MechanismAttributeImpl <em>Mechanism Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.MechanismAttributeImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getMechanismAttribute()
   * @generated
   */
  int MECHANISM_ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_ATTRIBUTE__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Mechanism Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.ServiceImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getService()
   * @generated
   */
  int SERVICE = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__HIERARCHY = 3;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.ServiceProviderTypeImpl <em>Service Provider Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.ServiceProviderTypeImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getServiceProviderType()
   * @generated
   */
  int SERVICE_PROVIDER_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE__ID = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE__HIERARCHY = 3;

  /**
   * The number of structural features of the '<em>Service Provider Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.ServiceProviderImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getServiceProvider()
   * @generated
   */
  int SERVICE_PROVIDER = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__TYPE = 3;

  /**
   * The feature id for the '<em><b>Assign To</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ASSIGN_TO = 4;

  /**
   * The feature id for the '<em><b>Outsource From</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__OUTSOURCE_FROM = 5;

  /**
   * The feature id for the '<em><b>Governance Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__GOVERNANCE_STRATEGY = 6;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__RESOURCES = 7;

  /**
   * The number of structural features of the '<em>Service Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.AssetImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__ID = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Skill Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__SKILL_SET = 3;

  /**
   * The number of structural features of the '<em>Asset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.SkillImpl <em>Skill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.SkillImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getSkill()
   * @generated
   */
  int SKILL = 8;

  /**
   * The feature id for the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL__SERVICE = 0;

  /**
   * The feature id for the '<em><b>Efficiency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL__EFFICIENCY = 1;

  /**
   * The number of structural features of the '<em>Skill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.WorkItemTypeImpl <em>Work Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.WorkItemTypeImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getWorkItemType()
   * @generated
   */
  int WORK_ITEM_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__ID = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__HIERARCHY = 3;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__MECHANISMS = 4;

  /**
   * The number of structural features of the '<em>Work Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.WorkItemImpl <em>Work Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.WorkItemImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getWorkItem()
   * @generated
   */
  int WORK_ITEM = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ID = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__TYPE = 3;

  /**
   * The feature id for the '<em><b>Has Predecessors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__HAS_PREDECESSORS = 4;

  /**
   * The feature id for the '<em><b>Pd Tasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PD_TASKS = 5;

  /**
   * The feature id for the '<em><b>Sc Tasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__SC_TASKS = 6;

  /**
   * The feature id for the '<em><b>Is Aggregation Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__IS_AGGREGATION_NODE = 7;

  /**
   * The feature id for the '<em><b>Sb Tasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__SB_TASKS = 8;

  /**
   * The feature id for the '<em><b>Up Tasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__UP_TASKS = 9;

  /**
   * The feature id for the '<em><b>Has Impacts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__HAS_IMPACTS = 10;

  /**
   * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__IMPACTS = 11;

  /**
   * The feature id for the '<em><b>Required Analysis</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__REQUIRED_ANALYSIS = 12;

  /**
   * The feature id for the '<em><b>Required Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__REQUIRED_SERVICES = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__VALUE = 14;

  /**
   * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ARRIVAL_TIME = 15;

  /**
   * The feature id for the '<em><b>Due Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DUE_DATE = 16;

  /**
   * The number of structural features of the '<em>Work Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_FEATURE_COUNT = 17;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.RequiredServiceImpl <em>Required Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.RequiredServiceImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getRequiredService()
   * @generated
   */
  int REQUIRED_SERVICE = 11;

  /**
   * The feature id for the '<em><b>Service Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__SERVICE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Efforts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__EFFORTS = 1;

  /**
   * The number of structural features of the '<em>Required Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link xtext.objectsModel.impl.ImpactImpl <em>Impact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.objectsModel.impl.ImpactImpl
   * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getImpact()
   * @generated
   */
  int IMPACT = 12;

  /**
   * The feature id for the '<em><b>Impact WI</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT__IMPACT_WI = 0;

  /**
   * The feature id for the '<em><b>Likelihood</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT__LIKELIHOOD = 1;

  /**
   * The feature id for the '<em><b>Risk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT__RISK = 2;

  /**
   * The number of structural features of the '<em>Impact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link xtext.objectsModel.ObjectsModel <em>Objects Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objects Model</em>'.
   * @see xtext.objectsModel.ObjectsModel
   * @generated
   */
  EClass getObjectsModel();

  /**
   * Returns the meta object for the containment reference list '{@link xtext.objectsModel.ObjectsModel#getServiceProviders <em>Service Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Providers</em>'.
   * @see xtext.objectsModel.ObjectsModel#getServiceProviders()
   * @see #getObjectsModel()
   * @generated
   */
  EReference getObjectsModel_ServiceProviders();

  /**
   * Returns the meta object for the containment reference list '{@link xtext.objectsModel.ObjectsModel#getWorkItems <em>Work Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Items</em>'.
   * @see xtext.objectsModel.ObjectsModel#getWorkItems()
   * @see #getObjectsModel()
   * @generated
   */
  EReference getObjectsModel_WorkItems();

  /**
   * Returns the meta object for the containment reference list '{@link xtext.objectsModel.ObjectsModel#getGovernanceStrategies <em>Governance Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Governance Strategies</em>'.
   * @see xtext.objectsModel.ObjectsModel#getGovernanceStrategies()
   * @see #getObjectsModel()
   * @generated
   */
  EReference getObjectsModel_GovernanceStrategies();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.GovernanceStrategy <em>Governance Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Governance Strategy</em>'.
   * @see xtext.objectsModel.GovernanceStrategy
   * @generated
   */
  EClass getGovernanceStrategy();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.GovernanceStrategy#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see xtext.objectsModel.GovernanceStrategy#getId()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Id();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.GovernanceStrategy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see xtext.objectsModel.GovernanceStrategy#getName()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Name();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.GovernanceStrategy#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see xtext.objectsModel.GovernanceStrategy#getType()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Type();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.GovernanceStrategy#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see xtext.objectsModel.GovernanceStrategy#getDescription()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Description();

  /**
   * Returns the meta object for the containment reference list '{@link xtext.objectsModel.GovernanceStrategy#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see xtext.objectsModel.GovernanceStrategy#getMechanisms()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_Mechanisms();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mechanism</em>'.
   * @see xtext.objectsModel.Mechanism
   * @generated
   */
  EClass getMechanism();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Mechanism#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see xtext.objectsModel.Mechanism#getName()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Name();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Mechanism#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see xtext.objectsModel.Mechanism#getValue()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Value();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Mechanism#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see xtext.objectsModel.Mechanism#getDescription()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Description();

  /**
   * Returns the meta object for the containment reference list '{@link xtext.objectsModel.Mechanism#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see xtext.objectsModel.Mechanism#getAttributes()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_Attributes();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.MechanismAttribute <em>Mechanism Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mechanism Attribute</em>'.
   * @see xtext.objectsModel.MechanismAttribute
   * @generated
   */
  EClass getMechanismAttribute();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.MechanismAttribute#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see xtext.objectsModel.MechanismAttribute#getAttribute()
   * @see #getMechanismAttribute()
   * @generated
   */
  EAttribute getMechanismAttribute_Attribute();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.MechanismAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see xtext.objectsModel.MechanismAttribute#getValue()
   * @see #getMechanismAttribute()
   * @generated
   */
  EAttribute getMechanismAttribute_Value();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see xtext.objectsModel.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Service#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see xtext.objectsModel.Service#getId()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Id();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see xtext.objectsModel.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Service#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see xtext.objectsModel.Service#getDescription()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Description();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Service#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see xtext.objectsModel.Service#getHierarchy()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Hierarchy();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.ServiceProviderType <em>Service Provider Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Provider Type</em>'.
   * @see xtext.objectsModel.ServiceProviderType
   * @generated
   */
  EClass getServiceProviderType();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.ServiceProviderType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see xtext.objectsModel.ServiceProviderType#getName()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Name();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.ServiceProviderType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see xtext.objectsModel.ServiceProviderType#getId()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Id();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.ServiceProviderType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see xtext.objectsModel.ServiceProviderType#getDescription()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Description();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.ServiceProviderType#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see xtext.objectsModel.ServiceProviderType#getHierarchy()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Hierarchy();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.ServiceProvider <em>Service Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Provider</em>'.
   * @see xtext.objectsModel.ServiceProvider
   * @generated
   */
  EClass getServiceProvider();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.ServiceProvider#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see xtext.objectsModel.ServiceProvider#getId()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Id();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.ServiceProvider#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see xtext.objectsModel.ServiceProvider#getName()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Name();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.ServiceProvider#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see xtext.objectsModel.ServiceProvider#getDescription()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Description();

  /**
   * Returns the meta object for the reference '{@link xtext.objectsModel.ServiceProvider#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see xtext.objectsModel.ServiceProvider#getType()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_Type();

  /**
   * Returns the meta object for the reference list '{@link xtext.objectsModel.ServiceProvider#getAssignTo <em>Assign To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assign To</em>'.
   * @see xtext.objectsModel.ServiceProvider#getAssignTo()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_AssignTo();

  /**
   * Returns the meta object for the reference list '{@link xtext.objectsModel.ServiceProvider#getOutsourceFrom <em>Outsource From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outsource From</em>'.
   * @see xtext.objectsModel.ServiceProvider#getOutsourceFrom()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_OutsourceFrom();

  /**
   * Returns the meta object for the reference '{@link xtext.objectsModel.ServiceProvider#getGovernanceStrategy <em>Governance Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Governance Strategy</em>'.
   * @see xtext.objectsModel.ServiceProvider#getGovernanceStrategy()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_GovernanceStrategy();

  /**
   * Returns the meta object for the containment reference list '{@link xtext.objectsModel.ServiceProvider#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see xtext.objectsModel.ServiceProvider#getResources()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_Resources();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asset</em>'.
   * @see xtext.objectsModel.Asset
   * @generated
   */
  EClass getAsset();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Asset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see xtext.objectsModel.Asset#getName()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Name();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Asset#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see xtext.objectsModel.Asset#getId()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Id();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Asset#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see xtext.objectsModel.Asset#getDescription()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Description();

  /**
   * Returns the meta object for the containment reference list '{@link xtext.objectsModel.Asset#getSkillSet <em>Skill Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Skill Set</em>'.
   * @see xtext.objectsModel.Asset#getSkillSet()
   * @see #getAsset()
   * @generated
   */
  EReference getAsset_SkillSet();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.Skill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skill</em>'.
   * @see xtext.objectsModel.Skill
   * @generated
   */
  EClass getSkill();

  /**
   * Returns the meta object for the reference '{@link xtext.objectsModel.Skill#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service</em>'.
   * @see xtext.objectsModel.Skill#getService()
   * @see #getSkill()
   * @generated
   */
  EReference getSkill_Service();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Skill#getEfficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Efficiency</em>'.
   * @see xtext.objectsModel.Skill#getEfficiency()
   * @see #getSkill()
   * @generated
   */
  EAttribute getSkill_Efficiency();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.WorkItemType <em>Work Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item Type</em>'.
   * @see xtext.objectsModel.WorkItemType
   * @generated
   */
  EClass getWorkItemType();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItemType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see xtext.objectsModel.WorkItemType#getName()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Name();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItemType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see xtext.objectsModel.WorkItemType#getId()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Id();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItemType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see xtext.objectsModel.WorkItemType#getDescription()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Description();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItemType#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see xtext.objectsModel.WorkItemType#getHierarchy()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Hierarchy();

  /**
   * Returns the meta object for the containment reference list '{@link xtext.objectsModel.WorkItemType#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see xtext.objectsModel.WorkItemType#getMechanisms()
   * @see #getWorkItemType()
   * @generated
   */
  EReference getWorkItemType_Mechanisms();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.WorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item</em>'.
   * @see xtext.objectsModel.WorkItem
   * @generated
   */
  EClass getWorkItem();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see xtext.objectsModel.WorkItem#getName()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Name();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItem#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see xtext.objectsModel.WorkItem#getId()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Id();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItem#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see xtext.objectsModel.WorkItem#getDescription()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Description();

  /**
   * Returns the meta object for the reference '{@link xtext.objectsModel.WorkItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see xtext.objectsModel.WorkItem#getType()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Type();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItem#isHasPredecessors <em>Has Predecessors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Predecessors</em>'.
   * @see xtext.objectsModel.WorkItem#isHasPredecessors()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_HasPredecessors();

  /**
   * Returns the meta object for the reference list '{@link xtext.objectsModel.WorkItem#getPdTasks <em>Pd Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Pd Tasks</em>'.
   * @see xtext.objectsModel.WorkItem#getPdTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_PdTasks();

  /**
   * Returns the meta object for the reference list '{@link xtext.objectsModel.WorkItem#getScTasks <em>Sc Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sc Tasks</em>'.
   * @see xtext.objectsModel.WorkItem#getScTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_ScTasks();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItem#isIsAggregationNode <em>Is Aggregation Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Aggregation Node</em>'.
   * @see xtext.objectsModel.WorkItem#isIsAggregationNode()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_IsAggregationNode();

  /**
   * Returns the meta object for the reference list '{@link xtext.objectsModel.WorkItem#getSbTasks <em>Sb Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sb Tasks</em>'.
   * @see xtext.objectsModel.WorkItem#getSbTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_SbTasks();

  /**
   * Returns the meta object for the reference list '{@link xtext.objectsModel.WorkItem#getUpTasks <em>Up Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Up Tasks</em>'.
   * @see xtext.objectsModel.WorkItem#getUpTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_UpTasks();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItem#isHasImpacts <em>Has Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Impacts</em>'.
   * @see xtext.objectsModel.WorkItem#isHasImpacts()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_HasImpacts();

  /**
   * Returns the meta object for the containment reference list '{@link xtext.objectsModel.WorkItem#getImpacts <em>Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Impacts</em>'.
   * @see xtext.objectsModel.WorkItem#getImpacts()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Impacts();

  /**
   * Returns the meta object for the reference list '{@link xtext.objectsModel.WorkItem#getRequiredAnalysis <em>Required Analysis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Required Analysis</em>'.
   * @see xtext.objectsModel.WorkItem#getRequiredAnalysis()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_RequiredAnalysis();

  /**
   * Returns the meta object for the reference list '{@link xtext.objectsModel.WorkItem#getRequiredServices <em>Required Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Required Services</em>'.
   * @see xtext.objectsModel.WorkItem#getRequiredServices()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_RequiredServices();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see xtext.objectsModel.WorkItem#getValue()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Value();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItem#getArrivalTime <em>Arrival Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arrival Time</em>'.
   * @see xtext.objectsModel.WorkItem#getArrivalTime()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_ArrivalTime();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.WorkItem#getDueDate <em>Due Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Due Date</em>'.
   * @see xtext.objectsModel.WorkItem#getDueDate()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_DueDate();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.RequiredService <em>Required Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Service</em>'.
   * @see xtext.objectsModel.RequiredService
   * @generated
   */
  EClass getRequiredService();

  /**
   * Returns the meta object for the reference '{@link xtext.objectsModel.RequiredService#getServiceType <em>Service Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service Type</em>'.
   * @see xtext.objectsModel.RequiredService#getServiceType()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_ServiceType();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.RequiredService#getEfforts <em>Efforts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Efforts</em>'.
   * @see xtext.objectsModel.RequiredService#getEfforts()
   * @see #getRequiredService()
   * @generated
   */
  EAttribute getRequiredService_Efforts();

  /**
   * Returns the meta object for class '{@link xtext.objectsModel.Impact <em>Impact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Impact</em>'.
   * @see xtext.objectsModel.Impact
   * @generated
   */
  EClass getImpact();

  /**
   * Returns the meta object for the reference '{@link xtext.objectsModel.Impact#getImpactWI <em>Impact WI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Impact WI</em>'.
   * @see xtext.objectsModel.Impact#getImpactWI()
   * @see #getImpact()
   * @generated
   */
  EReference getImpact_ImpactWI();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Impact#getLikelihood <em>Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Likelihood</em>'.
   * @see xtext.objectsModel.Impact#getLikelihood()
   * @see #getImpact()
   * @generated
   */
  EAttribute getImpact_Likelihood();

  /**
   * Returns the meta object for the attribute '{@link xtext.objectsModel.Impact#getRisk <em>Risk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Risk</em>'.
   * @see xtext.objectsModel.Impact#getRisk()
   * @see #getImpact()
   * @generated
   */
  EAttribute getImpact_Risk();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ObjectsModelFactory getObjectsModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.ObjectsModelImpl <em>Objects Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.ObjectsModelImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getObjectsModel()
     * @generated
     */
    EClass OBJECTS_MODEL = eINSTANCE.getObjectsModel();

    /**
     * The meta object literal for the '<em><b>Service Providers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECTS_MODEL__SERVICE_PROVIDERS = eINSTANCE.getObjectsModel_ServiceProviders();

    /**
     * The meta object literal for the '<em><b>Work Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECTS_MODEL__WORK_ITEMS = eINSTANCE.getObjectsModel_WorkItems();

    /**
     * The meta object literal for the '<em><b>Governance Strategies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECTS_MODEL__GOVERNANCE_STRATEGIES = eINSTANCE.getObjectsModel_GovernanceStrategies();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.GovernanceStrategyImpl <em>Governance Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.GovernanceStrategyImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getGovernanceStrategy()
     * @generated
     */
    EClass GOVERNANCE_STRATEGY = eINSTANCE.getGovernanceStrategy();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__ID = eINSTANCE.getGovernanceStrategy_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__NAME = eINSTANCE.getGovernanceStrategy_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__TYPE = eINSTANCE.getGovernanceStrategy_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__DESCRIPTION = eINSTANCE.getGovernanceStrategy_Description();

    /**
     * The meta object literal for the '<em><b>Mechanisms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__MECHANISMS = eINSTANCE.getGovernanceStrategy_Mechanisms();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.MechanismImpl <em>Mechanism</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.MechanismImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getMechanism()
     * @generated
     */
    EClass MECHANISM = eINSTANCE.getMechanism();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__NAME = eINSTANCE.getMechanism_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__VALUE = eINSTANCE.getMechanism_Value();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__DESCRIPTION = eINSTANCE.getMechanism_Description();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__ATTRIBUTES = eINSTANCE.getMechanism_Attributes();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.MechanismAttributeImpl <em>Mechanism Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.MechanismAttributeImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getMechanismAttribute()
     * @generated
     */
    EClass MECHANISM_ATTRIBUTE = eINSTANCE.getMechanismAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getMechanismAttribute_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM_ATTRIBUTE__VALUE = eINSTANCE.getMechanismAttribute_Value();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.ServiceImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__ID = eINSTANCE.getService_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

    /**
     * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__HIERARCHY = eINSTANCE.getService_Hierarchy();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.ServiceProviderTypeImpl <em>Service Provider Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.ServiceProviderTypeImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getServiceProviderType()
     * @generated
     */
    EClass SERVICE_PROVIDER_TYPE = eINSTANCE.getServiceProviderType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER_TYPE__NAME = eINSTANCE.getServiceProviderType_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER_TYPE__ID = eINSTANCE.getServiceProviderType_Id();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER_TYPE__DESCRIPTION = eINSTANCE.getServiceProviderType_Description();

    /**
     * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER_TYPE__HIERARCHY = eINSTANCE.getServiceProviderType_Hierarchy();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.ServiceProviderImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getServiceProvider()
     * @generated
     */
    EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__ID = eINSTANCE.getServiceProvider_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__NAME = eINSTANCE.getServiceProvider_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__DESCRIPTION = eINSTANCE.getServiceProvider_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__TYPE = eINSTANCE.getServiceProvider_Type();

    /**
     * The meta object literal for the '<em><b>Assign To</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__ASSIGN_TO = eINSTANCE.getServiceProvider_AssignTo();

    /**
     * The meta object literal for the '<em><b>Outsource From</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__OUTSOURCE_FROM = eINSTANCE.getServiceProvider_OutsourceFrom();

    /**
     * The meta object literal for the '<em><b>Governance Strategy</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__GOVERNANCE_STRATEGY = eINSTANCE.getServiceProvider_GovernanceStrategy();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__RESOURCES = eINSTANCE.getServiceProvider_Resources();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.AssetImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getAsset()
     * @generated
     */
    EClass ASSET = eINSTANCE.getAsset();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__ID = eINSTANCE.getAsset_Id();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

    /**
     * The meta object literal for the '<em><b>Skill Set</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSET__SKILL_SET = eINSTANCE.getAsset_SkillSet();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.SkillImpl <em>Skill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.SkillImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getSkill()
     * @generated
     */
    EClass SKILL = eINSTANCE.getSkill();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SKILL__SERVICE = eINSTANCE.getSkill_Service();

    /**
     * The meta object literal for the '<em><b>Efficiency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SKILL__EFFICIENCY = eINSTANCE.getSkill_Efficiency();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.WorkItemTypeImpl <em>Work Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.WorkItemTypeImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getWorkItemType()
     * @generated
     */
    EClass WORK_ITEM_TYPE = eINSTANCE.getWorkItemType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__NAME = eINSTANCE.getWorkItemType_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__ID = eINSTANCE.getWorkItemType_Id();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__DESCRIPTION = eINSTANCE.getWorkItemType_Description();

    /**
     * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__HIERARCHY = eINSTANCE.getWorkItemType_Hierarchy();

    /**
     * The meta object literal for the '<em><b>Mechanisms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_TYPE__MECHANISMS = eINSTANCE.getWorkItemType_Mechanisms();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.WorkItemImpl <em>Work Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.WorkItemImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getWorkItem()
     * @generated
     */
    EClass WORK_ITEM = eINSTANCE.getWorkItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__NAME = eINSTANCE.getWorkItem_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__ID = eINSTANCE.getWorkItem_Id();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__DESCRIPTION = eINSTANCE.getWorkItem_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__TYPE = eINSTANCE.getWorkItem_Type();

    /**
     * The meta object literal for the '<em><b>Has Predecessors</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__HAS_PREDECESSORS = eINSTANCE.getWorkItem_HasPredecessors();

    /**
     * The meta object literal for the '<em><b>Pd Tasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__PD_TASKS = eINSTANCE.getWorkItem_PdTasks();

    /**
     * The meta object literal for the '<em><b>Sc Tasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__SC_TASKS = eINSTANCE.getWorkItem_ScTasks();

    /**
     * The meta object literal for the '<em><b>Is Aggregation Node</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__IS_AGGREGATION_NODE = eINSTANCE.getWorkItem_IsAggregationNode();

    /**
     * The meta object literal for the '<em><b>Sb Tasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__SB_TASKS = eINSTANCE.getWorkItem_SbTasks();

    /**
     * The meta object literal for the '<em><b>Up Tasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__UP_TASKS = eINSTANCE.getWorkItem_UpTasks();

    /**
     * The meta object literal for the '<em><b>Has Impacts</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__HAS_IMPACTS = eINSTANCE.getWorkItem_HasImpacts();

    /**
     * The meta object literal for the '<em><b>Impacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__IMPACTS = eINSTANCE.getWorkItem_Impacts();

    /**
     * The meta object literal for the '<em><b>Required Analysis</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__REQUIRED_ANALYSIS = eINSTANCE.getWorkItem_RequiredAnalysis();

    /**
     * The meta object literal for the '<em><b>Required Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__REQUIRED_SERVICES = eINSTANCE.getWorkItem_RequiredServices();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__VALUE = eINSTANCE.getWorkItem_Value();

    /**
     * The meta object literal for the '<em><b>Arrival Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__ARRIVAL_TIME = eINSTANCE.getWorkItem_ArrivalTime();

    /**
     * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__DUE_DATE = eINSTANCE.getWorkItem_DueDate();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.RequiredServiceImpl <em>Required Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.RequiredServiceImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getRequiredService()
     * @generated
     */
    EClass REQUIRED_SERVICE = eINSTANCE.getRequiredService();

    /**
     * The meta object literal for the '<em><b>Service Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_SERVICE__SERVICE_TYPE = eINSTANCE.getRequiredService_ServiceType();

    /**
     * The meta object literal for the '<em><b>Efforts</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_SERVICE__EFFORTS = eINSTANCE.getRequiredService_Efforts();

    /**
     * The meta object literal for the '{@link xtext.objectsModel.impl.ImpactImpl <em>Impact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.objectsModel.impl.ImpactImpl
     * @see xtext.objectsModel.impl.ObjectsModelPackageImpl#getImpact()
     * @generated
     */
    EClass IMPACT = eINSTANCE.getImpact();

    /**
     * The meta object literal for the '<em><b>Impact WI</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPACT__IMPACT_WI = eINSTANCE.getImpact_ImpactWI();

    /**
     * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPACT__LIKELIHOOD = eINSTANCE.getImpact_Likelihood();

    /**
     * The meta object literal for the '<em><b>Risk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPACT__RISK = eINSTANCE.getImpact_Risk();

  }

} //ObjectsModelPackage
