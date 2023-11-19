package access1;

public class A {
	
	// public : 제한 없이 모든 패키지, 모든 클래스에서 접근 가능
	public int a;
	
	// protected : 같은 패키지 안에서 접근 가능하며, 다른
	// 패키지라도 자식 클래스라면 접근 가능
	protected int b;
	
	
	// default : 같은 패키지 내에서만 접근 가능
	int c;
	
	// private : 같은 클래스 내에서만 접근 가능
	// 거의 필드에서만 사용함
	private int d;
	
	void setD(int d) {
		this.d = d; // 세터를 이용하니 d가 보인다.
	}
	
	
	
}
