package Bank;

public class MyThreadRunnable implements Runnable{

    Bank b;
    Bank f;
    String c;
    public MyThreadRunnable(Bank b){
        this.b = b;
    }

//    @Override
//    public void run() {
//        for (int i = 0; i <  10 ; i++) {
//            b.money += 1000;
//            System.out.println(Thread.currentThread().getName()+" : "+b.money);
//
//            try {
//                Thread.sleep(1000); // 주어진 시간동안 스레드를 정지 (1/1000초)
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    @Override
    public void run() {
        synchronized (b) {  // 특정 실행 대상을 동기화
            for (int i = 0; i <  10 ; i++) {
                b.money += 1000;
                System.out.println(Thread.currentThread().getName()+" : "+b.money);

                try {
                    Thread.sleep(1000); // 주어진 시간동안 스레드를 정지 (1/1000초)
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
