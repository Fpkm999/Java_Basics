package section18;
// Runnable 인터페이스 구현
public class MyThread2 implements Runnable{
    @Override
    public void run() {

        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = "+sum);
        String threadName = Thread.currentThread().getName();
        System.out.println("우리가 만든 스레드 이름 : "+threadName);

        // runnable을 implements한 클래스에서는 setName,getName 사용 못함.
        // runnable 인터페이스에는 run 메소드만 정의 되어 있기 때문에
        // thread 클래스에 name필드의 setter, getter 가 정의 되어 있어서 사용 가능하다.
        /*
        Runnable 을 상속한 클래스는 어떻게 해야 이름을 불러올 수 있을까?
         */
    }

//    @Override
//    public void run() {
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
}
