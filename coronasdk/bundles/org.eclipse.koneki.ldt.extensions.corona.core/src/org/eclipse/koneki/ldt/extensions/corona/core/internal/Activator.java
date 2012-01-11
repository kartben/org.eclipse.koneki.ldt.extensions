/*******************************************************************************
 * Copyright (c) 2011 Sierra Wireless and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package org.eclipse.koneki.ldt.extensions.corona.core.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {
	/** The plug-in ID */
	public static final String PLUGIN_ID = "org.eclipse.koneki.ldt.extensions.corona.core"; //$NON-NLS-1$

	/** The shared instance */
	private static Activator plugin;

	/**
	 * The constructor.
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Log a error message caused by the given exception
	 * 
	 * @param message
	 *            message to log
	 * @param throwable
	 *            exception which causes the error
	 */
	public static void logError(final String message, final Throwable throwable) {
		IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, message, throwable);
		getDefault().getLog().log(status);
	}

	/**
	 * Log a simple warning message
	 * 
	 * @param message
	 *            message to log
	 */
	public static void logWarning(final String message) {
		IStatus status = new Status(IStatus.WARNING, PLUGIN_ID, message);
		getDefault().getLog().log(status);
	}

	/**
	 * Log a warning message caused by the given exception
	 * 
	 * @param message
	 *            message to log
	 * @param throwable
	 *            exception which causes the warning
	 */
	public static void logWarning(final String message, final Throwable throwable) {
		IStatus status = new Status(IStatus.WARNING, PLUGIN_ID, message, throwable);
		getDefault().getLog().log(status);
	}

	/**
	 * Log the given status
	 * 
	 * @param status
	 *            status to log
	 */
	public static void log(final IStatus status) {
		getDefault().getLog().log(status);
	}

}
