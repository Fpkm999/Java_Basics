package section17;
// 람다식 인터페이스는 하나의 기능만 할 수 있다.
public class Main {
    public static void main(String[] args) {
        // 람다식을 이용한 익명 함수가 생성됨
        Math math = (num1,num2) -> {
            return num1 + num2;
        };

        Math math2 = (num1, num2) -> {
            return num1 * num2;
        };
        int sum = math.add(10,11);
        int multi = math2.add(10,11);
        System.out.println(sum);
        System.out.println(multi);
    }
}
