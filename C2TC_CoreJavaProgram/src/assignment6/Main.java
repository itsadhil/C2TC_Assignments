package assignment6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1001, 5000.0);

        Scanner sc = new Scanner(System.in);
        try {
            account.displayBalance();
            System.out.print("Enter amount to deposit: ");
            double depositAmount = sc.nextDouble();
            try {
                account.deposit(depositAmount);
            } catch (InvalidAmountException e) {
                System.out.println("Deposit Error: " + e.getMessage());
            }

            account.displayBalance();

          
            System.out.print("Enter amount to withdraw: ");
            double withdrawalAmount = sc.nextDouble();
            try {
                account.withdraw(withdrawalAmount);
            } catch (InvalidAmountException | InsufficientFundsException e) {
                System.out.println("Withdrawal Error: " + e.getMessage());
            }

            account.displayBalance();

        } catch (Exception ex) {
            System.out.println("Unexpected error: " + ex.getMessage());
        } finally {
           
            sc.close();
            System.out.println("Banking operations complete.");
        }
    }
}
