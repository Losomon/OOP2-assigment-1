class BankAccount implements BankAccount {
    // This variable holds the account balance. It's private, meaning it can only be accessed within this class.
    private double balance;

    // This method lets you check the current balance of the account.
    @Override
    public double getbalance() {
        // It simply returns the value stored in the 'balance' variable.
        return balance;
    }

    // This method allows you to set the initial balance of the account.
    @Override
    public void setbalance(double balance) {
        // It takes a 'balance' value as input and assigns it to the account's balance.
        this.balance = balance;
    }

    // This method lets you deposit money into the account.
    @Override
    public void deposit(double amount) {
        // First, it checks if the amount you're trying to deposit is valid (greater than or equal to zero).
        if (amount >= 0) {
            // If the amount is valid, it adds it to the current balance.
            this.balance += amount;
        } else {
            // If the amount is invalid (negative), it prints an error message.
            System.out.println("The amount must be greater than 0");
        }
    }

    // This method lets you withdraw money from the account.
    @Override
    public void withdraw(double withdrawalamount) {
        // First, it checks if you have enough money in the account to withdraw the requested amount.
        if (withdrawalamount <= balance) {
            // If you have enough funds, it subtracts the withdrawal amount from the balance.
            this.balance -= withdrawalamount; // corrected from this.balance -= balance;
        } else {
            // If you don't have enough funds, it prints an "Insufficient funds" message.
            System.out.println("Insufficient funds");
        }
    }

    // This is the main method, the starting point of the program.
    public static void main(String[] args) {
        // Create a new BankAccount object (an account).
        BankAccount account = new BankAccount();

        // Set the initial balance of the account to 1000.
        account.setbalance(1000);

        // Deposit 500 into the account.
        account.deposit(500);

        // Withdraw 200 from the account.
        account.withdraw(200);

        // Print the current balance of the account to the console.
        System.out.println(account.getbalance());
    }
}