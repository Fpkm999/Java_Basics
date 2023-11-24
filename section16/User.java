package section16;

public class User<T> {
    private T height; // Key 값이 숫자가 올지 소수가 올지 문자가 올지 모르지 최상위 클래스로 어떤값이 들어갈지 모를때 오브젝트하면됨

    public T getHeight() {
        return height;
    }
    public void setHeight(T height){
        this.height = height;
    }

    // T자리에 Object가 박힘
    // 제네릭은 데이터 타입을 일반화 해줌.
//     클래스나 메서드 정의 시 일반화하여 사용할 데이터 타입을 컴파일 할 때 미리 지정
}
