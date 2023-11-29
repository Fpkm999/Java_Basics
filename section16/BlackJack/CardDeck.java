package section16.BlackJack;
// 카드덱
// 조커를 제외한 52장의 카드를 포함

/*
카드뭉치(카드덱)
    - 52개의 서로 다른 카드를 가짐
    - 카드 1개를 뽑아준다.
 */


import java.util.ArrayList;
import java.util.List;

public class CardDeck {
  private List<Card> cards;

  private static final String[] PATTERNS = {"spade","heart","diamond","club"};
  private static final int CARD_COUNT = 13; // 카드 총 숫자
  public CardDeck(){ // 생성자
    cards = new ArrayList<>();

    for(String pattern : PATTERNS){// 4번
      for(int i =1; i<=CARD_COUNT; i++){ // 13번 = 총 52번 반복함
        Card card = new Card();
        String denomination;

        if(i == 1){
          denomination = "A";
        } else if (i == 11){
          denomination = "J";
        } else if (i == 12){
          denomination = "Q";
        } else if (i == 13){
          denomination = "K";
        } else {
          denomination = String.valueOf(i);
        }
        card.setDenomination(denomination);
        card.setPattern(pattern);
        cards.add(card);
        System.out.println("카드덱 소환"+cards.size());
        System.out.println("카드덱 소환"+cards.toString());
      }
    }

  }


  public Card getCard(){
    return null;  //일단 null
  }
}
