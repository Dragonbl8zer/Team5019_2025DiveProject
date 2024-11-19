/*package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ConveyorSubsystem;
import frc.robot.subsystems.DriveSubSystem;

public final class AutoDumpGoOnChargeUp extends Command {

  private DriveSubSystem mDrive;
  private ConveyorSubsystem convey;

  public  AutoDumpGoOnChargeUp(
    DriveSubSystem drive,
    ConveyorSubsystem conveyorForward
  ) {
    mDrive = drive;
    convey = conveyorForward;
  }

  @Override
  public void initialize() {
    convey.RunConveyor();
    mDrive.SimpleDrivReverse( -1.0, -0.5);
  }

  @Override
  public void end(boolean interrupted) {
    mDrive.arcadeDrive(0, 0);
  }
}
*/