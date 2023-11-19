package section10;

public class SchoolBus extends Bus{//부모가 버스
	//2차 상속
	@Override
	public void ride() {
		super.ride();
		System.out.println("스쿨버스가 주행합니다.");
	}
}
