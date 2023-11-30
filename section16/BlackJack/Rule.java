package section16.BlackJack;
// Rule
// - 점수를 측정 한다
// - 승패를 판한 단다.
import java.util.List;

public class Rule {

    public int getScore(List<Card> cards){
        return 0;
    }

    public Player getWinner(List<Player> players){
        Player highestPlayer = null;
        int highestPoint = 0;

        for(Player player : players) {
            int playerPointSum = getPointSum(player.openCards());
            if(playerPointSum > highestPoint){
                highestPlayer = player;
                highestPoint = playerPointSum;
            }
        }
        return highestPlayer;
    }

    private int getPointSum (List<Card> cards){
        int sum = 0;

        for(Card card : cards) {
            sum += card.getPoint();
        }
        return  sum;
    }
}
