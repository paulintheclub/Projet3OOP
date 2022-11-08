import Entity.Order;
import Entity.Person.Client;
import Entity.Person.Employee;
import Entity.Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        InputChek();
    }

    public static void InputChek() {
        ArrayList<Order> orders = getOrders();
        ArrayList<Employee> employees = getEmployees();

        System.out.print("Select(1-2):\n");
        System.out.print("1. Login as Client\n");
        System.out.print("2. Login as Employee\n");
        System.out.print("Select:");
        Scanner in = new Scanner(System.in);
        int  select = in.nextInt();
        Scanner k = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        System.out.print("Enter login:");
        String login = k.nextLine();
        System.out.print("Enter password:");
        String password = z.nextLine();
        in.close();
        k.close();
        z.close();

        if (select == 1)
        {
            LoggingAsClient(login, password, orders);
        }
        else
        {
            LoginAsEmployee(login, password, orders, employees);
        }

    }

    public static void LoggingAsClient(String login, String passwrod, ArrayList<Order> orders) {

    }

    public static void LoginAsEmployee(String login, String password, ArrayList<Order> orders, ArrayList<Employee> employees) {


        for (Employee employee : employees)
        {
            if (employee.getEmail().equals(login) && employee.getPassword().equals(password)) {
                WorkWithOrders(employee);
            }
        }
    }

    public static void WorkWithOrders(Employee employee) {
        ArrayList<Order> orders = getOrders();
        System.out.print("Select(1-2):\n");
        System.out.print("1. Show all orders\n");
        System.out.print("2. Work with my orders\n");
        Scanner k = new Scanner(System.in);
        System.out.print("Select:");
        int select = k.nextInt();
        k.close();
        switch (select) {
            case 1 -> ShowOrders(orders);
            case 2 -> ShowOnlyEmployeeOrders(employee, orders);
        }
    }

    public  static ArrayList<Order> getOrders() {
        ArrayList<Order> orders = new ArrayList<Order>();
        Client employee1 = new Client("Ivan", "Jojo", 23, );
        return orders;
    }

    public  static ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Client employee1 = new Client("Ivan", "Jojo", 23, );
        return employees;
    }


    public static void AddOrder(ArrayList<Order> orders, Employee employee) {

        System.out.print("Input client name:\n");
        Scanner k = new Scanner(System.in);
        String name = k.nextLine();
        k.close();

        System.out.print("Input client email\n");
        Scanner z = new Scanner(System.in);
        String email = z.nextLine();
        z.close();

        System.out.print("Input client age:\n");
        Scanner f = new Scanner(System.in);
        int age = f.nextInt();
        f.close();

        System.out.print("Input client password:\n");
        Scanner l = new Scanner(System.in);
        String password = l.nextLine();
        l.close();

        System.out.print("Input vehicleBrand:\n");
        Scanner s = new Scanner(System.in);
        String vehicleBrand = s.nextLine();
        l.close();

        System.out.print("Input count wheels:\n");
        Scanner a = new Scanner(System.in);
        int wheels = a.nextInt();
        a.close();

        System.out.print("Input auto color:\n");
        Scanner p = new Scanner(System.in);
        String color = p.nextLine();
        l.close();

        System.out.print("Input count doors:\n");
        Scanner j = new Scanner(System.in);
        int doors = j.nextInt();
        j.close();

        Order order = new Order(
                new Client(name, email, age, password), employee,
                new Vehicle(vehicleBrand, wheels, color, doors), LocalDateTime.now(), false
        );
        orders.add(order);

    }

    public static void DeleteOrder(ArrayList<Order> orders) {

        System.out.print("Input client name:\n");
        Scanner k = new Scanner(System.in);
        String name = k.nextLine();
        k.close();

        System.out.print("Input vehicle brand:\n");
        Scanner z = new Scanner(System.in);
        String vehicleBrand = k.nextLine();
        z.close();

        orders.removeIf(order -> order.getClient().getName().equals(name) && order.getVehicle().getVehicleBrand().equals(vehicleBrand));
    }

    public static void MarkOrderAsCompleted(ArrayList<Order> orders,Employee employee){

        System.out.print("Input client name:\n");
        Scanner k = new Scanner(System.in);
        String name = k.nextLine();
        k.close();

        System.out.print("Input vehicle brand:\n");
        Scanner z = new Scanner(System.in);
        String vehicleBrand = k.nextLine();
        z.close();

        for (Order order: orders) {
            if (order.getClient().getName().equals(name) && order.getVehicle().getVehicleBrand().equals(vehicleBrand)
                    && order.getEmployee().getEmail().equals(employee.getEmail()))
            {
               order.setExecuted(true);
            }
        }


    }

    public static void ShowOnlyEmployeeOrders(Employee employee, ArrayList<Order> orders) {

        ArrayList<Order> ordersEmployee = new  ArrayList<Order>();
        for (Order order: orders) {
            if (order.getEmployee().getEmail().equals(employee.getEmail()))
            {
                ordersEmployee.add(order);
            }
        }

        ShowOrders(ordersEmployee);

        System.out.print("Select(1-3):\n");
        System.out.print("1. Delete order\n");
        System.out.print("2. Add new order\n");
        System.out.print("3. Mark the order as completed \n");
        Scanner k = new Scanner(System.in);
        System.out.print("Select:");
        int select = k.nextInt();
        k.close();
        switch (select) {
            case 1 -> DeleteOrder(orders);
            case 2 -> AddOrder(orders, employee);
            case 3 -> MarkOrderAsCompleted(orders, employee);
        }

    }
    public static void ShowOrders(ArrayList<Order> orders)
    {
        int index1 = 1;
        for (Order order :orders) {
            System.out.printf("%d\n", index1);
            System.out.printf("Client name: %s, ",  order.getClient().getName());
            System.out.printf("Client email: %s, ",  order.getClient().getEmail());
            System.out.printf("Employee name: %s, ",  order.getEmployee().getName());
            System.out.printf("Auto color: %s, ",  order.getVehicle().getColor());
            System.out.printf("Auto brand: %s, ",  order.getVehicle().getVehicleBrand());
            System.out.printf("Order date of create order: %s, ",  order.getDateOfOrder());
            System.out.printf("Completed task: %s, ",  order.getExecuted());
            System.out.print("============\n");
            index1++;
        }
    }


}