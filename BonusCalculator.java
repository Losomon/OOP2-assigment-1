import java.util.Scanner;
//solomon mwangi
// adm No.ct101/g/20741/23
public class BonusCalculator {
    
    public static void main(String[] args) {
        // Get the salary from the user
        try ( // Create a scanner to read user input
                Scanner scanner = new Scanner(System.in)) {
            // Get the salary from the user
            System.out.println("Please enter your salary: ");
            double salary = scanner.nextDouble();
            // Get the years of service from the user
            System.out.println("Please enter your years of service: ");
            int yearsOfService = scanner.nextInt();
            // Variable to store the bonus percentage
            double bonusPercentage;
            // Decide the bonus percentage based on years of service
            if (yearsOfService > 10) {
                bonusPercentage = 12; // 12% bonus for more than 10 years
            } else if (yearsOfService >= 6) {
                bonusPercentage = 10; // 10% bonus for 6 to 10 years
            } else {
                bonusPercentage = 8; // 8% bonus for less than 6 years
            }   // Calculate the bonus amount
            double bonusAmount = (bonusPercentage / 100) * salary;
            // Display the result to the user
            System.out.println("Your bonus amount is: " + bonusAmount);
            // Close the scanner
        }
    }
}

