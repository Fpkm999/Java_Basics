package section12.bluetooth;

public class Main {

	public static void main(String[] args) {
		BluetoothMIC bm = new BluetoothMIC();
		// 구현 클래스 객체 생성
		bm.music();
		// MicroPhone 인터페이스의 추상 메서드 재정의
		
		bm.sing();
		// Speaker  인터페이스의 추상 메서드 재정의
		
		System.out.println("=====================");
		
		MicTest mt = new MicTest();
		
		mt.connect(); // 자식 인터페이스 BluetoothMIC2의 메서드를 재정의 한것
		mt.sing();	// 부모 인터페이스의 Speaker의 메서드를 재정의
		mt.music(); // 부모 인터페이스의 MicroPhone 의 메서드를 재정의
		
	}

}


// 클래스 상속 : 클래스 끼리 상속, 다중 상속이 안됨
// 인터페이스 상속 : 인터페이스 끼리 상속, 다중 상속이 가능함

// 인터페이스는 필드와 메소드를 가질수 있다.
// 단 생성자를 가질 수 없다.

// 인터페이스 멤버에는 어떠한 제한자도 붙이지 않느다.
// 그러나 인터페이스 형 변수와 배열은 선언 가능