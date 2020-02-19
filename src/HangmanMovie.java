
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class HangmanMovie {

    public static void main(String[] args) {
        UserInteraction ui = new UserInteraction();
        int input = 0;
        if (ui.start() == 0) {
            Game newgame = new Game();
            newgame.start();
        } else {
            System.out.println("Game stopped");

        }

    }
}
