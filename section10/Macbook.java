package section10;
// 자식클래스
public class Macbook extends Notebook {
	// 오버라이딩
	// 부모 클래스에서 상속받은 메서드의 내용을 변경해서 재정의

	@Override
	void powerOn() {
		//super.powerOn(); <-- 부모클래스의 메소드도 실행 하고 재정의 된 메소드 실행
		System.out.println("맥북 전원 ON");
	}
}
