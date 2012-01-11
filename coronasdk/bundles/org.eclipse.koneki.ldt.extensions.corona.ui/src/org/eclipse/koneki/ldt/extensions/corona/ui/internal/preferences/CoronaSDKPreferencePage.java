package org.eclipse.koneki.ldt.extensions.corona.ui.internal.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.koneki.ldt.extensions.corona.core.preferences.IPreferencesConstants;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class CoronaSDKPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public CoronaSDKPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(new ScopedPreferenceStore(new InstanceScope(), "org.eclipse.koneki.ldt.extensions.corona.core")); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		addField(new DirectoryFieldEditor(IPreferencesConstants.PREF_CORONA_SDK_LOCATION, "Corona SDK location:", getFieldEditorParent()));
	}
}
