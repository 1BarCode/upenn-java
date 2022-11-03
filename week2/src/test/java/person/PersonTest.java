package person;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testPerson() {
        Person person1 = new Person("Ted", 22);
        Person person2 = new Person("ted", 22);
        Person person3 = new Person("Ted", 32);
        
        // assertEquals uses "==" to compare primitives
        // let's compare the age between these 2 people
        assertEquals(person1.age, person2.age);

        // assertEquals && NotEquals uses the "equals" method defined in the person class to compare objects
        assertNotEquals(person1, person2);
        assertEquals(person1, person3);

        // assertSame asserts that two arguments refer to the same object
        assertSame(person1, person1);
    }
}
