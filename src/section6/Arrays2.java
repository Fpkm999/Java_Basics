package section6;

import java.util.Arrays;

/*
 TITLE : 배열 공부2
 */
public class Arrays2 {
	public static void main(String[] args) {

		// Arrays 클래스를 이용해서 배열의 기능을 활용
		// 메서드란 : 기능
		// 배열의 출력을 하는 기능(메서드)
		// Arrays.toString(배열변수명) : 배열의 출력을 담당함

		int[] arr = {10, 4, 29, 26, 21, 29, 14, 28, 26, 14};
//		int[] arr7 = {10, 4, 29, 26, 21, 29, 14, 28, 26, 14};

		System.out.println(Arrays.toString(arr));
		// result
		// [10, 4, 29, 26, 21, 29, 14, 28, 26, 14]
		// 반복문 도움 없이 출력할 수 있고, 문자열(String) 형태로 변환
		// for 문 돌려서 일일히 출력할 필요없음

		System.out.println("==========================================");

//		// 배열의 정렬
//		// Arrays.sort(배열변수명)
//		Arrays.sort(arr); // arr 배열을 정렬시킨다.
//		System.out.println("오름차순 정렬 : " +Arrays.toString(arr));
//

		// 배열의 복사
		// 앑은 복사
//		int[] arr1 = {1, 2, 3};
//		int[] arr2 = arr1;
//
//		arr2[1] = 10;
//
//		System.out.println("arr1 : " + Arrays.toString(arr1));
//		System.out.println("arr2 : " + Arrays.toString(arr2));
//		System.out.println("arr1 : " + arr1);
//		System.out.println("arr2 : " + arr2);
//		/*
//		 * arr1 : [1, 10, 3]
//		 * arr2 : [1, 10, 3]
//		 * arr1 : [I@7276c8cd
//		 * arr2 : [I@7276c8cd
//		 */
//
		// 깊은 복사
		// Arrays.copyOf(배열, 복사범위)
//		int[] arr1 = { 1, 2, 3 };
//
//		int[] arr2 = Arrays.copyOf(arr1, arr1.length);//arr1의 길이 만큼 복사. 숫자로 해도 되지만 이렇게 하면 깔끔하고 오류가 생길 일이 없다
//
//		arr2[1] = 10;
//
//		System.out.println("arr1 : " + Arrays.toString(arr1));
//		System.out.println("arr2 : " + Arrays.toString(arr2));


		// 2차원 배열
		// 기본 구조 : int[][] arr = new int[행개수][열개수];
		/*
		 * int[][] arr = {
		 * 			{1, 2, 3, 4},
		 * 			{5, 6, 7}, <-- 1개씩 빠질수도 있다 그래도 됨
		 * 			{9, 10, 11, 12};
		 * }//3행 4열
		 */
//		int[][] arr = {
//				 		{1, 2, 3, 4},
//						{5, 6, 7, 8},
//				 		{9, 10, 11, 12}
//		};
//		System.out.println(arr.length); // 행의 개수가 나옴
//		System.out.println(arr[arr[1].length]);// 행에~열 번째. 0번째 행에 열의 개수임 이건

		/*
		 * 예제 : 이중 for 문을 이용해서 5 X 5 배열을 생성하고 1부터 25 숫자를 넣어서 출력
		 *
		 * 예상 출력
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 */
//		int[][] arr = new int[5][5];
//		int num = 1;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] =num;
//				System.out.print(arr[i][j]+" ");
//				num++;
//			}
//			System.out.println();
//		}
	}
}
