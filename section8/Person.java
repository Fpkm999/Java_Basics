package section8;

public class Person {
	private int age;
	private String name;

	// setter 메서드
	void setAge(int num){
		if (num < 0 ){
			System.out.println("1이상의 값으로 설정 하세요.");
			return;	// 메서드 종료
		} else {
			age = num;
		}
	}

	// getter 메서드
	int getAge() {	// 매개변수없다. 파라미터 필요 없음
		return age;
	}
	
	// ======================================================//

//	void setName(String name) {
//		//필터는 본인이 작성하면됨
//	}
//	
//
//
//	public String getName() {
//		return name;
//	}
	
	
}
