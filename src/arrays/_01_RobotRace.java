package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method

	static Random rand = new Random();
	// static int l = rand.nextInt(50);

	public static void main(String[] arg) {
		// 2. create an array of 5 robots.

		Robot[] robots = new Robot[1];

		// 3. use a for loop to initialize the robots.
		for (int x = 0; x < robots.length; x++) {
			robots[x] = new Robot();
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int x = 0; x < robots.length; x++) {
			robots[x].hide();
			robots[x].penDown();
			robots[x].moveTo(100 + 150 * x, 500);
			robots[x].setSpeed(10);
		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		int angle = 0;
		
		int q = 0;
		boolean hasReachedTop = false;

		while (!hasReachedTop) {
			for (int x = 0; x < robots.length; x++) {	
				
//				robots[x].move(rand.nextInt(50));
				robots[x].move(100);
				
				angle = angle + 45;
				robots[x].setAngle(angle);
				
				if(angle % 360 == 0) {
					hasReachedTop = true;
					q = x + 1;
				}
				
				if (robots[x].getY() <= 0) {
					hasReachedTop = true;
					q = x + 1;
				}
			}
		}
		
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		System.out.println("robot #" + q + " is the winner");
		
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		
	}
}