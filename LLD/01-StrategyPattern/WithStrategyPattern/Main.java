package WithStrategyPattern;

public class Main {

    public static void main(String args[]) {

        // Vehicle vehicle = new SportsVehicle();
        // vehicle.drive();  // sports drive capability

        Vehicle vehicle2 = new OffRoadVehicle();
        vehicle2.drive(); // sports drive capability

        Vehicle vehicle3 = new NormalVehicle();
        vehicle3.drive(); // normal drive capability
    }
}