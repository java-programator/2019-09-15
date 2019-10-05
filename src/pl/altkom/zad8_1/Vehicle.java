package pl.altkom.zad8_1;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract double getFuelNeeds();
    public abstract double getDistance();

    public double calculateFuelConsumption(){
        return getFuelNeeds()*getDistance()/100;
    }

    public void go(){
        System.out.println(getClass().getSimpleName() + " " + name + " , start: ...");
    }

    public void stop(){
        System.out.println("koniec podróży: ...");
    }



}
