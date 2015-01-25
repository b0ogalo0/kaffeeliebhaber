package de.kaffeeliebhaber.core;

import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public abstract class AbstractJFrame {

	protected JFrame window;
	protected Container container;
	protected LayoutManager layoutManager;
	
	public AbstractJFrame() {
		createJFrame();
	}
	
	private void createJFrame() {
		this.window = new JFrame();
		this.container = this.window.getContentPane();
		
		
		this.createComponents();
		this.addComponents();
		this.setup();
		this.addWindowListener();

	}
	
	public void setVisible(boolean visible) {
		this.window.setVisible(visible);
	}
	
	public void setTitle(final String title) {
		this.window.setTitle(title);
	}
	
	public abstract void addWindowListener();
	public abstract void createComponents();
	public abstract void addComponents();
	public abstract void setup();
}
