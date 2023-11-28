package section12.bluetooth;
// 자식 인터페이스를 상속받은 클래스
// 상속받은 추상 메서드 전부 재정의 해야한다.
public class MicTest implements BluetoothMIC2 {

	@Override
	public void sing() {
		System.out.println("마이크로 노래를 부릅니다.");
		
	}

	@Override
	public void music() {
		System.out.println("스피커로 노래가 나옵니다.");
		
	}

	@Override
	public void connect() {
		System.out.println("블루투스 연결");
	}

}
