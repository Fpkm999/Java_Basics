package web;
//다형성 이해 총집합
public class Main {

	public static void main(String[] args) {
		Join db = new Join(); // 클래스 자동 형변환
		Login join = new Login();
		
		db = join; // join의 주소값이 db에 들어간다.
		// 주소값이 달라서 안되었던 것임. 참조변수의 대입은 주소값을 대입하는 것임
		
		
		db.join("oh", "12345", true);
		join.login("oh", "12345");
	
		System.out.println(db);
		System.out.println(join);
//		
//		String s1 = new String("문자");
//		String s2 = new String("문자");
//		System.out.println(s1==s2);
	}

}
