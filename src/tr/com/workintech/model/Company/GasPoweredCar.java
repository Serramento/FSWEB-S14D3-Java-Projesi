package tr.com.workintech.model.Company;

public class GasPoweredCar extends CarSkeleton{
    public GasPoweredCar(String name, String description) {
        super(name, description);
    }
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return "GasPowered engine started.";
    }

    @Override
    public String drive() {
        return "GasPowered is driving.";
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
