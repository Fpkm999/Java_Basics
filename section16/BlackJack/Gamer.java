package section16.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    /*
    Gamer 의 역할
    1. 추가로 카드를 받는다
    2. 뽑은 카드를 소유한다
    3. 카드를 오픈한다.
     */
    private List<Card> cards;

    public Gamer() { // 생성자
        cards = new ArrayList<>();
    }
    public void receiveCard(Card card){
        this.cards.add(card);   // 카드를 뽑는 메소드
        this.showCards(); // 카드를 받으면 보여주는 메소드
    }
    public void showCards(){ // Gamer가 소유한 카드들의 목록을 보여줌
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for(Card card : cards){
            sb.append(card.toString());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public List<Card> OpenCards(){
        return this.cards;
    }
}
