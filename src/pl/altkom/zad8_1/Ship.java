package pl.altkom.zad8_1;

public class Ship extends Vehicle implements Sailing{

    public Ship(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 15;
    }

    @Override
    double getDistance() {
        return 50;
    }

    @Override
    public void dock(){
        String shipClass = getClass().getSimpleName();
        System.out.printf("%s %s przybył do portu.\n", shipClass, name);
    }

    @Override
    public void stop(){
        dock();
    }
}
