package section11;

public class Bus2 extends Car2{
	// 자식 클래스가 개별적으로 추가한 멤버
	String name;
	

	public void stop() {
		System.out.println("버스 정지");
	}
	// 오버라이딩한 메서드의 경우 오버라이딩한 메서드를 호출가능
	@Override
	public void ride() {
		System.out.println("버스 주행");
	}
}
