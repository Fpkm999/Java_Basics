package section10;

public class Apple extends Phone{

	@Override
	void info() {
		System.out.println("애플,"+super.brand+" "+super.series+" "+super.color);
	}
}
