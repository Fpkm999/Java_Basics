package section16.BlackJack;
// 카드덱
// 조커를 제외한 52장의 카드를 포함

/*
카드뭉치(카드덱)
    - 52개의 서로 다른 카드를 가짐
    - 카드 1개를 뽑아준다.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {
  private List<Card> cards;

  private static final String[] PATTERNS = {"spade","heart","diamond","club"};
  private static final int CARD_COUNT = 13; // 카드 총 숫자
  public CardDeck() { // 생성자
    cards = this.generateCards();
  } // 생성자
  private List<Card> generateCards() {  // 52개의 카드를 생성
    List<Card> cards = new LinkedList<>();  // 카드를 제거할 때 ArrayList보다 좋음

    for (String pattern : PATTERNS) {// 4번
      for (int i = 1; i <= CARD_COUNT; i++) { // 13번 = 총 52번 반복함
        Card card = new Card(pattern,i); // 카드 인스턴스 생성
//        card.setDenomination(denomination); // 끗수
//        card.setPattern(pattern); // 무늬
        cards.add(card);
      }
    }
      return cards;
  }

/*
numberToDenomination 기능
생성된 숫자를 끗수로 지정하는 기능
 */
//private String numberToDenomination(int number){
//  if(number == 1){
//    return  "A";
//  } else if (number == 11){
//    return "J";
//  } else if (number == 12){
//    return "Q";
//  } else if (number == 13){
//    return "K";
//  }
//  return String.valueOf(number);
//} // 숫자를 끗수로
//
//  private int numberToPoint(int number){
//    if(number>=11){
//      return 10;
//    }
//    return number;
//  }
  public Card getCard(){
    return null;  //일단 null
  }

  /*
  CardDeck toString
  카드덱이 잘 생성되었는지 테스트 하는 기능
   */
  @Override
  public String toString() {  // cardDeck 이 잘 생성되는지 확인
    StringBuilder sb = new StringBuilder();

    for(Card card : cards){
      sb.append(card.toString());
      sb.append("\n");
    }
    return sb.toString();
  }

  /*
  draw 기능
  - 남아 있는 카드 중 1개를 뽑는다.
  - 뽑은 가드는 카드덱에서 제거한다.
  draw에 기능을 getRandomCard로 분산했다.
   */
  public Card draw(){ // 카드 뽑는 메소드
    Card selectedCard = getRandomCard();
    cards.remove(selectedCard);
    return selectedCard;

  }
  private Card getRandomCard() {
    int size = cards.size();
    int select = (int)(Math.random()*size);
    return cards.get(select);
  }


}
