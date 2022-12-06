package Entity.Vehicle;

public final class Bus extends Vehicle {

    public Bus(String vehicleBrand, int wheels, String color, int doors) {
        super(vehicleBrand, wheels, color, doors);
    }

    @Override
    public final void Horn(){
        System.out.print("tuuuuuu!\n");
    }
}
