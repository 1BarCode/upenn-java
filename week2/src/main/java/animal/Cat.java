package animal;

public class Cat extends Animal {
    static String DEFAULT_TYPE = "domestic";

    // only accessible within this class
    private String type;

    public Cat (int age) {
        super(age);

        this.type = Cat.DEFAULT_TYPE;
    }

    // getters / setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void speak() {
        System.out.println(this.name + " says: Meow!");
    }

    public String toString() {
        return this.name + " is a " + this.type;
    }
}
