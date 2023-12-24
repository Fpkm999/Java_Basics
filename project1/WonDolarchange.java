package project1;

import java.util.Scanner;

/*
자바 환률 계산기
 */
public class WonDolarchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 원화를 입력받기 위해 Scanner를 사용함
        System.out.print("원화를 입력하세요(단위 : 원)>>"); // 화면에 출력할 문구
        int won = sc.nextInt(); // 원화를 int로 받음

        double dollar = (double)won/1300;   //원을 달러로 변환. 2023-12-20일 기준 환률 1299.86원. 편의상 1300원으로함
//        System.out.println(won+"원은 $"+dollar+"입니다.");
        System.out.printf("%d원은 $ %.2f 입니다.",won,dollar);
    }
}
/**
 * 달러를 double형으로 하는 이유 : 원화와 달리 달러는 소수가 나올 수 있기 때문이다.
 * 결과값으로 println을 사용하지 않고 printf를 사용한 이유 : 원-달러 환전시 소수점이 많이 나와 2째 자리 까지만 나오도록 하기 위해서
 */