package section16.BlackJack;

import java.util.Scanner;

public class Game {

        public void play(){
        System.out.println("====BlackJack====");
        Scanner sc = new Scanner(System.in);

        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();

        System.out.println(cardDeck.toString());
        }

//        Card card = cardDeck.draw(); // 카드를 뽑는 메소드
                // 남아 있는 카드 중 랜덤한 1개의 카드를 준다

}
