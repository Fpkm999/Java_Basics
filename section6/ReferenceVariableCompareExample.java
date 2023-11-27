package section6;

public class ReferenceVariableCompareExample {
    public static void main(String[] args){
        int[] arr1; // 배열 변수 arr1 선언
        int[] arr2; // 배열ㅌ 변수 arr2 선언
        int[] arr3; // 배열 변수 arr3 선언
        int[] arr4 = {1,2,3};

        arr1 = new int[] {1,2,3};   //배열 {1,2,3} 을 생성하고 arr1변수에 대입
        arr2 = new int[] {1,2,3};   // 배열 {1,2,3} 을 생성하고 arr2 변수에 대입
        arr3 = arr2;        // 배열 변수 arr2의 값을 배열 변수 arr3 에 대입 <-- 얇은 복사

        System.out.println("arr1==arr2 의 결과 : "+(arr1==arr2));  // false
        System.out.println("arr2==arr3 의 결과 : "+(arr2==arr3));  // true
        System.out.println("arr2==arr3 의 결과 : "+(arr1==arr4));  // false

        // 주소값
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr4);

    }
}
