package access2;

import access1.A;// public이면 import만 하면 다른패키지에접근가능하다.

public class C extends A{
	void access() {
		A a = new A();
		a.a = 1;
		super.b = 0; //슈퍼를 통해서 부모클래스에 접근하면 protected에도 접근이 가능하다.
		//default는 아예 접근 불가
	}
}
