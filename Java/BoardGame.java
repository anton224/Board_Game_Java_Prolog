/*
Programmer : Anton Rubenchik
File Name : BoardGame.java
Description : It is board game for two players. The purpose of the
 game is to create a row of 3 oval of the same color(The central oval
 must be included). The rules are explained in the Info menu of the
 game.
Input : No
Output : No

 */
package design;
import javax.swing.*;

public class BoardGame {

	public static void main(String args[])
	{
		DrawFrame frame = new DrawFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1100,900);
		frame.setVisible(true);
	}
}





