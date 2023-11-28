package section12.animal;
// 구현 클래스
public class Dog implements FourLegAnimal {	// 구현 클래스 선언

	int dogLeg = 4;
	
	@Override
	public void walk() {
		// 인터페이스의 상수를 사용하려면 인터페이스명.상수명
		if(this.dogLeg == FourLegAnimal.LEG_COUNT) {
			System.out.println("다리 개수 : "+ FourLegAnimal.LEG_COUNT
					+ "개로 강아지가 걷습니다.");
		} else {
			System.out.println("다리 개수 : "+this.dogLeg
					+ "개로 강아지가 걷습니다.");
		}
	}
	
	@Override
	public void cry() {
		System.out.println("강아지가 멍멍하고 웁니다.");
	}
}
