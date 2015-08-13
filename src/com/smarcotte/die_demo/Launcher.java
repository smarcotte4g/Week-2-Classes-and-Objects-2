package com.smarcotte.die_demo;

import javax.swing.JOptionPane;

public class Launcher {

	public static void main(String[] args) 
	{
		// create the loop
		char throwAgain = '?';
		
		do
		{
			// create  a die object
			Die firstDie = new Die();
			firstDie.roll();
			JOptionPane.showMessageDialog(null, "First number: " + firstDie.getLastNumberRolled());
			
			Die secondDie = new Die();
			secondDie.roll();
			JOptionPane.showMessageDialog(null, "Second number: " + secondDie.getLastNumberRolled());
			
			short total = (short) (firstDie.getLastNumberRolled() + secondDie.getLastNumberRolled());
			JOptionPane.showMessageDialog(null, "You rolled a " + total + ".");
			
			// ask user if we should repeat
			String answer = JOptionPane.showInputDialog("Do you want to thow again (y/n)?");
			throwAgain = answer.charAt(0);
		}
		while( Character.toUpperCase(throwAgain) == 'Y');

	}

}
