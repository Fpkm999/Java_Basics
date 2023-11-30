package Bank2;

public class Bank {
    // notify : 대기 중인 스레드를 다시 동작
    // wait : 스레드를 대기
    public synchronized void plus(){
        System.out.println("추가");
        notify();
        try {
            wait();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized void minus(){
        System.out.println("삭제");
        notify();
        try {
            wait();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
