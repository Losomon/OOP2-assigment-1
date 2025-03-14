import java.util.Scanner; // Import Scanner class
//solomon  mwangi ct101/g/20741/23
class Main { // Class name should start with uppercase (Java convention)

    // Method to calculate discount
    public static double get_discount(double amountSpend) {
        double discount; // Declare discount variable
        if (amountSpend > 5000) {
            discount = (10 * amountSpend) / 100; // 10% discount
        } else if (amountSpend > 1000) {
            discount = (5 * amountSpend) / 100; // 5% discount
        } else {
            discount = 0; // No discount
        }
        return discount; // Return the discount value
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in) // Create Scanner object using System.in
        ) {
            System.out.print("Enter the amount spent: "); // Prompt user for input
            double amountSpend = scanner.nextDouble(); // Read user input using System.in
            double discount = get_discount(amountSpend); // Call method to calculate discount
            System.out.println("The discount is: " + discount); // Display discount
            // Close Scanner to prevent resource leak
        } // Prompt user for input
    }
}