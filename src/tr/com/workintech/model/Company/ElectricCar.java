package tr.com.workintech.model.Company;

public class ElectricCar extends CarSkeleton{
    public ElectricCar(String name, String description) {
        super(name, description);
    }
    private double avKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avKmPerCharge, int batterySize) {
        super(name, description);
        this.avKmPerCharge = avKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public String startEngine() {
        return "ElectricCar engine started.";
    }

    @Override
    public String drive() {
        return "ElectricCar is driving.";
    }

    public double getAvKmPerCharge() {
        return avKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
