package section16.BlackJack;
// Rule,Card,CardDeck,Dealer,Gamer 5개만으로는 블랙잭 게임 진행이 안됨
// 게임을 진행시킬 Game이라는 클래스안에 play 메소드를 만들어 여기서 구현함
public class Game {

        public void play(){
                System.out.println("====== Blackjack ======");
                Dealer dealer = new Dealer();
                Gamer gamer = new Gamer();
                Rule rule = new Rule();
                CardDeck cardDeck = new CardDeck();
                // 게임에 필요한 클래스들의 인스턴스를 생성시킴
                // play()를 실행시킬 클래스는 Application.java

//                Card card = cardDeck.draw();// 첫번째 카드 뽑기
        }
}