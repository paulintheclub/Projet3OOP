package Entity.Person;

import Entity.Vehicle.Vehicle;

public class Client extends Person {
    private Vehicle vehicle;
    public Vehicle getVehicle() {return vehicle;}
    public void setHorn(Vehicle newProperty){vehicle = newProperty;}
}
