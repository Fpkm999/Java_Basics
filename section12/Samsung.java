package section12;

public class Samsung extends Phone{
//추상 클래스를 상속 받은 모든 자식 클래스는 무조건 오버라이딩하라고 빨간줄이 뜬다

	@Override
	public void phoneBrand(){
//		super.phoneBrand(); 추상메서드는 이거 안된다.
		System.out.println("삼성");
	}
	
}
