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
        this.cards.add(card);
    }
    public List<Card> OpenCards(){
        return null;
    }
}
