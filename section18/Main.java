package section18;

import Bank.Bank;

public class Main {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();   // 쓰레드 현재 이름을 알려주는 메서드
//        System.out.println("현재 쓰레드 이름 : "+threadName);  // resule : main
        // main 메서드의 스레드
        // 하나의 프로세스에서 하나의 스레드에 의해 동작이 기본

        System.out.println("===============");
        // 스레드의 사용
        MyThread th = new MyThread();   // run이라는 메서드를 실행하기 위해 객체 생성
        th.start(); // 안만들었는데
//        th.run();
        System.out.println("===============");
//        Runnable th3 = new MyThread2(); 세터 게터 가능

//        MyThread2 mt2 = new MyThread2();    // 아래와 동일한거임
        Thread th2 = new Thread(new MyThread2());

        th2.start();
//        th2.setName("마이스레드2 이름");
//        th2.setName(); // thread 타입으로 선언했으니까 세터,게터 메소드 사용가능함

//        th2.run();
        System.out.println("===============");


    }
}
