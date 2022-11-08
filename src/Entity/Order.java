package Entity;

import Entity.Person.Client;
import Entity.Person.Employee;
import Entity.Vehicle.Vehicle;
import java.time.LocalDateTime;

public class Order {

    public Order(Client client, Employee employee, Vehicle vehicle, LocalDateTime dateOfOrder, boolean executed){
        this.client = client;
        this.employee = employee;
        this.vehicle = vehicle;
        this.dateOfOrder = dateOfOrder;
        this.executed = executed;
    }
    private Client client;
    public Client getClient() {return client;}
    public void setClient(Client newProperty){client = newProperty;}

    private Employee employee;
    public Employee getEmployee() {return employee;}
    public void setEmployee(Employee newProperty){
        employee = newProperty;}

    private Vehicle vehicle;
    public Vehicle getVehicle() {return vehicle;}
    public void setVehicle(Vehicle newProperty){vehicle = newProperty;}

    private LocalDateTime dateOfOrder;
    public LocalDateTime getDateOfOrder() {return dateOfOrder;}
    public void setDateOfOrder(LocalDateTime newProperty){dateOfOrder = newProperty;}

    private boolean executed;
    public boolean getExecuted() {return executed;}
    public void setExecuted(boolean newProperty){executed = newProperty;}

}
