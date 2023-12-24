package project1;

import java.util.Scanner;

/*
숫자 3개 중 중간값 출력하기
 */
public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 정수 3개를 입력받기 위해 Scanner 사용
        System.out.print("정수 3개 입력 : >> ");

        int a = sc.nextInt(); // 11
        int b = sc.nextInt(); // 12
        int c = sc.nextInt(); // 13
        // 정수 3개를 a,b,c 각각 입력을 Scanner을 통해서 받는다
        int temp = 0;

        // temp 변수라는 빈 공간에 a 부터 넣고 작은 순서대로 바꿔준다.
        temp = a; //11
        a = b;
        b = temp;

        temp = b;
        b = c;
        c = temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("중간값 : "+b);
        // https://blog.naver.com/mctlab/222050361407
    }
}
