package section16.BlackJack;

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
                Rule rule = new Rule();
                CardDeck cardDeck = new CardDeck();

                List<Player> players = Arrays.asList(new Gamer("사용자1"), new Dealer()) ;
                List<Player> intiAfterPlayers = initPhase(cardDeck,players);
                List<Player> playingAfterPlayers= playingPhase(sc,cardDeck,intiAfterPlayers);
                // 게임에 필요한 클래스들의 인스턴스를 생성시킴
                // play()를 실행시킬 클래스는 Application.java

                Player winner = rule.getWinner(playingAfterPlayers);
                System.out.println("승자는 "+ winner.getName());
//              System.out.println(cardDeck.toString());
        }

        /*
        INIT_RECEIVE_CARD_COUNT = 2;
        매직 넘버를 피하기 위함
         */
        private static final int INIT_RECEIVE_CARD_COUNT = 2;
        private List<Player> initPhase(CardDeck cardDeck,List<Player> players){
                System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
                for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
                        for(Player player : players) {
                                Card card = cardDeck.draw();
                                player.receiveCard(card);
                        }
                }
                return players;
        }
        /*
        playingPhase
        receiveCardAllPlayer 결과에 따라 receiveCardAllPlayers 를 반복시키는 역할
         */
        private List<Player> playingPhase(Scanner sc, CardDeck cardDeck, List<Player> players){
            List<Player> cardReceivePlayers;
                while(true){
                        cardReceivePlayers = receiveCardAllPlayers(sc, cardDeck,players);

                    if(isAllPlayerTurnOff(cardReceivePlayers)){
                            break;
                    }
            }
            return cardReceivePlayers;
        }
        /*
        모든 Player가 Card를 뽑도록 하는 역할
         */
        private List<Player> receiveCardAllPlayers(Scanner sc, CardDeck cardDeck, List<Player> players){
                for(Player player : players) {
                        System.out.println(player.getName()+"님 차례입니다.");

                        if(isReceiveCard(sc)){
                                Card card = cardDeck.draw();
                                player.receiveCard(card);
                                player.turnOn();
                        } else {
                                player.turnOff();
                        }
                }
                return players;
        }

        /*
        모든 게임 참가자가 카드뽑기종료 상태인지를 확인하는 역할을 하는 메소드
         */
        private boolean isAllPlayerTurnOff(List<Player> players){
                for(Player player : players){
                        if(player.isTurn()){
                                return false;
                        }
                }
                return true;
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