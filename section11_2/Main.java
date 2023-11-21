package section11_2;

public class Main {
	public static void main(String[] args) {
		Car car = new Bus();
		// 클래스 자동 형 변환

		((Bus)car).name = "시내버스";
		((Bus)car).stop();
		// 클래스 강제 형 변환

		Bus bus = (Bus)car; // 강제 형변환

		bus.name = "관광버스";
		bus.stop();

		System.out.println("======================================");

		Car cars = new Car();
		Bus buss = new Bus();

		System.out.println("cars instanceof Car : " +(cars instanceof Car));
		System.out.println("cars instanceof Car : " +(cars instanceof Car));
		System.out.println("buss instanceof Car : " +(buss instanceof Car));
		System.out.println("cars instanceof Bus : " +(cars instanceof Bus));
		System.out.println("Buss instanceof Bus : " +(buss instanceof Bus));
	//강제 형변환은 취급안함 그래서 false뜸
		
		
	
	}

}
