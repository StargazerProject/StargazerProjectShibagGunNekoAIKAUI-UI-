package com.stargazer.mainframe;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class MainFrameJDialog extends JDialog {
	private static final long serialVersionUID = -3720555214012386633L;

	public MainFrameJDialog() {
		((JPanel) this.getContentPane()).setOpaque(false);
	}
}
