/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
// ctre
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
// wpilib
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class drivetrain extends Subsystem {
  private TalonSRX motorFrontLeft = new TalonSRX(RobotMap.motorFrontLeft);
  private TalonSRX motorMidLeft = new TalonSRX(RobotMap.motorMidLeft);
  private TalonSRX motorBackLeft = new TalonSRX(RobotMap.motorBackLeft);
  private TalonSRX motorFrontRight = new TalonSRX(RobotMap.motorFrontRight);
  private TalonSRX motorMidRight = new TalonSRX(RobotMap.motorMidRight);
  private TalonSRX motorBackRight = new TalonSRX(RobotMap.motorBackRight);
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new TankDrive());
  }
  public void setLeftMotors(double speed) {
    motorBackLeft.set(ControlMode.PercentOutput, -speed);
    motorMidLeft.set(ControlMode.PercentOutput, -speed);
    motorFrontLeft.set(ControlMode.PercentOutput, -speed);
  }
  public void setRightMotors(double speed) {
    motorBackRight.set(ControlMode.PercentOutput, speed);
    motorMidRight.set(ControlMode.PercentOutput, speed);
    motorFrontRight.set(ControlMode.PercentOutput, speed);
  }
}
