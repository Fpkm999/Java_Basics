package section11_2.practiceWeb;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Join 클래스는 Database 클래스에 상속받음
		// Login 클래스는 Join 클래스에 상속받음
		// Database 클래스에 필드
		// String joinId, String joinPw, boolean agree
		// Join 클래스에 join 메서드
		// 매개변수 joinId, joinPw, agree
		// join 메서드 호출 시 Database 필드에 값 대입
		// 단, agree 가 false 시 이용양관에 동의하세요.
		// Login 클래스에 login 메서드
		// 매개변수 loginId, loginPw
		// login 메서드 호출 시 loginId, loginPw가 일치시에만 로그인성공
		// 아이디가 존재하지 않을 경우 아이디가 존재하지 않습니다.
		// 아이디는 맞는데 비밀번호가 다르면 비밀번호가 일치하지 않습니다.
		// 단, loginId와 loginPw는 Scanner 통해 직접 입력받음
		Scanner sc = new Scanner(System.in);
		String joinId = sc.nextLine();
		String joinPw = sc.nextLine();
		
		
		String loginId = sc.nextLine();
		String loginPw = sc.nextLine();
		sc.close();

		
	
		Join join = new Join();
		
		Login login = new Login();
		
		
		join=login;

		join.join(joinId, joinPw, true);

		login.login(loginId, loginPw);
		
	}

}
