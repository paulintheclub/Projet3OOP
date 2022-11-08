import Entity.Order;
import Entity.Person.Employee;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        InputChek();
    }

    public static void InputChek() {
        System.out.print("Select(1-2):\n");
        System.out.print("1. Enter without Login\n");
        System.out.print("2. Enter with Login\n");
        System.out.print("Select:");
        Scanner in = new Scanner(System.in);
        int  select = in.nextInt();
        if (select == 1)
        {
            EnterWithOutLogin();
        }
        else
        {
            Scanner k = new Scanner(System.in);
            Scanner z = new Scanner(System.in);
            System.out.print("Enter login:");
            String login = k.nextLine();
            System.out.print("Enter password:");
            String password = z.nextLine();
            in.close();
            EnterWithLogin(login, password);
        }

    }

    public static void EnterWithLogin(String login, String password) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee  employee1 = new Employee();
        employee1.setName("Ivan");
        employee1.setPassword("112233");
        employees.add(employee1);

        for (Employee employee : employees)
        {
            if (employee.getEmail().equals(login) && employee.getPassword().equals(password)) {
                WorkWithOrders(login);
            }
        }
    }
    public static void WorkWithOrders(String login) {
        ArrayList<Order> orders = getOrders();
        System.out.print("Select(1-4):\n");
        System.out.print("1. Show all orders\n");
        System.out.print("2. Show only my orders\n");
        System.out.print("3. Delete order\n");
        System.out.print("4. Add new order\n");
        Scanner k = new Scanner(System.in);
        System.out.print("Select:");
        int select = k.nextInt();
        switch (select) {
            case 1 -> System.out.print("Show all orders");
            case 2 -> ShowOnlyEmployeeOrders(login);
            case 3 -> DeleteOrder();
            case 4 -> AddOrder();
        }

    }


    private static ArrayList<Order> getOrders() {
        ArrayList<Order> orders = new ArrayList<Order>();
        Order ll = new Order();
        return orders;
    }


    public static void AddOrder() {
        ArrayList<Order> orders = getOrders();
        Order newOrder = new Order();


    }

    public static void DeleteOrder() {
        ArrayList<Order> orders = getOrders();

    }

    public static void ShowOnlyEmployeeOrders(String login) {
        ArrayList<Order> orders = getOrders();
        for (Order order: orders) {
            if (order.getEmployee().getName().equals(login))
            {
                System.out.print("%s", order.getClient().getName());
                System.out.print("%b", order.getExecuted());
                System.out.print("%b", order.getExecuted());
                System.out.print("%b", order.getExecuted());
                System.out.print("%b", order.getExecuted());
               order.setDateOfOrder(LocalDateTime.now());
            }
        }

    }

    public static void EnterWithOutLogin() {
        System.out.print("Select(1-2):\n");
        System.out.print("1. Show all orders\n");
        System.out.print("2. Back\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Select:");
        int select = in.nextInt();
        if (select == 1)
        {
            System.out.print("Show all orders");
        }
        else
        {
            InputChek();
        }
    }


}