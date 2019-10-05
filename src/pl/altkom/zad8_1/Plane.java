package pl.altkom.zad8_1;

public class Plane extends Vehicle implements Flying {

    public Plane(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 55;
    }

    @Override
    public double getDistance() {
        return 5900;
    }

    @Override
    public void takeOff() {
        System.out.println("Czas wylotu: ...");
    }

    @Override
    public void land() {
        System.out.println("Czas lądowania: ...");
    }

    @Override
    public void callAirControl() {
        System.out.println("kontakt z kontrolą lotów: ...");
    }

    @Override
    public void go() {
        takeOff();
    }

    @Override
    public void stop() {
        land();
    }


}
