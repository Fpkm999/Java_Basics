package section16.GenericMethod;


public class GenericExample {
    // 제네릭 메소드
    public static <T> Box<T> boxing(T t) {  //제네릭 메소드 이름은 boxing boxing 매개변수값을 돌려주는 기능을 함
        Box<T> box = new Box<T>();
        box.setBox(t);
        return box;
    }

    public static void main(String[] args){
        // 제네릭 메소드 호출
        Box<Integer> box1 = boxing(100);    // Integer 타입으로 정함
        int intValue = box1.getBox();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.getBox();
        System.out.println(strValue);

        Box<Integer> box3 = boxing(2234);
        int value2 = box3.getBox(); //box3의 값을 얻음
        System.out.println(value2);


        System.out.println("====================");

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, World!");
        String content = stringBox.getContent();
        System.out.println(content);
    }

}
