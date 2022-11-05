package classroom;

import java.util.ArrayList;

public class Classroom {
    String buildingName;
    String roomName;
    ArrayList<Student> students;
    Seat[][] seats;
    // constructor
    public Classroom(String buildingName, String roomName, int rows, int columns) {
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.seats = new Seat[rows][columns];
        // populate the seats in the classroom
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = new Seat(i, j);
            }
        }

        // initialize list of students
        this.students = new ArrayList<Student>();
    }

    public void addAStudent(Student student) {
        this.students.add(student);
    }

    public void assignStudentToSeat(Student student) {
        int rows = this.seats.length;
        int columns = this.seats[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (seats[i][j].studentInSeat == null) {
                    this.seats[i][j].putStudentInSeat(student);
                    return; // this exits loop & method at same time
                }
            }
        }
    }

    public void printAllStudents() {
        System.out.println("Students in class: ");

        for (Student student : this.students) {
            System.out.println(student); // this will call the toString() method in the student class (becuz it's printing an Object)
        }
    }

    public String toString() {
        String s = "\n";

        int rows = this.seats.length;
        int columns = this.seats[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                s += this.seats[i][j] + "\t"; // this will call the toString() method in the seat class
            }
            s += "\n"; // adds new line at the end of each row
        }

        return s;
    }
}
