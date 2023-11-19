package section12.vehicle;

public class Main {

	public static void main(String[] args) {
		// 1. TwoWheel 인터페이스 생성
		// 2. Car, Bike 구현 클래스 생성
		// 3. TwoWheel 인터페이스에 int WHEEL_COUNT = 2; 상수
		// 4. ride 메서드 생성
		// 5. Car, Bike ride 메서드 오버라이딩해서 
		// if 문으로 Wheel 개수 출력
		Car car = new Car();
		Bike bike = new Bike();
		car.ride();
		bike.ride();
	}

}
