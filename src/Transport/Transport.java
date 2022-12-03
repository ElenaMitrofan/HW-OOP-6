package Transport;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected final double engineVolume;


    public Transport(String brand, String model, double engineVolume) {

        if (brand == null || brand == "") {
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "default";
        }else{
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.1;
        }else{
            this.engineVolume = engineVolume;
        }


    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract boolean passDiagnostics();


}
