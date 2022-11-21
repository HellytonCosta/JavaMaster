
// Replace ___ with your code
import java.util.Scanner;

class Student {

    int score;
    char grade;

    // assign value to score
    Student(int score) {
        int value = score;

        System.out.print(value);
    }

    void assignGrade(int value) {

        // assign grade based on the value
        if (value >= 90) {
            grade = 'A';
        } else if (value >= 80) {
            grade = 'B';
        } else {
            grade = 'C';
        }
    }
}

class Main {
    public static void main(String[] args) {

        // take the score input
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        // create object
        Student student = new Student(score);

        // call the assignGrade() method
        student.assignGrade(score);

        // print the grade
        System.out.println(student.grade);

        input.close();

    }
}