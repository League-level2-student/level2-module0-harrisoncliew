package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Random r = new Random();
		Robot[] robot = new Robot[7];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robot.length; i++) {
			robot[i] = new Robot();
			robot[i].setSpeed(200);
			robot[i].turn(90);
			robot[i].moveTo(600, 550);
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean notAtTheTop = true;
		while(notAtTheTop) {
		for (int i = 0; i < robot.length; i++) {
			
			for(int o = 0; o < r.nextInt(50); o++) {
				robot[i].turn(-1);
				robot[i].move(1);
			}
		
			if(robot[i].getX()==600 && robot[i].getY()==550) {
				notAtTheTop = false;
				JOptionPane.showMessageDialog(null, "Robot #"+i+" has won. Hooray! Congratulations!");
				break;
				
				
			}
			
		}
		}
		

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
