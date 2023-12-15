package BlackJack_alone;
/*
추가로 카드를 받는다
뽑은 카드를 소유한다
카드를 오픈한다.
 */
import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private List<Card> cards;
    private String name;
    private int point;
    public Gamer(String name){
        this.cards = new ArrayList<>();
        this.name = name;
    }
    public void receiveCard(Card card){
        this.cards.add(card);
        this.showCards();
    }

    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");
        for(Card card : cards){
            sb.append(card.toString()+"\n");
        }
        System.out.println(sb.toString());
    }
    /*
    Gamer가 자지고 있는 카드 객체 오픈
    */
    public List<Card> openCards() {
        return this.cards;
    }
    public String getName(){
        return this.name;
    }
    public int getPoint(){
        return this.point;
    }
}
