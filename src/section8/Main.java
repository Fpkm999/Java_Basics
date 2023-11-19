package section8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		//실행용
		
//		//1. Method.class
		Method method = new Method();//	객체 생성
		
//		Scanner sc = new Scanner(System.in); <--이것도 매개변수임
		
		method.tvName ="삼성";	//	필드에 값 대입
//		
		method.turnOn();	// turnOn 메서드를 호출
		
		method.turnOff();   // turnOff 메서드를 호출
//		
		method.nowChannel(7);
		
		
		System.out.println("=======================");
		
//		//계산기 클래스 만들자
//		//2. Calc.class
		Calc calc = new Calc();
		
		calc.sum(3, 2);//ctrl 로 sum 메서드 누르면 해당 클래스로 이동됨
//		//여기서3,2와 같은 것을 Argument, 인자라고 함
//		// 메서드에서 받는 것은 매개변수, 파라미터
//		// 메서드를 호출 할 때 Argument, 인자
		
		
		System.out.println("=======================");

		//3. Student.class
		Student student = new Student();//객체 생성
		
		student.introduce("김문식", 24);
		
		System.out.println("=======================");

		
		int[] arr = {1, 5, 23, 4, 7, 13, 15};
		
		// 객체 생성
		Calc calc2 = new Calc();
		
		// 객체 호출
		calc2.arrSum(arr);
		// 예상 출력 배열의 합 :  68 //변형해서 풀어도됨 
		
		System.out.println("=======================");

		int sum = calc2.sum1(5, 3);
		System.out.println(sum);
		
		System.out.println(calc.sum1(5, 4));
		
		System.out.println("=======================");
		

		int[] studentA = { 90, 85, 70};
		int[] studentB = { 80, 100, 95};
		
		//객체생성
		Calc calc3 = new Calc();
		
		// 반환값 변수에 저장
		int sumA = calc3.scoreSum(studentA);
		int sumB = calc3.scoreSum(studentB);
		
		// 성적 비교 코드
		// A학생의 점수가 높을 경우 : A 학생의 총점이 더 높습니다.
		// B학생의 점수가 높을 경우 : B 학생의 총점이 더 높습니다.
		// 점수가 같은 경우 : 두 학생의 총점이 같습니다. 
		
		if (sumA > sumB) {
			System.out.println("A학생의 총점이 더 높습니다.");
		}else if (sumA < sumB) {
			System.out.println("B학생의 총점이 더 높습니다.");
		}else {
			System.out.println("두 학생의 총점이 같습니다.");
		}
		
		
		System.out.println("=======================");

		
		String compare = calc3.scoreCompare(studentA, studentB);
		System.out.println(compare);
		

		System.out.println("=======================");

		Bus bus = new Bus();
		bus.take(10000);
		
		System.out.println("=======================");

		Person person = new Person();
		
		person.setAge(-11);
		
//		person.age 접근을 제한하기 위해 private 걸어둔다.
		person.getAge();
		System.out.println(person.getAge());
	}
}
