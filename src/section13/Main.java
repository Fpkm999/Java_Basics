package section13;

public class Main {

	public static void main(String[] args) {

		// 인스턴스 클래스의 객체 생성
		// 외부 클래스의 객체가 먼저 생성된 상태에서 객체 생성이 가능
		
		// 외부클래스 외부클래스객체명 = new 외부클래스();
		// 외부클래스명.내부클래스명 내부클래스객체명 = 외부클래스객체명.new 내부클래스();

		OuterClass outer = new OuterClass(); // 외부 클래스 객체 생성
		OuterClass.Inner inner = outer.new Inner(); //인스턴스 내부 클래스 객체 생성
		
	
		System.out.println("=====================");
		
		Calculator calculator = new Calculator(10,11);
		Calculator.Calc calc = calculator.new Calc();
		
		int sum = calc.add();
		System.out.println(sum);
		
		System.out.println("=====================");

		// 정적 내부 클래스
		// 외부 클래스를 생성하지 않아도 선언 가능
		// 외부클래스명.내부클래스명 내부클래스객체명 = new 외부클래스명.내부클래스명();
		
		OuterClass.Inner2 inner2 = new OuterClass.Inner2(); 
		
		System.out.println("=====================");

		String str = "정적 내부 클래스 테스트";
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);
		
		System.out.println("=====================");
		// 지역 내부 클래스
		
		String unitName = "마린";
		int unitSpeed = 10;
		
		Starcraft starcraft = new Starcraft();
		starcraft.getUnit(unitName, unitSpeed);
		
		System.out.println("=====================");
		// 익명 클래스
		// 1ghldyd zmffotm dlek
		Button button = new Button(){ // 객체 생성
			@Override
			public void click() {
				System.out.println("마이페이지로 이동");
			}
		};	//중괄호+세미콜론을 붙여줘야함
		button.click();//딱 한번만 실행되고 끝
	}
}
