public class Player {
    String name;
    String mark;
    Boolean turn = true;

    public Player(String player,String mark) {
        this.name = player;
        this.mark = mark;
    }


    public String getPlayerName() {
        return name;
    }
    public String getPlayerMark() {
        return mark;
    }
    public Boolean getTurn() {
        return turn;
    }

    public void setTurn(Boolean turn) {
        this.turn = turn;
    }
}
