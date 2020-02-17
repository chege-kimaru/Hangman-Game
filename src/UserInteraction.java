
import java.util.Scanner;

public class UserInteraction {
    Scanner in;

    public UserInteraction() {
        
    }

    //To start and initialize the program
    int start() {
        in = new Scanner(System.in);
        System.out.println("Java GuessTheMovie");
        System.out.println("Please enter 0  to start game:");
        int input = in.nextInt();
        return input;
    }
    
    void display(String s){
        System.out.println(s);
    }
    
    String takeGuess(){
        in = new Scanner(System.in);
        System.out.println("Take a guess ");
        String guess = in.nextLine();
        return guess;
    }
}
