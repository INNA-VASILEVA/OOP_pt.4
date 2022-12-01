package Autoracing.Transport;
import Autoracing.Competion;
import Autoracing.Driver.Driver;
import Autoracing.Driver.Move;
import java.util.Objects;

public abstract class Transport implements Competion {

    private String brand;
    private String model;
    private double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "Информация не указана";
        }
        if (model != null && !model.isEmpty() && !brand.isBlank()) {
            this.model = model;
        } else {
            this.model = "Информация не указана";
        }
        if (engineVolume <= 0.0) {
            this.engineVolume = 1.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "Информация не указана";
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !brand.isBlank()) {
            this.model = model;
        } else {
            this.model = "Информация не указана";
        }
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0.0) {
            this.engineVolume = 1.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void startMotion() {
        System.out.println(getBrand() + " " + getModel() + " начал движение ");
    }

    public void endMotion() {
        System.out.println(getBrand() + " " + getModel() + " закончил движение ");
    }


    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public String toString() {
        return this.brand + " модель " + this.model + " объем двигателя " + this.engineVolume + " л";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
            Transport transport = (Transport) obj;
            return this.engineVolume == transport.engineVolume && Objects.equals(this.brand, transport.brand) && Objects.equals(this.model, transport.model);
        } else {
            return false;
        }
    }

    public abstract void pitStop();

    public abstract void bestLapTime();

    public abstract void maxSpeed();

    public abstract void printTypes ();
}