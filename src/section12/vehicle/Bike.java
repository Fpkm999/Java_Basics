package section12.vehicle;

public class Bike implements TwoWheel {

	int bikeWheel = 2;
	@Override
	public void ride() {
		if (this.bikeWheel == TwoWheel.WHEEL_COUNT) {
			System.out.println("바퀴개수가 " + TwoWheel.WHEEL_COUNT +
					"개인 오토바이가 도로를 달리고 있습니다.");
		} else {
			System.out.println("바퀴개수가 2개인 오토바이가 도로를 달리고 있습니다.");
		}
	}
	
}

