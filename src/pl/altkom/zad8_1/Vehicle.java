package pl.altkom.zad8_1;

public abstract class Vehicle {
    protected String name;
    protected String vehicleType = getClass().getSimpleName();

    public Vehicle(String name){
        this.name = name;
    }

    abstract double getFuelNeeds();

    abstract double getDistance();

    public double calculateFuelConsumption(){
        return getFuelNeeds() * getDistance();
    }

    public void go(){
        System.out.printf("Pojazd typu %s, nazwany %s, został uruchomiony.\n", vehicleType, name);
    }

    public void stop(){
        System.out.printf("Pojazd typu %s, nazwany %s, został zatrzymany.\n", vehicleType, name);
    }

    @Override
    public String toString() {
        return "Vehicle name= " + name;
    }
}
