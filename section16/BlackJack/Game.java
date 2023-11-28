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

        playingPhase(sc, cardDeck, gamer);
//        System.out.println(cardDeck.toString());
        }
        private void playingPhase(Scanner sc, CardDeck cardDeck, Gamer gamer){
                String gamerInput;
                while(true){
                        System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
                        gamerInput = sc.nextLine();

                        if("0".equals(gamerInput)){
                                break;
                        }
                        Card card = cardDeck.draw();
                        gamer.receiveCard(card);
                }
        }
}
