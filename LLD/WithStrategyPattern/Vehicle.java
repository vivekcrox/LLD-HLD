package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    
   DriveStrategy driveObj;

   //this is known as ctor injection
   Vehicle(DriveStrategy driveObj) {
        this.driveObj = driveObj;
   }

   public void drive() {
        driveObj.drive();
   }
}