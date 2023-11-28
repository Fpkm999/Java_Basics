package section16.BlackJack;

import java.util.List;

public interface Player {
    void receiveCard(Card card);

    void showCards();

    List<Card> openCards();
}
