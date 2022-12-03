import Data.Data;
import Drivers.CategoryB;
import Drivers.CategoryC;
import Drivers.Driver;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "Z8", 3.2, false);
        System.out.println(bmw);
        bmw.pitStop();
        bmw.bestLapTime();
        bmw.maxSpeed();
        bmw.passDiagnostics();
        Driver<Car, CategoryB> ivan = new Driver<Car, CategoryB>("Иван Ианович Иванов", true, 3, null);
        ivan.participatesInTheRace(bmw);
        System.out.println();

        Truck gazelle = new Truck("ГАЗель", "Next", 2.9, true);
        System.out.println(gazelle);
        gazelle.pitStop();
        gazelle.bestLapTime();
        gazelle.maxSpeed();
        gazelle.passDiagnostics();
        Driver<Truck, CategoryC> misha = new Driver<Truck, CategoryC>("Михайлов Михаил Михайлович", true, 4, new CategoryC());
        misha.participatesInTheRace(gazelle);
        System.out.println();

        Bus zis = new Bus("ЗИС", "154", 4.5);
        System.out.println(zis);
        zis.pitStop();
        zis.bestLapTime();
        zis.maxSpeed();
        zis.passDiagnostics();
        Driver<Bus, CategoryC> alex = new Driver<Bus, CategoryC>("Александров Александр Александрович", true, 5, new CategoryC());
        alex.participatesInTheRace(zis);
        System.out.println();

        boolean success = Data.validate("test", "test", "test");
        if (success) {
            System.out.println("Вы зарегистрированы!");
        } else {
            System.out.println("Данные введены некорректно");
        }
    }
}