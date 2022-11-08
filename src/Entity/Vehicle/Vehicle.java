package Entity.Vehicle;

public class Vehicle {

    public Vehicle( String vehicleBrand, int wheels, String color, int doors){
        this.vehicleBrand = vehicleBrand;
        this.wheels = wheels;
        this.color = color;
        this.doors = doors;
    }

    private String vehicleBrand;
    public String getVehicleBrand() {return vehicleBrand;}
    public void setVehicleBrand(String newProperty){vehicleBrand = newProperty;}

    private int wheels;
    public int getWheels() {return wheels;}
    public void setWheels(int newProperty){wheels = newProperty;}

    private String color;
    public String getColor() {return color;}
    public void setColor(String newProperty){color = newProperty;}

    private int doors;
    public int getDoors() {return doors;}
    public void setDoors(int newProperty){doors = newProperty;}


    public void  Horn(){
        System.out.print("Truu!\n");
    }

}
