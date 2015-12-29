package com.stargazer.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LogoClickListener extends MouseAdapter {
	 public void mouseClicked(MouseEvent evt) {
		 if (evt.getClickCount() == 5) {
			 System.out.println("System has Exit By User");
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 System.exit(0);
		 } else if (evt.getClickCount() == 2) {
		 System.out.println("Welcome To Stargazer Cells System");
		 }
		 }
}
