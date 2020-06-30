public class MainClass {

    public static void main(String[] args) {

        Player p1 = new Player("Dimitris", "O");
        Player p2 = new Player("Bill","X");

        TicTacToe triliza = new TicTacToe(p1, p2);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Welcome to Tic Tac Toe Java edition!!"); // NO GUI :'(
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        while (!(triliza.checkWinner())) {
            triliza.playersTurns();
            triliza.showTable();
            triliza.play();

        }
        triliza.showTable();
        triliza.showWinner();

    }

}
