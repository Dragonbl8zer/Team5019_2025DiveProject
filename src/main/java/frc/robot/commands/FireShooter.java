package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ConveyorSubsystem;

public class FireShooter extends Command {
    private final ConveyorSubsystem conveyor;

    public FireShooter(ConveyorSubsystem i) {
        conveyor = i;
        addRequirements(conveyor);

    }

    @Override
    public void initialize() {
            
    }

    @Override
    public void execute() {
        conveyor.launch();

    }

    @Override
    public void end(boolean interrupted) {
        conveyor.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }


}