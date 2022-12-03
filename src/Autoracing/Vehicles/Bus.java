package Autoracing.Vehicles;
import Autoracing.Capacity;
import Autoracing.Driver.DriverD;
import Autoracing.Driver.Move;
import Autoracing.Transport.*;
public class Bus<D extends DriverD & Move> extends Transport {
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity=capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public void participate(D driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в заезде");
        printTypes();
    }

    @Override
    public void startMotion() {
        System.out.println("Автобус");
        super.startMotion();
    }
    @Override
    public void endMotion() {
        System.out.println("Автобус");
        super.endMotion();
    }
    @Override
    public void pitStop() {
        System.out.println(this + " остановился для замены шин");
    }
    @Override
    public void bestLapTime() {
        System.out.println(this + " показал лучшее время круга");
    }
    @Override
    public void maxSpeed() {
        System.out.println(this + " показал лучшую скорость");
    }

    @Override
    public void printTypes() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость автобуса от " + capacity.getFrom() + " мест " + " до " + capacity.getTo() + " мест");
        }
    }

    @Override
    public boolean checkVehicles() {
        System.out.println("Автобус" + getBrand() + " " + getModel() + " в диагностике не нуждается");
        return true;
    }
}
