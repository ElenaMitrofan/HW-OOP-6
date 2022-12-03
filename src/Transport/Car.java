package Transport;

import Drivers.Category;

public class Car extends Transport implements Competing {
    private final boolean service;
    public Car(String brand, String model, double engineVolume, boolean service) {

        super(brand, model, engineVolume);
        this.service = service;
    }

    public Car() {
        this ("default",
                "default",
                1.1,
                false);
    }

    public boolean isService() {
        return service;
    }

    public void startMoving(){
        return;
    }
    public void finishMoving(){
        return;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + getBrand()+
                ", модель: " + getModel()+
                ", объём двигателя: " + getEngineVolume();
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль заезжает на обслуживание %s %s.\n", getBrand(), getModel());
        System.out.printf("Автомобиль %s %s прошел обслуживание, выезжает на трассу.\n", getBrand(), getModel());

    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время автомобиля %s %s составляет: %.0f мин.\n", getBrand(), getModel(), (1+Math.random() * (5)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автомобиля %s %s составила: %.1f км/ч.\n", getBrand(), getModel(), (100+Math.random() * (200)));
    }

    @Override
    public boolean passDiagnostics() {
        if (service == false) {
            throw new RuntimeException ("Автомобиль " + getBrand() + " " + getModel() + " не прошел диагностику");
        } else {
            return true;
        }
    }
}
