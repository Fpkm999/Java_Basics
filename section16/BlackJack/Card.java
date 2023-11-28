package section16.BlackJack;

public class Card {
    private String pattern;// 모양(스페이드, 하트, 다이아몬드, 클로버)
    private String denomination;    // A,2,3,4,5,6,7,8,9,10,J,Q,K = 끗수라고함

    private int point;
    public Card(String pattern, int index){
        this.pattern = pattern;
        this.denomination = this.numberToDenomination(index);
        this.point = this.numberToPoint(index);
    }

    public String numberToDenomination(int number) {

        if (number == 1) {
            return "A";
        } else if (number == 11){
            return  "J";
        } else if (number == 12){
            return "Q";
        } else if (number ==13){
            return "K";
        }
        return String.valueOf(number);
    }
    public int numberToPoint(int number){
        if(number >= 11){
            return 10;
        }
        return number;
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
