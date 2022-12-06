package Entity.Vehicle;

public final class Truck extends Vehicle {

    public Truck(String vehicleBrand, int wheels, String color, int doors) {
        super(vehicleBrand, wheels, color, doors);
    }

    @Override
    public final void  Horn(){
        System.out.print("Truu! Truu! Truu!\n");
    }
}
