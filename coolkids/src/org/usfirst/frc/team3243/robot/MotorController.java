package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.VictorSP;

public class MotorController {
	//4 victor sp motor controllers
	//motor 1 = PWM 1, motor 2 = PWM 2, motor 3 = PWM 3, motor 4 = PWM 4
	//Motors 1 & 2 are connected together (left wheel) and motors 3 & 4 are connected together (right wheel)  
	VictorSP motor1 = new VictorSP(1);
	VictorSP motor2 = new VictorSP(2);
	VictorSP motor3 = new VictorSP(3);
	VictorSP motor4 = new VictorSP(4);
	
	void drive(Double[] val) {
		motor1.set(0.5*val[0]);
		motor2.set(0.5*val[0]);
		motor3.set(0.5*val[1]);
		motor4.set(0.5*val[1]);
	}
	
}
