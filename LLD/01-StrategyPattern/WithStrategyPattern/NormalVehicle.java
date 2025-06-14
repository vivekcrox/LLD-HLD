package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {

    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
