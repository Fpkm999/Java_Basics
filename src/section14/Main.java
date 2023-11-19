package section14;

public class Main {

	public static void main(String[] args) {
		// NullPointerException
//		String[] strArray = null;
//		// 배열을 만들기만 하고 선언하지 않음
//		
//		System.out.println(strArray[0]);
//		// 생성되지 않은 배열을 출력하려고 함
//		
		
		//===============================//
		
		//NumberFormatException

//		String str = "자바"; // 문자열
//		
//		int num = Integer.parseInt(str);	//정적 메서드라 그냥 불러올 수 있음
//		// 문자열을 정수형태로 형변환하는 메서드
//		// 정수가 아닌 문자열을 정수로 변환 했다. 근데 되겠노?
//		
		
		// ArrayIndexOutOfBoundsException
//		int[] arr = {1, 2, 3, 4};
//	
//		for (int i = 0 ; i<=arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("============================");
//		
		int result = 0;
		
		
		// try - catch 문 기본구조
		// try {
		// 	예외가 발생할 가능성이 있는 코드
		//} catch(예외클래스 e){
		//		예외 처리 코드
		//}
		
//		result = 10/0; // 10을 0으로 나누었을 때 예외 발생
		
//		try {
//			result = 10/0; // 10을 0으로 나누었을 때 예외 발생
//		} catch (ArithmeticException e) {	//e는 단순한 변수명임
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		
//		String str = "자바";
//		
//		try {
//		int num = Integer.parseInt(str);
//		} catch(NumberFormatException e) {
//			e.printStackTrace();// 어떤 예외가 발생했는지 출력 해주는 메소드
//			System.out.println("정수로 변환할 수 없습니다.");
//		}
		
//		int[] arr = {1, 2, 3, 4};
//		
//		try {
//			
//		
//		for (int i=0; i<=arr.length;i++) {
//			System.out.println(arr[i]);
//			}
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위를 초과하였습니다.");
//		}
		
		
		
//		String[] strArray = null;
//		try {
//		System.out.println(strArray[0]);
//		} catch(NullPointerException e) {
//			System.out.println("객체를 생성하지 않았습니다.");
//			System.out.println("출력하려는 값이 null 입니다.");
//		}
		
		// 다중 catch 문
		// 다중 catch 문을 사용하여 예외별로 예외 처리 코드를 다르게 작성하여 다양한 예외 처리 가능
		// 단, 가장 먼저 발생한 예외를 먼저 처리
//		String str = "자바";
//		int[] arr = {1, 2, 3, 4};
//		
//		try {
//		int num = Integer.parseInt(str);	// 정수가 아닌 문자를 정수로 변환할 때 #예외1
//		System.out.println(arr[4]);			// 인덱스 범위를 초과 #예외2
//		// 둘이 같이 실행하면 첫번째 오류만뜸 
//		} catch(NumberFormatException e) {
//			System.out.println("첫예외1");
//			System.out.println("정수로 변환할 수 없습니다.");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.err.println("두번 째 예외 ");
//			System.err.println("배열의 크기를 초과했습니다.");
//		}
//		int[] arr = {1, 2, 3, 4};
//		
//		
//		try {
//			System.out.println(arr[4]);
//		} catch(Exception e) {
//			e.printStackTrace();//어떤 예외가 발생했는지 확인
//			System.out.println("예외가 발생함");
//		} //catch(ArrayIndexOutOfBoundsException) {
			
		//}
		//최상위 예외뒤에 캐치문을 쓰면 오류가 뜨니 맨 마지막에 작성함(에러가 여러개라면)
		
//		int[] arr = {1, 2, 3, 4};
//	
//	
//		try {
//			System.out.println(arr[3]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 크기를 초과했습니다.");
//		} finally {
//			System.out.println("배열의 크기를 초과했어도 실행해라 아니어도 실행해라");
//		}
		
		
		Throws thr = new Throws();
		
		try {
		thr.divideThrows(10, 0);// 10, 0 이면 예외가 발생
		} catch (ArithmeticException e) {
			System.out.println("y에 0을 넣을 수 없습니다.");
		}
		
		
		
		
		}
}
