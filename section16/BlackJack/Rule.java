package section16.BlackJack;
// Rule 클래스는 승자를 판단하는 역학을 한다.
import java.util.List;

public class Rule {
    public int getScore(List<Card> cards){
        return 0;
    }
    public Player getWinner(List<Player> players){
        Player highstPlayer = null;
        int highstPoint = 0;

        for(Player player : players){
            int playerPointSum = getPointSum(player.openCards());
            if(playerPointSum > highstPoint){
                highstPlayer = player;
                highstPoint = playerPointSum;
            }
        }
        return highstPlayer;
    }

    private int getPointSum (List<Card> cards){
        int sum = 0;

        for(Card card : cards){
            sum += card.getPoint();
        }
        return sum;
    }


}
