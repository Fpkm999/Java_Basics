package section12.bluetooth;
// 자식 인터페이스
// 구현클래스가 아니다.
// 자식 인터페이스는 구현 클래스가 아니기 때문에 재정의 // 안해도됨.
public interface BluetoothMIC2 extends MicroPhone, Speaker {
	public abstract void connect();
	
}
