package section12;

public class Main {

	public static void main(String[] args) {
//		Animal animal = new Animal("사자"); 안된다
		// 추상 클래스는 독립적으로 객체를 생성할 수 없음
		
		Dog dog = new Dog("강아지");
		dog.cry();//값이 자식객체를 통해서 잘 들어갔는지 테스트(부모 호출)
		dog.crySound();// 자식 클래스에 독립적인 메서드

	
		System.out.println("================");
		
		Apple apple = new Apple();
		Samsung samsung = new Samsung();
		// 추상 메서드를 오버라이딩한 메서드 호출
		apple.phoneBrand();
		apple.powerOn();
		// 자식 객체를 통해 메서드를 호출
		samsung.powerOn();
	
	}
}
