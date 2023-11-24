package Troll1;

import java.awt.Robot;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		try {
			Robot robot = new Robot();
			Random random = new Random();
			while (true) {
				robot.mouseMove(random.nextInt(1000), random.nextInt(1000));
				Thread.sleep(50);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
