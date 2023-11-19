package section8;

public class Bus {

	// 반환 값이 없는 버스를 타는 메서드
	void take(int money){
		int count = 0;
		while(true){
			if(money < 1250){
				System.out.println("잔액 부족. NAGA"+count+", 번째에서 OUT");
				return; // 반환 타입이 void 일 떄에만 break 처럼 사용가능함
			}
			System.out.println("버스를 탔다."+count);
			count ++;
			money -= 1250;
		}

	}
}
