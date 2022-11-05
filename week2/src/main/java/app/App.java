package app;

import customstring.CustomString;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");

        CustomString myCustomString = new CustomString();
        myCustomString.setString("Some real test.");
        String res = myCustomString.filterLetters('E', true);
        System.out.println("==> "+ res);
        System.out.println("Done");
    }
}
