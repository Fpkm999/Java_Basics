package section12.animal;
// 인터페이스 공부
// 인터페이스
public interface FourLegAnimal {
	// 인터페이슨는 항상 public으로 구현함
	// 모든 상수는 public static final
	public static final int LEG_COUNT = 4; // 상수
	// public static final 은 생략이 가능
	
	// 인터페이스의 모든 메서드는 추상 메서드이다. 고로 모두 재정의 해줘야 한다.
	// public abstract
	public abstract void walk();
	public abstract void cry();
	// public abstract 는 생략이 가능하다.
	
	// 인터페이스는 객체를 생성할 수 없다.
	// 구현 클래스를 통해서 메서드를 호출한다.
}
