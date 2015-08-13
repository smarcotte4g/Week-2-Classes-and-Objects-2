package com.smarcotte.die_demo;

import java.util.Random;

public class Die 
{
	// attributes
	private short lastNumberRolled;
	private static Random rnd = new Random();
	
	// constructors
	public Die() 
	{
		super();
		lastNumberRolled = 0;
	}
	/*
	public Die(short lastNumberRolled) 
	{
		super();
		this.lastNumberRolled = lastNumberRolled;
	}
	*/
	
	// behaviors
	public short roll()
	{
		lastNumberRolled = (short) (rnd.nextInt(6) + 1);
		return lastNumberRolled;
	}

	
	
	// accessors and mutators
	public short getLastNumberRolled() {
		return lastNumberRolled;
	}
	
	// THERE WILL BE NO MUTATOR. LIKE THE WISE MAN SAID, "CAN'T TOUCH THIS!"
	
}
