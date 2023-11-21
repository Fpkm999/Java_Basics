package section12;
//추상 클래스
public abstract class Animal {
	String name; // 동물 이름

	Animal(String name){	// 부모 클래스 생성자
		this.name = name;	//super() 를 통해 한번 실행 된다.
	}

	// 일단적인 메서드
	public void cry(){
		System.out.println(name+ "의 울음소리");
	}
	// 추상 메서드
	//public abstract void walk();
	
}
