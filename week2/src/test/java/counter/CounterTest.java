package counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CounterTest 
{
    Counter counter;

    @BeforeEach
    void setUp() throws Exception {
        this.counter = new Counter();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    void testIncrement() {
        assertTrue(this.counter.increment() == 1);
        assertTrue(this.counter.increment() == 2);
        this.counter.increment();

        assertFalse(this.counter.getCount() == 2, "Should not return 2 after calling increment 3 times.");

        assertEquals(3, this.counter.getCount());

        assertNotEquals(3, this.counter.increment());
    }
    
    @Test
    void testDecrement() {
        assertEquals(-1, this.counter.decrement());
        assertTrue(this.counter.decrement() == -2);

        this.counter.decrement();

        assertFalse(this.counter.getCount() == -2, "Should not return -2 after calling decrement 3 times.");

        assertTrue(this.counter.getCount() == -3);
    }
}
