package person;

public class Person {
    String name;
    int age;

    /**
     * Constructor the Person
     * @param name of the person
     * @param age of the person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // the method "equals" is used by the Test to compare objects
    // this method must be defined manually
    public boolean equals(Object personToCompare) {
        Person otherPerson = (Person) personToCompare;
        // returns true if the names of 2 people are the same are the same, otherwise false
        return this.name.equals(otherPerson.name);
    }
}
