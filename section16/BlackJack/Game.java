package section16.BlackJack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Game {

        public void play() {
                System.out.println("====BlackJack====");
                Scanner sc = new Scanner(System.in);    // 값을 입력 받고
                Rule rule = new Rule();
                CardDeck cardDeck = new CardDeck(); // 필요한 인스턴스 실행

                List<Player> players = Arrays.asList(new Gamer("사용자1"), new Dealer());
                List<Player> initAfterPlayers = initPhase(cardDeck, players);
                List<Player> playingAfterPlayers = playingPhase(sc, cardDeck, initAfterPlayers);

                Player winner = rule.getWinner(playingAfterPlayers);
                System.out.println("승자는 " + winner.getName);
        }

        private List<Player> playingphase(Scanner sc, CardDeck cardDeck, List<Player> players){
                List<Player> cardReceivePlayers;
                while (true) {
                        cardReceivePlayers = receiveCardAllPlayers(sc, cardDeck, players);

                        if(isAllPlayerTurnOff(cardReceivePlayers)){
                                break;
                        }
                }
                return cardReceivePlayers;
        }

        private List<Player> receiveCardAllPlayers(Scanner sc , CardDeck cardDeck, List<Player> players){
                for(Player player : players){
                        if(isReceiveCard(sc)){
                                Card card = cardDeck.draw();
                                player.receiveCard(card);
                                player.turnOn();
                        } else{
                                player.turnOff();
                        }
                }
                return players;
        }
        private boolean isAllPlayerTurnOff(List<Player> players){
                for(Player player : players){
                        if(player.isTurn()){
                                return false;
                        }
                }
                return true;
        }

        private List<Player> playingPhase(Scanner sc, CardDeck cardDeck, List<Player> players) {
                List<Player> cardReceivedPlayers;
                while(true){
                        cardReceivedPlayers = receiveCardAllPlayers(sc, cardDeck, players);

                        if(isAllPlayerTurnOff(cardReceivedPlayers)){
                                break;
                        }
                }
                return cardReceivedPlayers;
        }
//        private boolean receiveCardAllPlayers(Scanner sc,  CardDeck cardDeck, List<Player> players) {
//                boolean isAllPlayerTurnOff = true;
//
//                for (Player player : players) {
//                        if (isReceiveCard(sc)) {
//                                Card card = cardDeck.draw();    //draw가 진짜 카드 뽑는 메소드임
//                                player.receiveCard(card);
//                                isAllPlayerTurnOff = false;
//                        } else {
//                                isAllPlayerTurnOff = true;
//                        }
//                }
//                return isAllPlayerTurnOff;
//        }
        private boolean isReceiveCard(Scanner sc) {
                System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
                return !STOP_RECEIVE_CARD.equals(sc.nextLine());
        }


        private static final int INIT_RECEIVE_CARD_COUNT = 2;   // 매직 넘버를 피하고자 static 상수로 선언함.
        private List<Player> initPhase(CardDeck CardDeck,List<Player> players){ // 블랙잭 처음 시작시 Dealer와 Gamer에게 각각 2 장씩 카드를 받는 역할을 하는 메소드
                System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
                for(int i=0 ; i<INIT_RECEIVE_CARD_COUNT; i++) {
                        for(Player player : players) {
                                Card card = CardDeck.draw();
                                player.receiveCard(card);
                        }
                }
                return players;
        }
}
