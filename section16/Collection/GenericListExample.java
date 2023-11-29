package section16.Collection;

import java.util.ArrayList;
import java.util.List;

// 제네릭을 사용한 클래스
class MyGenericList<T> {
    private List<T> elements = new ArrayList<>();

    // 리스트에 요소 추가
    public void addElement(T element) {
        elements.add(element);
    }

    // 리스트의 모든 요소 출력
    public void printElements() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}

public class GenericListExample {
    public static void main(String[] args) {
        // MyGenericList를 사용하여 String을 저장하는 리스트 생성
        MyGenericList<String> stringList = new MyGenericList<>();

        // 리스트에 문자열 추가
        stringList.addElement("Java");
        stringList.addElement("Python");
        stringList.addElement("C++");

        // 문자열 리스트 출력
        System.out.println("문자열 리스트:");
        stringList.printElements();

        // MyGenericList를 사용하여 Integer를 저장하는 리스트 생성
        MyGenericList<Integer> integerList = new MyGenericList<>();

        // 리스트에 정수 추가
        integerList.addElement(42);
        integerList.addElement(123);
        integerList.addElement(7);

        // 정수 리스트 출력
        System.out.println("\n정수 리스트:");
        integerList.printElements();

    }
}

