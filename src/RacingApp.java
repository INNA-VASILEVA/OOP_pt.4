import Autoracing.Capacity;
import Autoracing.Mechanic.Mechanic;
import Autoracing.ServiceStation;
import Autoracing.Sponsor.Sponsor;
import Autoracing.Transport.Transport;
import Autoracing.TypesOfVehicles;
import Autoracing.Vehicles.Bus;
import Autoracing.Vehicles.Car;
import Autoracing.Vehicles.Truck;
import Autoracing.Driver.*;
import Autoracing.Weight;

import java.util.List;


public class RacingApp {

    public static void checkVehicles(Transport... transports) throws RuntimeException {
        for (Transport transport : transports) {
            if (!transport.checkVehicles())
                try {
                    throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошёл диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
        }
    }


    public static void main(String[] args) {
        Mechanic<Bus> jhope = new Mechanic<Bus>("Джей Хоуп", "BTS");
        Sponsor bhe = new Sponsor("BIG HIT ENTERTAINMENT", 1_000_000);

        Bus<DriverD> daewoo = new Bus<>("Daewoo", "BS106 Royal Star", 8.7, Capacity.M);
        daewoo.addDriver(new DriverD("Чимин", 5.1));
        daewoo.addMechanic(jhope);
        daewoo.addSponsor(bhe);
        Bus<DriverD> isuzu = new Bus<>("ISUZU", "А-092Н6", 9.0, Capacity.L);
        Bus<DriverD> yutong = new Bus<>("Yutong", "ZK6720D", 10.0, Capacity.XL);
        Bus<DriverD> iris = new Bus<>("Irisbus", "Iveco Arway", 7.8, Capacity.S);
        System.out.println(daewoo);
        System.out.println(isuzu);
        System.out.println(yutong);
        System.out.println(iris);

        Mechanic<Car> jin = new Mechanic<Car>("Чин", "BTS");

        Car<DriverB> lada = new Car<>("Lada", "Granta", 1.9, TypesOfVehicles.SEDAN);
        Car<DriverB> audi = new Car<>("Audi", "A8 50 L TDI quattro", 3.0, TypesOfVehicles.UNIVERSAL);
        Car<DriverB> bmw = new Car<>("BMW", "Z8", 3.0, TypesOfVehicles.MINIVAN);
        Car<DriverB> suzuki = new Car<>("Suzuki", "Vitara", 3.0, TypesOfVehicles.CROSSOVER);

        suzuki.addMechanic(jin);
        suzuki.addSponsor(bhe);
        suzuki.addDriver(new DriverB("Чунгук", 3.0));
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(suzuki);

        Mechanic<Truck> suga = new Mechanic<Truck>("Шуга", "BTS");


        Truck<DriverC> man = new Truck<>("MAN", "TGM", 6.9, Weight.N2);
        Truck<DriverC> mers = new Truck<>("Mercedes-Benz", "Atego", 4.3, Weight.N1);
        Truck<DriverC> volvo = new Truck<>("Volvo", "FH", 12.8, Weight.N3);
        Truck<DriverC> kamaz = new Truck<>("КАМАЗ", "6522", 8.8, Weight.N2);
        kamaz.addDriver(new DriverD("Тэхен", 5.0));
        kamaz.addMechanic(suga);
        kamaz.addSponsor(bhe);
        System.out.println(man);
        System.out.println(mers);
        System.out.println(volvo);
        System.out.println(kamaz);

        List<Transport> transports = List.of(daewoo, suzuki, kamaz);
        for (Transport transport:transports){
            printInfo(transport);
        }


        DriverB driverB = new DriverB("Чунгук", 4.0);
        DriverC driverC = new DriverC("Тэхен", 5.0);
        DriverD driverD = new DriverD(" Чимин", 5.1);

        daewoo.participate(driverD);
        suzuki.participate(driverB);
        kamaz.participate(driverC);

        checkVehicles(daewoo);
        checkVehicles(kamaz);
        checkVehicles(suzuki);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(suzuki);
        serviceStation.addTruck(kamaz);
        serviceStation.checkVehicles();
        serviceStation.checkVehicles();


        boolean success = Data.validate("qwerty", "qwerty", "qwerty");
        if (success) {
            System.out.println("данные ок");
        } else {
            System.out.println("данные не ок");

        }
    }
    private static void printInfo(Transport transport) {
        System.out.println("Информация по автобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители:" );
        for (Driver driver: transport.getDrivers()){
            System.out.println(driver.getName());
        }
        System.out.println("Механики:" );
        for (Mechanic mechanic: transport.getMechanics()){
            System.out.println(mechanic.getName() + " из " + mechanic.getCompany());
        }
        System.out.println("Спонсоры:" );
        for (Sponsor sponsor: transport.getSponsors()){
            System.out.println(sponsor.getName());
        }

    }
}
