package a_variable;

public class VariableType {

	public static void main(String[] args) {
		
		/*
		 변수의 타입
		 
		 1. 기본형 타입 (Primitive type)
		    - boolean, char, byte, short, int, long, float, double
		    
		 2. 참조형 타입 (Reference type)
		    - 8가지 기본형을 제외한 나머지 타입, 객체의 주소를 저장한다
		 
		 3. 기본형 타입의 크기 (1byte = 8bit)
		    - 1byte : boolean, byte
		    - 2byte : char, short
		    - 4byte : int, float
		    - 8byte : long, double
		    
		 4. 종류
		    - 논리형 : true, false 중 하나 값을 가진다. "boolean" 
		    - 문자형 : 문자를 하나 저장하는데 사용 "char"
		    - 정수형 : 정수값을 저장하는데 사용 "byte, short, int(기본), long"
		    - 실수형 : 실수값을 저장하는데 사용 "float, double"
		    
		 5. 논리형 - boolean(기본값 : false)
		    - boolean형 변수에는 true 또는 false의 값 중 하나만 저장할 수 있다.
		    - boolean형 변수는 대답(yes, no), 스위치(on/off)등의 논리구조에 사용된다
		    - 데이터를 다루는 가장 작은 단위 byte이기 때문에 1byte의 크기를 가진다.
		    
		 6. 문자형 - char
		    - java는 Unicode문제체계 (16진수)를 이용한다. 2byte의 크기를 가진다.
		    - 문자 하나를 저장하기 위해서 사용한다. 'A' 싱글퍼트? 
		 
		 7. 정수형 - byte, short, int, long
		    - 기본 자료형은  int이다.
		    - 변수에 저장하려는 정수값의 범위에 따라 4개의 정수행중에 하나를 선택한다.
			- byte, short의 경우 크기가 작아서 범위를 넘어서는 경우가 많다. 그래서 int형을 사용하는 것이 좋다.
		 
		 8. 실수형 - float, double
		 	- 실수형 값을 저장하는데 사용된다. 
		 	- float : 1+8+23
		 	  double : 1+11+52
		 	- 실수형 중 자료형을 선택할 때는 값의 범위만이 아니라 정밀도도 중요하다.
		 	
		 9. String (클래스명임)
		  	- 문자열을 다루는 클래스 (여러개 가질 수 있음)
		 	- 기본값이 null이다.
		 	- 아무 문자, 특수문자가 무제한 들어가도 된다. (\ 빼고)
		 	
		 10. overflow
		 	- 변수 자신이 저장할 수 있는 범위를 넘어섰을 때, 최솟값으로 돌아가는 현상
		 	byte b2 = 126;
			b2++;
			System.out.println(b2);            //127
			b2++;
			System.out.println(b2);				//-127
			-----------byte는 -127~127까지----------
		 	
		 11. 형변환(casting)
		 	- 'cast 연산자'를 이용하여 형변환을 할 수 있다.
		 	- 'A' => 10진수일 때, 어떤 값인지??
		 		10 -> '?'     //양쪽의 타입이 같아야 연산이 가능하다
		 
		 
		 
		 
		 */
		

		/* ------------문제---------------
		 1) 변수 power를 선언하고 true의 값으로 초기화 하여라.
		 
		  	변수명 power , 값 true
		 	[변수타입] 변수명 = 값;
		 	boolean power = true; 
		 
		 2) 변수 ch를 선언하고'A'의 값으로 초기화 하여라.
		 
		 	char ch = 'A';
		 	char ch2 = '\u0041';    Unicode , 65를 16진수로 하였을 때 41이 나왔음
		 	char ch3 = 65;         
		 	System.out.println(ch);
		 
		 3) 변수 b1에 50의 값을 저장하라.
		 
		    byte b1 = 50;
		    System.out.println(b1);
		
		 4) 변수 s1에 25000의 값을 저장하여라.
		 
		 	short s1 = 25000;
		 	System.out.println(s1);
		
		 5) 변수 i1에 15억의 값을 저장하여라.
		 
		 	int i1 = 1500000000;
			System.out.println(i1);
		 
		 6) 변수 l1에 53억의 값을 저장하여라.
		 
		 	long l1 = 5300000000L;
			System.out.println(l1);
		 
		 7) 변수 f1에 3.141592를 저장해주세요
		 
		 	float f1 = 3.141592f;
			System.out.println(f1);
			
		 8) 변수 d1에 3.141592531548를 저장해주세요
		 
		 	double d1 = 3.141592531548;
			System.out.println(d1);
		 
		 9) String name = "20100000";         String name = ""; 빈집.? 이것도 이름이 없지만 주소가 있음
		 	String gibon = null;
		 	
		 10) 변수 a1에 7의 값을 저장해주세요
		 	int a1 = 7;
		 
		 11) 변수 s1에 "이름"의 값을 저장해주세요
		 	String s1 = "이름";
		 
		 12) a1과 s1의 합을 변수 result1에 저장해주세요
		 	String result1 = a1+s1;          // int+String   =>  String + String
		 	System.out.println(result1);
		 
		 13) byte형 변수 b3에 100의 값을 저장해주세요
		 	byte b3 = 100;
		 
		 14) char형 변수 c3에 'k'값을 저장해주세요.
		 	char c3 = 'k'; 
		 	char -> int로 바뀌는 것 int가 다 표현 가능 (cast연산자 생략 가능)
		 
		 15) int형 변수 i3에 400000의 값을 저장해주세요
		 	int i3 = 400000;
		
		 16) float 변수 f3에 3.14을 저장해주세요.
		 	float f3 = 3.14f;
		 
		 17) c3에 저장된 값의 10진수 값을 변수 reuslt2에 저장해주세요
		 	int reuslt2 = (int)c3;
		 
		 18) result2의 값을 출력해주세요
		 	System.out.println(result2);
		 
		 19) f3에 저장된 값 중 정수값만 취득하여 result3에 저장해주세요
		 	int result3 = (int)f3;
		 	float -> int (overflow발생)
		 	
		 20) result3를 출력해주세요
			System.out.println(result3);
			
		 */
		
		//p.22 [문제 2-4]
		//1. 변수 a를 선언하고 8의 값으로 초기화 하여라.
			int a = 8;
		//2. 변수 b를 선언하고 3의 값으로 초기화 하여라.
			int b = 3;
		//3. 변수 result를 선언하고 a의 값을 b의 값으로 나누기한 결과로 초기화 하여라.(정수)
			int result = a/b;
			System.out.println(result);
		//4. 변수 result2를 선언하고 a의 값을 b의 값으로 나누기한 결과로 초기화 하여라. (실수)
			float result2 = (float) a/b;
			System.out.println(result2);
		
		
		
		//byte 타입의 변수 b6를 선언하고 15의 값으로 초기화 하여라.
		byte d6 = 15;
		//char 타입의 변수 c6를 선언하고 'A'의 값으로 초기화 하여라.
		char c6 = 'A';
		//b6와 c6의 합을 byte 변수 result6에 저장하여라
		byte result6 = (byte)(d6 + c6);
//		System.out.println(result6);
		
		byte byte01 = 33;
		long long01 = 888;
		char char01 = 'A';
		float float01 = 3.141592f;
		
		int intger01 = (int)long01;
		short short01 = (short)char01;
		int integer01 = (int) float01;
		int integer02 = (int) byte01;
		int integer03 = (int) char01;
//		System.out.println(intger01);
//		System.out.println(short01);
//		System.out.println(integer01);
//		System.out.println(integer02);
//		System.out.println(integer03);
		
		
		
//		String r1 = "====------";
//		System.out.println(r1);
//		System.out.println(""+true);            // "" + true ===> true
// 		System.out.println(""+null);            // "" + null ===> null
		
		
		
		
		
		
		
		
	}

}
