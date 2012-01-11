package org.eclipse.koneki.ldt.extensions.corona.core.internal.preferences;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.koneki.ldt.extensions.corona.core.internal.Activator;
import org.eclipse.koneki.ldt.extensions.corona.core.preferences.IPreferencesConstants;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	public PreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IEclipsePreferences store = new DefaultScope().getNode(Activator.PLUGIN_ID);

		String defaultSdkLocation = ""; //$NON-NLS-1$
		if (Platform.getOS().equals(Platform.OS_MACOSX)) {
			defaultSdkLocation = "/Applications/CoronaSDK"; //$NON-NLS-1$
		} else if (Platform.getOS().equals(Platform.OS_WIN32)) {
			if (Platform.getOS().equals(Platform.ARCH_X86)) {
				defaultSdkLocation = "C:\\Program Files\\Ansca\\Corona SDK"; //$NON-NLS-1$
			} else if (Platform.getOS().equals(Platform.ARCH_X86_64)) {
				defaultSdkLocation = "C:\\Program Files (x86)\\Ansca\\Corona SDK"; //$NON-NLS-1$
			}
		}

		store.put(IPreferencesConstants.PREF_CORONA_SDK_LOCATION, defaultSdkLocation);
	}
}
