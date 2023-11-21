package section11;

class Parent {}
class Child extends Parent {
	void pisco(){
		System.out.println("피스코");
	};
}

class Car {}
class Bus extends Car{}
class SchoolBus extends Bus{}

public class Main {

	public static void main(String[] args) {
		// 클래스의 자동 타입 변환은 상속관계에서만 변환 가능
		// 1. 자식 객체를 만들면서 바로 부모 타입으로 변환
		// 부모클래스 객체변수명 = new 자식클래스();
		
		Parent p1 = new Parent();	// 부모 타입의 부모 객체
		Child c1 = new Child();	// 만들어진 자식 클래스
		
		
		Parent p2 = new Child();//자식객체를 만들면서 바로 부모 타입으로 변환

		c1.pisco();	// 된다
//		p2.pisco(); // 타입은 부모라 상된다

		///////////////////////////////////////////////////////////////
		
		// 2. 만들어진 자식 객체를 부모 타입으로 변환
		// 자식클래스 객체변수명 = new 자식클래스();
		// 부모클래스 객체변수명 = 자식객체;
	
		Parent p3 = c1;	// 자식객체를 부모 타입으로
			// N 차 상속도 가능
		Car c3 = new Bus();	// 자통 타입변환
		Car c2 = new SchoolBus();	// 자동 타입변환
		
	}
}
