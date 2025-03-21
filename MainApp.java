import java.util.Scanner;
// Solomon Mwangi CT101/G/20741/23
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize employee details (name and salary)
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display the employee's name and salary
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Getter for the employee's name
    public String getName() {
        return name;
    }

    // Setter for the employee's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the employee's salary
    public double getSalary() {
        return salary;
    }

    // Setter for the employee's salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class SalaryCalculator {
    // Method to calculate the bonus, which is 10% of the salary
    public double calculateBonus(double salary) {
        return salary * 0.1; // 10% bonus calculation
    }
}

public class MainApp {
    public static void main(String[] args) {
        // Use scanner to get input from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for the employee's name
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            
            // Prompt the user for the employee's salary
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            
            // Create an Employee object with the provided name and salary
            Employee employee = new Employee(name, salary);
            
            // Create a SalaryCalculator object to calculate the bonus
            SalaryCalculator calculator = new SalaryCalculator();
            
            // Calculate the bonus based on the salary
            double bonus = calculator.calculateBonus(salary);
            
            // Display the employee's details and the calculated bonus
            employee.displayDetails();
            System.out.println("Bonus: $" + bonus);
        }
    }
}
