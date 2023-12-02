package BlackJack_alone;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    public static final  int MAX_CARD_HAP = 13;
    public static final String[]  PATTERN =  {"SPADE","HEART","CLUB","DIAMOND" };



    // 카드 52장 생성
    // 생성자
    public CardDeck(){
         cards = this.GenerateCard();

    }
private List<Card> GenerateCard() {
    List<Card> cards = new ArrayList<>();

    for (String card_ : PATTERN) {// 4
        for (int i = 1; i <= MAX_CARD_HAP; i++) { // 13
            Card card = new Card(); // 새로운 카드 객체 생성
            card.setPattern(String.valueOf(card_));
            card.setDenomination(String.valueOf(i));
            cards.add(card);
        }
    }
    return cards;
}

public Card createRandomCard() { // 0 ~13사이의 난수 1개 생성
    int cardSize = cards.size(); // 카드 사이즈
    int randomCard = (int)(Math.random()*cardSize);
        return cards.get(randomCard);
        }

private static int INITCARD = 2;
public void inItCard() { // 처음 카드 2장을 주는 기능

        for(int i = 0 ; i<INITCARD ; i++){ // 2번 돌림
//            cards.add(draw());
        }
}
    // 카드를 뽑는 기능
//public Card draw() {
//    int cardss = createRandomCard();
//
//    Card cardDraw = (Card) cardss;
//    return cardDraw;
//}


}
