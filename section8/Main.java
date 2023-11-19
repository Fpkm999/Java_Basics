package section8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TITLE : 메서드 연습
		// 실행용
		
		// Method.class
		Method method = new Method();//	객체 생성

		Scanner sc = new Scanner(System.in); // ()안에 요소들은 매개변수이다.

		method.tvName ="삼성";	//	필드에 값 대입

		method.turnOn();	// turnOn 메서드를 호출
		
		method.turnOff();   // turnOff 메서드를 호출

		method.nowChannel(7);
		
		
		System.out.println("=======================");

		// TITLE : 메서드 활용2
		// 계산기 클래스 만들자
		// Calc.class
		Calc calc = new Calc();
		
		calc.sum(3, 2);

		// ctrl 로 sum 메서드 누르면 해당 클래스로 이동됨
		// 여기서3,2와 같은 것을 Argument, 인자라고 함
		// 메서드에서 받는 것은 매개변수, 파라미터
		// 메서드를 호출 할 때 Argument, 인자
		

		System.out.println("=======================");

		//Student.class
		Student student = new Student();//객체 생성

		// 학새의 이름과 나이를 출력하는 프로그램
		System.out.println("학생의 이름과 나이");
		student.introduce("김문식", 24);


		System.out.println("=======================");

		
		int[] arr = {1, 5, 23, 4, 7, 13, 15};
		
		// 객체 생성
		Calc calc2 = new Calc();
		
		// 객체 호출
		calc2.arrSum(arr);
		// 예상 출력 배열의 합 :  68 //변형해서 풀어도됨
		
		System.out.println("=======================");

		// calc2 객체에 sum1 메서드호출 인자로 int 자료형 4과 4를 입력
		//  두 수의 합을 입력받고 int 자료형으로 잔환된 값을 sum 변수에 넣음
		int sum = calc2.sum1(5, 3);

		System.out.println(sum);	// 방법1
		
		System.out.println(calc2.sum1(5, 4)); // 방법2
		// 값을 변수에 넣어서 깔끔하게 해도되고 출력문에서 메소드를 통해로 넣어도
		// 되기는 하지만 변수를 따로 만들어서 저장하는게 좋다.

		System.out.println("=======================");

		// 객체생성
		Calc calc3 = new Calc();

		int[] studentA = { 90, 85, 70};
		int[] studentB = { 80, 100, 95};

		// 반환값 변수에 저장
		int sumA = calc3.scoreSum(studentA);
		int sumB = calc3.scoreSum(studentB);
		
		// 성적 비교 코드
		// A학생의 점수가 높을 경우 : A 학생의 총점이 더 높습니다.
		// B학생의 점수가 높을 경우 : B 학생의 총점이 더 높습니다.
		// 점수가 같은 경우 : 두 학생의 총점이 같습니다. 

		if(sumA > sumB){
			System.out.println("A 학생의 총점이 더 높습니다.");
		} else if (sumA < sumB){
			System.out.println("B 학생의 총점이 더 높습니다.");
		}else {
			System.out.println("두 학생의 총점이 같습니다.");
		}
		
		System.out.println("=======================");

		// 두 학생의 성적의 결과를 반환 해주는 메서드
		String compare = calc3.scoreCompare(studentA, studentB);
		System.out.println(compare);
		

		System.out.println("=======================");

		// 버스에 10000원을 들고 탄다면 몇번을 탈 수 있을건가
		Bus bus = new Bus();
		bus.take(10000);
		
		System.out.println("=======================");

		// TITLE : getter, setter 메서드 사용
		Person person = new Person();	// person 객체 생성
		
		person.setAge(-11);

//		person.age 접근을 제한하기 위해 private 걸어둔다.

		System.out.println(person.getAge());	// 넣은 값이 없으니까!
		person.setAge(11);	//setter 메소드를 통해 11을 넣음
		System.out.println(person.getAge());
	}
}
