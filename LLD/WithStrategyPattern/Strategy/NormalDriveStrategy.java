package WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DeriveStrategy {

    @Override
    public void drive () {
        System.out.println("normal drive capability");
    }
}