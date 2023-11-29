package section16.Collection;
// List를 사용한 간단한 예제 테스트
// List를 사용하여 문자열을 저장하고, 문자열을 추가해보고 반복문을 통해 출력해봄
import java.util.ArrayList;
import java.util.List;

public class ListTest  {
    public static void main(String[] args) {
        // String을 저장할 수 있는 ArrayList 생성
        List<String> stringList = new ArrayList<>();

        // 리스트에 문자열 추가
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

        // 리스트의 크기 출력
        System.out.println("리스트의 크기: " + stringList.size());

        // 리스트의 모든 요소 출력
        System.out.println("리스트의 모든 요소:");
        for (String language : stringList) {
            System.out.println(language);
        }

        // 리스트에서 요소 제거
        stringList.remove("C++");

        // 제거 후 리스트의 크기 출력
        System.out.println("C++를 제거한 후 리스트의 크기: " + stringList.size());
    }
}
