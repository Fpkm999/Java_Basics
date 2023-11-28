package section16.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    /*
    Gamer 의 역할
    -  추가로 카드를 받는다
    -  뽑은 카드를 소유 한다
    -  카드를 오픈 한다.
     */
    private List<Card> cards;

    public Gamer() { // 생성자
        cards = new ArrayList<>();  // 카드를 받는다
    }
    public void receiveCard(Card card){ // 카드를 소유(뽑는다)한다.
        this.cards.add(card);   // 카드를 뽑는 메소드
        this.showCards(); // 카드를 받으면 보여 주는 메소드. 뽑았으면 보여줘야지..
    }
    public void showCards(){ // Gamer가 소유한 카드들의 목록을 보여줌
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for(Card card : cards){
            sb.append(card.toString());
            sb.append("\n");
        }
        System.out.println(sb.toString());  // 가진 카드 수 만큼 출력함
    }

    public List<Card> OpenCards(){  // 현재 갖고 있는 모든 카드들을 전달하는 역할
        return this.cards;
    }
}
