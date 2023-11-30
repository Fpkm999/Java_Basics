package section18;

import Bank.Bank;

public class Main {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();   // 쓰레드 현재 이름을 알려 주는 메서드
        System.out.println("Thread.currentThread().getName 테스트");
        System.out.println("현재 쓰레드 이름 : "+threadName);  // result : main
        // main 메서드의 스레드
        // 지금까지 만든 자바들은 하나의 프로세스에서 하나의 스레드에 의해 동작이 기본

        System.out.println("======================");
        // 스레드의 사용
        // #1 START
//        MyThread th = new MyThread();   // run이라는 메서드를 실행하기 위해 객체 생성
//        th.start();
//      th.run();
        // #1 END
        System.out.println("======================");
        // #2 START
//        MyThread th2 = new MyThread();
//        th2.start();
        // #2 END

        // #3 START
        MyThread th3 = new MyThread();
        th3.start();
        // #3 END

        // 여기까지가 Thread를 상속해서 구현한 케이스
        System.out.println("======================");

        Runnable th4 = new MyThread2(); // Runnable 타입으로 선언
        MyThread2 mt1 = new MyThread2();
        Thread th5 = new Thread(new MyThread2()); // 이건 된다!

        MyThread2 mt2 = new MyThread2();
        Thread th6 = new Thread(mt2);
        /*
        th4 : setter, getter name 불가능
        mt1 : setter, getter name 불가능
        th5 : setter, getter name 가능 <-- Runnable 상속을 받았는데 setName 쓰고 싶다면 이렇게 하자.
        th6 : setter, getter name 불가능
         */

        th5.setName("\n"+"마이스레드2 이름");
//        th5.setName(""); // thread 타입으로 선언해서 SetName(), getName() 사용가능

        System.out.println(th5.getName());
        th5.start();

////        th2.run();


    }
}
