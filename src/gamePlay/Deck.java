package gamePlay;

/**
 * Created by dorka on 08.07.2017.
 */

public class Deck {
    private String[] colors = {"heart", "diamond", "club", "spades"}; //kier karo trefl pik
    private String[] figures = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q","K","A"};
    private Card[] cards = new Card[52];
    private int size = cards.length;
    public Deck(){
        int counter = 0;
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<figures.length;j++){
                cards[counter] = new Card(j,colors[i],figures[j]);
                counter++;
            }
        }
    }



    public int getSize(){
        return size;
    }

    public void printDeck(){
        for(Card card: cards) {
            System.out.println(card.getName());
        }
    }

    public void shuffleCards(Card[] cards){
        int cardsAmount = cards.length;

        for(int i=0;i<cardsAmount;i++){
            int random = i + (int)(Math.random()*(cardsAmount-i));
        }
    }


}
