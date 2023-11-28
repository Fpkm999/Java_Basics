package section16.BlackJack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

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
                Card card = new Card(pattern,i);
                cards.add(card); // 카드의 모양과 숫자를 저장함
            }
        }
        return cards;   //돌려줌
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
    public Card draw(){
        Card selectedCard = getRandomCard();
        cards.remove(selectedCard);
        return selectedCard;
    }
    private Card getRandomCard(){
        int size = cards.size(); // 사이즈는 아마도 52일거고 인덱스이므로
        int select = (int)(Math.random()*size); // 0부터 size-1사이의 난수 를 생성하여 select에 할당
        return cards.get(select);

    }
}
