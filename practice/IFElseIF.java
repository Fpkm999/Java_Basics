package practice;

public class IFElseIF {

	public static void main(String[] args) {
		// Scanner 클래스로 int 값을 받아와
		// 경우1 : 5 보다 크면 좋아하는 숫자가 5보다 큽니다.
		// 경우2 : 5 보다 작으면 좋아하는 숫자가 5보다 작습니다.
		// 경우3 : 좋아하는 숫자가 5입니다.
//		Scanner sc = new Scanner(System.in);
//		
//		int favoriteNumber = sc.nextInt();
//		
//		if (favoriteNumber > 5) {
//			System.out.println("좋아하는 숫자가 5보다 큽니다.");
//		} else if (favoriteNumber < 5) {
//			System.out.println("5 보다 작으면 좋아하는 숫자가 5보다 작습니다.");
//		} else {
//			System.out.println("좋아하는 숫자가 5입니다.");
//		}
//		
//		System.out.println("======================================");
//		
//		
//		for (int i = 2; i < 10; i++) {
//			for (int j= 1; j<10; j++) {
//				System.out.print(i+" X "+j+" = "+i*j+"  ");
//			}
//			System.out.println("");
//		}
		
		//별 찍기
		
//		for (int i = 1; i<5 ; i++) {
//			for (int j = 5 ; j>i ; j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
		
//		for (int i = 0; i<5 ; i++) {
//			for (int j = 0 ; j<=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
		int[][] arr = new int[5][5];
		int result = 1;
		
		for (int i=0 ; i<arr.length; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				arr[i][j] = result;
				result++;
				System.out.print(arr[i][j]+" ");

			}
			System.out.println("");
		}
		
	}

}
