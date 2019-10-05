package pl.altkom.zad8_1;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 7;
    }

    @Override
    double getDistance() {
        return 100;
    }


}
