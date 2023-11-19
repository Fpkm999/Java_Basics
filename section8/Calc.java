package section8;

public class Calc {
	// 라이브러리용
	
	// 두 수의 합을 계산해서 출력하는 메서드
	void sum(int num1, int num2) {
		//두개의 정수값을 받고 합을 출력함(반환필요 X)
		System.out.println(num1+num2);
	}
	
	// 배열의 합을 구하는 메서드
	void arrSum(int[] arr) {
		//배열의 합 코드
		int sum = 0;
		for ( int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("예상 출력 배열의 합 : "+sum);
	}
		
	// 배열의 합을 구하는 메서드
	// 값을 입력 받아  메서드

	
	// 반환 값이 있는 두 수의 합을 구하는 메서드
	// 반환타입이 int 정수로 반환 된다.
	int sum1(int num3, int num4) {
		return num3 + num4;	
	}
	
	
	//  성적의 합을 반환해주는 메서드
	int scoreSum(int[] student) {
		//성적의 합 코드
		int sum = 0;
		for (int i = 0; i < student.length; i++) {
			sum += student[i];
		}

		return sum;
	}
	// 두 학생의 성적의 결과를 반환해주는 메서드
	String scoreCompare(int[] studentA, int[] studentB) {
		int sumA = 0;
		int sumB = 0;
		
//		for (int i = 0; i < studentA.length; i++) {
//			sumA += studentA[i];
//		}
//		for (int i = 0; i < studentB.length; i++) {
//			sumB += studentB[i];
//		}
		sumA = scoreSum(studentA);//위에 거슬리는거 해결
		sumB = scoreSum(studentB);
		
		if (sumA > sumB) {
			return "두 학생의 총점이 같습니다.";
		}else if (sumA < sumB) {
			return  "B학생의 총점이 더 높습니다.";
		}else {
			return  "두 학생의 총점이 같습니다.";
		}

	
	
	}
	
	int scoreSum1(int[] arr) {//동일클래스라서 이렇게도 가능하다.
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
