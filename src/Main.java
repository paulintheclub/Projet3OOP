import Entity.Person.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputChek();
    }

    public static void InputChek() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter login:");
        String login = in.nextLine();
        System.out.print("Enter password:");
        String password = in.nextLine();

        System.out.printf("Your login: %s \n", login);
        System.out.printf("Your login: %s \n", password);
        in.close();
        EnterWithLogin(login, password);
    }

    public static void EnterWithLogin(String login, String password) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee  employee1 = new Employee();
        employee1.setName("Ivan");
        employee1.setPassword("112233");
        employees.add(new Employee());

        for (Employee employee : employees)
        {
            if (employee.getName().equals("Ivan")) {
                System.err.println("Username incorrect.");
            }


        }
    }

    public static void EnterWithOutLogin() {

    }


}