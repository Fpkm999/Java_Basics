package section12.notebook;

public class Macbook extends Notebook {
	// 자식클래스
	//추상 메서드는 반드시 오버라이딩 해야함
	@Override
	public void notebookBrand() {
		System.out.println("맥북 출력");
	}
}
