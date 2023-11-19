package section12.bluetooth;

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
