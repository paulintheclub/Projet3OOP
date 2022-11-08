package Entity.Person;

import Entity.Vehicle.Vehicle;

public class Client extends Person {
    public Client(String name, String email, int age, String password) {
        super(name, email, age, password);
    }

    private boolean discount;
    public boolean getClient() {return discount;}
    public void setClient(boolean newProperty){discount = newProperty;}

    @Override
    public void  Сlothes(){
        System.out.print("Normal clothes\n");
    }

}
