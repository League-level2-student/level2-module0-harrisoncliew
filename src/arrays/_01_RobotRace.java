package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Random r = new Random();
		Robot[] robot = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robot.length; i++) {
			robot[i] = new Robot();
			robot[i].setSpeed(50);
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		robot[4].moveTo(450, 550);
		robot[0].moveTo(50, 550);
		robot[1].moveTo(150, 550);
		robot[2].moveTo(250, 550);
		robot[3].moveTo(350, 550);

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean notAtTheTop = true;
		while(notAtTheTop) {
		for (int i = 0; i < robot.length; i++) {
			robot[i].move(r.nextInt(50));
			if(robot[i].getY()==10) {
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
