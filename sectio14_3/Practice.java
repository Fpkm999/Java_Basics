package sectio14_3;

public class Practice {
	int result =0;
	
	public int divide1(int x, int y) {
		// 메서드 내에서 예외 처리
		try {
			result = x/y;
		} catch (ArithmeticException e) {
			System.out.println("수식 예외");
		}
		return result;
	}
	
	
	public int divide2 (int x, int y) throws ArithmeticException {
		// 호출 한 쪽에서 예외 처리
		return  (x/y);
	}
}
