package section16.BlackJack;

public class Card {
    private String pattern;// 모양(스페이드, 하트, 다이아몬드, 클로버)
    private String denomination;    // A,2,3,4,5,6,7,8,9,10,J,Q,K = 끗수라고함

    public Card(String pattern, String denomination){ // 생성자
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
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
        return "Card{" + "pattern ='" + pattern+ ", denomination = '"+ denomination+'}';
    }
}
