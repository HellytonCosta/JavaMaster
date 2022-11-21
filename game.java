import java.util.Scanner;

class Main {

    // returns "rock", "paper" or "scissors"
    String getComputerChoice() {

        String computerChoice;
        int randomNumber = (int) (Math.random() * 3) + 1;

        if (randomNumber == 1) {
            computerChoice = "rock";
        } else if (randomNumber == 2) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }

        return computerChoice;
    }

    // returns user input
    String getUserInput() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter rock, paper or scissors:");
        String userInput = input.next();

        userInput = userInput.toLowerCase();

        input.close();

        return userInput;
    }

    // return if the user "win", "lose" or if it's a "draw"
    String getResult(String userInput, String computerChoice) {

        // condition for user to draw
        if (userInput.equals(computerChoice)) {
            return "It's a draw";
        }
        // condition for user to win
        else if (userInput.equals("paper") && computerChoice.equals("rock")) {
            return "You win";
        } else if (userInput.equals("rock") && computerChoice.equals("scissors")) {
            return "You win";
        } else if (userInput.equals("scissors") && computerChoice.equals("paper")) {
            return "You win";
        }
        // all other conditions result to loss
        else {
            return "You lose";
        }
    }

    public static void main(String[] args) {

        // creating object of Main class
        Main obj = new Main();

        // get users input
        String userInput = obj.getUserInput();

        // get computers choice
        String computerChoice = obj.getComputerChoice();

        // get results
        String result = obj.getResult(userInput, computerChoice);

        System.out.println("User Input: " + userInput);
        System.out.println("Computer Choice: " + computerChoice);
        System.out.println(result);

    }

}