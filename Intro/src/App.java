import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int inputInt = scan.nextInt();
        System.out.println("Your input is: " + inputInt);

        scan.close();
        
    }
}

