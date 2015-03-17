package de.kaffeeliebhaber.swing;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComponent;

public class JDiagram extends JComponent{

	private static final long serialVersionUID = 1L;
	
	private final int WIDTH = 600;
	private final int HEIGHT = 600;
	private Dimension dimension = new Dimension(WIDTH, HEIGHT);
	
	private final Color COLOR_BORDER = new Color(220,220,220);
	private final Color COLOR_BACKGROUND = Color.WHITE;
	
	private final String fontName = "SansSerif";
	
	public JDiagram() {
		
		setMinimumSize(dimension);
		setPreferredSize(this.dimension);
		setMaximumSize(this.dimension);
		
		setBorder(BorderFactory.createLineBorder(COLOR_BORDER));
		
	}
	
	@Override public void paintComponent(Graphics g) {
	
		int width = (int) getSize().getWidth();
		int height = (int) getSize().getHeight();
		
		/* BACKGROUND WIRD GEZEICHNET */
		g.setColor(COLOR_BACKGROUND);
		g.fillRect(0, 0, width, height);
		
		
		g.setColor(Color.BLACK);
		
		Font font = new Font(fontName, Font.PLAIN, 30);
		g.setFont(font);
		//Übersicht
		g.drawString("�bersicht", 10, 40);


	}
	
	
}

