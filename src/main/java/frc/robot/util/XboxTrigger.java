package frc.robot.util;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class XboxTrigger extends Trigger {
    
    

    public XboxTrigger(BooleanSupplier condition) {
        super(condition);
        //TODO Auto-generated constructor stub
    }

    private XboxController controller;
    private boolean leftHand;

    public void XboxTrigger(XboxController controller, boolean leftHand) {
        XboxController controller2 = controller;
        this.controller = controller;
        boolean leftHand2 = leftHand;
        this.leftHand = leftHand;
    }

    public double getLeft() {
       
        return this.getLeftY();
      }
  
      private double getLeftY() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLeftY'");
    }

    public double getRight() {
          return this.getRightX();
  
      }

    private double getRightX() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRightX'");
    }

    
}
