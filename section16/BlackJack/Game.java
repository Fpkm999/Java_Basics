package section16.BlackJack;

import java.util.Scanner;

public class Game {

        public void play(){
        System.out.println("====BlackJack====");
        Scanner sc = new Scanner(System.in);    // 값을 입력 받고

        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck(); // 필요한 인스턴스 실행

        playingPhase(sc, cardDeck, gamer);      //카드를 뽑는 메소드
//        System.out.println(cardDeck.toString());
//                cardDeck을 통해 카드를 뽑는다.
//                gamer : 게이머가 카드를 받고, gamer가 현재 카드를 확인한다.

        }
        private void playingPhase(Scanner sc, CardDeck cardDeck, Gamer gamer){
                String gamerInput;
                while(true){
                        System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
                        gamerInput = sc.nextLine();

                        if("0".equals(gamerInput)){
                                break;
                        }
                        Card card = cardDeck.draw();    //draw가 진짜 카드 뽑는 메소드임
                        gamer.receiveCard(card);
                }
        }
}
