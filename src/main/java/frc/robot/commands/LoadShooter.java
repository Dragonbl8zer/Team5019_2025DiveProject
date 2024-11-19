 /*package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubSystem;

public class LoadShooter extends Command {
    private final IntakeSubSystem intake;

    public LoadShooter(IntakeSubSystem i) {
        intake = i;
        addRequirements(intake);

    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        intake.run();

    }

    @Override
    public void end(boolean interrupted) {
        intake.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

*/