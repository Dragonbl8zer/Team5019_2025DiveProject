// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;
import com.ctre.phoenix6.signals.SensorDirectionValue;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;
import frc.lib.util.COTSTalonFXSwerveConstants;
import frc.lib.util.SwerveModuleConstants;
import frc.robot.commands.TeleopSwerve;




/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  
  public static final int CONTROLLER_DRIVER_ID = 0;

  public static final class Swerve {
	 public static final int pigeonID = 13;

	 public static final COTSTalonFXSwerveConstants chosenModule = COTSTalonFXSwerveConstants.SDS.MK4i.Falcon500(COTSTalonFXSwerveConstants.SDS.MK4i.driveRatios.L3);

	 // Drivetrain Constants - ADD SPECIFIC MEASUREMENTS
	 public static final double trackWidth = Units.inchesToMeters(22.25); //Center to Center distance of left and right modules in meters. 
	 public static final double wheelBase = Units.inchesToMeters(22.25);  //Center to Center distance of front and rear module wheels in meters.
	 public static final double wheelCircumference = chosenModule.wheelCircumference;

	 //Swerve Kinematics
	 public static final SwerveDriveKinematics swerveKinematics = new SwerveDriveKinematics (
		new Translation2d(wheelBase / 2.0, trackWidth / 2.0),
		new Translation2d(wheelBase / 2.0, -trackWidth / 2.0),
		new Translation2d(-wheelBase / 2.0, trackWidth / 2.0),
		new Translation2d(-wheelBase / 2.0, -trackWidth / 2.0));
															
	//Module Gear Ratios
	public static final double driveGearRatio = chosenModule.driveGearRatio;
	public static final double angleGearRatio = chosenModule.angleGearRatio;

	/* Motor Inverts */
        public static final InvertedValue angleMotorInvert = chosenModule.angleMotorInvert;
        public static final InvertedValue driveMotorInvert = chosenModule.driveMotorInvert;

 	/* Angle Encoder Invert */
        public static final SensorDirectionValue cancoderInvert = chosenModule.cancoderInvert;

    /* Swerve Current Limiting */
        public static final int angleCurrentLimit = 25;
        public static final int angleCurrentThreshold = 40;
        public static final double angleCurrentThresholdTime = 0.1;
        public static final boolean angleEnableCurrentLimit = true;

        public static final int driveCurrentLimit = 35;
        public static final int driveCurrentThreshold = 60;
        public static final double driveCurrentThresholdTime = 0.1;
        public static final boolean driveEnableCurrentLimit = true;

	/* These values are used by the drive falcon to ramp in open loop and closed loop driving.
         * We found a small open loop ramp (0.25) helps with tread wear, tipping, etc */
        public static final double openLoopRamp = 0.25;
        public static final double closedLoopRamp = 0.0;

    /* Angle Motor PID Values */
        public static final double angleKP = chosenModule.angleKP;
        public static final double angleKI = chosenModule.angleKI;
        public static final double angleKD = chosenModule.angleKD;

    /* Drive Motor PID Values */
        public static final double driveKP = 0.12; //TODO: This must be tuned to specific robot
        public static final double driveKI = 0.0;
        public static final double driveKD = 0.0;
        public static final double driveKF = 0.0;

	/* Drive Motor Characterization Values From SYSID */
        public static final double driveKS = 0.32; //TODO: This must be tuned to specific robot
        public static final double driveKV = 1.51;
        public static final double driveKA = 0.27;
	
	/* Swerve Profiling Values */
        /** Meters per Second */
        public static final double maxSpeed = 4; 
        /** Radians per Second */
        public static final double maxAngularVelocity = 3; 
        /* Neutral Modes */
        public static final NeutralModeValue angleNeutralMode = NeutralModeValue.Coast;
        public static final NeutralModeValue driveNeutralMode = NeutralModeValue.Brake;

    /* Module Specific Constants */
    /* Front Left Module - Module 0 */
        public static final class Mod0 { 
            public static final int driveMotorID = 1;
            public static final int angleMotorID = 2;
            public static final int canCoderID = 9;
            public static final Rotation2d angleOffset = Rotation2d.fromDegrees(147.3);
            public static final SwerveModuleConstants constants = 
                new SwerveModuleConstants(driveMotorID, angleMotorID, canCoderID, angleOffset);
        }       
      
	/* Front Right Module - Module 1 */
	public static final class Mod1 { 
		public static final int driveMotorID = 3;
		public static final int angleMotorID = 4;
		public static final int canCoderID = 10;
		public static final Rotation2d angleOffset = Rotation2d.fromDegrees(123.66);
		public static final SwerveModuleConstants constants = 
			new SwerveModuleConstants(driveMotorID, angleMotorID, canCoderID, angleOffset);
	}
	
	/* Back Left Module - Module 2 */
	public static final class Mod2 { 
		public static final int driveMotorID = 5;
		public static final int angleMotorID = 6;
		public static final int canCoderID = 11;
		public static final Rotation2d angleOffset = Rotation2d.fromDegrees(81.47);
		public static final SwerveModuleConstants constants = 
			new SwerveModuleConstants(driveMotorID, angleMotorID, canCoderID, angleOffset);
	}

	  /* Back Right Module - Module 3 */
	  public static final class Mod3 { 
		public static final int driveMotorID = 7;
		public static final int angleMotorID = 8;
		public static final int canCoderID = 12;
		public static final Rotation2d angleOffset = Rotation2d.fromDegrees(165.06);
		public static final SwerveModuleConstants constants = 
			new SwerveModuleConstants(driveMotorID, angleMotorID, canCoderID, angleOffset);
	}

	public class swerveKinematics {
	}

	public Object zeroHeading() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'zeroHeading'");
	}

    public Object setPose(Pose2d initialPose) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPose'");
    }

	public void setDefaultCommand(TeleopSwerve teleopSwerve) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setDefaultCommand'");
	}
  }

  	public static final class AutoConstants { //TODO: The below constants are used in the example auto, and must be tuned to specific robot
        public static final double kMaxSpeedMetersPerSecond = 3;
        public static final double kMaxAccelerationMetersPerSecondSquared = 3;
        public static final double kMaxAngularSpeedRadiansPerSecond = Math.PI;
        public static final double kMaxAngularSpeedRadiansPerSecondSquared = Math.PI;
    
        public static final double kPXController = 1;
        public static final double kPYController = 1;
        public static final double kPThetaController = 1;
    
        /* Constraint for the motion profilied robot angle controller */
        public static final TrapezoidProfile.Constraints kThetaControllerConstraints =
            new TrapezoidProfile.Constraints(
                kMaxAngularSpeedRadiansPerSecond, kMaxAngularSpeedRadiansPerSecondSquared);
	}

	public static final int CONVEYOR_MOTOR_CAINID1 = 14; // Talon FX - converyor motor
	public static final int CONVEYOR_MOTOR_CAINID2 = 15;
  

public static double stickDeadband = 0.08;








//2023 Code


	// 11 & 12 are Left Wheel Motors - 1 forward motor
	// 13 & 14 are Right Wheele Motors - 3 forward motor

	/*public final class Drive {
		// Talon SRX and Talon FX CAN IDs
		public static final int LEFT_FRONT_DRIVE_MOTOR_CANID = 11; // Talon FX - left forward motor
		public static final int LEFT_REAR_DRIVE_MOTOR_CAINID = 12; // Talon FX - left rear motor
		public static final int RIGHT_FRONT_DRIVE_MOTOR_CAINID = 13; // Talon FX - right forward motor
		public static final int RIGHT_REAR_DRIVE_MOTOR_CAINID = 14; // Talon FX - right rear motor
		// Conveyor
		public static final int CONVEYOR_MOTOR_CAINID = 20; // Talon FX - converyor motor
	}

	public final class AutomousCommands{
		public static final String DefaultAuto = "default";
		public static final double kSlowModeMultiplier = 0.5;
		public static final double kLinearResponseCurveExponent = 5.0 / 3.0;
		public static final double kJoystickDeadzoneSize = 0.1;
		public static final double kDriveSpeedPercent = .3;
		public static final double kTurnSpeedPercent = .3;
	
		public static final double kDriveGearRatio = 10.57; 
	} */


}
