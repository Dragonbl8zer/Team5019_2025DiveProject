package frc.robot.subsystems;



import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.util.HeroController;

public class ConveyorSubsystem extends SubsystemBase {

  
  
  private final TalonFX conveyorMotor1 = new TalonFX(
    Constants.CONVEYOR_MOTOR_CAINID1
  );

   private final TalonFX conveyorMotor2 = new TalonFX(
    Constants.CONVEYOR_MOTOR_CAINID2
  );

  /** Creates a new ConveyorSubsystem. */
  public ConveyorSubsystem(HeroController controller) {
    conveyorMotor1.setSafetyEnabled(false);
    conveyorMotor1.setNeutralMode(NeutralModeValue.Coast);

    conveyorMotor2.setSafetyEnabled(false);
    conveyorMotor2.setNeutralMode(NeutralModeValue.Coast);
  }

  public void run() {
    //conveyorMotor.set(ControlMode.PercentOutput, 0.4);
    conveyorMotor1.set(14);

    //conveyorMotor2.set(14);
  
  }

  public void launch() {
    //conveyorMotor.set(ControlMode.PercentOutput, 0.4);
    //conveyorMotor1.set(14);

    conveyorMotor2.set(1);
  
  }

  public void runBackward() {
    //conveyorMotor.set(ControlMode.PercentOutput, -0.4);
    conveyorMotor1.set(-0.2);

    conveyorMotor2.set(-0.2);
  }

  public void stop() {
    //conveyorMotor.set(ControlMode.PercentOutput, 0.0);
    conveyorMotor1.set(0);

    conveyorMotor2.set(0);
  }

  @Override
  public void periodic() {
    conveyorMotor1.feed();

    conveyorMotor2.feed();
  }

  /*public void RunConveyor() {
    conveyorMotor1.(0);
    var travel = conveyorMotor1.getSelectedSensorPosition()   /100000;
    while(travel < 1.0){
        travel =  conveyorMotor1.getSelectedSensorPosition()   /100000;
        run();
    }
   stop();
   conveyorMotor2.setSelectedSensorPosition(0);
    var travel = conveyorMotor2.getSelectedSensorPosition()   /100000;
    while(travel < 1.0){
        travel =  conveyorMotor2.getSelectedSeFnsorPosition()   /100000;
        run();
    }
   stop();
  }
  */
}
