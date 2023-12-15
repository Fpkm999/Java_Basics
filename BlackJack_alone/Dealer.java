package BlackJack_alone;
/*
1. 추가로 카드를 받는다.
2. 단, 2장의 카드의 합계 점수가 16점 이하면 반드시 1장을 추가로 뽑고, 17점 이상 이면 받을 수 없다. <-- 카드 별로 포인트를 가지도록 한다.
3. 뽑은 카드를 소유 한다.
4. 카드를 오픈 한다.
** 게임의 승패를 판단하는 것은 Rule 객체가, 카드를 뽑는 것은 카드덱 객체가 맡아서 한다.
 */
import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private List<Card> cards;
    private int point;
    private boolean ON_OFF;
    private static final int DEALERLIMIT = 16;
    private static final String DEALERNAME = "딜러";
    public void receiveCard(Card card){
        if(this.point < DEALERLIMIT){
            this.cards.add(card);
            this.showCards();
            SumPoint(getPoint());
        }
//        this.getPointSum(card);
    }

    private void SumPoint(int point) {
        this.point += point;
    }

    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append("딜러님의 현재 보유 카드 목록 \n");

        for(Card card : cards){
//            sb.append((cards.toString()+"\n"));
            sb.append(card.toString()+"\n");
        }
        System.out.println(sb.toString());
    }

    public List<Card> openCard(){
       return this.cards;
    }
    public Dealer(){
        this.cards = new ArrayList<>();
    }

    public String getDealername(){
        return DEALERNAME;
    }
//    public void getPointSum(Card card){
//        this.point
//        int sum = 0;
//        for (Card card1 : cards){
//            sum += card.getPoint();
//        }
//    }
    public int getPoint(){
        return point;
    }
    public void setPoint(int point){
        if(point >= DEALERLIMIT){
            ON_OFF = true;
        }
    }
}
