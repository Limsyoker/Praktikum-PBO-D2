public class InsufficientFundsException extends Exception {
  public InsufficientFundsException(double requiredBalance) {
      super("Withdrawal failed: Insufficient funds. Minimum balance required: $" + requiredBalance);
  }
}
