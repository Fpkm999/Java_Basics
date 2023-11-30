package section16.BlackJack;
/*
Gamer와 Dealer의 공통점인 receiveCard,
showCards, openCards를 추상메소드로 갖고 있습니다.
 */
import java.util.List;

public interface Player {

    void receiveCard(Card card);

    void showCards();

    List<Card> openCards();
}
