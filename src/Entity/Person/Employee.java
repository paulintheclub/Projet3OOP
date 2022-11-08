package Entity.Person;

public class Employee extends Person {
    public Employee(String name, String email, int age, String password) {
        super(name, email, age, password);
    }
    private double salary;
    public double getClient() {return salary;}
    public void setClient(double newProperty){salary = newProperty;}


}
