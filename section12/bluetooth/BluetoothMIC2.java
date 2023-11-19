package section12.bluetooth;
//자식 인터페이스O . 구현클래스가 아님. 그래서 재정의 안해도됨.
public interface BluetoothMIC2 extends MicroPhone, Speaker {
	public abstract void connect();
	
}
