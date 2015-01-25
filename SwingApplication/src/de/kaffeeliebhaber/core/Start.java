package de.kaffeeliebhaber.core;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.Dimension;

public class Start {
	
	public static void main(String[] args) {
		System.out.println("Dies ist ein einfacher GIT TEST.");
		
		System.out.println("Eine weitere Ausgabe. Demo.");
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				JFrame frame = new JFrame();
				frame.setTitle("GUI");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setSize(new Dimension(300,400));
				
				frame.setVisible(true);
			}
			
		});
	}
}
