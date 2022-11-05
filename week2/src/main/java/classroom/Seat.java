package classroom;

public class Seat {
    int row;
    int column;
    Student studentInSeat;
    // constructor
    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
    }
    // methods
    public void putStudentInSeat(Student student) {
        this.studentInSeat = student;
    }
    public String toString() {
        // this.studentInSeat is another Object, so concating it and printing it will also call the toString() method in the Student class
        return this.row + ", " + this.column + ": " + this.studentInSeat;
    }
}
