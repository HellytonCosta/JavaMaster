
// Replace ___ with your code
import java.util.Scanner;

class Company {

    // create a static field
    static String name;

    // create a static method
    static void printName(String name) {

        System.out.println(name);
    }
}

class Main {

    // main method
    public static void main(String[] args) {

        // take an String input for name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // set the value of static variable
        Company.name = "Programiz";

        // call the static method
        Company.printName(name);

        // close the Scanner object
        input.close();
    }
}