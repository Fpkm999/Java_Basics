package project1;

import java.util.Scanner;

/*
알파벳 하나를 입력 받아 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력하는 프로그램
 */
public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳 하나를 입력하세요. >>> ");
        String s = sc.next(); // 입력 : e
        char c =s.charAt(0); // 문자열의 원하는 문자를 추출하는 메소드.

        //int i =0, i<= 101-097; i++ 즉, int i=0;i<=4;i++
        //int j = 'a'; j<= e-i ; j++; 즉 j=97; j<=101-i ; j++, j가 97부터시작하므로 abcde
        for (int i = 0; i <= c-'a'; i++){// 입력받은 알파벳보다
            for(char j = 'a'; j <= c-i ; j++){ //a부터 시작해 입력받은 알파벳 -1까지 출력
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
/**
 * 아스키코드표를 보면
 * 소문자 알파벳 기준 제일 작은 a의 경우 97이다. 소문자 a를 97로 보고 입력할 알파벳도 아스키 코드 숫자로 보면 이해가 쉬운데
 * 먼저 첫번째 for문에서 몇번을 실행 할건지 제일 작은 a까지 실행하면 되므로 입력한 문자-'a' 번째 까지 실행하도록 한다.
 * 두번 째 for문에서는 낮은 문자 모두 출력해야 하므로 print문을 이용하고 j값이 a로 시작해 j가 입력한알파멧-i번째 실행되도록 하면
 * 차례대로 낮은 알파벳문자 모두 출력할 수 있다.
 */