package access1;

public class B {
	void access() {
		A a = new A();
		a.a = 0;
		a.b = 0;//자동완성이 다이아몬드로 보임
		a.c = 0;
	}
}
