package Entity.Vehicle;

public class Sedan extends Vehicle {

    public Sedan(String vehicleBrand, int wheels, String color, int doors) {
        super(vehicleBrand, wheels, color, doors);
    }
    @Override
    public void  Horn(){
        System.out.print("Biiiip!\n");
    }
}
