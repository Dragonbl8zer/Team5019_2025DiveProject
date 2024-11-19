package frc.robot.util;

import edu.wpi.first.wpilibj.XboxController;

    public class HeroController extends XboxController {

        public HeroController(final int port) {
            super(port);
    
        }
    
        public double getLeft() {
           
          return this.getLeftY();
        }
    
        public double getRight() {
            return this.getRightX();
    
        }
    
      
    
    
        // public JoystickButton getButton(int id) {
        // return new JoystickButton(this, id);
        // }
    
        // public XboxTrigger getTrigger(boolean leftHand) {
        // return new XboxTrigger(this, leftHand);
        // }
    
        // public enum DPad {
        // UP,
        // RIGHT,
        // DOWN,
        // LEFT
        // }
    
        // public Trigger getDPad(DPad dpad) {
        // int angle;
        // switch(dpad) {
        // case UP:
        // angle = 0;
        // break;
        // case RIGHT:
        // angle = 90;
        // break;
        // case DOWN:
        // angle = 180;
        // break;
        // case LEFT:
        // angle = 270;
        // break;
        // default:
        // angle = 0;
        // }
    
        // return new Trigger(() -> (this.getPOV() == angle));
        // }
    
        // public double getDriveForward() {
        // if (getAButton()) {
        // return -applyDeadband(getLeftY());
        // } else if (getRightBumper()) {
        // return -applyDeadband(getRightY());
        // } else if (getLeftBumper()) {
        // return -applyDeadband(getLeftY());
        // }
        // return 0;
        // }
    
        // public double getDriveTurn() {
        // if (getAButton()) {
        // return applyDeadband(getLeftX());
        // } else if (getRightBumper()) {
        // return applyDeadband(getLeftX());
        // } else if (getLeftBumper()) {
        // return applyDeadband(getRightX());
        // }
        // return 0;
        // }
    
}
