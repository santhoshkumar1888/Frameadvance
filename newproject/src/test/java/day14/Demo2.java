package day14;

import java.awt.Robot;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		Robot r=new Robot();
		int x=100;
		for(int i=0; i<=20; i++) {
			r.mouseMove(x, 200);
			x=x+50;
			Thread.sleep(2000);
		}
				
	}

}
