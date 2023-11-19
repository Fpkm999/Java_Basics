package section10;

public class Apple extends Phone{
	@Override
	void info(){
		System.out.println("애플 : "+super.brand+", 시리즈 : " +super.series+ ", 색상 : "+super.color);
	}
}
