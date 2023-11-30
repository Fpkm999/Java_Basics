package Bank;

public class Main {
    public static void main(String[] args) {


    Bank b = new Bank();

    Runnable mtr = new MyThreadRunnable(b);

    Thread th1 = new Thread(mtr);   // 쓰레드 1개 만듬

    Thread th2 = new Thread(mtr); // 스레드 2개 만듬

        th1.start();
        th2.start(); // 비동기 작업
    }
}
