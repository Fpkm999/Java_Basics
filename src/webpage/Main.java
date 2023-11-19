package webpage;

public class Main {

	public static void main(String[] args) {
		// 실행용
		
		// 아이디가 틀리면 아이디가 일치하지 않습니다.
		// 이이디가 맞으면 비밀번호 확인
		// 비밀번호가 틀리면 비밀번호가 일치하지 않습니다
		// 비밀번호가 맞으면 로그인 성공
		
		String joinId = "ohseebin";
		String joinPw = "12345";
		
		String loginId = "ohseebin";
		String loginPw = "123435";
		
		Join join = new Join(joinId, joinPw); // 객체 생성과 동시에 초기화
		Login login = new Login(loginId, loginPw);
		
		
		String joinIdField = join.joinId;
		String joinPwField = join.joinPassword;
		
		String loginIdField = login.loginId;
		String loginPwField = login.loginPassword;
		
		
		if (joinIdField == loginIdField) {
			if (joinPwField == loginPwField) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.err.println("아이디가 틀렸음");
			}
	
		System.out.println("==============================");
		
		
	}
}
