package section16.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Player{
    /*
    딜러의 역할
    1. 추가로 카드를 받는다.
    2. 단, 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 받을 수 없다. <-- 카드별로 포인트를 가지면  쉽다
    3. 뽑은 카드를 소유한다.
    4. 카드를 오픈한다.
    * 게임의 승패를 판단은 Rule 객체가, 카드를 뽀는 것은 카드덱 객체가 맡아서 이렇게 할 수 있다.
     */
    private List<Card> cards;
    private boolean turn;

    @Override
    public void turnOff(){
        this.setTurn(false);
    }
    @Override
    public void turnOn(){
        this.setTurn(true);
    }
    @Override
    public boolean isTurn(){
        return this.turn;
    }
    private void setTurn(boolean turn){
        this.turn = turn;
    }


    private static final int CAN_RECEIVE_POINT = 16;

    public Dealer() {
        cards = new ArrayList<>();
    }

    @Override
    public String getname() {
        return null;
    }

    @Override
    public void receiveCard(Card card){ // 카드를 받는 메소드
        if(this.isReceiveCard()){
            this.cards.add(card);
            this.showCards();
        }else{
            System.out.println("카드의 총 합이 17이상입니다. 더이상 카드를 받을 수 없습니다.");
        }
    }

    private boolean isReceiveCard() {   // 총 포인트의 합이 16이하인 경우 true. 이건 매직넘버와 같다.
        return getPointSum() <= CAN_RECEIVE_POINT;
    }

    private int getPointSum() {
        int sum = 0;
        for(Card card : cards){
//            sum += card.getPoint();
        }
        return sum;
    }
    @Override
    public void showCards(){ // dealer가 소유한 카드들의 목록을 보여줌
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for(Card card : cards){
            sb.append(card.toString());
            sb.append("\n");
        }
        System.out.println(sb.toString());  // 가진 카드 수 만큼 출력함
    }

    @Override
    public List<Card> openCards(){  // 현재 갖고 있는 모든 카드들을 전달하는 역할
        return this.cards;
    }
    // 카드를 오픈하는 메소드
}
