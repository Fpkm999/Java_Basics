package BlackJack_alone;

public class Card {

    public static final String[]  PATTERN =  {"SPADE","HEART","CLUB","DIAMOND" };
    public static final String[] DENOMINATION = {"2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static final  int MAX = 13;
    private String pattern;

    private String denomination;

    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
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
}
