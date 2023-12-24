package project1;

import java.util.Scanner;

/*
숫자 5개를 입력 받고 평균 구하기
 */
public class Exam2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print(a.length+"개의 정수를 입력하세요. >>>");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.print("5개의 정수의 평균은 >>>"+ (double)sum/a.length);
        sc.close();
    }
}
/**
 * 5개의 정수를 입력 받는다.
 * 정수를 담을 공간으로 배열을 사용한 이유 : 배열을 사용하지 않고 사용한다면 5개의 변수를 직접 만들어 줘야하고 for문을 이용해
 * 한번에 값을 넣기 힘들다.
 * length 메소드를 사용한 이유 : 문제에 5개라고 명시되어 있다. 그냥 5라고 해도 되지만 a배열의 크기가 5라고 왜 5인지 알 수 있도록 length 메소드를
 * 사용하였다.
 *
 * a 배열의 공간 : a[0],a[1],a[2],a[3],a[4]  총 5개
 */