package Autoracing.Vehicles;

import Autoracing.Driver.DriverC;
import Autoracing.Driver.Move;
import Autoracing.Transport.*;
import Autoracing.Weight;

import java.util.Objects;

public class Truck<C extends DriverC & Move> extends Transport {
    private Weight weight;

    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void participate(C driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в заезде");
        printTypes();
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

    @Override
    public void printTypes() {
        if (weight == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom();
            String to = weight.getTo() == null ? "" : "до " + weight.getTo();
            System.out.println("Грузоподьемность " + from + " тонн " + to + " тонн");
        }
    }
    @Override
    public boolean checkVehicles() {
        System.out.println(getBrand() + " " + getModel() + " прошел диагностику");
        return true;
    }
}

