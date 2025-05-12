public class BankAccount {
    // Attributes (State)
    double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("Account created with balance: " + balance);
    }

    // Behaviors (Methods)
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Balance: " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();
    }
}
