package BlackJack_alone;

import java.util.List;

public class Rule {
    public void Winner(List<Card> cardhap) {
    int CardHap = 0;
    int highestPoint = 0;

    }

    public int getPointSum (List<Card> cards){
        int sum = 0;

        for(Card card  :cards){
            sum += card.getPoint();
        }
        return sum;
    }
}
