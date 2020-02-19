
public class GameLogic {

    UserInteraction ui;

    private String check(String userIn, String genLine, String dashedString) {

        if (genLine.contains(userIn)) {
            char user = userIn.charAt(0);
            char[] charArray = dashedString.toCharArray();
            for (int i = 0; i < genLine.length(); i++) {
                if (String.valueOf(genLine.charAt(i)).equals(userIn)) {
                    charArray[i] = user;
                }

            }
            return String.copyValueOf(charArray);

        }

        return null;
    }

    void loop(String genLine, String dashedString) {
        ui = new UserInteraction();
        String userIn = "";
        String result = dashedString;

        int tries = 10;
        while (tries > 0) {
            userIn = ui.takeInput(tries);
            if (check(userIn, genLine, result) != null) {
                result = check(userIn, genLine, result);
                if (result.equals(genLine)) {
                    winGame();
                    break;
                }
                ui.display(result);
            } else {
                tries--;
            }

        }
        if (tries < 0) {
            looseGame();
        }
    }

    void winGame() {
        ui = new UserInteraction();
        ui.display("Hurrah you have won the game!!");
    }

    void looseGame() {
        ui = new UserInteraction();
        ui.display("Sorry you have run out of guesses.\nPress 0(zero) to start again");

    }
}
