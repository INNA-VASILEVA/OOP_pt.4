package Autoracing.Vehicles;
import Autoracing.Driver.DriverD;
import Autoracing.Driver.Move;
import Autoracing.Transport.*;
public class Bus<D extends DriverD & Move> extends Transport {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void participate(D driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в заезде");
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
}
