package section12.animal;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog();
		
		dog.walk();//추상메서드를 재 정의한 메서드 인터페이스의 메서드는 추상 메서드이기 때문.
		//추상 메서드는 재정의 해야됨
		dog.cry();
		
		Bird bird = new Bird();
		bird.walk();
		bird.cry();
	}
}
