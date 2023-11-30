package section16.BlackJack;
   /*
    Gamer 의 역할
    -  추가로 카드를 받는다
    -  뽑은 카드를 소유 한다
    -  카드를 오픈 한다.
     */
import java.util.ArrayList;
import java.util.List;

public class Gamer implements Player{
    private List<Card> cards;   // 나의 카드 리스트
    private boolean turn;
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

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

    public void setTurn(boolean turn){
        this.turn = turn;
    }

    public Gamer(String name){ // 생성자
        this.cards = new ArrayList<>();
        this.name = name;
    }
    @Override
    public void receiveCard(Card card){
        this.cards.add(card);
    }

    /*
    showCards()
    Gamer가 소유한 카드들의 목록을 보여주는 역할
    System.out.println을 일일히 쓰는것보다는 StringBuilder로 출력결과를 모아서
    마지막 한번에 System.out을 하는게 성능상 좋음
     */
    @Override
    public void showCards(){
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for(Card card : cards){
            sb.append(card.toString());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    /*
    openCards
    현재 가지고 있는 카드 오픈(전달)
     */
    @Override
    public List<Card> openCards(){
        return this.cards;
    }
}