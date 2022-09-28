
// Replace ___ with your code
import java.util.Scanner;

class Person {
    // create private field name
    private String name;

    // create a setter method to set value of name
    public void setMet(String name) {
        this.name = name;

    }

    // create a getter method to return name
    public String getMet() {
        return this.name;
    }
}

class Main {

    public static void main(String[] args) {

        // create person1 object of Person class
        Person person1 = new Person();

        // get input name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // set the value of the name variable
        person1.setMet(name);

        // get the value of name
        name = person1.getMet();
        System.out.println(name);
    }
}