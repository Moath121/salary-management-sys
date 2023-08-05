import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // define preexistence employees in the system

        Employee admin = new Employee("Moath",1000);
        Employee emp1 = new Employee("Ahmed", 500);
        Employee emp2 = new Employee("Ali",800);
        //---------------------------//
        // create List to store all employees objects. we need this list to display all employees information
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(admin);
        employeeList.add(emp1);
        employeeList.add(emp2);
        //-------------------------------------//


        Scanner read = new Scanner(System.in);

        System.out.println("<>Welcome to salary management system<>");

        boolean stop = false; // we need this variable to control the while loop
        // after we finish displaying the employees
        while (!stop) {
            System.out.print("Enter C to create employee or enter S to show all employees info: ");
            String choice = read.next();

            if (choice.toLowerCase().equals("c")) { // create new employee object to hold it's info
                System.out.print("Enter employee name: ");
                String name = read.next();
                System.out.print("Enter the salary: ");
                double salary = read.nextDouble();
                // add the employee info into the list.
                // so we didn't lose it.
                // list is the best place to hold such info .
                employeeList.add(new Employee(name, salary));


            } else if (choice.toLowerCase().equals("s")) {
                System.out.println("<> All employees information: <>");
                // we need foreach loop to display all the objects info that stored in the list

                for (Employee emp : employeeList) {
                    System.out.println("Name: " + emp.name);
                    System.out.println("Salary: " + emp.getSalary());
                    System.out.println("--------------------------------------");
                }
                // after we display the info we tell to the user of he wants to exist from the program
                System.out.println();
                System.out.print("Do you want exist?: (Y/N): ");
                String exist = read.next();
                if (exist.toLowerCase().equals("y")) {
                    stop = true; // we set stop variable to true so the while loop terminated.
                }
            } else {
                System.out.println("<><> Error, enter correct options <><>");
            }
        }









    }
}




