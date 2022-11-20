package animal;

public class Animal {
    // static variables
    static int DEFAULT_AGE = 0;

    // instance variables
    int age;

    double weight;

    String name;

    // constructors
    public Animal(int age) {
        this.age = age;
    }

    public Animal() {
        // calls first constructor with default age value
        this(Animal.DEFAULT_AGE);
    }

    // getters / setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // other methods
    public void speak() {
        System.out.println("Animal says hi.");
    }

    // this overrides the toString() method from Object class
    @Override
    public String toString() {
        return this.name;
    }
}
