package section16.BlackJack;
/*
카드
    - 다이아몬드, 하트, 스페이드, 클럽 중 1개의 무늬를 가지고 있다
    - A,2,3,4,5,6,7,8,9,10,J,Q,K 중 하나를 가지고 있다.
 */
public class Card {
    private String pattern; // 모양(스페이드, 하트, 다이아몬드, 클로버)
    private String denomination;    // A,2,3,4,5,6,7,8,9,10,J,Q,K = 끗수라고함


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

}