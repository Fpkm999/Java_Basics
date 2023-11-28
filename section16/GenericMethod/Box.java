package section16.GenericMethod;

public class Box<T> {
    // 필드
    private T t;

    // getter 메소드
    public T get(){
        return t;
    }
    // setter 메소드
    public void set(T t){
        this.t = t;
    }
}
