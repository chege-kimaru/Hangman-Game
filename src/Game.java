
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Game {

    Scanner in;
    File moviefile;
    int x;

    Game() {
        openFile();
        dashes(genRand());
    }

    void display() {

    }

    void openFile() {

        try {
            moviefile = new File("C:\\Users\\Spectre\\Desktop\\Programming\\Java\\UdacityJava\\HangmanMovie\\src\\movies.txt");
            in = new Scanner(moviefile);

        } catch (FileNotFoundException ex) {
            System.out.println("An error occured while opening the file");;
        }

    }

    String genRand() {
        String line = "";
        int count = 0;
        //To know the number of lines in txt file
        while (in.hasNextLine()) {
            line = in.nextLine();
            System.out.println(count + " " + line);
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
        //System.out.println(line);
        return line;
    }
    
    String dashes(String title){
        String dashString = "";
        for(int i=0;i<title.length(); i++){
            if(String.valueOf(title.charAt(i)).equals(" ")){
                dashString += " ";
            }else{
                dashString += "_ ";
            }            
        }
        System.out.println(dashString);
        return dashString;
    }
    
    

    
    
    
}
