import java.util.Scanner;
// solomon mwangi ct101/g/20741/23
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class SalaryCalculator {
    public double calculateBonus(double salary) {
        return salary * 0.1; // 10% bonus
    }
}

public class MainApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            
            Employee employee = new Employee(name, salary);
            SalaryCalculator calculator = new SalaryCalculator();
            
            double bonus = calculator.calculateBonus(salary);
            
            employee.displayDetails();
            System.out.println("Bonus: $" + bonus);
        }
    }
}
