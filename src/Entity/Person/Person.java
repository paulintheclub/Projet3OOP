package Entity.Person;

public class Person {

    public Person(String name, String email, int age  ){
        this.name = name;
        this.email = email;
        this.age = age;
    }
    private String name;
    public String getName() {return name;}
    public void setName(String newProperty){name = newProperty;}

    private String email;
    public String getEmail() {return email;}
    public void setEmail(String newProperty){email = newProperty;}

    private int age;
    public int getAge() {return age;}
    public void setAge(int newProperty){age = newProperty;}

}
