package Entity.Person;

public class Employee extends Person {
    private String password;

    public Employee(String name, String email, int age, String password) {
        super(name, email, age);
        this.password = password;
    }

    public String getPassword() {return password;}
    public void setPassword(String newProperty){password = newProperty;}
}
