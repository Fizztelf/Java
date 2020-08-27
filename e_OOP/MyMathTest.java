package e_OOP;

public class MyMathTest {
	public static void main(String[] args) {
		
		
//		메서드 호출
//		  - 클래스명.메서드명();
//		  - int 변수명 = 클래스명.add(3, 5);
		//8. MethodTest의 클래스의 add01 메서드를 호출하라
		MethodTest.add01();
		
		//9. MethodTest의 클래스의 add02 메서드를 호출하라
		//메서드 부를 때 누구의 친구인지 , 뭐를 요구하는지 !
		//int 타입 c를 하나 달라. 값 아무거나
		int result = MethodTest.add02(100);
		System.out.println(result);
		
		//main() 안에 result 라는 지역변수 선언 
		//MethodTest 클래스에 add2()가 호출되어서 call stack에 쌓임 
		// 가져가는 값 = 인자값 (100)이 있어서 표현되어야 함
		//이렇게 해야 메서드 호출 완료
		// MethodTest로 넘어가자!
		
		
		//10. MethodTest의 클래스의 add03 메서드를 호출하라
		//add03가 누구 친구얌??? 인스턴스 친구
		// 인스턴스 화  하면 뭐가 생성되니? 객체
		// 두번쨰로 매개변수 확인해라
		
		// 대입연산자가 있기 때문에 왼쪽부터
		// 인스턴스 화를 시키기 위해서 class 명을 넣어줘야 한다
		// MethodTest이 호출이 되었는데, 메서드 영역에 이미 있으니까 로드하지 않고서
		// mt를 메인 메서드 내에 참조형 변수 로드
		// new MethodTest 인스턴스 화, 인스턴스 생성. 인스턴스는 heap에 만듦
		// 인스턴스 변수와 인스턴스 메서드가 같이 올라간다
		// 오른쪽 값을 왼쪽 mt에 저장
		// heap에서는 처음 mt의 주소만 가지고 있음
		// 인스턴스가 생성되었으니까 클래스나 메서드를 heap에 생성
		MethodTest mt = new MethodTest();
		int result2 = mt.add03(100);	// main() 안에 result2를 선언 , call stack add메서드 호출 , 100은 인자값.
		System.out.println(result2);
		
		
		//11. MethodTest의 클래스의 add04 메서드를 호출하라
		// 인스턴스 메서드 호출 방식 : 참조변수명.메서드명
		// 첫번째 메서드명, 두번째  매개변수 확인 
		// 매개변수가 뭐 없으니까 안 넣어도 됨
		// 세번째, 반환값이 있는지 없는지.
		// 없으니까 ? 변수에 저장하지 않고 호출만 한다.
		mt.add04();
		
		
	}
}

class MethodTest {
	//1. 클래스 변수 a를 선언하고 10의 값으로 초기화 하여라
	static int a = 10;
	
	//2. 클래스 변수 b를 선언하고 20의 값을 초기화 하여라
	static int b = 20;
	
	//3. 인스턴스 변수 c를 선언하고 50의 값으로 초기화 하여라
	int c = 50;
	
	//4. 클래스 변수 a와 b의 합을 출력하는 클래스메서드 add01를 구현하라
	static void add01(){
		int result = MethodTest.a + MethodTest.b;
		// int result = a + b; 도 가능			add1()에 result라는 지역변수를 선언 그리고 a + b를 더한 값이 result에 저장
		// a와 b를 어떻게 찾아? 
//		다른 클래스에도 a,b가 있으면 어떻게 찾을래? 지역 내에 찾아보고 없으면(add1에는 a와 b가 없음) 그러면 Method area에 전역변수를 찾아라. 그럼 있따!
		System.out.println(result);				
		// return;     생략가능
	}

	//어디에 들어가는 게 매개변수인가? 괄호 안.. 입력받을 놈
	//5. 클래스 변수 a,b,int 타입의 매개변수 c의 합을 반환하는 클래스메서드 add02를 구현하라
	// 받아야 할 건 int type 한개

	// 메서드 오면 뭐부터 확인하라고? 
	static int add02(int c){	//메서드가 오면 뭐부터 확인해? 매개변수 부터 확인해.  int c 하나 있음. 어느 지역내에서 선언되었어? add2()에 지역변수로 선언
		int result = a + b + c;	//call stack에 result 지역변수로 선언. 10+20+100을 더해준 값을 result에 저장
		return result; 		// 어디다 돌려줘야하는지 알 수 없다. main()안에 result 값을 넣어주고 나서  종료
	}
	
	//매개변수는 지역변수의 일종
	// 인스턴스 변수와 매개변수 c 랑 이름이 같을 때만 this를 쓴다.
	//6. 인스턴스 변수 c와 int 타입의 매개변수 c의 합을 반환하는 인스턴스메서드 add03을 구현하라
	int add03(int c){		//jvm에서 c를 초기화 
		int result = this.c + c;		// this.c 이 인스턴스 안에 있는 c ,, 이건 mt 주소에 있는 c 
		return result;
	}
	
	//7. 인스턴스변수 c와 0~100사이의 임의의 정수의 합을 출력하는 인스턴스메서드 add04를 구현하라
	
	void add04(){
		int random = (int)(Math.random()*101);
		int result = c + random;		//add4메서드의 지역변수  result가 선언되었다.
										// c를 찾았는데 , 지역 c에 없어서 전역변수에서 찾는다.
		System.out.println(result);
	}
	
	
	
	
	
}

















