package section12.bluetooth;
									// 다중 인터페이스
public class BluetoothMIC implements MicroPhone, Speaker {
	// 다중 인터페이스의 경우
	// 선언한 모든 인터페이스에 대한 추상 메서드를 모두 오버라이딩 해줘야함
	
	
	@Override
	public void sing() {
		System.out.println("마이크로 노래를 부릅니다.");
	}
	
	@Override
	public void music() {
		System.out.println("스피커로 노래가 나옵니다.");
	}

}
