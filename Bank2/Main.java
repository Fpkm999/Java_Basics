package Bank2;

public class Main {
    public static void main(String[] args) {


    Bank b = new Bank();

    Thread t1 = new Thread(new MyThread(b));
    // plus 메서드만 호출
    Thread t2 = new Thread(new MyThread2(b));
    // minus 메서드만 호출
    t1.start();
    t2.start();

    }
}