package Autoracing.Vehicles;
import Autoracing.Driver.DriverC;
import Autoracing.Driver.Move;
import Autoracing.Transport.*;
import java.util.Objects;
public class Truck<C extends DriverC & Move> extends Transport {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void participate(C driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в заезде");
    }

    @Override
    public void startMotion() {
        System.out.println("Грузовик");
        super.startMotion();
    }

    @Override
    public void endMotion() {
        System.out.println("Грузовик");
        super.endMotion();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Truck truck = (Truck) obj;
        return super.equals(truck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
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
}

