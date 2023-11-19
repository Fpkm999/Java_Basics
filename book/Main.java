package book;

public class Main {

	public static void main(String[] args) {
		Book[] bookArr = new Book[3];
		bookArr[0] = new Comic();
		bookArr[1] = new Fantasy();
		bookArr[2] = new Horror();

		// 이렇게도 된다.
		Book[] BookArr2 = {new Comic(), new Fantasy(), new Horror()};
		
		for (int i = 0; i < bookArr.length; i++) {
			bookArr[i].read();
		}
		
	}

}
