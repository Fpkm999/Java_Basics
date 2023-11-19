package section11_2;

public class Main {

	public static void main(String[] args) {
//		Car section7.car = new Bus();
//		// 클래스 자동 형 변환
//		
//		((Bus)section7.car).name = "시내버스";
//		((Bus)section7.car).stop();
//		// 클래스 강제 형 변환
//		
//		Bus bus = (Bus)section7.car; // 강제 형변환
//		bus.name = "관광버스";
//		bus.stop();
//		
		System.out.println("======================================");
		Car car = new Car();
		Bus bus = new Bus();
		
		System.out.println("section7.car instanceof Car : " +(car instanceof Car));
		System.out.println("bus instanceof Car : " +(bus instanceof Car));
		System.out.println("section7.car instanceof Bus : " +(car instanceof Bus));
		System.out.println("Bus instanceof Bus : " +(bus instanceof Bus));
	//강제 형변환은 취급안함 그래서 false뜸
		
		
	
	}

}
