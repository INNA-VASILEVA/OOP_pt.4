package Autoracing;

import Autoracing.Transport.Transport;
import Autoracing.Vehicles.Car;
import Autoracing.Vehicles.Truck;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport) {
        transports.offer(transport);
    }
    public void  addCar(Car car){
        add(car);
    }
    public void addTruck (Truck truck) {
        add(truck);
    }
    public void checkVehicles (){
        if (transports.isEmpty()) {
            Transport transport = transports.poll();
            boolean result = transport.checkVehicles();
            if (!result) {
                transport.repairVehicles();
            }
        }
    }
}
