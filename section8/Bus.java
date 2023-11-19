package section8;

public class Bus {
	// 반환값이 없는 버스를 타는 메서드
	void take(int money) {
		while(true) {
			if (money < 1250) {
				System.out.println("잔액 부족");
				return;//반환타입이 void일때만 break처럼 사용 가능
			}//break는 반복문만 종료 이 메서드는 안 종료됨
			System.out.println("버스를 탄다.");
			money -=1250;
		}
//		System.out.println(); 이건 절대 만날수없는 코드라 오류뜸. 쓰레기라는거임
//		break;문을 썼으면 오류 안뜸. 종료하면 이거 쓰고 나가기때문
	}
}
