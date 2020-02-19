
import java.util.Scanner;

public class UserInteraction {

    Scanner in;

    //To start and initialize the program
    int start() {
        in = new Scanner(System.in);
        System.out.println("Java GuessTheMovie");
        System.out.println("Please enter 0  to start game:");
        int input = in.nextInt();
        return input;
    }

    void display(String s) {
        System.out.println(s);
    }

    String takeInput(String prompt) {
        in = new Scanner(System.in);
        System.out.println(prompt);
        return in.nextLine();

    }

    String takeInput(int tries) {
        in = new Scanner(System.in);
        System.out.println("You have " + tries + " guesses \nTake a guess ");
        String UserIn = in.nextLine();
        return UserIn;
    }
}
