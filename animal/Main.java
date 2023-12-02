package animal;

public class Main {

	public static void main(String[] args) {
//		Lion l = new Lion();
//		Dog d = new Dog();
//		Cat c = new Cat();
//		
//		l.walk();
//		d.walk();
//		c.walk();
	
		Animal[] animalArr = new Animal[3];	// 타입이 Animal들을 모아놓은 배열
		animalArr[0] = new Lion();
		animalArr[1] = new Dog();
		animalArr[2] = new Cat();

		animalArr[0].walk();
//		int[] arr = new int[3];
//		int a = 3;
//		arr[0] = 3;
//		
//		//서로 같은 말임		
//		animalArr[0] = new Lion();
//		Animal ani = new Lion();
//		
		for (int i= 0 ;i<animalArr.length; i++ ) {
			animalArr[i].walk();
		}
		
		
	}

}
