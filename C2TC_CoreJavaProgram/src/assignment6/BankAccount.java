package assignment6;

public class BankAccount {
    private int accountNumber;
    private double balance;


    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.printf("Deposited: %.2f\n", amount);
    }


    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.printf("Withdrawn: %.2f\n", amount);
    }

    public void displayBalance() {
        System.out.printf("Account Number: %d | Balance: %.2f\n", accountNumber, balance);
    }
}
