// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DrivetrainSubsystem;

public class drive extends CommandBase {

  DrivetrainSubsystem m_drivetrain;

  /** Creates a new drive. */
  public drive(DrivetrainSubsystem drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.

    m_drivetrain = drivetrain;

    // this command uses the drivetrain, so the requirement is added
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.drive(RobotContainer.oi.getDriverY(), RobotContainer.oi.getDriverZ());  
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
