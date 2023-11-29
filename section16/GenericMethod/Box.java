package section16.GenericMethod;
/*
자바에서 제네릭 타입을 클래스명 자체로 사용하는 경우 일반적으로 해당 클래스가 제네릭 타입을 사용하고
있다는 것을 나타낸다.
제네릭은 클래스나 메서드에서 사용되는 데이터의 타입을 파라미터화하여 코드의 재사용성과 안정성을 높이는데 사용됩니다.

 */
public class Box<T> {
    // 필드
    private T t;
    private T content;

    // getter 메소드
    public T getBox(){
        return t;
    }
    // setter 메소드
    public void setBox(T t){
        this.t = t;
    }


    public void setContent(T content){
        this.content = content;
    }
    public T getContent(){
        return content;
    }

}
