// Base class: BankAccount
abstract class BankAccount {
    protected double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Abstract withdraw method
    public abstract void withdraw(double amount);
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of $100 required.");
        }
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + 1; // $1 transaction fee
        if (balance >= totalAmount) {
            balance -= totalAmount;
            System.out.println("Withdrawn: $" + amount + " (Fee: $1) | New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal and transaction fee.");
        }
    }
}

// Main class to test the accounts
public class BankApplication {
    public static void main(String[] args) {
        // Create SavingsAccount object
        SavingsAccount savings = new SavingsAccount(500);
        savings.deposit(200);
        savings.withdraw(550);
        savings.withdraw(50);

        // Create CheckingAccount object
        CheckingAccount checking = new CheckingAccount(300);
        checking.deposit(100);
        checking.withdraw(50);
        checking.withdraw(350);
    }
}