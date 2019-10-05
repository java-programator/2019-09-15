package pl.altkom.zad8_1;

public class RaceCar extends Car {

    public RaceCar(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 15;
    }

}
