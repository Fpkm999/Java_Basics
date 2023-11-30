package Bank2;

public class MyThread2 implements Runnable {
    Bank b;
//    String C;
    public MyThread2(Bank b){
        this.b = b;
    }
    // Runnable 인터페이스에 추상메서드로 run 메서드가
    // 있기 때문에 오버라이딩 해줘야함
    @Override
    public void run() {
        while (true) {
            b.minus();
        }
    }
}
