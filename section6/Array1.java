package section6;
/*
 TITLE : 배열 공부
 */
public class Array1 {
	public static void main(String[] args) {
		// 배열의 선언
		// 자료형[] 변수명;
		// String int long ... 등 자료형 다됨
//		int[] arr; //배열을 만들때는 arr을 고정으로 만들고 구분이 필요할때 userArr 등으로 arr 앞에 단어를 붙임(카멜표기국룰)
//		//int 자료형 배열을 선열
//		int arr[]; // int[] arr과의 차이점은 가독성

//		// 배열의 생성
//		arr = new int[4];
//		// 혹은
//		int[] arr2 = new int[4]; // 배열의 크기만 생성 
//		
//		// 배열의 선언과 생성을 하면서 값 대입
//		int[] arr3 = {1, 2, 3, 4}; //바로바로 값을 넣을때는 중괄호를 씀 여기선 제한없이 유동적으로 넣을수있음

//		System.out.println(arr);	//배열의 주소값 | 기본8가지 자료형을 제외한 것들은 주소를 참조한다. == 배열은 주소를 참조하니까 배열은 참조형 변수이다.


		System.out.println("======================================");
		// 컴퓨터는 셀때 0부터 셈 ex) 배열 인덱스


		// 인덱스로 배열의 값 저장
		// 변수명[인덱스] = 값

		System.out.println("변수명[인덱스] = 값 테스트");
		int[] arr$ = new int[4]; //new int[3] 으로 하면 배열범위를 초과했다고 예외가 뜬다.
		arr$[0] = 1;
		arr$[1] = 2;
		arr$[2] = 3;
		arr$[3] = 4;
		System.out.println("arr$[0] : "+arr$[0]);
		System.out.println("arr$[1] : "+arr$[1]);
		System.out.println("arr$[2] : "+arr$[2]);
		System.out.println("arr$[3] : "+arr$[3]);
		// result
		// 변수명[인덱스] = 값 테스트
		// arr$[0] : 1
		// arr$[1] : 2
		// arr$[2] : 3
		// arr$[3] : 4

		System.out.println("======================================");

		// 배열의 길이
		// 변수명.length
		int[] arr = new int[4];
		System.out.println(arr.length);	//배열의 길이
		// result : 4

		int[] arr2 = {1,2,3,4};
		System.out.println(arr2.length);
		// result : 4

		for (int i = 0 ; i<arr.length ; i++){
			arr[i] = i+1;
			System.out.println("arr["+i+"]의 값 : "+arr[i]);
		}
		// result
		// arr[0]의 값 : 1
		// arr[1]의 값 : 2
		// arr[2]의 값 : 3
		// arr[3]의 값 : 4
		System.out.println("======================================");

		// 배열의 초기값 : 값을 안주었을 떄 어떤 값이 있는가?

		int[] arr3 = new int[1];
		double[] arr4 = new double[1];
		String[] arr5 = new String[1];

		System.out.println("int 배열 초기값 : " +arr3[0]);
		System.out.println("double 배열 초기값 : " +arr4[0]);
		System.out.println("String 배열 초기값 : " +arr5[0]);

		// result
		// int 배열 초기값 : 0
		// double 배열 초기값 : 0.0
		// String 배열 초기값 : null

		System.out.println("======================================");

//		arr3[0] = "문자열"  // int 배열인데 String 문자열을 넣을 수 없음
//		int[] arr6 = {""}; // int 배열인데 String 문자타입을 넣을 수는 없음


		System.out.println("======================================");

		/*
		 * 예제 : for 문을 이용해서 배열 값에서 짝수의 합 구하기
		 *
		 * 예상 출력
		 * 10 4 29 26 21 29 14 28 26 14
		 * 배열의 짝수의 합 :122
		 */

		int[] arr7 = {10, 4, 29, 26, 21, 29, 14, 28, 26, 14};
		int sum = 0;

		for(int i=0 ; i<arr7.length ; i++){
			if (arr7[i] %2 == 0){
				sum+= arr7[i];
			}
		}
		System.out.println("배열의 짝수의 합 : "+sum);
		// result
		// 배열의 짝수의 합 : 122

		System.out.println("======================================");

		int sum1 = 0;

		for (int i = 0; i < arr7.length; i++) {
			System.out.print(arr7[i]+" ");
			if(arr7[i]%2 == 0) {
				sum1 += arr7[i];
			}

		}
		System.out.println("");
		System.out.println("배열의 짝수의 합 : "+sum1);
		// result
		// 10 4 29 26 21 29 14 28 26 14
		// 배열의 짝수의 합 : 122
	}
}
