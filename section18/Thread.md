Thread : 클래스

Runnable : 인터페이스

Thread 는 Runnable에 상속을 받음
Runnalbe에는 run() 라는 추상 메서드가 있기 때문에 Threa클래스에서 오버라이딩 되어 있음

```java
    @Override
    public void run() {
        Runnable task = holder.task;
        if (task != null) {
            Object bindings = scopedValueBindings();
            runWith(bindings, task);
        }
    }
```
참고 File
`Runnable.java`
`Thread.java`

---
> 2023-11-30
> ㅇㅋㅇㅋ
> 

