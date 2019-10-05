package pl.altkom.zad8_1;

public class Plane extends Vehicle implements Flying{

    public Plane(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 50;
    }

    @Override
    double getDistance() {
        return 100;
    }


    public void go(){
        super.go();
        takeOff();
    }

    public void stop(){
        super.stop();
        land();
    }

    @Override
    public void takeOff() {
        System.out.printf("%s %s wystartował.\n", getClass().getSimpleName(), name);
    }

    @Override
    public void land() {
        System.out.printf("%s %s wylądował.\n", getClass().getSimpleName(), name);
    }

    @Override
    public void callAirControl() {
        System.out.printf("%s %s, proszę zadzwonić do kontroli lotów.\n", getClass().getSimpleName(), name);
    }
}
