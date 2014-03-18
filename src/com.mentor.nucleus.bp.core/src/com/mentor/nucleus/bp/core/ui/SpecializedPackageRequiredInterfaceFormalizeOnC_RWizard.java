package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard.java
//
// WARNING: Do not edit this generated file
// Generated by arc/wizard.inc
//
// (c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.
//
//====================================================================
import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.wizard.*;
import org.eclipse.ui.IWorkbench;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.util.TransactionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard class
 */
public class SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard
		extends
			Wizard {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	// workbench selection when the wizard was started
	protected IStructuredSelection m_selection;

	// the workbench instance
	protected IWorkbench m_workbench;

	// the viewer the wizard was started from. This must be replaced with a listener system
	protected Viewer m_viewer;

	// Pages stack
	protected Stack m_pagesStack = new Stack();

	// wizard pages
	SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage4 C_R_SpecializedPackageRequiredInterfaceFormalizePage4;
	SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage5 C_R_SpecializedPackageRequiredInterfaceFormalizePage5;

	// wizard state
	// constants
	protected static final int INITIAL_WIZARD_STATE = -1;
	protected static final int C_R_SPECIALIZEDPACKAGEREQUIREDINTERFACEFORMALIZE0_WIZARD_STATE = 0;
	protected static final int C_R_SPECIALIZEDPACKAGEREQUIREDINTERFACEFORMALIZE1_WIZARD_STATE = 1;
	// member
	protected int m_state = INITIAL_WIZARD_STATE;
	// end wizard state

	// cache for contextual selections (public for use by unit tests)
	public Requirement_c v_requirement = null;

	// cache for the users selections (public for use by unit tests)
	public InterfacePackage_c v_Diagram = null;
	public Interface_c v_Interface = null;

	/**
	 * Constructor for SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard.
	 */
	public SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard() {
		super();
	}

	/**
	 * See field.
	 */
	public IStructuredSelection getSelection() {
		return m_selection;
	}

	public void addPages() {
		C_R_SpecializedPackageRequiredInterfaceFormalizePage4 = new SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage4(
				"SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage4");
		addPage(C_R_SpecializedPackageRequiredInterfaceFormalizePage4);
		C_R_SpecializedPackageRequiredInterfaceFormalizePage5 = new SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage5(
				"SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage5");
		addPage(C_R_SpecializedPackageRequiredInterfaceFormalizePage5);
	}

	/**
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection,
			Viewer viewer) {
		this.m_workbench = workbench;
		this.m_selection = selection;
		this.m_viewer = viewer;
		for (Iterator iterator = selection.iterator(); iterator.hasNext();) {
			Object context = iterator.next();
			if (context instanceof Requirement_c) {
				v_requirement = (Requirement_c) context;
			}
		}
	}

	public boolean canFinish() {
		boolean pagesComplete = true;
		pagesComplete = pagesComplete
				&& C_R_SpecializedPackageRequiredInterfaceFormalizePage4
						.isPageComplete();
		pagesComplete = pagesComplete
				&& C_R_SpecializedPackageRequiredInterfaceFormalizePage5
						.isPageComplete();
		return pagesComplete;
	}

	public IWizardPage getNextPage(IWizardPage page) {
		List pages = new ArrayList(getPages().length);
		for (int i = 0; i < getPages().length; i++) {
			pages.add(getPages()[i]);
		}
		switch (pages.indexOf(page)) {
			case C_R_SPECIALIZEDPACKAGEREQUIREDINTERFACEFORMALIZE0_WIZARD_STATE :
				m_state = pages
						.indexOf(C_R_SpecializedPackageRequiredInterfaceFormalizePage5);
				C_R_SpecializedPackageRequiredInterfaceFormalizePage5
						.onPageEntry();
				return C_R_SpecializedPackageRequiredInterfaceFormalizePage5;

			case C_R_SPECIALIZEDPACKAGEREQUIREDINTERFACEFORMALIZE1_WIZARD_STATE :
				return null;
		}
		return null;
	}

	public IWizardPage getPreviousPage(IWizardPage page) {
		if (m_pagesStack.empty()) {
			return null;
		} else {
			List pages = new ArrayList(getPages().length);
			for (int i = 0; i < getPages().length; i++) {
				pages.add(getPages()[i]);
			}
			m_state = pages.indexOf((IWizardPage) m_pagesStack.peek());
			((PtWizardPage) m_pagesStack.peek()).onPageEntry();
			return (IWizardPage) m_pagesStack.pop();
		}
	}

	public boolean performFinish() {
		TransactionUtil.TransactionGroup transactionGroup = null;
		ModelRoot modelRoot = v_requirement.getModelRoot();
		try {
			transactionGroup = TransactionUtil
					.startTransactionsOnSelectedModelRoots("Specialized Package Required Interface Formalize"); //$NON-NLS-1$
			if (((v_requirement != null))) {

				Component_c v_component = Component_c.getOneC_COnR4010(Port_c
						.getOneC_POOnR4016(InterfaceReference_c
								.getOneC_IROnR4009(v_requirement)));

				if (((v_component != null))) {

					ComponentPackage_c v_componentPackage = ComponentPackage_c
							.getOneCP_CPOnR4604(v_component);

					if (((v_componentPackage == null))) {

						Component_c v_parentComponent = Component_c
								.getOneC_COnR4202(ComponentInComponent_c
										.getOneCN_CICOnR4203(v_component));

						if (((v_parentComponent != null))) {

							while (((v_componentPackage == null))) {

								v_componentPackage = ComponentPackage_c
										.getOneCP_CPOnR4604(v_parentComponent);

								v_parentComponent = Component_c
										.getOneC_COnR4202(ComponentInComponent_c
												.getOneCN_CICOnR4203(v_parentComponent));

							}

						}

					}

					if ((!(v_componentPackage == null))) {

						SystemModel_c v_system = SystemModel_c
								.getOneS_SYSOnR4606(v_componentPackage);

						Interface_c v_existingI = Interface_c
								.getOneC_IOnR4012(InterfaceReference_c
										.getOneC_IROnR4009(v_requirement));

						java.util.UUID v_id = Gd_c.Null_unique_id();

						if (((v_existingI != null))) {

							v_id = v_existingI.getId();

						}

						if (((v_Diagram != null))) {

							if (v_requirement != null) {
								v_requirement.Formalize(v_Interface.getId(),
										true);
							} else {
								Throwable t = new Throwable();
								t.fillInStackTrace();
								CorePlugin
										.logError(
												"Attempted to call an operation on a null instance.",
												t);
							}

						}

					}

				}

			}

			// catch all exceptions and cancel the transaction
		} catch (Exception e) {
			if (transactionGroup != null)
				TransactionUtil.cancelTransactions(transactionGroup, e);
			CorePlugin
					.logError(
							"Transaction: Specialized Package Required Interface Formalize failed", e);//$NON-NLS-1$
			// return true so that the wizard will
			// close
			return true;
		}
		if (transactionGroup != null)
			TransactionUtil.endTransactions(transactionGroup);
		if (m_viewer != null) {
			if (m_viewer instanceof StructuredViewer) {
				((StructuredViewer) m_viewer).refresh(v_requirement);
			} else {
				m_viewer.refresh();
			}
		}
		return true;
	}
}