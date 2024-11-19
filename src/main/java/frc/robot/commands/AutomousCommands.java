//package frc.robot.commands;

//import java.io.Console;
//import java.util.HashMap;

//import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
//import frc.robot.subsystems.DriveSubSystem;
//import frc.robot.Constants;
//import frc.robot.subsystems.ConveyorSubsystem;
//import frc.robot.commands.DriveReverseCommand;

//import static frc.robot.Constants.*;

//public class AutomousCommands  {

//private DriveSubSystem drive;
// HashMap<String, Command> mCommandAutoModes;
//private ConveyorForward conveyorForward;

//public AutomousCommands(  ConveyorForward conveyForwardCommand) {
// drive = drivetrain;
//  conveyorForward= conveyForwardCommand;
//mCommandAutoModes = new HashMap<>();

//}
//public Command getAutoMode(String id)
//{
//  return mCommandAutoModes.get(id);
//}

//public String[] getAllAutoModes() {
//  return mCommandAutoModes.keySet().toArray(new String[mCommandAutoModes.size()]);
//}

//}
/*package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ConveyorSubsystem;
import frc.robot.subsystems.DriveSubSystem;

public final class AutomousCommands extends Command {

  private DriveSubSystem mDrive;
  private ConveyorSubsystem convey;

  public AutomousCommands(
    DriveSubSystem drive,
    ConveyorSubsystem conveyorForward
  ) {
    mDrive = drive;
    convey = conveyorForward;
  }

  @Override
  public void initialize() {
    convey.RunConveyor();
    mDrive.SimpleDrivReverse( -2.0, -0.5);
  }

  @Override
  public void end(boolean interrupted) {
    mDrive.arcadeDrive(0, 0);
  }
} */


