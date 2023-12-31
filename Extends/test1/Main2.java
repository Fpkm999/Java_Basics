package Extends.test1;

public class Main2 {
    public static void main(String[] args) {

        Car2 car2 = new Bus2();
        // 자식 클래스가 개별적으로 추가한 멤버는 사용이 불가능하다
        // car2.name
        // car2.stop() 둘다 불가능함

        // 오버라이딩한 메서드를 호출
        car2.ride();
//        car2.stop(); 형변환시 자식 클래스의 메서드는 호출 불가능
//        car2.name; 형변환 시 자식 필드도 호출 불가능

        /*
        부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다.
        자식 객체의 멤버들을 사용하고 싶다면 형벼환을 다시 해줘야 가능하다 (자식 타입으로)

         1. 객체들끼리도 형변환이 가능하다. 단, 상속 관계에 있었을 때만 가능 하다.
         2. 부모타입으로 자식타입의 객체를 참조할 때는 묵시적으로 형변환이 일어난다.
         3. 부모타입 객체를 자식타입으로 참조하게 할때 명시적 형변환을 해줘야한다.
         단, 이렇게 형변환을 시도할땐 부모가 참초하는 인스턴스가 형변환하려는 자식타입일 때만 가능하다.
             */
    }
}
