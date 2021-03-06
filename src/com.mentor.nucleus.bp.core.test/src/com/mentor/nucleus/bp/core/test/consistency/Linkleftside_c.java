      
package com.mentor.nucleus.bp.core.test.consistency ;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.test.consistency.Linkleftside_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.test.CoreTestPlugin;
import java.util.* ;
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
abstract class EV_LINKLEFTSIDE extends genericEvent_c 
{
  public abstract int getEvtcode() ;
}

public class Linkleftside_c extends NonRootModelElement implements IAdaptable, Cloneable
{
  // Public Constructors
  public Linkleftside_c(ModelRoot modelRoot,
       int          p_m_llsid)
  {
    super(modelRoot);
       m_llsid = p_m_llsid;
        
    Object [] key = {new UUID(0, new Long(m_llsid))};
    addInstanceToMap(key);
  }
  static public Linkleftside_c createProxy(ModelRoot modelRoot,
       int          p_m_llsid, String p_contentPath, IPath p_localPath)
  {
	  ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot, p_contentPath, p_localPath);
	  // if a model root was not resolved it is most likely
	  // due to a missing file of the proxy, defualt back to
	  // the original model root
	  if(resolvedModelRoot != null)
	  	modelRoot = resolvedModelRoot;
      InstanceList instances = modelRoot.getInstanceList(Linkleftside_c.class);
      Linkleftside_c new_inst = null;
      synchronized(instances) {
          Object[] key = {new UUID(0, new Long(p_m_llsid))};
          new_inst = (Linkleftside_c) instances.get(key) ;
        }
	String contentPath = PersistenceUtil.resolveRelativePath(
			p_localPath,
			new Path(p_contentPath));
	if(modelRoot.isNewCompareRoot()) {
	      // for comparisons we do not want to change
	      // the content path
	      contentPath = p_contentPath;
	}
	if ( new_inst != null && !modelRoot.isCompareRoot()) {
		PersistableModelComponent pmc = new_inst.getPersistableComponent();
		if (pmc == null) {
			// dangling reference, redo this instance
			new_inst.batchUnrelate();
       new_inst.m_llsid = p_m_llsid;
        
		}
	}
	if ( new_inst == null ) {
		// there is no instance matching the id, create a proxy
		// if the resource doesn't exist then this will be a dangling reference
    	new_inst = new Linkleftside_c(modelRoot,
p_m_llsid
);
		new_inst.m_contentPath = contentPath;
	}
    return new_inst;
  }

  static public Linkleftside_c resolveInstance(ModelRoot modelRoot,
       int          p_m_llsid){
    InstanceList instances = modelRoot.getInstanceList(Linkleftside_c.class);
    Linkleftside_c source = null;
    synchronized(instances) {
        Object [] key = {
        new UUID(0, new Long(p_m_llsid))
            };
        source = (Linkleftside_c) instances.get(key);
        if (source != null && !modelRoot.isCompareRoot()) {
           source.convertFromProxy();
           source.batchUnrelate();
       source.m_llsid = p_m_llsid;
        
           return source ;
        }
      }
      // there is no instance matching the id
    Linkleftside_c new_inst = new Linkleftside_c(modelRoot,
p_m_llsid
);
    return new_inst;
  }
  public Linkleftside_c(ModelRoot modelRoot)
  {
    super(modelRoot);
    Object [] key = {new UUID(0, new Long(m_llsid))};
    addInstanceToMap(key);
  }

  public Object getInstanceKey() {
    Object [] key =  {new UUID(0, new Long(m_llsid))};
		return key;
  }
  
  public boolean setInstanceKey(UUID p_newKey){
  
  	boolean changed = false;
		// round p1
		// round p2
		// round p3
			// round p6
		// round p7
  	return changed;
  }
  

  



  public boolean equals (Object elem) {
     if (!(elem instanceof Linkleftside_c)) {
         return false;
     }
	    // check that the model-roots are the same
    	if (((NonRootModelElement)elem).getModelRoot() != getModelRoot()) {
    		return false;
    	}
    	
     return identityEquals(elem);
  }
  
   public boolean identityEquals(Object elem) {
       if (!(elem instanceof Linkleftside_c)) {
           return false;
       }
       
       Linkleftside_c me = (Linkleftside_c)elem;
      if (getLlsid() != ((Linkleftside_c)elem).getLlsid()) return false;
      return true;
    }

   public boolean cachedIdentityEquals(Object elem) {
       if (!(elem instanceof Linkleftside_c)) {
           return false;
       }
       
       Linkleftside_c me = (Linkleftside_c)elem;
      if (getLlsid() != ((Linkleftside_c)elem).getLlsid()) return false;
      return true;
    }


  // Attributes
  private int          m_llsid ;

// declare associations referring to this class

    
  
  
// referred to navigation

ArrayList<Linktest_c> backPointer_Linktest_R2 = new ArrayList<Linktest_c>();

public void setLinktestOrderInChildListR2(Linktest_c target, int index) {
	unrelateAcrossR2From(target);
	Linktest_c[] elements = Linktest_c.getManyCST_LTsOnR2(this);
	int count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			unrelateAcrossR2From((Linktest_c) elements[i]); 
		}
		count++;
	}
	relateAcrossR2To(target);
	count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			relateAcrossR2To((Linktest_c) elements[i]);
		}
		count++;
	}
}

public void relateAcrossR2To(Linktest_c target)
{
  if (target != null) {
    target.relateAcrossR2To(this, true) ;
  }
}

public void relateAcrossR2To(Linktest_c target, boolean notifyChanges)
{
  if (target != null) {
    target.relateAcrossR2To(this, notifyChanges) ;
  }
}

public void setBackPointerR2To(Linktest_c target)
{
  	synchronized (backPointer_Linktest_R2) {
		backPointer_Linktest_R2.add(target);
	}
}

public void unrelateAcrossR2From(Linktest_c target)
{
  if (target != null) {
    target.unrelateAcrossR2From(this, true) ;
  }
}

public void unrelateAcrossR2From(Linktest_c target, boolean notifyChanges)
{
  if (target != null) {
    target.unrelateAcrossR2From(this, notifyChanges) ;
  }
}

public void clearBackPointerR2To(Linktest_c target)
{
  synchronized (backPointer_Linktest_R2) {
	    backPointer_Linktest_R2.remove(target);
	}
}

public static Linkleftside_c getOneCST_LLSOnR2(Linktest_c [] targets)
{
    return getOneCST_LLSOnR2(targets, null);
}

public static Linkleftside_c getOneCST_LLSOnR2(Linktest_c [] targets, ClassQueryInterface_c test)
{
    return getOneCST_LLSOnR2(targets, test, true);
}

public static Linkleftside_c getOneCST_LLSOnR2(Linktest_c [] targets, ClassQueryInterface_c test, boolean loadComponent)
{
    Linkleftside_c ret_val = null;
    if (targets != null)
    {
        for (int i = 0; i < targets.length && ret_val == null; ++i )
        {
           if (test != null) {
             Linkleftside_c candidate_val = getOneCST_LLSOnR2(targets[i],true);
             if ( candidate_val != null && test.evaluate(candidate_val) )
             {
               ret_val = candidate_val;
               break;
             }
           }
           else {
             ret_val = getOneCST_LLSOnR2(targets[i], loadComponent);
             if (ret_val != null) {
               break;
             }
           }
        }
    }
    return ret_val;
}

public static Linkleftside_c getOneCST_LLSOnR2(Linktest_c target)
{
	return getOneCST_LLSOnR2(target, true);
}
public static Linkleftside_c getOneCST_LLSOnR2(Linktest_c target, boolean loadComponent)
{
  if (target != null) {
	if(loadComponent){
	     target.loadProxy();
	}
    return target.Linkleftside ;
  } else {
    return null;
  }
}

public static Linkleftside_c [] getManyCST_LLSsOnR2(Linktest_c [] targets,
    ClassQueryInterface_c test)
{
	return getManyCST_LLSsOnR2(targets, test, true);
}

public static Linkleftside_c [] getManyCST_LLSsOnR2(Linktest_c [] targets,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if(targets == null || targets.length == 0 || targets[0] == null)
    return new Linkleftside_c[0];
  
  
  LinkedHashSet<Linkleftside_c> elementsSet = new LinkedHashSet<Linkleftside_c>();
  for (int i = 0; i < targets.length; i++) {
	if(loadComponent && targets[i] != null && targets[i].Linkleftside == null)
	  targets[i].loadProxy();
    Linkleftside_c associate = targets[i].Linkleftside;
    if (targets[i] != null && associate != null
    	&& (test == null || test.evaluate(associate))) {
        	if (elementsSet.add(associate)){ 
            }
    }
  }

  Linkleftside_c[] result = new Linkleftside_c[elementsSet.size()];
  elementsSet.toArray(result);
  return result;
}

public static Linkleftside_c [] getManyCST_LLSsOnR2(Linktest_c [] targets)
{
  return getManyCST_LLSsOnR2(targets, null);
}

public static Linkleftside_c [] getManyCST_LLSsOnR2(Linktest_c target,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if (target != null) {
    Linktest_c [] targetArray = new Linktest_c[1];
    targetArray[0] = target;
    return getManyCST_LLSsOnR2(targetArray, test, loadComponent);
  } else {
    Linkleftside_c [] result = new Linkleftside_c [0] ;
    return result ;
  }
  
}

public static Linkleftside_c [] getManyCST_LLSsOnR2(Linktest_c target,
    ClassQueryInterface_c test)
{
    return getManyCST_LLSsOnR2(target, null, true);
}

public static Linkleftside_c [] getManyCST_LLSsOnR2(Linktest_c target)
{
    return getManyCST_LLSsOnR2(target, null, true);
}

public static Linkleftside_c [] getManyCST_LLSsOnR2(Linktest_c target, boolean loadComponent)
{
    return getManyCST_LLSsOnR2(target, null, loadComponent);
}

public static Linkleftside_c getOneCST_LLSOnR2(Linkrightside_c target)
{
  return Linkleftside_c.getOneCST_LLSOnR2(Linktest_c.getOneCST_LTOnR2(target)) ;
}

public static Linkleftside_c getOneCST_LLSOnR2(Linkrightside_c target,
    ClassQueryInterface_c test)
{
  return Linkleftside_c.getOneCST_LLSOnR2(Linktest_c.getManyCST_LTsOnR2(target), test) ;
}



      
  public void batchRelate(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots)
  {
      batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
  }
  
  public void batchRelate(ModelRoot modelRoot, boolean relateProxies, boolean notifyChanges, boolean searchAllRoots)
  {
	}
  public void batchUnrelate(boolean notifyChanges)
  {
	}
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
  }	  
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	    
      // class has no referential attributes
  
  }

  public static void clearInstances(ModelRoot modelRoot)
  {
    InstanceList instances = modelRoot.getInstanceList(Linkleftside_c.class);
    synchronized(instances) {
       for(int i=instances.size()-1; i>=0; i--){
              ((NonRootModelElement)instances.get(i)).delete_unchecked();
       }
    
    }
  }

  public static Linkleftside_c LinkleftsideInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {
  		Linkleftside_c result=findLinkleftsideInstance(modelRoot,test,loadComponent);
	  return result;  
  }
private static Linkleftside_c findLinkleftsideInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
{
	InstanceList instances = modelRoot.getInstanceList(Linkleftside_c.class);
		synchronized (instances) {
            for (int i = 0; i < instances.size(); ++i) {
				Linkleftside_c x = (Linkleftside_c) instances.get(i);
				if (test==null || test.evaluate(x)){
					return x;
			}
		}
		}
			return null;
}
  public static Linkleftside_c LinkleftsideInstance(ModelRoot modelRoot, ClassQueryInterface_c test){
     return LinkleftsideInstance(modelRoot,test,true);
  }
  
  public static Linkleftside_c LinkleftsideInstance(ModelRoot modelRoot)
  {
	 return LinkleftsideInstance(modelRoot,null,true);
  }

  public static Linkleftside_c [] LinkleftsideInstances(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {	
		    InstanceList instances = modelRoot.getInstanceList(Linkleftside_c.class);
			Vector matches = new Vector();
			synchronized (instances) {
                for (int i = 0; i < instances.size(); ++i) {
					Linkleftside_c x = (Linkleftside_c) instances.get(i);
					if (test==null ||test.evaluate(x)){
						matches.add(x);
			    }
				}
			if (matches.size() > 0) {
				Linkleftside_c[] ret_set = new Linkleftside_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new Linkleftside_c[0];
			}		
		} 
  }
  public static Linkleftside_c [] LinkleftsideInstances(ModelRoot modelRoot, ClassQueryInterface_c test){
    return  LinkleftsideInstances(modelRoot,test,true);
  }
  public static Linkleftside_c [] LinkleftsideInstances(ModelRoot modelRoot)
  {
	return LinkleftsideInstances(modelRoot,null,true);
  }

  public boolean delete()
  {
    boolean result = super.delete();
	boolean delete_error = false;
	String errorMsg = "The following relationships were not torn down by the linkLeftSide.dispose call: ";
	Linktest_c testR2Inst = Linktest_c.getOneCST_LTOnR2(this, false);

	if ( testR2Inst != null )
	{
   	delete_error = true;	        
	errorMsg = errorMsg + "2 ";
	}
	if(delete_error == true) {

		if(CoreTestPlugin.getDefault().isDebugging()) {
			Consistency.log.println(ILogger.DELETE, "linkLeftSide", errorMsg);
		}
		else {
			Exception e = new Exception();
            e.fillInStackTrace();
			CoreTestPlugin.logError(errorMsg, e);
		}
	}
	return result;
  }

  // end declare instance pool

  // declare attribute accessors
  public boolean isUUID(String attributeName){
      return false;      
  }      
  // declare attribute accessors
  public int getLlsid()
  {
    return m_llsid ;
  }


  public void setLlsid(int newValue)
  {
    if(m_llsid == newValue){
        return;
    }
    AttributeChangeModelDelta change = new AttributeChangeModelDelta(Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Llsid", new Integer(m_llsid), new Integer(newValue),true);

   m_llsid = newValue ;
    Consistency.getDefaultInstance().fireModelElementAttributeChanged(change);
  }
  // end declare accessors
  public static void checkClassConsistency (ModelRoot modelRoot) {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "linkLeftSide", //$NON-NLS-1$
	  " Operation entered: linkLeftSide::checkClassConsistency"); //$NON-NLS-1$
     if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
       return;
     }
     Linkleftside_c [] objs = Linkleftside_c.LinkleftsideInstances(modelRoot,null,false); 
     
     for ( int i = 0; i < objs.length; i++) {
       objs[i].checkConsistency();
     }  
  } 
  public boolean checkConsistency () {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "linkLeftSide", //$NON-NLS-1$
	  " Operation entered: linkLeftSide::checkConsistency");  //$NON-NLS-1$
    if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
      return true;
    }
	ModelRoot modelRoot = getModelRoot();
    boolean      retval = true;
    class Linkleftside_c_test86_c implements ClassQueryInterface_c
    {
	  Linkleftside_c_test86_c( int             p87 ) {
	  m_p87 = p87;
	  }
	  private int              m_p87; 
	  public boolean evaluate (Object candidate)
	  {
	      Linkleftside_c selected = (Linkleftside_c) candidate;
	      boolean retval = false;
	      retval = (selected.getLlsid() == (m_p87));
	      return retval;
	  }
    }

    Linkleftside_c [] objs85 = 
    Linkleftside_c.LinkleftsideInstances(modelRoot, new Linkleftside_c_test86_c(getLlsid())) ;

    if ( (  (objs85.length) == 0) )
    {

      if (CoreTestPlugin.getDefault().isDebugging()){
          Consistency.log.println(ILogger.CONSISTENCY, "linkLeftSide", //$NON-NLS-1$
           "Consistency: Object: linkLeftSide: Cardinality of an identifier is zero. " //$NON-NLS-1$
           + "Actual Value: " + Integer.toString( objs85.length ) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CoreTestPlugin.logError("Consistency: Object: linkLeftSide: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs85.length )  , e); 
      }
      retval = false;

    }

    if ( (  (objs85.length) > 1) )
    {

      if (CoreTestPlugin.getDefault().isDebugging()){
          Consistency.log.println(ILogger.CONSISTENCY, "linkLeftSide", //$NON-NLS-1$
           "Consistency: Object: linkLeftSide: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
           + "Actual Value: " //$NON-NLS-1$ 
           + Integer.toString( objs85.length )  + " llsID: " + Integer.toString(getLlsid()) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CoreTestPlugin.logError("Consistency: Object: linkLeftSide: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs85.length )  + " llsID: " + Integer.toString(getLlsid()) , e); //$NON-NLS-1$
      }
      retval = false;

    }

          // Associated One Side: rel.Numb = 2
            // Link Object: linkTest
            // Other Side Class: linkRightSide
    class Linktest_c_test92_c implements ClassQueryInterface_c
    {
	  Linktest_c_test92_c( int             p93 ) {
	  m_p93 = p93;
	  }
	  private int              m_p93; 
	  public boolean evaluate (Object candidate)
	  {
	      Linktest_c selected = (Linktest_c) candidate;
	      boolean retval = false;
	      retval = (selected.getLlsid() == (m_p93));
	      return retval;
	  }
    }

    Linktest_c [] objs94 = 
    Linktest_c.LinktestInstances(modelRoot, new Linktest_c_test92_c(getLlsid())) ;

    if ( (  (objs94.length) == 0) )
    {

      if (CoreTestPlugin.getDefault().isDebugging()){
          Consistency.log.println(ILogger.CONSISTENCY, "linkLeftSide", //$NON-NLS-1$
           "Consistency: Object: linkLeftSide: Association: 2: Cardinality of a link is equal to zero. " //$NON-NLS-1$
           + "Actual Value: " + Integer.toString( objs94.length ) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CoreTestPlugin.logError("Consistency: Object: linkLeftSide: Association: 2: Cardinality of a link is equal to zero. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs94.length )  , e); 
      }
      retval = false;

    }


    if ( (  (objs94.length) != 1) )
    {

      if (CoreTestPlugin.getDefault().isDebugging()){
          Consistency.log.println(ILogger.CONSISTENCY, "linkLeftSide", //$NON-NLS-1$
           "Consistency: Object: linkLeftSide: Association: 2: Cardinality of a link is not equal to 1. " //$NON-NLS-1$
           + "Actual Value: " + Integer.toString( objs94.length ) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CoreTestPlugin.logError("Consistency: Object: linkLeftSide: Association: 2: Cardinality of a link is not equal to 1. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs94.length )  , e); 
      }
      retval = false;

    }

    return retval;
  }



  public Object getAdapter(Class adapter) {
    Object superAdapter = super.getAdapter(adapter);
    if(superAdapter != null) {
    	return superAdapter;
    }
	  return null;
  }
} // end linkLeftSide
