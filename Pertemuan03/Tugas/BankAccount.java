public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException(MIN_BALANCE);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
