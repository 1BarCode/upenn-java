package banking;

public class BankAccount {
    // instance vars

    String accountType;

    double balance;

    Customer customer;

    // constructor

    /**
     * Creates a bank account of given type for given customer
     * @param accountType for bank account
     * @param customer for bank account
     */
    public BankAccount(String accountType, Customer customer) {
        this.accountType = accountType;
        this.customer = customer;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Withdraws the given amount from balance
     * @param amount to withdraw
     * @throws Exception if given amount is larger than available balance
     */
    public void withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("Amount is greater than available balance.");
        }
        this.balance -= amount;
    }

    public String getAccountInfo() {
        return this.accountType + ": " + this.balance;
    }

    public String getCustomerInfo() {
        return this.customer.getName() + ": " + this.customer.getAddress();
    }
}