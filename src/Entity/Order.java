package Entity;

import Entity.Person.Client;
import Entity.Person.Employee;
import Entity.Vehicle.Vehicle;
import java.time.LocalDateTime;

public class Order {
    private Client client;
    public Client getClient() {return client;}
    public void setPassword(Client newProperty){client = newProperty;}

    private Employee employee;
    public Employee getStaff() {return employee;}
    public void setStaff(Employee newProperty){
        employee = newProperty;}

    private Vehicle vehicle;
    public Vehicle getVehicle() {return vehicle;}
    public void setStaff(Vehicle newProperty){vehicle = newProperty;}

    private LocalDateTime dateOfOrder;
    public LocalDateTime getDateOfOrder() {return dateOfOrder;}
    public void setDateOfOrder(LocalDateTime newProperty){dateOfOrder = newProperty;}

}
