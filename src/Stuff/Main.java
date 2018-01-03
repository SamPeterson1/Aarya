package Stuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


import Lib.Algorithm;
import Lib.Cube;
import Lib.Map;
import Lib.Move;
import Lib.ScrambleGenerator;

public class Main {

	public static void main(String args[]) {
		SolverEventQueue queue = new SolverEventQueue();
		SolverEvent event = null;
		SolverFrame frame = new SolverFrame();
		SolverCanvas canvas = new SolverCanvas();
		frame.addCanvas(canvas);
		canvas.addEventQueue(queue);
		while(true) {
			if(queue.isEventToProcess()) {
				SolverEvent e = queue.getEvent();
			}
			canvas.draw();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

