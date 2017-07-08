package gamePlay;

/**
 * Created by dorka on 08.07.2017.
 */
public class Card {
    private int value;
    private String color;
    private String figure;
    private String name;

    public Card(int val, String col, String fig){
        this.value = val;
        this.color = col;
        this.figure = fig;
        this.name = this.figure + " " +this.color;
    }
    public int getValue(){
        return value;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public String getFigure(){
        return figure;
    }

}
