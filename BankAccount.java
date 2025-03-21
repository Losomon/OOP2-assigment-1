class BankAccount {
    private double balance;

    // Getter method to retrieve the current balance
    public double getBalance() {
        return balance;
    }

    // Setter method to set the account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    // Ensures the deposit amount is greater than 0
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Please enter an amount greater than 0 for deposit.");
        }
    }

    // Method to withdraw money from the account
    // Checks if there are enough funds before withdrawing
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("You don't have enough funds for this withdrawal.");
        }
    }
    public static void main(String[] args) {
        // Create a new BankAccount instance
        BankAccount account = new BankAccount();
        
        // Set an initial balance of $1000
        account.setBalance(1000);
        
        // Deposit $500 into the account
        account.deposit(500);
        
        // Withdraw $200 from the account
        account.withdraw(200);
        
        // Print the current balance after transactions
        System.out.println("Current balance: " + account.getBalance());
    }
}
