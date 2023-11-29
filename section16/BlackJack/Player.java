package section16.BlackJack;

import java.util.List;

public interface Player {
    String getname();

    public abstract void receiveCard(Card card);

    public abstract void showCards();

    public abstract List<Card> openCards();

    void turnOff();

    void turnOn();

    boolean isTurn();
}
