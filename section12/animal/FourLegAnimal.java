package section12.animal;
// 인터페이스 공부
// 인터페이스 엽습
public interface FourLegAnimal {
	// 인터페이스는 항상 public으로 구현함
	// 모든 상수는 public static final
	// 인터페이스에 선언된 변수는 static 키워드,
	// public 접근제어자에 관계없이 static final로 역할한다

	public static final int LEG_COUNT = 4; // 상수
	// public static final 은 생략이 가능 (컴퓨터가 인터페이스 필드라고 판단하고 알아서 붙여줌)
	
	// 인터페이스의 모든 메서드는 추상 메서드이다. 
	// 고로 인터페이스로 생성한 메서드는 재정의 해줘야 한다.
	// public abstract 은 생략이 가능하다.
	public abstract void walk();
	public abstract void cry();

	// 인터페이스는 객체를 생성할 수 없다. 고로, 필드와 생성자를 가지지 않음. 필드와 메서드가 있다는 건

	// 구현 클래스를 통해서 메서드를 호출한다.
}
