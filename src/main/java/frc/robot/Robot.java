// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import javax.lang.model.util.ElementScanner6;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {
  TalonFX shooter1 = new TalonFX(1);
  TalonFX shooter2 = new TalonFX(12);
  XboxController controller = new XboxController(0);

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    // We need to invert one side of the drivetrain so that positive voltages
    // result in both sides moving forward. Depending on how your robot's
    // gearbox is constructed, you might have to invert the left side instead.
  }

  /** This function is run once each time the robot enters autonomous mode. */
  @Override
  public void autonomousInit() {
    
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    // Drive for 2 seconds
    
    
  }

  /** This function is called once each time the robot enters teleoperated mode. */
  @Override
  public void teleopInit() {}

  /** This function is called periodically during teleoperated mode. */
  @Override
  public void teleopPeriodic() {

    if(controller.getAButtonPressed() ==true){
      shooter1.set(TalonFXControlMode.PercentOutput, 1);
      shooter2.set(TalonFXControlMode.PercentOutput, 1);
    } else if (controller.getBButtonPressed() == true){
      shooter1.set(TalonFXControlMode.PercentOutput, 0.75);
      shooter2.set(TalonFXControlMode.PercentOutput, 0.75);
    }else if (controller.getBButtonPressed() == true){
      shooter1.set(TalonFXControlMode.PercentOutput, 0.5);
      shooter2.set(TalonFXControlMode.PercentOutput, 0.5);
  }else if (controller.getBButtonPressed() == true){
    shooter1.set(TalonFXControlMode.PercentOutput, 0.5);
    shooter2.set(TalonFXControlMode.PercentOutput, 0.5);
  }
  
  }
  /** This function is called once each time the robot enters test mode. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}
