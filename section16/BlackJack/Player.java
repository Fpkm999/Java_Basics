package section16.BlackJack;
/*
Gamer 와 Dealer 의 공통점 인 receiveCard, showCards, openCards 를
 추상 메소드로 가지고 있다.
 */
import java.util.List;

public interface Player {

    void receiveCard(Card card);

    void showCards();

    List<Card> openCards();

    void turnOff();

    void turnOn();

    boolean isTurn();

    String getName();
}
