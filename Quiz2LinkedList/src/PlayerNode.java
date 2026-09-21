public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayer;

    //Generate Constructor, select only Player
    public PlayerNode(Player player) {
        this.player = player;
    }

    //Generate Getter and Setter, select all
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}