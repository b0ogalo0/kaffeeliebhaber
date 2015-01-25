package de.kaffeeliebhaber.core;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Start {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				MainFrame frame = new MainFrame("DATA LIST");
				frame.setVisible(true);
			}
			
		});
	}
}
