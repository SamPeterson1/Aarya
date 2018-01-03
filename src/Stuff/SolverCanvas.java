package Stuff;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class SolverCanvas extends Canvas{
	private static final long serialVersionUID = -6828443604112305057L;
	public SolverCanvas() {
		this.setBackground(Color.GRAY);
	}
	int[][][] cubeData = null;
	public void draw() {
		BufferedImage image;
		Graphics g;
		image = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
		g = image.getGraphics();
		
		g.dispose();
		g = this.getGraphics();
		g.drawImage(image, 0, 0, null); 
	}
	public void addEventQueue(SolverEventQueue queue)  {

		this.addKeyListener(queue);
		this.addMouseListener(queue);
		this.addMouseMotionListener(queue);

		return;
	}
	/*
	╭━━━━╮               
	╰┃ ┣▇━▇                
	 ┃ ┃  ╰━▅╮ 
	 ╰┳╯ ╰━━┳╯        
	  ╰╮ ┳━━╯          
	 ▕▔▋ ╰╮╭━╮   
	╱▔╲▋╰━┻┻╮╲╱▔▔▔╲ 
	▏  ▔▔▔▔▔▔▔  O O┃ 
	╲╱▔╲▂▂▂▂╱▔╲▂▂▂╱
	 ▏╳▕▇▇▕ ▏╳▕▇▇▕
	 ╲▂╱╲▂╱ ╲▂╱╲﻿
	*/
}
