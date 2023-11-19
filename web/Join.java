package web;

public class Join extends Database {
	// 회원가입하는 메서드
	public void join(String joinId, String joinPw, boolean agree) {
		if(agree == true) {
			this.joinId = joinId;
			this.joinPw = joinPw;
			this.agree = agree;
			System.out.println("아이디 : "+ joinId+ ", 비밀번호 : "+joinPw
					+", 회원가입 정보 저장");
		}else {
			System.out.println("이용약관에 동의하세요.");
		}
	}

	
//	@Override
//	public void login(String loginId, String loginPw) {
//		System.out.println("===== 로그인 시도 =====");
//		super.login(loginId, loginPw);
//	}
}
