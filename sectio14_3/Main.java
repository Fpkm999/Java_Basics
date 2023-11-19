package sectio14_3;

public class Main {

	public static void main(String[] args) {
//		
//		Practice pr = new Practice();
//		pr.divide1(10, 0);
//		
//		Practice pr2 = new Practice();
////		new ArithmeticException();
//		
//		try {		
//				pr2.divide2(10, 0);
//		} catch (ArithmeticException e) {
//			System.out.println("수식 예외");
//		}
		
		// 다중 catch
		String str = "자바";
		int[] arr = {1, 2, 3};
		String[] strArray = null;

		try {
		int num = Integer.parseInt(str);
		System.out.println(arr[3]);
		System.out.println(strArray[0]);
		
		// 다중 catch 문으로 처리하고 마지막에는 Exception 으로 처리 해보자
		} catch (NumberFormatException e) {
			System.out.println("문자를 숫자로 변환 할 수 없음");
		} catch (ArrayIndexOutOfBoundsException e) {	
			System.out.println("인덱스 범위 초과");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (Exception e) {
			System.out.println("모든 예외 쉴드");
			e.printStackTrace();
		}
	}
}
