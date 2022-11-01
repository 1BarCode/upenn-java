package banking;

import java.util.Scanner;

/*
 * Represents a bank for managing customers and their bank accounts.
 * @author me
 */
public class Bank {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        bank.run();
    }

    public void run() {
        System.out.println("Welcome to the Bank, what is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.println("Hello " + name + "! We are creating checking and savings accounts for you.");

        System.out.println("What is your address?");

        String address = scanner.next();

        Customer customer = new Customer(name);
        customer.setAddress(address);

        BankAccount checkingAccount = new BankAccount("checking", customer);
        BankAccount savingsAccount = new BankAccount("savings", customer);

        System.out.println("Your checking account has been created with the balance of " + checkingAccount.getAccountInfo());
        System.out.println("Your savings account has been created with the balance of " + savingsAccount.getAccountInfo());

        System.out.println("Enter the amount to deposit into your checking account. (decimal)");
        double amount = scanner.nextDouble();
        checkingAccount.deposit(amount);

        System.out.println("Enter the amount to deposit into your savings account. (decimal)");
        amount = scanner.nextDouble();
        savingsAccount.deposit(amount);

        System.out.println("The balance in your checking is " + checkingAccount.getAccountInfo());
        System.out.println("The balance in your savings is " + savingsAccount.getAccountInfo());

        // withdraw from the accounts
        System.out.println("How much do you want to withdraw from your checking account?");
        amount = scanner.nextDouble();
        try {
            checkingAccount.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("How much do you want to withdraw from your savings account?");
        amount = scanner.nextDouble();
        try {
            savingsAccount.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("The balance in your checking is " + checkingAccount.getAccountInfo());
        System.out.println("The balance in your savings is " + savingsAccount.getAccountInfo());

        scanner.close();
    }
}
