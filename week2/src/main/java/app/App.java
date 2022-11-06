package app;

import java.lang.reflect.Array;

import classroom.Classroom;
import classroom.Student;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");

        Classroom hunstman = new Classroom("HH", "105", 10, 5);

        Student finegan = new Student("finegan", "fineganw");
        Student bob = new Student("bob", "roberts");

        hunstman.addAStudent(finegan);
        hunstman.addAStudent(bob);

        hunstman.assignStudentToSeat(finegan);
        hunstman.assignStudentToSeat(bob);

        hunstman.printAllStudents();

        // String[] strings = new String[3];
        int[] primes = {2,3,4,7,13};

        // int[] set;
        // set = new int[20];

        for (int i = 0; i <= 5; i++) {
            System.out.println(primes[i]);
        }

        System.out.println(hunstman);
    }
}
