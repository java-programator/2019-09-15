package pl.altkom.zad8_1;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 40;
    }

    @Override
    public double getDistance() {
        return 2600;
    }

    @Override
    public void dock() {
        System.out.println("Przybycie do portu: ...");
    }


    @Override
    public void stop() {
        dock();
    }


}
