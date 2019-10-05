package pl.altkom.zad8_1;

import javafx.scene.transform.Scale;

public class Test {

    public static void main(String[] args) {

        Vehicle v[] = new Vehicle[5];
        v[0] = new Ship("Stanisław");
        v[1] = new Car("Andrzej");
        v[2] = new Plane("Lucyna");
        v[3] = new Truck("Grażynka");
        v[4] = new RaceCar("Mietek");

        for (Vehicle vehicle: v){
            vehicle.go();
            vehicle.stop();
            System.out.println("Zużyte paliwo [L]: " + vehicle.calculateFuelConsumption());
            if (vehicle instanceof Flying){
                Flying veh2 = (Flying) vehicle;
                veh2.callAirControl();
            }
            System.out.println();
        }
    }

}
