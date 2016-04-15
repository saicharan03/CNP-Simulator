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

import xtext.objectsModel.Impact;
import xtext.objectsModel.ObjectsModelPackage;
import xtext.objectsModel.RequiredService;
import xtext.objectsModel.WorkItem;
import xtext.objectsModel.WorkItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#isHasPredecessors <em>Has Predecessors</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getPdTasks <em>Pd Tasks</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getScTasks <em>Sc Tasks</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#isIsAggregationNode <em>Is Aggregation Node</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getSbTasks <em>Sb Tasks</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getUpTasks <em>Up Tasks</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#isHasImpacts <em>Has Impacts</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getRequiredAnalysis <em>Required Analysis</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link xtext.objectsModel.impl.WorkItemImpl#getDueDate <em>Due Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkItemImpl extends MinimalEObjectImpl.Container implements WorkItem
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected WorkItemType type;

  /**
   * The default value of the '{@link #isHasPredecessors() <em>Has Predecessors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasPredecessors()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_PREDECESSORS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasPredecessors() <em>Has Predecessors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasPredecessors()
   * @generated
   * @ordered
   */
  protected boolean hasPredecessors = HAS_PREDECESSORS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPdTasks() <em>Pd Tasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPdTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> pdTasks;

  /**
   * The cached value of the '{@link #getScTasks() <em>Sc Tasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> scTasks;

  /**
   * The default value of the '{@link #isIsAggregationNode() <em>Is Aggregation Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAggregationNode()
   * @generated
   * @ordered
   */
  protected static final boolean IS_AGGREGATION_NODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAggregationNode() <em>Is Aggregation Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAggregationNode()
   * @generated
   * @ordered
   */
  protected boolean isAggregationNode = IS_AGGREGATION_NODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSbTasks() <em>Sb Tasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSbTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> sbTasks;

  /**
   * The cached value of the '{@link #getUpTasks() <em>Up Tasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> upTasks;

  /**
   * The default value of the '{@link #isHasImpacts() <em>Has Impacts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasImpacts()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_IMPACTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasImpacts() <em>Has Impacts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasImpacts()
   * @generated
   * @ordered
   */
  protected boolean hasImpacts = HAS_IMPACTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getImpacts() <em>Impacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpacts()
   * @generated
   * @ordered
   */
  protected EList<Impact> impacts;

  /**
   * The cached value of the '{@link #getRequiredAnalysis() <em>Required Analysis</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredAnalysis()
   * @generated
   * @ordered
   */
  protected EList<RequiredService> requiredAnalysis;

  /**
   * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredServices()
   * @generated
   * @ordered
   */
  protected EList<RequiredService> requiredServices;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final double VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected double value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrivalTime()
   * @generated
   * @ordered
   */
  protected static final int ARRIVAL_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrivalTime()
   * @generated
   * @ordered
   */
  protected int arrivalTime = ARRIVAL_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDueDate()
   * @generated
   * @ordered
   */
  protected static final int DUE_DATE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDueDate()
   * @generated
   * @ordered
   */
  protected int dueDate = DUE_DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkItemImpl()
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
    return ObjectsModelPackage.Literals.WORK_ITEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (WorkItemType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectsModelPackage.WORK_ITEM__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(WorkItemType newType)
  {
    WorkItemType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasPredecessors()
  {
    return hasPredecessors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasPredecessors(boolean newHasPredecessors)
  {
    boolean oldHasPredecessors = hasPredecessors;
    hasPredecessors = newHasPredecessors;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__HAS_PREDECESSORS, oldHasPredecessors, hasPredecessors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getPdTasks()
  {
    if (pdTasks == null)
    {
      pdTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, ObjectsModelPackage.WORK_ITEM__PD_TASKS);
    }
    return pdTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getScTasks()
  {
    if (scTasks == null)
    {
      scTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, ObjectsModelPackage.WORK_ITEM__SC_TASKS);
    }
    return scTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAggregationNode()
  {
    return isAggregationNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAggregationNode(boolean newIsAggregationNode)
  {
    boolean oldIsAggregationNode = isAggregationNode;
    isAggregationNode = newIsAggregationNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__IS_AGGREGATION_NODE, oldIsAggregationNode, isAggregationNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getSbTasks()
  {
    if (sbTasks == null)
    {
      sbTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, ObjectsModelPackage.WORK_ITEM__SB_TASKS);
    }
    return sbTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getUpTasks()
  {
    if (upTasks == null)
    {
      upTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, ObjectsModelPackage.WORK_ITEM__UP_TASKS);
    }
    return upTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasImpacts()
  {
    return hasImpacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasImpacts(boolean newHasImpacts)
  {
    boolean oldHasImpacts = hasImpacts;
    hasImpacts = newHasImpacts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__HAS_IMPACTS, oldHasImpacts, hasImpacts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Impact> getImpacts()
  {
    if (impacts == null)
    {
      impacts = new EObjectContainmentEList<Impact>(Impact.class, this, ObjectsModelPackage.WORK_ITEM__IMPACTS);
    }
    return impacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RequiredService> getRequiredAnalysis()
  {
    if (requiredAnalysis == null)
    {
      requiredAnalysis = new EObjectResolvingEList<RequiredService>(RequiredService.class, this, ObjectsModelPackage.WORK_ITEM__REQUIRED_ANALYSIS);
    }
    return requiredAnalysis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RequiredService> getRequiredServices()
  {
    if (requiredServices == null)
    {
      requiredServices = new EObjectResolvingEList<RequiredService>(RequiredService.class, this, ObjectsModelPackage.WORK_ITEM__REQUIRED_SERVICES);
    }
    return requiredServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(double newValue)
  {
    double oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArrivalTime()
  {
    return arrivalTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrivalTime(int newArrivalTime)
  {
    int oldArrivalTime = arrivalTime;
    arrivalTime = newArrivalTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__ARRIVAL_TIME, oldArrivalTime, arrivalTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDueDate()
  {
    return dueDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDueDate(int newDueDate)
  {
    int oldDueDate = dueDate;
    dueDate = newDueDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObjectsModelPackage.WORK_ITEM__DUE_DATE, oldDueDate, dueDate));
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
      case ObjectsModelPackage.WORK_ITEM__IMPACTS:
        return ((InternalEList<?>)getImpacts()).basicRemove(otherEnd, msgs);
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
      case ObjectsModelPackage.WORK_ITEM__NAME:
        return getName();
      case ObjectsModelPackage.WORK_ITEM__ID:
        return getId();
      case ObjectsModelPackage.WORK_ITEM__DESCRIPTION:
        return getDescription();
      case ObjectsModelPackage.WORK_ITEM__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case ObjectsModelPackage.WORK_ITEM__HAS_PREDECESSORS:
        return isHasPredecessors();
      case ObjectsModelPackage.WORK_ITEM__PD_TASKS:
        return getPdTasks();
      case ObjectsModelPackage.WORK_ITEM__SC_TASKS:
        return getScTasks();
      case ObjectsModelPackage.WORK_ITEM__IS_AGGREGATION_NODE:
        return isIsAggregationNode();
      case ObjectsModelPackage.WORK_ITEM__SB_TASKS:
        return getSbTasks();
      case ObjectsModelPackage.WORK_ITEM__UP_TASKS:
        return getUpTasks();
      case ObjectsModelPackage.WORK_ITEM__HAS_IMPACTS:
        return isHasImpacts();
      case ObjectsModelPackage.WORK_ITEM__IMPACTS:
        return getImpacts();
      case ObjectsModelPackage.WORK_ITEM__REQUIRED_ANALYSIS:
        return getRequiredAnalysis();
      case ObjectsModelPackage.WORK_ITEM__REQUIRED_SERVICES:
        return getRequiredServices();
      case ObjectsModelPackage.WORK_ITEM__VALUE:
        return getValue();
      case ObjectsModelPackage.WORK_ITEM__ARRIVAL_TIME:
        return getArrivalTime();
      case ObjectsModelPackage.WORK_ITEM__DUE_DATE:
        return getDueDate();
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
      case ObjectsModelPackage.WORK_ITEM__NAME:
        setName((String)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__ID:
        setId((Integer)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__TYPE:
        setType((WorkItemType)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__HAS_PREDECESSORS:
        setHasPredecessors((Boolean)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__PD_TASKS:
        getPdTasks().clear();
        getPdTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__SC_TASKS:
        getScTasks().clear();
        getScTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__IS_AGGREGATION_NODE:
        setIsAggregationNode((Boolean)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__SB_TASKS:
        getSbTasks().clear();
        getSbTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__UP_TASKS:
        getUpTasks().clear();
        getUpTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__HAS_IMPACTS:
        setHasImpacts((Boolean)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__IMPACTS:
        getImpacts().clear();
        getImpacts().addAll((Collection<? extends Impact>)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__REQUIRED_ANALYSIS:
        getRequiredAnalysis().clear();
        getRequiredAnalysis().addAll((Collection<? extends RequiredService>)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__REQUIRED_SERVICES:
        getRequiredServices().clear();
        getRequiredServices().addAll((Collection<? extends RequiredService>)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__VALUE:
        setValue((Double)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__ARRIVAL_TIME:
        setArrivalTime((Integer)newValue);
        return;
      case ObjectsModelPackage.WORK_ITEM__DUE_DATE:
        setDueDate((Integer)newValue);
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
      case ObjectsModelPackage.WORK_ITEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM__ID:
        setId(ID_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM__TYPE:
        setType((WorkItemType)null);
        return;
      case ObjectsModelPackage.WORK_ITEM__HAS_PREDECESSORS:
        setHasPredecessors(HAS_PREDECESSORS_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM__PD_TASKS:
        getPdTasks().clear();
        return;
      case ObjectsModelPackage.WORK_ITEM__SC_TASKS:
        getScTasks().clear();
        return;
      case ObjectsModelPackage.WORK_ITEM__IS_AGGREGATION_NODE:
        setIsAggregationNode(IS_AGGREGATION_NODE_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM__SB_TASKS:
        getSbTasks().clear();
        return;
      case ObjectsModelPackage.WORK_ITEM__UP_TASKS:
        getUpTasks().clear();
        return;
      case ObjectsModelPackage.WORK_ITEM__HAS_IMPACTS:
        setHasImpacts(HAS_IMPACTS_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM__IMPACTS:
        getImpacts().clear();
        return;
      case ObjectsModelPackage.WORK_ITEM__REQUIRED_ANALYSIS:
        getRequiredAnalysis().clear();
        return;
      case ObjectsModelPackage.WORK_ITEM__REQUIRED_SERVICES:
        getRequiredServices().clear();
        return;
      case ObjectsModelPackage.WORK_ITEM__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM__ARRIVAL_TIME:
        setArrivalTime(ARRIVAL_TIME_EDEFAULT);
        return;
      case ObjectsModelPackage.WORK_ITEM__DUE_DATE:
        setDueDate(DUE_DATE_EDEFAULT);
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
      case ObjectsModelPackage.WORK_ITEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ObjectsModelPackage.WORK_ITEM__ID:
        return id != ID_EDEFAULT;
      case ObjectsModelPackage.WORK_ITEM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ObjectsModelPackage.WORK_ITEM__TYPE:
        return type != null;
      case ObjectsModelPackage.WORK_ITEM__HAS_PREDECESSORS:
        return hasPredecessors != HAS_PREDECESSORS_EDEFAULT;
      case ObjectsModelPackage.WORK_ITEM__PD_TASKS:
        return pdTasks != null && !pdTasks.isEmpty();
      case ObjectsModelPackage.WORK_ITEM__SC_TASKS:
        return scTasks != null && !scTasks.isEmpty();
      case ObjectsModelPackage.WORK_ITEM__IS_AGGREGATION_NODE:
        return isAggregationNode != IS_AGGREGATION_NODE_EDEFAULT;
      case ObjectsModelPackage.WORK_ITEM__SB_TASKS:
        return sbTasks != null && !sbTasks.isEmpty();
      case ObjectsModelPackage.WORK_ITEM__UP_TASKS:
        return upTasks != null && !upTasks.isEmpty();
      case ObjectsModelPackage.WORK_ITEM__HAS_IMPACTS:
        return hasImpacts != HAS_IMPACTS_EDEFAULT;
      case ObjectsModelPackage.WORK_ITEM__IMPACTS:
        return impacts != null && !impacts.isEmpty();
      case ObjectsModelPackage.WORK_ITEM__REQUIRED_ANALYSIS:
        return requiredAnalysis != null && !requiredAnalysis.isEmpty();
      case ObjectsModelPackage.WORK_ITEM__REQUIRED_SERVICES:
        return requiredServices != null && !requiredServices.isEmpty();
      case ObjectsModelPackage.WORK_ITEM__VALUE:
        return value != VALUE_EDEFAULT;
      case ObjectsModelPackage.WORK_ITEM__ARRIVAL_TIME:
        return arrivalTime != ARRIVAL_TIME_EDEFAULT;
      case ObjectsModelPackage.WORK_ITEM__DUE_DATE:
        return dueDate != DUE_DATE_EDEFAULT;
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
    result.append(", hasPredecessors: ");
    result.append(hasPredecessors);
    result.append(", isAggregationNode: ");
    result.append(isAggregationNode);
    result.append(", hasImpacts: ");
    result.append(hasImpacts);
    result.append(", value: ");
    result.append(value);
    result.append(", arrivalTime: ");
    result.append(arrivalTime);
    result.append(", dueDate: ");
    result.append(dueDate);
    result.append(')');
    return result.toString();
  }

} //WorkItemImpl
