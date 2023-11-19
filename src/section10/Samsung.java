package section10;

public class Samsung extends Phone{
	// 부모클래스로 객체 생성을 하면
	// 자식 클래스가 독단적으로 만든 클래스 구성멤버는
	// 사용할 수 없음
//	String name = "이재용";	// 삼성에만 있는 name필드
	
	// info 메서드 오버라이딩
	// 출력문 제일 앞에 삼성
	@Override 
	void info() {
		System.out.println("삼성,"+super.brand+" "+super.series+" "+super.color);
	}
}
