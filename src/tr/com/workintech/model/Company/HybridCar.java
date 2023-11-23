package tr.com.workintech.model.Company;

public class HybridCar extends CarSkeleton{
    public HybridCar(String name, String description) {
        super(name, description);
    }
    private double avKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avKmPerLitre = avKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public String startEngine() {
        return "HybridCar engine started.";
    }

    @Override
    public String drive() {
        return "HybridCar is driving.";
    }

    public double getAvKmPerLitre() {
        return avKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
