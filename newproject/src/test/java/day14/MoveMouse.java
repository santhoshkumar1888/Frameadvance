package day14;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class MoveMouse {

	public static void main(String[] args) throws AWTException {
		Robot r = new Robot();

        // Get current position
        Point location = MouseInfo.getPointerInfo().getLocation();
        int x = (int) location.getX();
        int y = (int) location.getY();

        // Move mouse 100px right, 50px down
        r.mouseMove(x + 100, y + 50);

        System.out.println("Mouse moved from (" + x + "," + y + ") to (" + (x+100) + "," + (y+50) + ")");
 

	}

}
