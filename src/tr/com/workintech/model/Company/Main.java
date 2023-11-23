package tr.com.workintech.model.Company;

public class Main {
    public static void main(String[] args) {

        CarSkeleton carSkeleton = new CarSkeleton("Generic Car", "2018");

        System.out.println(carSkeleton.drive());

        System.out.println(carSkeleton.startEngine());

        ElectricCar electricCar = new ElectricCar("Generic Car", "2018",300.0,200);

        System.out.println(electricCar.drive());

        System.out.println(electricCar.startEngine());

        HybridCar hybridCar = new HybridCar("Generic Car", "2018",300.0,200,200);

        System.out.println(hybridCar.drive());

        System.out.println(hybridCar.startEngine());

        GasPoweredCar gasPoweredCar = new GasPoweredCar("Generic Car", "2018",300.0,200);

        System.out.println(gasPoweredCar.drive());

        System.out.println(gasPoweredCar.startEngine());

        gasPoweredCar.runEngine();
        gasPoweredCar.runEngine(new GasPoweredCar("Generic Car", "2018",300.0,200));
        gasPoweredCar.runEngine(electricCar);
        gasPoweredCar.runEngine(hybridCar);

        CarSkeleton carSkeleton1= new ElectricCar("Serra","lorem",200.0,5);
        carSkeleton1.runEngine(carSkeleton1);
    }
}
