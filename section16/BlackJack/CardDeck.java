package section16.BlackJack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;

    public Card getCard(){
        return null;
    } // Card 클래스 getCard

    private static final String[] PATTERNS = {"spade","heart","diamond","club"};
    private static final int CARD_COUNT = 13;
    public CardDeck() { // CardDeck 생성자. 카드덱 객체를 생성하자 마자 52개의 서로 다른 카드가 만들어져야됨
        cards = this.generateCards();
    }

    public List<Card> generateCards(){  // 52가지 카드를 생성하는 메소드
        List<Card> cards = new LinkedList<>();

        for(String pattern : PATTERNS){ // 카드 모양(4가지) 총 52가지 카드를 생성함
            for(int i=1 ; i<= CARD_COUNT; i++){ // 1부터 13까지
                String denomination = this.numberToDenomination(i); // 카드 명칭 (A,2,3,4,5,6,7,8,9,10,J,Q,K) 총 13가지
                //끗수를 결정해주는 메소드를 통해 끗수를 결정
                Card card = new Card(pattern,denomination);

                cards.add(card); // 카드의 모양과 숫자를 저장함
            }
        }
        return cards;
    }
    public String numberToDenomination(int number){ /// 1~13의 숫자를 받으면 끗수를 정해주는 메소드

        if (number  == 1) { // 만약 돌려서 1이라면
            return "A";
        } else if (number == 11) { // 만약 돌려서 11이라면
            return "J";
        } else if (number == 12) { // 만약 돌려서 12이라면
            return "Q";
        } else if (number == 13) { // 만약 돌려서 13이라면
            return "K";
        } // 만약 돌려서 A,J,Q,K가 아니라면 해당하는 숫자로 돌려줌
        return  String.valueOf(number);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(Card card : cards){
            sb.append((card.toString())); // 삽입 모양과 끗수
            sb.append("\n"); // 삽입 개생
        }
        return sb.toString();
    }
}
