package banking;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    Customer customer;

    @BeforeEach
    void setUp() throws Exception {
        this.customer = new Customer("Jayce");
    }

    @Test
    void testSetAddress() {
        assertNull(this.customer.getAddress());

        String address1 = "Brooklyn, NY";
        this.customer.setAddress(address1);
        assertEquals(address1, this.customer.getAddress());

        String address2 = "LA, CA";
        this.customer.setAddress(address2);
        assertEquals(address2, this.customer.getAddress());
    }
}
