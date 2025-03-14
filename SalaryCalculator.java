import java.util.Scanner;
//solomon mwangi ct101/g/20741/23
public class SalaryCalculator {
        public static void main(String[] args) {
        // Get user input for years of service
        try ( // Create a Scanner object to read input from the user
                Scanner scanner = new Scanner(System.in)) {
            // Get user input for years of service
            System.out.print("Enter the years of service: ");
            int yearsOfService = scanner.nextInt();
            // Constant salary
            int salary = 20000;
            // Calculate bonus based on years of service
            double bonusPercentage;
            if (yearsOfService > 10) {
                bonusPercentage = 0.12;
            } else if (yearsOfService >= 6 && yearsOfService <= 10) {
                bonusPercentage = 0.10;
            } else {
                bonusPercentage = 0.08;
            }   // Calculate bonus amount
            double bonusAmount = bonusPercentage * salary;
            // Calculate net salary
            double netSalary = salary + bonusAmount;
            // Print the results
            System.out.println("Salary: $" + salary);
            System.out.println("Bonus: $" + bonusAmount);
            System.out.println("Net Salary: $" + netSalary);
            // Close the scanner
        }
    }
}