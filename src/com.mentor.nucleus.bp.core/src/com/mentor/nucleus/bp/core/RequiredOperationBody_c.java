package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.RequiredOperationBody_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_REQUIRED_OPERATION_BODY extends genericEvent_c {
	public abstract int getEvtcode();
}

public class RequiredOperationBody_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public RequiredOperationBody_c(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_id = IdAssigner.preprocessUUID(p_m_id);

		Object[] key = {m_action_id};
		addInstanceToMap(key);
	}
	static public RequiredOperationBody_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(RequiredOperationBody_c.class);
		RequiredOperationBody_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id};
			new_inst = (RequiredOperationBody_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_id = IdAssigner.preprocessUUID(p_m_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new RequiredOperationBody_c(modelRoot, p_m_action_id,
					p_m_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public RequiredOperationBody_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_id) {
		InstanceList instances = modelRoot
				.getInstanceList(RequiredOperationBody_c.class);
		RequiredOperationBody_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id};
			source = (RequiredOperationBody_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_id = IdAssigner.preprocessUUID(p_m_id);

				return source;
			}
		}
		// there is no instance matching the id
		RequiredOperationBody_c new_inst = new RequiredOperationBody_c(
				modelRoot, p_m_action_id, p_m_id);
		return new_inst;
	}
	public RequiredOperationBody_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_action_id = IdAssigner.NULL_UUID;
		m_id = IdAssigner.NULL_UUID;
		Object[] key = {m_action_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_action_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_action_id != p_newKey) {

			m_action_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof RequiredOperationBody_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof RequiredOperationBody_c)) {
			return false;
		}

		RequiredOperationBody_c me = (RequiredOperationBody_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getAction_id()) || IdAssigner.NULL_UUID
				.equals(((RequiredOperationBody_c) elem).getAction_id()))
				&& this != elem) {
			return false;
		}
		if (!getAction_id().equals(
				((RequiredOperationBody_c) elem).getAction_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof RequiredOperationBody_c)) {
			return false;
		}

		RequiredOperationBody_c me = (RequiredOperationBody_c) elem;
		if (!getAction_idCachedValue().equals(
				((RequiredOperationBody_c) elem).getAction_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_action_id;
	private java.util.UUID m_id;

	// declare association references from this class

	// referring navigation

	RequiredOperation_c SpecifiesProcessingForRequiredOperation;
	public void relateAcrossR685To(RequiredOperation_c target) {
		relateAcrossR685To(target, true);
	}
	public void relateAcrossR685To(RequiredOperation_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == SpecifiesProcessingForRequiredOperation)
			return; // already related

		if (SpecifiesProcessingForRequiredOperation != target) {

			Object oldKey = getInstanceKey();

			if (SpecifiesProcessingForRequiredOperation != null) {

				SpecifiesProcessingForRequiredOperation
						.clearBackPointerR685To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"RequiredOperationBody_c.relateAcrossR685To(RequiredOperation_c target)",
									"Relate performed across R685 from Required Operation Body to Required Operation without unrelate of prior instance.");
				}
			}

			SpecifiesProcessingForRequiredOperation = target;
			if (IdAssigner.NULL_UUID.equals(target.getId())) {
				// do not update cached value
			} else {
				// update cached value
				m_id = target.getIdCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR685To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR685From(RequiredOperation_c target) {
		unrelateAcrossR685From(target, true);
	}
	public void unrelateAcrossR685From(RequiredOperation_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (SpecifiesProcessingForRequiredOperation == null)
			return; // already unrelated

		if (target != SpecifiesProcessingForRequiredOperation) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R685",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR685To(this);
		}

		if (SpecifiesProcessingForRequiredOperation != null) {

			m_id = SpecifiesProcessingForRequiredOperation.getId();
			if (IdAssigner.NULL_UUID.equals(m_id)) {
				m_id = SpecifiesProcessingForRequiredOperation
						.getIdCachedValue();
			}
			SpecifiesProcessingForRequiredOperation = null;
			target.removeRef();
		}
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR685(
			RequiredOperation_c[] targets) {
		return getOneACT_ROBOnR685(targets, null);
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR685(
			RequiredOperation_c[] targets, ClassQueryInterface_c test) {
		RequiredOperationBody_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_ROBOnR685(targets[i], test);
			}
		}

		return ret_val;
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR685(
			RequiredOperation_c target) {
		return getOneACT_ROBOnR685(target, null);
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR685(
			RequiredOperation_c target, boolean loadComponent) {
		return getOneACT_ROBOnR685(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR685(
			RequiredOperation_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_ROBOnR685(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR685(
			ModelRoot modelRoot, RequiredOperation_c target,
			ClassQueryInterface_c test) {
		return getOneACT_ROBOnR685(modelRoot, target, test, true);
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR685(
			ModelRoot modelRoot, RequiredOperation_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneACT_ROBOnR685(modelRoot, target, test);
	}
	private static RequiredOperationBody_c find_getOneACT_ROBOnR685(
			ModelRoot modelRoot, RequiredOperation_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			RequiredOperationBody_c source = (RequiredOperationBody_c) target.backPointer_RequiredOperationBody_R685;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static RequiredOperationBody_c[] getManyACT_ROBsOnR685(
			RequiredOperation_c[] targets) {
		return getManyACT_ROBsOnR685(targets, null);
	}
	public static RequiredOperationBody_c[] getManyACT_ROBsOnR685(
			RequiredOperation_c[] targets, boolean loadComponent) {
		return getManyACT_ROBsOnR685(targets, null, loadComponent);
	}
	public static RequiredOperationBody_c[] getManyACT_ROBsOnR685(
			RequiredOperation_c[] targets, ClassQueryInterface_c test) {
		return getManyACT_ROBsOnR685(targets, test, true);
	}

	public static RequiredOperationBody_c[] getManyACT_ROBsOnR685(
			RequiredOperation_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new RequiredOperationBody_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(RequiredOperationBody_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			RequiredOperationBody_c source = (RequiredOperationBody_c) targets[i].backPointer_RequiredOperationBody_R685;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			RequiredOperationBody_c[] ret_set = new RequiredOperationBody_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new RequiredOperationBody_c[0];
		}
	}

	public static RequiredOperationBody_c[] getManyACT_ROBsOnR685(
			RequiredOperation_c target) {
		if (target != null) {
			RequiredOperation_c[] targetArray = new RequiredOperation_c[1];
			targetArray[0] = target;
			return getManyACT_ROBsOnR685(targetArray);
		} else {
			RequiredOperationBody_c[] result = new RequiredOperationBody_c[0];
			return result;
		}
	}

	public static RequiredOperationBody_c[] getManyACT_ROBsOnR685(
			RequiredOperation_c target, boolean loadComponent) {
		if (target != null) {
			RequiredOperation_c[] targetArray = new RequiredOperation_c[1];
			targetArray[0] = target;
			return getManyACT_ROBsOnR685(targetArray, loadComponent);
		} else {
			RequiredOperationBody_c[] result = new RequiredOperationBody_c[0];
			return result;
		}
	}

	// referring navigation

	Body_c IsSupertypeBody;
	public void relateAcrossR698To(Body_c target) {
		relateAcrossR698To(target, true);
	}
	public void relateAcrossR698To(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeBody)
			return; // already related

		if (IsSupertypeBody != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeBody != null) {

				IsSupertypeBody.clearBackPointerR698To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"RequiredOperationBody_c.relateAcrossR698To(Body_c target)",
									"Relate performed across R698 from Required Operation Body to Body without unrelate of prior instance.");
				}
			}

			IsSupertypeBody = target;
			m_action_id = target.getAction_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR698To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR698From(Body_c target) {
		unrelateAcrossR698From(target, true);
	}
	public void unrelateAcrossR698From(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeBody == null)
			return; // already unrelated

		if (target != IsSupertypeBody) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R698",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR698To(this);
		}

		if (IsSupertypeBody != null) {

			m_action_id = IsSupertypeBody.getAction_id();
			IsSupertypeBody = null;
			target.removeRef();
		}
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR698(Body_c[] targets) {
		return getOneACT_ROBOnR698(targets, null);
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR698(Body_c[] targets,
			ClassQueryInterface_c test) {
		RequiredOperationBody_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_ROBOnR698(targets[i], test);
			}
		}

		return ret_val;
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR698(Body_c target) {
		return getOneACT_ROBOnR698(target, null);
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR698(Body_c target,
			boolean loadComponent) {
		return getOneACT_ROBOnR698(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR698(Body_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_ROBOnR698(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR698(
			ModelRoot modelRoot, Body_c target, ClassQueryInterface_c test) {
		return getOneACT_ROBOnR698(modelRoot, target, test, true);
	}

	public static RequiredOperationBody_c getOneACT_ROBOnR698(
			ModelRoot modelRoot, Body_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneACT_ROBOnR698(modelRoot, target, test);
	}
	private static RequiredOperationBody_c find_getOneACT_ROBOnR698(
			ModelRoot modelRoot, Body_c target, ClassQueryInterface_c test) {
		if (target != null) {
			RequiredOperationBody_c source = (RequiredOperationBody_c) target.backPointer_IsSubtypeRequiredOperationBodyIsSubtype_R698;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static RequiredOperationBody_c[] getManyACT_ROBsOnR698(
			Body_c[] targets) {
		return getManyACT_ROBsOnR698(targets, null);
	}
	public static RequiredOperationBody_c[] getManyACT_ROBsOnR698(
			Body_c[] targets, boolean loadComponent) {
		return getManyACT_ROBsOnR698(targets, null, loadComponent);
	}
	public static RequiredOperationBody_c[] getManyACT_ROBsOnR698(
			Body_c[] targets, ClassQueryInterface_c test) {
		return getManyACT_ROBsOnR698(targets, test, true);
	}

	public static RequiredOperationBody_c[] getManyACT_ROBsOnR698(
			Body_c[] targets, ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new RequiredOperationBody_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(RequiredOperationBody_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			RequiredOperationBody_c source = (RequiredOperationBody_c) targets[i].backPointer_IsSubtypeRequiredOperationBodyIsSubtype_R698;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			RequiredOperationBody_c[] ret_set = new RequiredOperationBody_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new RequiredOperationBody_c[0];
		}
	}

	public static RequiredOperationBody_c[] getManyACT_ROBsOnR698(Body_c target) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_ROBsOnR698(targetArray);
		} else {
			RequiredOperationBody_c[] result = new RequiredOperationBody_c[0];
			return result;
		}
	}

	public static RequiredOperationBody_c[] getManyACT_ROBsOnR698(
			Body_c target, boolean loadComponent) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_ROBsOnR698(targetArray, loadComponent);
		} else {
			RequiredOperationBody_c[] result = new RequiredOperationBody_c[0];
			return result;
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		if (SpecifiesProcessingForRequiredOperation == null) {
			// R685
			RequiredOperation_c relInst56235 = (RequiredOperation_c) baseRoot
					.getInstanceList(RequiredOperation_c.class).get(
							new Object[]{m_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst56235 == null) {
				relInst56235 = (RequiredOperation_c) Ooaofooa
						.getDefaultInstance()
						.getInstanceList(RequiredOperation_c.class)
						.get(new Object[]{m_id});
			}
			if (relInst56235 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst56235 = (RequiredOperation_c) roots[i]
							.getInstanceList(RequiredOperation_c.class).get(
									new Object[]{m_id});
					if (relInst56235 != null)
						break;
				}
			}
			//synchronized
			if (relInst56235 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst56235) && !isProxy())) {
					relInst56235.relateAcrossR685To(this, notifyChanges);
				}
			}
		}

		// R698
		Body_c relInst56236 = (Body_c) baseRoot.getInstanceList(Body_c.class)
				.get(new Object[]{m_action_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst56236 == null) {
			relInst56236 = (Body_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Body_c.class)
					.get(new Object[]{m_action_id});
		}
		if (relInst56236 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst56236 = (Body_c) roots[i].getInstanceList(Body_c.class)
						.get(new Object[]{m_action_id});
				if (relInst56236 != null)
					break;
			}
		}
		//synchronized
		if (relInst56236 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst56236) && !isProxy())) {
				relInst56236.relateAcrossR698To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R685
		// SPR_RO
		inst = SpecifiesProcessingForRequiredOperation;
		unrelateAcrossR685From(SpecifiesProcessingForRequiredOperation,
				notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// R698
		// ACT_ACT
		inst = IsSupertypeBody;
		unrelateAcrossR698From(IsSupertypeBody, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(RequiredOperationBody_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final RequiredOperationBody_c inst = (RequiredOperationBody_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(RequiredOperationBody_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static RequiredOperationBody_c RequiredOperationBodyInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		RequiredOperationBody_c result = findRequiredOperationBodyInstance(
				modelRoot, test, loadComponent);
		return result;
	}
	private static RequiredOperationBody_c findRequiredOperationBodyInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(RequiredOperationBody_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				RequiredOperationBody_c x = (RequiredOperationBody_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static RequiredOperationBody_c RequiredOperationBodyInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return RequiredOperationBodyInstance(modelRoot, test, true);
	}

	public static RequiredOperationBody_c RequiredOperationBodyInstance(
			ModelRoot modelRoot) {
		return RequiredOperationBodyInstance(modelRoot, null, true);
	}

	public static RequiredOperationBody_c[] RequiredOperationBodyInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(RequiredOperationBody_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				RequiredOperationBody_c x = (RequiredOperationBody_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				RequiredOperationBody_c[] ret_set = new RequiredOperationBody_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new RequiredOperationBody_c[0];
			}
		}
	}
	public static RequiredOperationBody_c[] RequiredOperationBodyInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return RequiredOperationBodyInstances(modelRoot, test, true);
	}
	public static RequiredOperationBody_c[] RequiredOperationBodyInstances(
			ModelRoot modelRoot) {
		return RequiredOperationBodyInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Required Operation Body.dispose call: ";
		RequiredOperation_c testR685Inst = RequiredOperation_c
				.getOneSPR_ROOnR685(this, false);

		if (testR685Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "685 ";
		}
		Body_c testR698Inst9 = Body_c.getOneACT_ACTOnR698(this, false);

		if (testR698Inst9 != null) {
			delete_error = true;
			errorMsg = errorMsg + "698 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Required Operation Body",
						errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("action_id")) {
			return true;
		}
		if (attributeName.equals("id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getAction_idLongBased() {
		if (IsSupertypeBody != null) {
			return IsSupertypeBody.getAction_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getAction_id() {
		if (IsSupertypeBody != null) {
			return IsSupertypeBody.getAction_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeBody != null);

	}

	public java.util.UUID getAction_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_action_id))
			return m_action_id;
		else
			return getAction_id();
	}

	public void setAction_id(java.util.UUID newValue) {
		m_action_id = IdAssigner.preprocessUUID(newValue);
	}
	public long getIdLongBased() {
		if (SpecifiesProcessingForRequiredOperation != null) {
			return SpecifiesProcessingForRequiredOperation.getIdLongBased();
		}
		return 0;
	}
	public java.util.UUID getId() {
		if (SpecifiesProcessingForRequiredOperation != null) {
			return SpecifiesProcessingForRequiredOperation.getId();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getIdCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_id))
			return m_id;
		else
			return getId();
	}

	public void setId(java.util.UUID newValue) {
		m_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Required Operation Body", //$NON-NLS-1$
						" Operation entered: Required Operation Body::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		RequiredOperationBody_c[] objs = RequiredOperationBody_c
				.RequiredOperationBodyInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Required Operation Body", //$NON-NLS-1$
						" Operation entered: Required Operation Body::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class RequiredOperationBody_c_test56238_c
				implements
					ClassQueryInterface_c {
			RequiredOperationBody_c_test56238_c(java.util.UUID p56239) {
				m_p56239 = p56239;
			}
			private java.util.UUID m_p56239;
			public boolean evaluate(Object candidate) {
				RequiredOperationBody_c selected = (RequiredOperationBody_c) candidate;
				boolean retval = false;
				retval = (selected.getAction_id().equals(m_p56239));
				return retval;
			}
		}

		RequiredOperationBody_c[] objs56237 = RequiredOperationBody_c
				.RequiredOperationBodyInstances(modelRoot,
						new RequiredOperationBody_c_test56238_c(getAction_id()));

		if (((objs56237.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Required Operation Body", //$NON-NLS-1$
								"Consistency: Object: Required Operation Body: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56237.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Required Operation Body: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56237.length), e);
			}
			retval = false;

		}

		if (((objs56237.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Required Operation Body", //$NON-NLS-1$
								"Consistency: Object: Required Operation Body: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56237.length)
										+ " Action_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Required Operation Body: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56237.length)
										+ " Action_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Required Operation Body is a subtype in association: rel.Numb = 698
		// The supertype class is: Body
		class Body_c_test56243_c implements ClassQueryInterface_c {
			Body_c_test56243_c(java.util.UUID p56244) {
				m_p56244 = p56244;
			}
			private java.util.UUID m_p56244;
			public boolean evaluate(Object candidate) {
				Body_c selected = (Body_c) candidate;
				boolean retval = false;
				retval = (selected.getAction_id().equals(m_p56244));
				return retval;
			}
		}

		Body_c[] objs56242 = Body_c.BodyInstances(modelRoot,
				new Body_c_test56243_c(getAction_id()));

		if (((objs56242.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Required Operation Body", //$NON-NLS-1$
								"Consistency: Object: Required Operation Body: Association: 698: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56242.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Required Operation Body: Association: 698: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56242.length), e);
			}
			retval = false;

		}

		// Required Operation Body is a referring class in association: rel.Numb = 685
		// The participating class is: Required Operation
		class RequiredOperation_c_test56246_c implements ClassQueryInterface_c {
			RequiredOperation_c_test56246_c(java.util.UUID p56247) {
				m_p56247 = p56247;
			}
			private java.util.UUID m_p56247;
			public boolean evaluate(Object candidate) {
				RequiredOperation_c selected = (RequiredOperation_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p56247));
				return retval;
			}
		}

		RequiredOperation_c[] objs56245 = RequiredOperation_c
				.RequiredOperationInstances(modelRoot,
						new RequiredOperation_c_test56246_c(getId()));

		// The participant is unconditional
		// The multiplicity of the participant is one
		if (((objs56245.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Required Operation Body", //$NON-NLS-1$
								"Consistency: Object: Required Operation Body: Association: 685: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56245.length)
										+ " Id: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Required Operation Body: Association: 685: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56245.length)
										+ " Id: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Required Operation Body",
				" Operation entered: RequiredOperationBody::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		RequiredOperation_c v_act = RequiredOperation_c
				.getOneSPR_ROOnR685(this);

		if (((v_act != null))) {

			this.unrelateAcrossR685From(v_act);

		}

		delete();

	} // End dispose
	public java.util.UUID Getcontainingcomponentid() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Required Operation Body",
						" Operation entered: RequiredOperationBody::Getcontainingcomponentid");
		final ModelRoot modelRoot = getModelRoot();
		RequiredOperation_c v_requiredOp = RequiredOperation_c
				.getOneSPR_ROOnR685(this);

		return v_requiredOp.Getcomponentid();

	} // End getContainingComponentId
	public java.util.UUID Getcontainerid() {
		Ooaofooa.log.println(ILogger.OPERATION, "Required Operation Body",
				" Operation entered: RequiredOperationBody::Getcontainerid");
		final ModelRoot modelRoot = getModelRoot();
		RequiredOperation_c v_requiredOp = RequiredOperation_c
				.getOneSPR_ROOnR685(this);

		return v_requiredOp.Getcomponentid();

	} // End getContainerId
	public String Getpath() {
		Ooaofooa.log.println(ILogger.OPERATION, "Required Operation Body",
				" Operation entered: RequiredOperationBody::Getpath");
		final ModelRoot modelRoot = getModelRoot();
		RequiredOperation_c v_requiredOp = RequiredOperation_c
				.getOneSPR_ROOnR685(this);

		String v_requiredOpPath = "";

		String v_requiredOpName = "";

		if (((v_requiredOp != null))) {

			v_requiredOpName = v_requiredOp.getName();

			Component_c v_comp = Component_c
					.getOneC_COnR4010(Port_c.getOneC_POOnR4016(InterfaceReference_c.getOneC_IROnR4009(Requirement_c
							.getOneC_ROnR4500(RequiredExecutableProperty_c
									.getOneSPR_REPOnR4502(v_requiredOp)))));

			v_requiredOpPath = v_comp.Getpath(true, v_requiredOpName);

		}

		return v_requiredOpPath;

	} // End getPath

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Required Operation Body