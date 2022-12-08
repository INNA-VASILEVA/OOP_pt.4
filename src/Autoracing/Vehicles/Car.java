package Autoracing.Vehicles;

import Autoracing.Driver.DriverB;
import Autoracing.Driver.Move;
import Autoracing.Transport.*;
import Autoracing.TypesOfVehicles;

import java.util.Objects;

public class Car<B extends DriverB & Move> extends Transport {

    private TypesOfVehicles typesOfVehicles;

    public Car(String brand, String model, double engineVolume, TypesOfVehicles typesOfVehicles) {
        super(brand, model, engineVolume);
        this.typesOfVehicles = typesOfVehicles;
    }

    public TypesOfVehicles getTypesOfVehicles() {
        return typesOfVehicles;
    }

    public void setTypesOfVehicles(TypesOfVehicles typesOfVehicles) {
        this.typesOfVehicles = typesOfVehicles;
    }

    public void participate(B driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в заезде ");
        printTypes();
    }

    @Override
    public void startMotion() {
        super.startMotion();
    }

    @Override
    public void endMotion() {
        System.out.println("Автомобиль");
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
        if (typesOfVehicles == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова авто " + typesOfVehicles);
        }
    }

    @Override
    public boolean checkVehicles() {
        System.out.println(getBrand() + " " + getModel() + " прошел диагностику");
        return true;
    }
    @Override
    public void repairVehicles(){
        System.out.println("Машина " + getBrand() + getModel() + " отремонтирована");
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
        Car car = (Car) obj;
        return super.equals(car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

}

