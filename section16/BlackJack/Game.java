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

        initPhase( cardDeck,gamer, dealer);
        playingPhase(sc, cardDeck, gamer, dealer);      //카드를 뽑는 메소드
//        System.out.println(cardDeck.toString());
//                cardDeck을 통해 카드를 뽑는다.
//                gamer : 게이머가 카드를 받고, gamer가 현재 카드를 확인한다.

        }
        private void playingPhase(Scanner sc, CardDeck cardDeck, Gamer gamer,Dealer dealer){
                String gamerInput, dealerInput;
                boolean isGamerTurn = false,
                        isDealerTurn = false;

                while(true){
                        System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
                        gamerInput = sc.nextLine();

                        if("0".equals(gamerInput)){
                                isGamerTurn = true;
                        }else {
                                Card card = cardDeck.draw();    //draw가 진짜 카드 뽑는 메소드임
                                gamer.receiveCard(card);
                        }

                        System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
                        dealerInput = sc.nextLine();
                        if("0".equals(dealerInput)){
                                isDealerTurn = true;
                        }else {
                                Card card = cardDeck.draw();    //draw가 진짜 카드 뽑는 메소드임
                                dealer.receiveCard(card);
                        }
                        if(isGamerTurn && isDealerTurn){
                                break;
                        }
                }
        }

        private static final int INIT_RECEIVE_CARD_COUNT = 2;   // 매직 넘버를 피하고자 static 상수로 선언함.
        private void initPhase(CardDeck CardDeck,Gamer gamer,Dealer dealer){ // 블랙잭 처음 시작시 Dealer와 Gamer에게 각각 2 장씩 카드를 받는 역할을 하는 메소드
                System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
                for(int i=0 ; i<INIT_RECEIVE_CARD_COUNT; i++) {
                        Card card = CardDeck.draw();
                        gamer.receiveCard(card);

                        Card card2 = CardDeck.draw();
                        dealer.receiveCard(card2);
                }
        }
}
