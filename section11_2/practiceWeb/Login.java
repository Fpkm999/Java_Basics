package section11_2.practiceWeb;

public class Login extends Join {

		
	public void login(String loginId,String loginPw) {
		if(super.joinId.equals(loginId)) {
			if(super.joinPw.equals(loginPw)) {	
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
	}
}
