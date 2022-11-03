package banking;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    Customer customer;
    BankAccount myCheckingAccount;
    BankAccount mySavingsAccount;

    @BeforeEach
    void setUp() throws Exception {
        this.customer = new Customer("Jayce");
        this.myCheckingAccount = new BankAccount("checking", customer);
        this.mySavingsAccount = new BankAccount("savings", customer);
    }

    @Test
    void testDeposit() {
        this.myCheckingAccount.deposit(100);
        assertEquals(100, this.myCheckingAccount.balance);

        this.myCheckingAccount.deposit(-100);
        assertEquals(100, this.myCheckingAccount.balance);

        this.myCheckingAccount.deposit(0);
        assertEquals(100, this.myCheckingAccount.balance);
    }

    @Test
    void testWithdraw() {
        // depo 100 into savings
        // savings balance is 100
        this.mySavingsAccount.deposit(100);
        assertEquals(100, this.mySavingsAccount.balance);

        // withdraw 80 from savings
        // savings balance is 20
        assertDoesNotThrow(() -> {
            this.mySavingsAccount.withdraw(80);
        });
        assertEquals(20, this.mySavingsAccount.balance);

        // withdraw 21
        // assert should expect an exception
        // savings balance should still be 20
        assertThrows(Exception.class, () -> {
            this.mySavingsAccount.withdraw(21);
        });
        assertEquals(20, this.mySavingsAccount.balance);

        // withdraw 19
        // savings balance is 1
        assertDoesNotThrow(() -> {
            this.mySavingsAccount.withdraw(19);
        });
        assertEquals(1, this.mySavingsAccount.balance);
    }

    @Test
    void testFastWithdraw() {
        this.myCheckingAccount.deposit(100);
        assertDoesNotThrow(() -> {
            this.myCheckingAccount.fastWithdraw(); // withdraw default (60)
        });
        assertEquals(40, this.myCheckingAccount.balance);


        this.myCheckingAccount.setFastCashAmount(20);
        assertDoesNotThrow(() -> {
            this.myCheckingAccount.fastWithdraw();
        });
        assertEquals(20, this.myCheckingAccount.balance);


        this.myCheckingAccount.setFastCashAmount(-50);
        assertDoesNotThrow(() -> {
            this.myCheckingAccount.fastWithdraw();
        });
        assertEquals(0, this.myCheckingAccount.balance);


        assertThrows(Exception.class, () -> {
            this.myCheckingAccount.fastWithdraw();
        });

    }

}
