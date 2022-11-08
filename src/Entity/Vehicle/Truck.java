package Entity.Vehicle;

public class Truck extends Vehicle {

    public Truck(String vehicleBrand, int wheels, String color, int doors) {
        super(vehicleBrand, wheels, color, doors);
    }

    @Override
    public void  Horn(){
        System.out.print("Truu! Truu! Truu!\n");
    }
}
