package section8;

/*
 *  TV 켜고 끄는 프로그램
 *  만들 날짜 : 2023년 11월 2일
 *  개발자 : 이도영
 */
public class Method {
	// 라이브러리용
	// 필드
	String tvName;	// TV 이름

	// 메서드
	// TV를 켜는 메서드
	void turnOn() {
		System.out.println(tvName + "TV를 켜다.");
	}

	void turnOff () {
			System.out.println(tvName + "TV를 끄다.");
		}

		// TV의 현재 채널을 출력하는 메서드
		// 반환타입 메서드명(매개변수)
		// 반환타입 메서드명(자료형 변수명) //23,24줄 둘다 동일한 말임
	void nowChannel (int channel){
		System.out.println("현재 채널은 : "+channel);
	}

}