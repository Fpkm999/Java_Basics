package section10;

public  class Bus extends Car{
	@Override
	public void ride() {
		super.ride();
		System.out.println("버스가 주행합니다.");
	}
}
