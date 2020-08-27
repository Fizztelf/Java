package e_OOP;

public class Qu3_8 {

	public static void main(String[] args) {

		
		//7. 3번의 add 메서드를 호출하여라
		int result0 = MyAdd.add(4);
		System.out.println(result0);
		
		//8. 4번의 add 메서드를 호출하여라
		MyAdd ma = new MyAdd();
		int result = ma.add(1,2);
		System.out.println(result);
		
		//9. 5번의 add 메서드를 호출하여라
		long result1 = ma.add(4, 123456789L);
		System.out.println(result1);
		
		
		//10. 6번의 add 메서드를 호출하여라
		float result2= ma.add('A', 3.14f);
		System.out.println(result2);
		
		
	}

}


class MyAdd{
	
	
	
	//1. 클래스변수 a를 선언하고 20의 값으로 초기화하여라
	static int a = 20;
	//2. 인스턴스변수 b를 선언하고 15의 값으로 초기화하여라
	int b = 15;
	//3. int타입의 매개변수가 하나이며 변수 a의 합을 반환하는 클래스메서드를 add를 작성하여라
	static int add(int i){
		int result = i + a;
		return result;
	}
	//4. int타입의 매개변수가 두개이고 매개변수의 합을 반환하는 인스턴스메서드를 add를 작성하여라
	int add(int i, int j){
		int result = i + j;
		return result;
	}
	//5. int, long 타입 각 한개의 매개변수, 매개변수의 합을 반환하는 인스턴스메서드 add를 작성하여라
	long add(int i, long j){
		long result = i+j;
		return result;
	}
	
	//6. char,float 타입 각 한 개의 매개변수, 매개변수의 합을 반환한느 인스턴스 메서드 add를 작성하여라
	float add(char i, float j){
		float result = i + j;
		return result;
	}
	
	//추가1. 인스턴스 메서드 add, 매개변수 long타입 하나, int타입 하나이며 매개변수의 합을 반환한느 메서드
	long add(long i, int j){
		long result = i+j;
		return result;
	}
	
	//추가2. 인스턴스 메서드 add, 매개변수가 int 타입 두개이며 두개의 합을 반환하는 메서드
	//단, 반환타입이 long타입이어야 한다.
//	long add(int i, int j){
//		long result = i+j;
//		return result;
//	}
	// 이건 오류야.함정이었어. 안되는데 풀어보라고 한거야
	
	
	
}