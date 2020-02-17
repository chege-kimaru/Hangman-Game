
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Game {

    Scanner in;
    File moviefile;
    int x;

    Game() {
        UserInteraction ui = new UserInteraction();
        openFile();
        ui.display("You are guessing \n" + dashes(genRand()));
        String guess = ui.takeGuess();
        
    }

    void display() {

    }

    //Open the txt file.
    void openFile() {
        try {
            moviefile = new File("C:\\Users\\Spectre\\Desktop\\Programming\\Java\\UdacityJava\\HangmanMovie\\src\\movies.txt");
            in = new Scanner(moviefile);

        } catch (FileNotFoundException ex) {
            System.out.println("An error occured while opening the file");;
        }

    }

    //Have the computer randomly choose a line from the txt file
    String genRand() {
        String line = "";
        int count = 0;
        //To know the number of lines in txt file
        while (in.hasNextLine()) {
            line = in.nextLine();
            count++;
        }
        //Pick a random line from file
        Random rand = new Random();
        int r = rand.nextInt(count);
        System.out.println("Rand num is " + r);
        openFile();
        int lnum = 0;
        while (lnum != r) {
            line = in.nextLine();
            lnum++;
        }
        line = in.nextLine();
        return line;
    }

    String dashes(String title) {
        String dashString = "";
        for (int i = 0; i < title.length(); i++) {
            if (String.valueOf(title.charAt(i)).equals(" ")) {
                dashString += " ";
            } else {
                dashString += "_ ";
            }
        }
        return dashString;
    }

    //Compare the guess
}
