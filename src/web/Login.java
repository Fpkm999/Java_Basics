package web;

public class Login extends Join{
	// 로그인하는 메서드
		public void login(String loginId, String loginPw) {
			if(super.joinId == loginId) {
				if(super.joinPw == loginPw) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			//혹은
//			if(super.joinId == loginId && super.joinPw == loginPw)
//			@Override
//			public void join(String joinId, String joinPw, boolean agree) {
//				System.out.println("=====회원가입 시도=====");
//				super.join(joinId, joinPw, agree);
//			}
	}
}
