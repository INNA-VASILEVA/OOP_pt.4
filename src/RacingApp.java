import Autoracing.Vehicles.Bus;
import Autoracing.Vehicles.Car;
import Autoracing.Vehicles.Truck;
import Autoracing.Driver.*;

public class RacingApp {
    public static void main(String[] args) {
        Bus <DriverD> daewoo = new Bus <>("Daewoo", "BS106 Royal Star", 8.7);
        Bus <DriverD> isuzu = new Bus <>("ISUZU", "А-092Н6", 9.0);
        Bus <DriverD> yutong = new Bus<>("Yutong", "ZK6720D", 10.0);
        Bus <DriverD> iris = new Bus<>("Irisbus", "Iveco Arway", 7.8);
        System.out.println(daewoo);
        System.out.println(isuzu);
        System.out.println(yutong);
        System.out.println(iris);

        Car <DriverB> lada = new Car <>("Lada", "Granta",1.9);
        Car <DriverB> audi = new Car<>("Audi", "A8 50 L TDI quattro", 3.0);
        Car <DriverB> bmw = new Car<>("BMW", "Z8",  3.0);
        Car <DriverB> suzuki = new Car<>("Suzuki", "Vitara", 3.0);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(suzuki);

        Truck <DriverC> man = new Truck<>("MAN", "TGM",6.9);
        Truck <DriverC> mers = new Truck<>("Mercedes-Benz", "Atego", 4.3);
        Truck <DriverC> volvo = new Truck<>("Volvo", "FH",12.8);
        Truck <DriverC> kamaz = new Truck<>("КАМАЗ", "6522", 8.8);
        System.out.println(man);
        System.out.println(mers);
        System.out.println(volvo);
        System.out.println(kamaz);

        DriverB driverB = new DriverB("Чунгук",4.0);
        DriverC driverC = new DriverC("Тэхен",5.0);
        DriverD driverD = new DriverD(" Чимин", 5.1);

        daewoo.participate(driverD);
        suzuki.participate(driverB);
        kamaz.participate(driverC);


    }
}
