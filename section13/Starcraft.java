package section13;
// 지역 내부 클래스
public class Starcraft { // 외부 클래스
	// 지역 내부 클래스
	// 메서드 안에서 선언함
	public void getUnit(String unitName, int unitSpeed) {
		class Unit {	// 지역 내부 클래스
			public void move() {
				System.out.println(unitName+"이"
						+unitSpeed+"속도로 이동합니다.");
			}
		}
		Unit unit = new Unit(); // 메서드 내에서 객체 생성
		unit.move();// 외부클래스 메서드 내에서 내부클래스메서드 호출
	}
}
