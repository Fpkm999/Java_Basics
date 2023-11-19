package section12_2;

public class Main {

	public static void main(String[] args) {
		// 인터페이스  Heater, Cooler
		// Heater 에는 void heat() 메서드
		// Cooler 에는 void cool() 메서드
		// 구현 클래스 Air를 만들고 다중 상속 받아서
		// heat 호출 시 더움 출력
		// cool 호출 시 추움 출력
		Air air = new Air();
		air.cool();
		air.heat();
	}

}
