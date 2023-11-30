package section18;
// Thread 클래스를 상속하여 run() 메서드 구현
public class MyThread extends Thread{   // Thread 클래스를 상속 받음 thread의 메서드를 오버라이딩가능해짐
//    @Override
//    public void run() {
////        super.run(); <-- 자동생성되는데 필요없다면 지워도 됨
//        int sum = 0;
//        for (int i = 0; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("sum : " +sum);
//        String threadNam = Thread.currentThread().getName();
//        System.out.println("우리가 만든 스레드 이름 : "+threadNam);
//    }
//    @Override
//    public void run(){
//        setName("마이스레드 이름");
//        String threadNam = Thread.currentThread().getName();
//        System.out.println("우리가 만든 스레드 이름 : "+threadNam);
//    }
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
