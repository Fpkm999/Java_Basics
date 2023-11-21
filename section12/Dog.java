package section12;

public class Dog extends Animal {
	Dog(String name) {
		super(name);//부모 클래스의 생성자에 접근(호출)==부모 클래스 메서드 시랳ㅇ
	}


	void crySound() {
		System.out.println("멍멍");
	}
}
