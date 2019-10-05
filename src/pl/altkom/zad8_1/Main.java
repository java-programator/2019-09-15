package pl.altkom.zad8_1;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicles[] = new Vehicle[5];
        vehicles[0] = new Car("Bobek");
        vehicles[1] = new Plane("Beniek");
        vehicles[2] = new RaceCar("Felek");
        vehicles[3] = new Ship("Piracik");
        vehicles[4] = new Truck("Arnold");

        for(Vehicle v : vehicles){
            v.go();
            v.stop();
            System.out.println(v.calculateFuelConsumption());
            if(v instanceof Flying){
                ((Flying) v).callAirControl();
            }
        }
    }

    
}
