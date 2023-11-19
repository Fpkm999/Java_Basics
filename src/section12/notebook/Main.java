package section12.notebook;

public class Main {

	public static void main(String[] args) {

		// 추상 클래스는 객체를 생성할 수 없다.
		Galaxybook galaxybook = new Galaxybook();
		Macbook macbook = new Macbook();

		// 자식 객체 생성
		galaxybook.notebookBrand();
		macbook.notebookBrand();
		
	}

}
/*
 *  추상 부모 클래스의 생성자도 기존의 일반클래스처럼 매개변수 추가해서 사용할 수 있는지
 *  
 *  
 *  추상 메소드 사용하는 이유 : 프로젝트를 진행하면서 많은 클래스와
 *   멤버들로 인해 코드가 복잡해질때 필요한 코드를 작성하도록 강제
 *   해서 오류를 줄이고 코드를 단순화 하기 위해서 사용
 *  
 */
