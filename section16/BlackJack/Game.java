package section16.BlackJack;

public class Game {

        public void play(){
        Card card = CardDeck.draw();
        System.out.println("====블랙잭====");
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();
        }
}
