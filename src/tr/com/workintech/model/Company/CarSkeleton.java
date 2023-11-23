package tr.com.workintech.model.Company;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine(){
        return "Engine is starting";
    }
    public String drive(){
        runEngine();
        return "Driving";
    }
    protected void runEngine(){
        System.out.println("Engine is running");
    }
    /*protected void runEngine(ElectricCar electricCar){
        System.out.println("ElectricCar is running.");
    }
    protected void runEngine(GasPoweredCar gasPoweredCar){
        System.out.println("GasPoweredCar is running.");
    }
    protected void runEngine(HybridCar hybridCar){
        System.out.println("HybridCar is running with "+hybridCar.getCylinders());
    }*/
    protected void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof GasPoweredCar){
            System.out.println("GasPoweredCar is running with"+ ((GasPoweredCar) carSkeleton).getAvgKmPerLitre());
        } else if(carSkeleton instanceof  ElectricCar){
            System.out.println("ElectricCar is running with "+((ElectricCar)carSkeleton).getAvKmPerCharge());
        }
    }
}
