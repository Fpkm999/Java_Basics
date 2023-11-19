package practiceWeb;

public class Join extends Database {


	public void join(String joinId,String joinPw,boolean agree) {
		

		if (agree == true) {
		super.joinId = joinId;
		super.joinPw = joinPw;
		super.agree = agree;
		System.out.println("아이디 : "+super.joinId);
		System.out.println("비밀번호 : "+super.joinPw);
		} else {
			System.out.println("이용약관에 동의하세요.");
		}
	}
}
