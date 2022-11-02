package counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CounterTest {

    Counter counter;

    @BeforeEach
    void setUp() throws Exception {
        this.counter = new Counter();
    }

    @Test
    void testIncrement() {
        // assertTrue(this.counter.increment() == 1);
        // assertTrue(this.counter.increment() == 2);
        // this.counter.increment();
        // assertFalse(this.counter.getCount() == 2);
        System.out.println(counter);
    }

    @Test
    void testDecrement() {
        fail("Not implemented");
    }
}
