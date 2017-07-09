package gamePlay;

/**
 * Created by dorka on 09.07.2017.
 */
public class Game {
    public Player[] players;
    public Deck deck;
    public int roundCounter;

    public Game(){
        players = new Player[2];
        deck = new Deck();
        roundCounter = 0;
    }


}
