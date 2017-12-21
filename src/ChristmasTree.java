
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import org.jointheleague.graphical.robot.Robot;

public class ChristmasTree {

	Robot r2d2 = new Robot();

	public static void main(String[] args) {
		ChristmasTree ohChristmasTree = new ChristmasTree();
		ohChristmasTree.drawStar();
		ohChristmasTree.drawTreeBody();
		ohChristmasTree.drawTreeTrunk();
		ohChristmasTree.drawOrnimants();
	}

	double treeWidth = 15;
	double scale = 1.1; // This is how much the width of the tree increases with each layer down

	void drawTreeBody() {
		// 8. Change the color of the line the robot draws to forest green
		r2d2.setPenColor(16, 255, 0);

		r2d2.penDown();
		r2d2.hide();
		// 1. Make a variable for turnAmount and set it to 175
		int ta = 175;
		r2d2.setSpeed(500);
		// 2. Start the Robot facing to the right
		r2d2.turn(90);

		// 5. Repeat steps 3 through 11, 11 times
		for (int i = 0; i < 11; i++) {

			// 3. Move the robot the width of the tree
			r2d2.move((int) treeWidth);
			// 4. Turn the robot the current turnAmount to the right
			r2d2.turn(ta);
			// 6. Set the treeWidth to the current treeWidth times the scale
			treeWidth = treeWidth * scale;
			// 7. Move the robot the width of a tree again
			r2d2.move((int) treeWidth);
			// 9. Turn the robot the current turn amount to the LEFT
			r2d2.turn(-ta);
			// 10. Set the treeWidth to the current treeWidth times the scale again
			treeWidth = treeWidth * scale;
			// 11. Decrease turnAmount by 1
			ta--;
		}
	}

	void drawTreeTrunk() {
		r2d2.penDown();
		r2d2.hide();
		r2d2.setSpeed(500);
		// 1. Move the robot half the width of the t
		r2d2.move((int) (treeWidth / 2));
		// 2. Change the robot so that it is pointing straight down
		r2d2.setAngle(180);
		// 4. Set the pen width to the tree width divided by 10
		r2d2.setPenWidth((int) (treeWidth / 10));
		// 5. Change the color of the line the robot draws to brown
		r2d2.setPenColor(102, 68, 34);
		// 3. Move the robot a quarter the tree width
		r2d2.move((int) (treeWidth / 4));
	}

	void drawStar() {
		r2d2.setPenColor(246, 255, 0);
		r2d2.penDown();
		r2d2.hide();
		r2d2.setSpeed(500);
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a
		// star.
		for (int i = 0; i < 5; i++) {
			r2d2.move(20);
			r2d2.turn(144);

		}

	}

	void drawOrnimants() {
		r2d2.setX(200);
		r2d2.setY(200);
		r2d2.hide();
		r2d2.setSpeed(500);
		r2d2.penDown();
		r2d2.setPenWidth(5);
		r2d2.move(5);
		r2d2.setX(300);
		r2d2.setY(150);
		r2d2.move(5);
		r2d2.setX(50);
		r2d2.setY(300);
		r2d2.move(5);
		r2d2.setX(100);
		r2d2.setY(250);
		r2d2.move(5);
		r2d2.setX(100);
		r2d2.setY(256);
		r2d2.move(5);
		r2d2.setX(238);
		r2d2.setY(184);
		r2d2.move(5);
		r2d2.setX(200);
		r2d2.setY(56);

	}

}
