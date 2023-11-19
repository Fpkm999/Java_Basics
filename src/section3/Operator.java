package section3;
public class Operator {

	public static void main(String[] args) {
		
		// 연산방향 ->(왼쪽에서 오른쪽 일때)
		System.out.println(2+3-4);
		System.out.println("====================");
		
		// 연산방향 <-(오른쪽에서 왼쪽 일때)
		int a;
		int b;
		int c;
		
		a = b = c = 5;// a,b,c 가 5랑 같다는 의미X, a,b,c 각각에 c,b,a 순으로 5를 대입하는것
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("====================");
		
		// 괄호 연산자 (1순위 우선순위)
		int d = 2 + 3 * 4;
		System.out.println(d);
		int e =  (2 + 3) * 4;
		System.out.println(e);		
		System.out.println("====================");
		
		// 부호 연산자
		int f = 100;
		
		int plusA = +f;
		int minusA = -f; // +는 잘안쓰고 -를 표현하고 싶을땐 -를 붙인다. 음수값이됨
		
		System.out.println(plusA);
		System.out.println(minusA);
		
		System.out.println("====================");

		// 증감 연산자 : 값을 1씩 증가 또는 감소 시킨다.
		// ++ , --
		int number = 10;
		System.out.println(number);
		number++;	// number + 1
		System.out.println(number);
		++number;
		System.out.println(number);
		
		int number2 = 10;
		System.out.println(number2);
		number2--;
		System.out.println(number2);
		System.out.println("====================");

		// 전위형, 후위형 : 증감연산자가 앞에 있냐 뒤에 있냐
		int number3 = 1;
		System.out.println(number3++); // 후위형 : 코드가 먼저 실행되고 1이 증가
		System.out.println(number3);
		System.out.println(++number3); // 전위형 : 1이 먼저 증감되고 즉시 코드에 반영
		System.out.println(number3);
		System.out.println("====================");
		
		//------------------------------------
		// 논리 부정 연산자
		// boolean 값 (true / false ) 앞에 !를 붙여서 값을 반대로 바꿔준다.
		
		boolean tvPower = false; //true 혹은 false 값이 들어간다.
		System.out.println(tvPower);
		System.out.println(!tvPower);//tvPower은 변수명일뿐 !false를 넣어도 결과는 같다.
		System.out.println("====================");
		
		/*
		 * 변수를 사용하는 이유
		 */
		
		// 이항 연산자
		// 산술 연산자
		// 사칙연산과 나머지 연산자
		// 사칙 연산 : + - * /  , 나머지 연산자 : %
		int g = 5;
		int h = 2;
		
		System.out.println("g + h = " + g + h); // + 더하기 인데 결과가 g + h = 52가 나왔다.
		
		// 문자열(String)타입과 정수형 또는 실수형이 더해지면 뒤에거 모든게 다 문자열타입으로 자동형변환 g와 h는 int형이라도 문자형을 만나니까
		// 자동으로 형변환이 된다. h도 동일하다.
		// 이때 필요한게 괄호 () 이다.
		System.out.println("====================");
		System.out.println("g + h = " + (g + h)); // + 더하기
		System.out.println("g - h = " + (g - h)); // - 빼기
		System.out.println("g * h = " + (g * h)); // * 곱하기
		System.out.println("g / h = " + (g / h)); // / 나눗셈의 몫
		System.out.println("g % h = " + (g % h)); // % 나눗셈의 나머지
		

		System.out.println("====================");
		
		// 실수형 
		double i = 5;
		double j = 2;
		System.out.println("i / j = " + (i / j)); // / 나눗셈의 몫
		// double 형일때는 소숫점까지 나옴
		///// 질문1 소수끼리 나누어서 결과도 소수로 반환되는데 소수점 아래 6자리 공백 .0000 이 안나오는 이유. 
		
		
		System.out.println("====================");

		// 대입 연산자
		// = += -= *= /= %=
		int k = 5;
		int l = 2;
		
		k += l; // k = k + l 와 같다. a = a + b 
		// a++ 이나 a +=1 둘다 같음.둘다 a= a+ 1 이므로
		System.out.println(k);
		
		k *= l; //14
		System.out.println(k);
		
		k -= l; //12
		System.out.println(k);
		
		k /= l; //6
		System.out.println(k);
		
		k %= l; //0
		System.out.println(k);
		
		System.out.println("====================");


		// 비교 연산자
		// 결과값으로 true, false로 반환된다.
		// >, >=, <, <=, ==, !=
		
		int n = 5;
		System.out.println(n > 2); // n가 2보다 크냐
		System.out.println(n <= 2); // n가 2보다 작거나 같냐
		System.out.println(n == 2); // n 가 2랑 같냐 //질문2. 값자체만 같으면 true? 주소값?이랑 여러가지 모든 조건까지 맞으면ture?
		System.out.println(n != 2); // n 가 2랑 다르냐
		
		System.out.println("====================");
		
		// 논리 연산자
		// 논리식의 결과가 boolean 값으로 반환
		// &&, ||
		// 항(피연산자)들이 다 boolean 데이터 타입이어야 함
		boolean m = true;
		boolean o = false;
		boolean p = true;
		boolean q = false;
		
		System.out.println("-----&&-----");
		System.out.println("true && false : " + (m && o)); //false
		System.out.println("true && true  : " + (m && p)); //true
		System.out.println("false&& false : " + (o && q)); //false
		System.out.println();
		System.out.println("-----||-----");
		System.out.println("true || false : " + (m || o)); //true
		System.out.println("true || true  : " + (m || p)); //true
		System.out.println("false|| false : " + (o || q)); //false
		
		System.out.println("================================");
		int r = 3;
		int s = 4;
		int t = 4;// 각각의 항이 boolean 값으로 반환됨
		System.out.println( (r > s) && (s == t) );// 비교 연산자들이 항 반환값이 boolean
							// false && true 이므로 false 반환됨
		
		System.out.println("===============================");
		// 삼항 연산자
		// 조건식 ? : ture : false
		// 조건식이 true -> ture
		// 조건식이 false -> false
		// x y z
		//조건식이란? 참또는 거짓 즉, boolean으로 결과를 확인할 수 있는 모든 식을 조건식이라고 함
		
		int u = 2;
		int w = 1;
		
		//				조건식 ? true : false
		int bigNumber = (u > w) ? u : w;
		//				a가 b보다 크면 a가 큰 값이고,
		//				a가 b보다 작으면 b가 큰 값이다.
		System.out.println(bigNumber);
		
//
//		if(조건식) {
//
//		}else {
//
//		}
//
		//질문3. (조건식) ? ture : false 인데 ture 나 false에 삼항 연산자를 넣어서 계속 진행 할 수 있는지 보니까 되는거같긴한데
	}
}
