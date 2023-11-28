package section17;

@FunctionalInterface    //람다식 인터페이스를 사용할 거라고 선언하는 것
public interface Math {
    // 람다식 인터페이스
    // Math 을 람다식 인터페이스로 사용하겠다고 선언 <-- 어노테이션 사용함
    int add(int num1, int num2);    // 구현부는 Main
    // 람다식은 추상 메서드가 1개만 선언 가능

//    int Calc(); 람다식 인터페이스는 추상메서드 하나만 가능함
}
