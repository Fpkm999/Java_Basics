package section16.BlackJack;
/*
카드
    - 다이아몬드, 하트, 스페이드, 클럽 중 1개의 무늬를 가지고 있다
    - A,2,3,4,5,6,7,8,9,10,J,Q,K 중 하나를 가지고 있다.
 */
public class Card {
    private String pattern; // 모양(스페이드, 하트, 다이아몬드, 클로버)
    private String denomination;    // A,2,3,4,5,6,7,8,9,10,J,Q,K = 끗수라고함

    private int point;
    public Card(String pattern, int index){  // 생성자
        this.pattern = pattern;
        this.denomination =this.numberToDenomination(index);
        this.point = this.numberToPoint(index);
    }

    private String numberToDenomination(int number){
        if(number == 1){
            return  "A";
        } else if (number == 11){
            return "J";
        } else if (number == 12){
            return "Q";
        } else if (number == 13){
            return "K";
        }
        return String.valueOf(number);
    } // 숫자를 끗수로

    private int numberToPoint(int number){
        if(number>=11){
            return 10;
        }
        return number;
    }


    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    @Override
    public String toString(){ // 카드 생성 확인
        return "pattern= " + pattern + ", denomination= " + denomination;
    }

    public int getPoint() {
        return this.point;
    }
}