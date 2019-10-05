package pl.altkom.zad8_1;

public class RaceCar extends Car {

    public RaceCar(String name) {
        super(name);
    }

    public double getFuelNeeds(){
        return super.getFuelNeeds() * 2;
    }
}
