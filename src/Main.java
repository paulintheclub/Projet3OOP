import Entity.Order;
import Entity.Person.Client;
import Entity.Person.Employee;
import Entity.Vehicle.Bus;
import Entity.Vehicle.Sedan;
import Entity.Vehicle.Truck;
import Entity.Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
        Scanner k = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        int  select = in.nextInt();
        System.out.print("Enter login:");
        String login =   k.nextLine();
        System.out.print("Enter password:");
        String password =  z.nextLine();
        if (select == 1)
        {
            LoggingAsClient(login, password, orders);
        }
        else
        {
            LoginAsEmployee(login, password, orders, employees);
        }
        in.close();

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
        Scanner in = new Scanner(System.in);
        System.out.print("Select:");
        int select = in.nextInt();
        switch (select) {
            case 1 -> ShowOrders(orders);
            case 2 -> ShowOnlyEmployeeOrders(employee, orders);
        }
        in.close();
    }

    public  static ArrayList<Order> getOrders() {
        ArrayList<Employee> employees = getEmployees();
        ArrayList<Order> orders = new ArrayList<Order>();

        Client client1 = new Client("Hope", "hopeislife@gmail.com", 23, "onlyyou");
        Client client2 = new Client("Kristine", "kris11@gmail.com", 27, "dontknow");
        Client client3 = new Client("Teodor", "teomyname@gmail.com", 19, "teoprezident");
        Client client4 = new Client("Franklin", "frankfromgame@gmail.com", 45, "gunsandrosses");
        Client client5 = new Client("Zuzana", "zuzytree2@gmail.com", 32, "zuzka32");
        Client client6 = new Client("Viktoria", "victory@gmail.com", 34, "vikitiki");
//        Client client7 = new Client("Maria", "ohmygod@gmail.com", 26, "mari111");
//        Client client8 = new Client("Sofia", "sofialikeacity@gmail.com", 51, "sofia22");
//        Client client9 = new Client("Siargei", "thebest@gmail.com", 33, "hardpassword");
//        Client client10 = new Client("Tom", "tomandjerry@gmail.com", 18, "jerryloose");
        Truck truck1 = new Truck("Mersedes-Benz", 6, "black", 2);
        Truck truck2 = new Truck("Audi", 4, "white", 4);
        Bus bus1 = new Bus("BMW", 4, "blue", 4);
        Bus bus2 = new Bus("Skoda", 4, "yellow", 4);
        Sedan sedan1 = new Sedan("Jeep", 4, "green", 2);
        Sedan sedan2 = new Sedan("Volvo", 4, "purple", 2);
        Order order1 = new Order(client1, employees.get(0), truck1,LocalDateTime.now(),false);
        Order order2 = new Order(client2, employees.get(1), truck2,LocalDateTime.now(),false);
        Order order3 = new Order(client3, employees.get(2), bus1,LocalDateTime.now(),false);
        Order order4 = new Order(client4, employees.get(3), bus2,LocalDateTime.now(),false);
        Order order5 = new Order(client5, employees.get(4), sedan1,LocalDateTime.now(),false);
        Order order6 = new Order(client6, employees.get(5), sedan2,LocalDateTime.now(),false);
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        return orders;
    }

    public  static ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee employee1 = new Employee("Ivan", "kek", 23, "334455");
        Employee employee2 = new Employee("Pavlo", "pavlo45@gmail.com", 18,"qwerty" );
        Employee employee3 = new Employee("Marek", "marek12@gmail.com", 32,"figa32" );
        Employee employee4 = new Employee("John", "john33@gmail.com", 42,"liljohn" );
        Employee employee5 = new Employee("Fillip", "fil777@gmail.com", 33,"filkill" );
        Employee employee6 = new Employee("George", "gog123@gmail.com", 22,"john22" );
        Employee employee7 = new Employee("Kenny", "keniken@gmail.com", 24,"kennyvise" );
        Employee employee8 = new Employee("Sidney", "sidneyfromusa@gmail.com", 41,"sisidney145" );
        Employee employee9 = new Employee("Willy", "willyoubemine@gmail.com", 25,"yesiwill" );
        Employee employee10 = new Employee("Lusy", "lusygq@gmail.com", 31,"lusyor" );
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);
        return employees;
    }


    public static void AddOrder(ArrayList<Order> orders, Employee employee) {

        System.out.print("Input client name:\n");
        Scanner k = new Scanner(System.in);
        String name = k.nextLine();


        System.out.print("Input client email\n");
        Scanner z = new Scanner(System.in);
        String email = z.nextLine();


        System.out.print("Input client age:\n");
        Scanner f = new Scanner(System.in);
        int age = f.nextInt();


        System.out.print("Input client password:\n");
        Scanner l = new Scanner(System.in);
        String password = l.nextLine();


        System.out.print("Input vehicleBrand:\n");
        Scanner s = new Scanner(System.in);
        String vehicleBrand = s.nextLine();


        System.out.print("Input count wheels:\n");
        Scanner a = new Scanner(System.in);
        int wheels = a.nextInt();


        System.out.print("Input auto color:\n");
        Scanner p = new Scanner(System.in);
        String color = p.nextLine();


        System.out.print("Input count doors:\n");
        Scanner j = new Scanner(System.in);
        int doors = j.nextInt();


        Order order = new Order(
                new Client(name, email, age, password), employee,
                new Vehicle(vehicleBrand, wheels, color, doors), LocalDateTime.now(), false
        );
        orders.add(order);
        k.close();
        z.close();
        f.close();
        l.close();
        l.close();
        a.close();
        l.close();
        j.close();
        ShowOrders(orders);
    }

    public static void DeleteOrder(ArrayList<Order> orders) {

        System.out.print("Input client name:\n");
        Scanner k = new Scanner(System.in);
        String name = k.nextLine();

        System.out.print("Input vehicle brand:\n");
        Scanner z = new Scanner(System.in);
        String vehicleBrand = z.nextLine();

        orders.removeIf(order -> order.getClient().getName().equals(name) && order.getVehicle().getVehicleBrand().equals(vehicleBrand));
        k.close();
        z.close();
        ShowOrders(orders);
    }

    public static void MarkOrderAsCompleted(ArrayList<Order> orders,Employee employee){

        System.out.print("Input client name:\n");
        Scanner k = new Scanner(System.in);
        String name = k.nextLine();


        System.out.print("Input vehicle brand:\n");
        Scanner z = new Scanner(System.in);
        String vehicleBrand = k.nextLine();


        for (Order order: orders) {
            if (order.getClient().getName().equals(name) && order.getVehicle().getVehicleBrand().equals(vehicleBrand)
                    && order.getEmployee().getEmail().equals(employee.getEmail()))
            {
               order.setExecuted(true);
            }
        }
        z.close();
        k.close();
        ShowOrders(orders);
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
        switch (select) {
            case 1 -> DeleteOrder(orders);
            case 2 -> AddOrder(orders, employee);
            case 3 -> MarkOrderAsCompleted(orders, employee);
        }
        k.close();

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