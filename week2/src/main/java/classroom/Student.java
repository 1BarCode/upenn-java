package classroom;

public class Student {
    String name;
    String ID;
    // constructor
    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String toString() {
        return this.name;
    }
}
