package ExceptionTest.section14_2;

public class AgeMinusException extends Exception { // Exception을 상속하면 예외 클래스가 된다
	public AgeMinusException(String message) {
		super(message); //
	}
}