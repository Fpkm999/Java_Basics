package section12.animal;
//구현 클래스
public class Bird implements FourLegAnimal {
	
	int birdLeg = 2;
	
	@Override
	public void walk() {
		if(this.birdLeg == FourLegAnimal.LEG_COUNT) {
			System.out.println("다리 개수 : "+ FourLegAnimal.LEG_COUNT
					+ "개로 새가 걷습니다.");
	}else {
		System.out.println("다리 개수 : "+this.birdLeg
				+ "개로 새가 걷습니다.");
	}
}
	
	@Override
	public void cry() {
		System.out.println("새가 짹짹하고 웁니다.");

	}
}
