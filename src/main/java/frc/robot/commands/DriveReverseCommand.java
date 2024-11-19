/*package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import frc.robot.subsystems.DriveSubSystem;

public class DriveReverseCommand extends CommandGroupBase {
    private int _time;
    private double _speed;
    private Timer _timer = new Timer();
    private DriveSubSystem _drive;

    public DriveReverseCommand(int time, double speed, DriveSubSystem drive) {
        _time = time;
        _speed = speed;
        _drive = drive;

    }

    public DriveReverseCommand(int i, int j) {
    }

    @Override
    public void execute() {
        _timer.start();

        while (_timer.get() <= _time) {
            _drive.tankDriveVolts(-_speed, -_speed);

        }
        _timer.stop();
    }

    @Override
    public void addCommands(Command... commands) {
        //  Auto-generated method stub
        
    }
    
}

*/