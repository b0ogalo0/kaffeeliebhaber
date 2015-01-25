package de.kaffeeliebhaber.core;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;

import de.kaffeeliebhaber.swing.JDiagram;
import javax.swing.JPanel;
import javax.swing.JTable;

public class MainFrame extends AbstractJFrame{

	private static final int HGAP = 5;
	private static final int VGAP = 5;
	
	private JPanel panel;
	private JDiagram diagram;
	
	public MainFrame(String title) {
		super();
		
		window.setTitle(title);
		window.setSize(1024, 768);
		window.setLocationRelativeTo(null);
		
		JTable table = new JTable();
		
	}

	@Override
	public void createComponents() {
		
		container = this.window.getContentPane();
		container.setLayout(new BorderLayout(HGAP, VGAP));
		
		
		window.setSize(new Dimension(400,400));
		
		panel = new JPanel();
		diagram = new JDiagram();
		panel.add(diagram);
		container.add(panel, BorderLayout.PAGE_START);
	}

	@Override
	public void addComponents() {
	
		
	}

	@Override
	public void setup() {
		
	}
	
	/* WINDOWS LISTENER ADAPTER */
	public void addWindowListener() {
		this.window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("Ich wurde geschlossen");
				System.exit(0);
			}
		});
	}
}
