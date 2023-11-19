package section12.vehicle;

public class Car implements TwoWheel{

	int carWheel = 4;
	@Override
	public void ride() {
		if (this.carWheel == TwoWheel.WHEEL_COUNT) {
			System.out.println("바퀴개수가 "+TwoWheel.WHEEL_COUNT+
					" 개인 자동차가 도로를 달리고 있습니다.");
		} else {
			System.out.println("바퀴개수가 4개인 자동차가 도로를 달리고 있습니다.");
		}
	}
	
}
