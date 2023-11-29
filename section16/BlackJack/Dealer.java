package section16.BlackJack;
 /*
    딜러의 역할
    1. 추가로 카드를 받는다.
    2. 단, 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 받을 수 없다. <-- 카드별로 포인트를 가지면  쉽다
    3. 뽑은 카드를 소유한다.
    4. 카드를 오픈한다.
    * 게임의 승패를 판단은 Rule 객체가, 카드를 뽀는 것은 카드덱 객체가 맡아서 이렇게 할 수 있다.
     */

import java.util.List;

public class Dealer {
    private List<Card> cards;

    public void receiveCard(Card card){}

    public List<Card> openCard(){
        return null;
    }
}
