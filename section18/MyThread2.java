package section18;
// Runnable 인터페이스 구현
public class MyThread2 implements Runnable{
//    @Override
//    public void run() {
//        int sum = 0;
//        for (int i = 0; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("sum = "+sum);
//        String threadName = Thread.currentThread().getName();
//        System.out.println("우리가 만든 스레드 이름 : "+threadName);
//    //runable에서는 setName 사용 못함. runable 인터페이스에는 run메소드만 정의 되어 있기 때문에
//        // thread 클래스에 name필드의 setter, getter 가 있다.
//    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
