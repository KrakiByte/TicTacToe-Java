import java.util.Scanner;

public class TicTacToe {


    Scanner scanner = new Scanner(System.in);
    Player Winner;
    Player activePlayer;
    byte counter = 0;

    String[][] table = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};


    Player playerOne;
    Player playerTwo;

    public TicTacToe(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }


    public void showTable() {

        System.out.print(table[0][0]);
        System.out.print("|");
        System.out.print(table[0][1]);
        System.out.print("|");
        System.out.print(table[0][2]);

        System.out.print("\n-+-+-\n");

        System.out.print(table[1][0]);
        System.out.print("|");
        System.out.print(table[1][1]);
        System.out.print("|");
        System.out.print(table[1][2]);

        System.out.print("\n-+-+-\n");

        System.out.print(table[2][0]);
        System.out.print("|");
        System.out.print(table[2][1]);
        System.out.print("|");
        System.out.println(table[2][2]);

    }

    public Boolean checkWinner() {

        if (counter < 9) {
            counter++;

            for (String[] items : table) {
                if (items[0].equals(items[1]) && items[0].equals(items[2])) {
                    if (items[0].equals(playerOne.getPlayerMark())) {
                        Winner = playerOne;

                    } else {
                        Winner = playerTwo;

                    }
                    return true;
                }
            }
            for (byte i = 0; i <= 2; i++) {
                if (table[0][i].equals(table[1][i]) && table[1][i].equals(table[2][i])) {
                    if (table[0][i].equals(playerOne.getPlayerMark())) {
                        Winner = playerOne;
                    } else {
                        Winner = playerTwo;
                    }
                    return true;
                }
            }
            if (table[0][0].equals(table[1][1]) && table[0][0].equals(table[2][2])) {


                if (table[0][0].equals(playerOne.getPlayerMark())) {
                    Winner = playerOne;
                } else {
                    Winner = playerTwo;
                }
                return true;
            }
            if (table[0][2].equals(table[1][1]) && table[0][2].equals(table[2][0])) {
                if (table[0][2].equals(playerOne.getPlayerMark())) {
                    Winner = playerOne;
                } else {
                    Winner = playerTwo;
                }
                return true;
            }

        } else {
            return true;

        }
        return false;
    }


    public void playersTurns() {
        if (playerOne.getTurn()) {
            playerOne.setTurn(false);
            playerTwo.setTurn(true);
            activePlayer = playerOne;
        } else {
            playerOne.setTurn(true);
            playerTwo.setTurn(false);
            activePlayer = playerTwo;
        }
    }

    public void play() {

        System.out.println("Player: " + activePlayer.getPlayerName() + "(" + activePlayer.getPlayerMark() + ")");
        boolean wrongInput = false;
        while (!(wrongInput)) {

            System.out.print("Give Number to place: ");
            String slot = scanner.next();

            for (byte i = 0; i <= 2; i++) {
                for (byte j = 0; j <= 2; j++) {
                    if (slot.equals(table[i][j])) {
                        table[i][j] = activePlayer.getPlayerMark();
                        wrongInput = true;

                    }
                }
            }
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void showWinner() {

        if (Winner != null) {
            System.out.println(Winner.getPlayerName() + "(" + Winner.getPlayerMark() + ")" + " Won the game!!!");
        }else{
            System.out.println("No one won. TIE!");
        }
    }


}