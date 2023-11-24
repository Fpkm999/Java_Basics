package section6;

import java.util.Arrays;
/*
 TITLE : 배열 공부2
 */
public class Arrays1 {
	public static void main(String[] args) {

		// TITLE : Arrays
		// Arrays 클래스를 이용해서 배열의 기능을 활용
		// 메서드란 : 기능

		// 배열의 출력을 하는 기능(메서드)
		// Arrays.toString(배열변수명) : 배열의 출력을 담당함

		int[] arr = {10, 4, 29, 26, 21, 29, 14, 28, 26, 14};

		System.out.println(Arrays.toString(arr));
		// result
		// [10, 4, 29, 26, 21, 29, 14, 28, 26, 14]
		// 반복문 도움 없이 출력할 수 있고, 문자열(String) 형태로 변환
		// for 문 돌려서 일일히 출력할 필요없음

		System.out.println("==========================================");

//		// 배열의 정렬
//		// Arrays.sort(배열변수명)
		Arrays.sort(arr); // arr 배열을 정렬시킨다.

		System.out.println("오름차순 정렬 : "+Arrays.toString(arr));
		// result
		// 오름차순 정렬 : [4, 10, 14, 14, 21, 26, 26, 28, 29, 29]

		int[] intArr = new int[] {1,3,5,2,4};
		double[] doubletArr = new double[] {1.1, 3.3, 5.5, 2.2, 4.4};
		String[] stringArr = new String[] {"A","C","F","E","D"};

		// 전체 정렬
		Arrays.sort(intArr);
		Arrays.sort(doubletArr);
		Arrays.sort(stringArr);

		// 부분 정렬
		Arrays.sort(intArr, 1, 4);

		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(doubletArr));
		System.out.println(Arrays.toString(stringArr));


		// result
		// [1, 2, 3, 4, 5]
		// [1.1, 2.2, 3.3, 4.4, 5.5]
		// [A, C, D, E, F]

		System.out.println("==========================================");

		// 배열의 복사
		// 얇은 복사
		// 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 함께 변경
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;

		arr2[1] = 10;
		System.out.println("배열의 얇은 복사");
		System.out.println("arr1 : "+ Arrays.toString(arr1));
		System.out.println("arr2 : "+ Arrays.toString(arr2));

		System.out.println("arr1 : " +arr1);
		System.out.println("arr2 : "+arr2);

		// result
		// 배열의 얇은 복사
		// arr1 : [1, 10, 3]
		// arr2 : [1, 10, 3]
		// arr1 : [I@6f496d9f
		// arr2 : [I@6f496d9f


		// 깊은 복사
		// 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 바뀌지 않음
		// Arrays.copyOf(배열, 복사범위)

		System.out.println("배열의 깊은 복사");

		int[] arr3 = {1, 2, 3};

		int[] arr4 = Arrays.copyOf(arr3,arr3.length);
		//arr3의 길이 만큼 복사. 숫자로 해도 되지만 이렇게 메소드를 이용하면 깔끔하고 오류가 생길 일이 없다.

		arr4[0] = 10;
		System.out.println("arr3 : "+Arrays.toString(arr3));
		System.out.println("arr4 : "+Arrays.toString(arr4));

		System.out.println("==========================================");

		// TITLE : 2차원 배열
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

		int[][] arr5 = new int[5][5];
		int num = 1;

		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] =num;
				System.out.print(arr5[i][j]+" ");
				num++;
			}
			System.out.println();
		}
	}
}
