public class BankApp {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(500.0);

            // Skenario saldo mencukupi
            System.out.println("Saldo awal: $" + account.getBalance());
            account.withdraw(200.0);
            System.out.println("Penarikan pertama berhasil. Saldo saat ini: $" + account.getBalance());

            // Skenario saldo tidak mencukupi
            account.withdraw(400.0);
            System.out.println("Penarikan kedua berhasil. Saldo saat ini: $" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
