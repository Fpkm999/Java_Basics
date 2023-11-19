package section12_2;

public class Air implements Heater, Cooler{
	
	public void heat() {
		System.out.println("더움");
	}
	public void cool() {
		System.out.println("추움");
	}
}
