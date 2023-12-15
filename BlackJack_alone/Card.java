package BlackJack_alone;

import java.awt.dnd.DnDConstants;
import java.util.List;

public class Card {
    private List<Card> cards;
    public static final String[]  PATTERN =  {"SPADE","HEART","CLUB","DIAMOND" };
    public static final String[] DENOMINATION = {"2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String pattern;
    private String denomination;
    private int point;

    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public Card() {

    }

    public String getPattern(){
        return pattern;
    }
    public void setPattern(String pattern){
        this.pattern = pattern;
    }
    public String getDenomination(){
        return denomination;
    }
    public void setDenomination(String denomination){
        this.denomination = denomination;
    }


    @Override
    public String toString() {
        return "[패턴 = "+pattern+"][끗수 = "+denomination+"]"+"[포인트"+point+"]";
    }

    public int getPoint(){
        return this.point;
    }
    public  void setPoint(int point){
        this.point += point;
    }
}
