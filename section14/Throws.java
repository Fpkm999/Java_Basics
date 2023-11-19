package section14;

public class Throws {
	// 예외를 메서드 내부에서 직접 처리한 경우
	public int divideTryCatch(int x, int y) {
		int result = 0;
		
		try {
		result = x / y;
		} catch(ArithmeticException e) {
			System.out.println("y에 0을 넣을 수 없습니다.");
		}
		return result;
	}
		// 예외를 호출한 쪽으로 던지는 경우
		public int divideThrows(int x, int y) throws ArithmeticException {
			return x/y;
	
	}
	
}
