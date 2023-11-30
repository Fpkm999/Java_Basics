package section16.BlackJack;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Rule,Card,CardDeck,Dealer,Gamer 5개만으로는 블랙잭 게임 진행이 안됨
// 게임을 진행시킬 Game이라는 클래스안에 play 메소드를 만들어 여기서 구현함
public class Game {
        private static final String STOP_RECEIVE_CARD = "0";

        public void play() {
                System.out.println("====== Blackjack ======");
                Scanner sc = new Scanner(System.in);

                Dealer dealer = new Dealer();
                Gamer gamer = new Gamer();
                Rule rule = new Rule();
                CardDeck cardDeck = new CardDeck();
                // 게임에 필요한 클래스들의 인스턴스를 생성시킴
                // play()를 실행시킬 클래스는 Application.java

                List<Player> players = Arrays.asList(new Gamer(), new Dealer());
                System.out.println(cardDeck.toString());
                initPhase(cardDeck,players);
                System.out.println(gamer.openCards().toString());
                playingPhase(sc, cardDeck, players);
//                System.out.println(gamer.openCards().toString());

        }

        /*
        INIT_RECEIVE_CARD_COUNT = 2;
        매직 넘버를 피하기 위함
         */
        private static final int INIT_RECEIVE_CARD_COUNT = 2;
        private void initPhase(CardDeck cardDeck,List<Player> players){
                System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
                for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
                        for(Player player : players) {
                                Card card = cardDeck.draw();
                                player.receiveCard(card);
                        }
                }
        }
        /*
        playingPhase
        receiveCardAllPlayer 결과에 따라 receiveCardAllPlayers 를 반복시키는 역할
         */
        private void playingPhase(Scanner sc, CardDeck cardDeck, List<Player> players){
            while(true){
                    boolean isAllPlayerTurnOff = receiveAllPlayers(sc, cardDeck,players);

                    if(isAllPlayerTurnOff){
                            break;
                    }
            }
        }
        /*
        모든 Player가 Card를 뽑도록 하는 역할
         */
        private boolean receiveAllPlayers(Scanner sc, CardDeck cardDeck, List<Player> players){
                boolean isAllPlayerTurnOff = true;

                for(Player player : players) {
                        if(isReceiveCard(sc)){
                                Card card = cardDeck.draw();
                                player.receiveCard(card);
                                isAllPlayerTurnOff = false;
                        } else {
                                isAllPlayerTurnOff = true;
                        }
                }
                return isAllPlayerTurnOff;
        }

        /*
        isReceiveCard
        - Player 개개인에게 카드를 뽑을건지 의사를 묻는 역할
         */
        private boolean isReceiveCard(Scanner sc){
                System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
                return !STOP_RECEIVE_CARD.equals(sc.nextLine());
        }

}