package gamePlay;

/**
 * Created by dorka on 09.07.2017.
 */
public class Player {
    public int points;
    public int cardsAmount;
    Card[] cards;

    public Player(){
        points = 0;
        cardsAmount = cards.length;
        cards = new Card[26];
    }

    public Card putOutTheCard(){
        return cards[0];
    }



}
