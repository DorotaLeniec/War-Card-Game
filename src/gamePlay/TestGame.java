package gamePlay;

/**
 * Created by dorka on 08.07.2017.
 */
public class TestGame {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.printDeck();
        System.out.println(deck.getSize());
    }
}
