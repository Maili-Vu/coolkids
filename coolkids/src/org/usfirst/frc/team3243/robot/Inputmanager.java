package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Inputmanager {
	
	//use either xbox controller or regular PS4 joystick
	Joystick inOne = new Joystick(0);
	Joystick inTwo = new Joystick(0);
	Double[] stickData = new Double[2];
	
	public Double[] getMoveInput() {
		stickData[0] = inOne.getRawAxis(1);
		stickData[1] = inTwo.getRawAxis(3);
		
		return stickData;
	}
	
	
}
