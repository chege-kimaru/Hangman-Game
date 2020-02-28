
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Game {

    Scanner in;
    File moviefile;
    private int x;



    void start(){
        
        UserInteraction ui = new UserInteraction();
        GameLogic logic = new GameLogic();
        openFile();
        String genLine = genRand();
        String dashedString = dashes(genLine);
        ui.display(dashedString);
        logic.loop(genLine, dashedString);
        


        
    }

    //Open the txt file.
    void openFile() {
        try {
            moviefile = new File("movies.txt");
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
        openFile();
        int lnum = 0;
        while (lnum != r) {
            line = in.nextLine();
            lnum++;
        }
        line = in.nextLine();
        System.out.println(line);
        return line;
    }

    String dashes(String genLine) {
        String dashString = "";
        for (int i = 0; i < genLine.length(); i++) {
            if (String.valueOf(genLine.charAt(i)).equals(" ")) {
                dashString += " ";
            } else {
                dashString += "*";
            }
        }
        
        return dashString;
    }

    
    
}
