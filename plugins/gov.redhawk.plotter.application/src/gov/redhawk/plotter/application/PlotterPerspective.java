/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gov.redhawk.plotter.application;

import gov.redhawk.ui.port.nxmplot.PlotActivator;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPlaceholderFolderLayout;

public class PlotterPerspective implements IPerspectiveFactory {
	public static final String ID = "gov.redhawk.plotter.application.perspective"; //$NON-NLS-1$

	public void createInitialLayout(final IPageLayout layout) {
		final String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);

		// Place project explorer to left of editor area.
		IPlaceholderFolderLayout plotFolder = layout.createPlaceholderFolder("plotFolder", IPageLayout.BOTTOM, (float) 0.25, editorArea);
		plotFolder.addPlaceholder(PlotActivator.VIEW_PLOT_2);
		plotFolder.addPlaceholder(PlotActivator.VIEW_PLOT_2 + ":*");
	}

}
