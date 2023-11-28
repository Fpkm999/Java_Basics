package section15;

import section13.Calculator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 2023-11-21
        // 이제는 예제 없음
        // Object의 equals() 메서드
        // 객체의 값을 비교할 때 사용
        // String 비교는 엥간 하면 equals() 써라
//      Object ob = new Calculator(); 형변환 가능
        //객체를 동등 비교("=="할 경우 해당 객체의 값을 비교 하는 것이 아니라 객체의 주소 값을 비교함
        //객체의 값을 비교할 때는 equals()

        System.out.println("str 비교");
        String str1 = "hello";  // 실제 값을 저장
        String str2 = "hello"; // 실제 값을 저장
        String str3 = new String("hello"); // 주소 값을 저장

        System.out.println("str1 == str2 : "+(str1 == str2));   // 동등 비교
        System.out.println("str1 == str3 : "+(str1 == str3));   // 동등 비교

        System.out.println("str1.equals(str3) : " +str1.equals(str3));  // equals() 비교
        System.out.println("str2.equals(str3) : " +str2.equals(str3));  // equals() 비교

        System.out.println("===================toString() 메서드 테스트========================");

        // Object의 toString() 메서드
        // 객체의 정보를 문자열로 변환
        // 이 메소드의 반환값은 String 이다!
        User user = new User(); // 객체 생성
        System.out.println(user.toString());
//        section15.User@31221be2 @뒤에는 16진수 해시코드임
        System.out.println("====================================================================");

        user.setUserId("lee");
        user.setUserPw("1234");
        System.out.println(user.toString());
        System.out.println(user);

        System.out.println("==========CharAt() 메서드 테스트==================");
        // String 클래스의 CharAt() 메서드
        // 인덱스를 통해 원하는 위치의 문자를 문자열에서 추출
        String str = "Hello World";

        char charAt = str.charAt(2);    // 인덱스가 2인 자리에 문자 추출
        System.out.println("2번째 인덱스 문자 : "+charAt);

        System.out.println("=========indexOf() 메서드 테스트================");
        // String 클래스의 indexOf() 메서드
        // 문자열 중에서 특정 단어 또는 문장의 시작 위치를 알려 주는 메서드이다.
        String strTest1 = "Hello World World Jump";
        String str4 = "Hello World World";
//        str4.indexof
        System.out.println("World의 위치1 : "+strTest1.indexOf("World"));
        System.out.println("World의 위치 : "+str4.indexOf("World")); // 공백 포함
        // 0번째 인덱스 부터 검색
        System.out.println("World의 위치(10번째 인덱스부터) : " + str4.indexOf("World",10));
                                                                            //10번째 인덱스부터 검색
        System.out.println("World의 위치(13번째 인덱스부터) : "+ str4.indexOf("World",13));
                                                                            // 13번째 인덱스부터 검색해봐
                                                                            // -1이 떳는데 못찾은거임
        if(str4.indexOf("오세빈") == -1){
            System.out.println("이 글에는 오세빈이라는 글자가 없습니다.");
        }

        System.out.println("==========replaceAll() 메서드 테스트================");
        // String 클래스의 replaceAll() 메서드
        // 특정 문자 및 문자열을 원하는 단어로 변경해줌


//        str4.replaceAll()
        String replaceStr4 = str4.replaceAll("World","JAVA");// World를 JAVA로 변경
        System.out.println(replaceStr4);

        String replaceStrTest1 = strTest1.replaceAll("Jump","Dimitry");
        System.out.println("replaeAll() 테스트 : "+replaceStrTest1);

        System.out.println("====================================================================");
        // String 클래스의 substring() 메서드
        // 원하는 위치에서 문자열을 잘라서 사용

//        str4.substring()
        String substrStr4_1 = str4.substring(6); // 해당 인덱스 부터 마지막까지 추출해준다.
        System.out.println("문자열을 자름1 : "+substrStr4_1);

        String substrStr4_2 = str4.substring(6,10);     // 앞에 인덱스부터 마지막 인덱스 전까지 추출함. 주의!!
        System.out.println("문자열을 자름2 : "+substrStr4_2);

        // 휴대폰 -(하이픈) 없이 입력하는 경우 많아짐
        String phoneNumber = "01012345678";
        // 010-1234-5678
        String phoneNumber_ = "010-4807-2708";
        String substStr_Phone1 = phoneNumber_.substring(0,3);
        String substStr_Phone2 = phoneNumber_.substring(4,8);
        String substStr_Phone3 = phoneNumber_.substring(9);
        System.out.println(substStr_Phone1+substStr_Phone2+substStr_Phone3);

        String Phone1 = phoneNumber.substring(0,3);
        String Phone2 = phoneNumber.substring(3,7);
        String Phone3 = phoneNumber.substring(7);

        String PhoneHypun = Phone1+"-" +Phone2+"-"+Phone3;
        System.out.println(PhoneHypun);

        System.out.println("====================================================================");
        String str5 = "안녕하세요";
        str5 += "반갑습니다.";
        System.out.println(str5);// 문자열 둘이 붙어버림
        // 기본 주소 버리고 안녕하세요반갑습니다라는 것을 저장한 새로운 주소가 생김
        str5.concat(new String("반갑습니다")); // 문자열을 붙이는 메소드
        // concat 메소드는  문자열을 붙이는데 새로운 주소를 만듬 얘는 기존주소도 살려서 이거 쓸때마다 계속 쌓임

        System.out.println("====================================================================");

        // StringBuilder 와 StringBuffer
        // 문자열이 수정 되면 기존의 메모리 주소에 할당된 값이 변경
        StringBuilder str6 = new StringBuilder("안녕하세요");
        StringBuilder str66 = new StringBuilder("이랏샤이마세"); // 테스트 StringBuilder
        System.out.println(str6); // 잘들어갔네. 여기까지는  String 과 다를게 없음
        System.out.println(str66);
        // 문자열 삽입
        str6.append("반갑습니다."); // 문자열을 뒤에 삽입(안녕하세요  뒤에)
        System.out.println(str6);   // str자체가 변함

        str66.append("-따자하오");   // 문자열 뒤에 삽입
        System.out.println(str66);

        // 문자열 삭제
        str6.delete(0,5); // 인덱스 0 부터 5 전까지 삭제
        System.out.println(str6); // result : 반갑습니다.

        // 원하는 위치에 문자열 삽입
        str6.insert(0,"안녕하세요"); // 원하는 위치, 삽입하고자 하는 문자열

        System.out.println(str6);
        // 이것들의 장점은 주소가 그대로 추가 생성을 안함

        // 문자를 반대로 변경
        str6.reverse();
        System.out.println(str6);

        /*
         String과 StringBuffer, StringBuilder 정리
        String : 한 번 생성된 문자열은 변경할 수 없으며, 문자열을 조작할 때마다 새로운 문자열을 생성함으로
        불변
        StringBuffer와 StringBuilder : 문자열을 조작해도 새로운 문자열을 생성 하지 않고 변경함 으로써 가변

        String과 StringBuffer, StringBuilder 사용

        String : 문자열 조작이 적은 경우 사용
        StringBuffer : 뒤에서 배울 스레드 환경에서 문자열 조작이 필요한 경우 사용
        StringBuilder : 스레드 환경을 고려하지 않고 문자열 조작이 필요한 경우 사용
        */

        System.out.println("====================================================================");
        /*
        Math 클래스
        수학에서 자주 사용하는 함수들을 사용할 수 있는 클래스
        객체를 선언하지 않고 바로 사용할 수 있도록 모든 메서드는 static 메서드로 구현되어 있음
        */
        System.out.println("올림 : "+Math.ceil(3.51)); // 올림

        System.out.println("버림 : "+Math.floor(13.61)); // 버림

        System.out.println("반올림 : "+ Math.round(12.8));

        System.out.println("절대값 : "+Math.abs(-44.5));

        System.out.println("최대값 : "+Math.max(10,20));

        System.out.println("최소값 : "+Math.min(10,20));

        System.out.println("====================================================================");

        // Wrapper 클래스
        // 기본타입의 데이터를 객체형으로 표현해야 하는경우
        // Wrapper 클래스 사용법1
        // 문자 타입의 데이터를 숫자 타입의 데이터로 변환할 때 사용
        String intStr = "70";
        String doubleStr = "80.2";

        int integerParse = Integer.parseInt(intStr); // 문자형태의 데이터를 정수형으로 변환
        double doubleParse = Double.parseDouble(doubleStr); // 문자형태의 데이터를 실수형으로 변환
        // 래퍼 클래스를 이용
//        Long.parseLong() 래퍼클래스는 8개인가 있는데 int, double정도만 쓰임

        System.out.println("문자열을 정수형태로 변환 : "+integerParse);
        System.out.println("문자열을 실수형태로 변환 : "+doubleParse);
        System.out.println(intStr.getClass().getName()); // 어떤 놈의 데이터 타입인지 확인 하는 메서드

        System.out.println("====================================================================");
        // java.lang 말고는 다 import 해줘야함

        System.out.println("====================================================================");
        // 현재 날짜 구하는 방법
        // 시스템 시계, 시스템 타임존      // 값을 안주면 현재 시스템 날짜
        LocalDate now = LocalDate.now(ZoneId.of("Europe/Paris")); //파리에 있는 날짜

        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        // MM 을 소문자 mm 으로 하면 안됨
        String formatNow = now.format(formatter);
        System.out.println(formatNow);

        // 현재 시간 구하기
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        DateTimeFormatter tformatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");

        String tformatNow = nowTime.format(tformatter);
        System.out.println(tformatNow);
    }
}
