package project1;

import java.util.Scanner;

/*
TITLE : 가위바위보 게임
설명 : 두 사람이 하는 가위바위보 게임을 만들어보자.
두 사람의 이름은 '철수'와 '영희'이다. 머저 "철수 >>"를 출력하고 "가위","바위","보" 중 하나를 문자열로 입력 받는다.
그리고 "영희 >>"를 출력하고 마찬가지로 입력받는다.
입력 받는 문자열을 비교하여 누가 이겼는지 판별하여 승자를 출력한다.
 https://blog.naver.com/mctlab/222049436662
 */
public class Exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 가위, 바위, 보 중 하나를 입력하세요 ===");

        System.out.println("철수 >>");
        String var1 = sc.next();

        System.out.println("영희 >>");
        String var2 = sc.next();

        if(var1.equals("가위") && var2.equals("보") ||
                var1.equals("보") && var2.equals("묵") ||
                var1.equals("바위") && var2.equals("가위")) {
            System.out.println("철수가 이겼습니다.");
        } else if(var2.equals("가위") && var1.equals("보") ||
                    var2.equals("보") && var1.equals("묵") ||
                    var2.equals("바위") && var1.equals("가위")) {
            System.out.println("영희가 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
    }
}
/**
 *
 */
