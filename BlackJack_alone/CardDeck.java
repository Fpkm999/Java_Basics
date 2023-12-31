package BlackJack_alone;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    public static final  int MAX_CARD_HAP = 13;
    private int point;
    public static final String[]  PATTERN =  {"SPADE","HEART","CLUB","DIAMOND" };

    // 카드 52장 생성. 생성자를 이용함
    public CardDeck(){
         this.cards = this.GenerateCard();
    }
private List<Card> GenerateCard() {
    List<Card> cards = new ArrayList<>();

    for (String card_ : PATTERN) {// 4
        for (int i = 1; i <= MAX_CARD_HAP; i++) { // 13
            Card card = new Card(); // 새로운 카드 객체 생성
            card.setPattern(card_);
            card.setDenomination(setTodDenomination(i));
            card.setPoint(setToPoint(i));
            cards.add(card);
        }
    }
    return cards;
}

public Card createRandomCard() { // 1 ~52 사이의 난수 1개 생성
    int cardSize = cards.size(); // 카드 사이즈
    int randomCard = (int)(Math.random()*cardSize+1);
        return cards.get(randomCard);
        }

//private static int INITCARD = 2;
//public void inItCard() { // 처음 카드 2장을 주는 기능
//        for(int i = 0 ; i<INITCARD ; i++){ // 2번 돌림
//        cards.add(draw());
//        }
//}
    // 카드를 뽑는 기능
public Card draw() {
    Card selectedCard = createRandomCard();
    cards.remove(selectedCard);
    return selectedCard;
}
    public int setToPoint(int point){
        if (point == 11 || point == 12 || point == 13) {
            return 10;
        }else {
            this.point = point;
        }
        return point;
    }
public String setTodDenomination(int number) {
    if (number == 1) {
        return "A";
    } else if (number == 11) {
        return "J";
    } else if (number == 12) {
        return "Q";
    } else if (number == 13) {
        return "K";
    }
    return String.valueOf(number);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(Card card : cards){
            sb.append(card.toString()+"\n");
        }
        return sb.toString();
    }
}