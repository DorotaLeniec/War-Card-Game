package gamePlay;

import java.util.Arrays;

/**
 * Created by dorka on 08.07.2017.
 */
public class TestGame {
    public static void main(String[] args) {

//        Deck deck = new Deck();
//        deck.printDeck();
//        System.out.println(deck.getSize());
        int[] randomy = new int[52];
        double random = 1 + (Math.random()*52);
        System.out.println(random);

        for(int i=0;i<randomy.length;i++){
            randomy[i] =  (int)(Math.random()*52);

        }

        Arrays.sort(randomy);
        for(int a:randomy) {
            System.out.println(a);
        }
    }
}
