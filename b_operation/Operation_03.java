package b_operation;

public class Operation_03 {

	public static void main(String[] args) {

		/*
		1. 산술연산자
		  - 사칙연산자 (+, -, *,/), 나머지 연산자 (%), 쉬프트 연산자(<<,>>,>>>)는
		        두 개의 피연산자를 취하는 이항연산자이다.
		  - 이항연산을 할 때는, 두 개의 피연산자 모두 4byte형 보다 작은 경우에는 둘다 4byte형인 int로 변환하여 연산을 수행한다.
		 
		2. 사칙연산자  (+, -, *,/)
		  - 두 개의 피연산자 중 하나 이상이 4byte형 보다 큰 경우에는 큰 자료형으로 변환 후 연산
		    : int + float => float + float -> float 
		  - 두 개의 피연산자 모두 4byte형 보다 작은 경우에는 둘 다 int형으로 변환후 연산
		    : byte + short -> int + int 
		  - 정수형 간의 나눗셈에서 0으로 나누는 것은 금지
		*/
		
		// p.34 [2-8]
		// 1. byte형 변수 b1을 선언하고 80의 값을 초기화 하라
		
		
		
		/*
		3. 나머지 연산자 (%)
		  - 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 반환하는 연산자
		  - boolean형을 제외한 모든 기본형 변수에 사용할 수 있다.
		  - 홀짝 구할 때 많이 씀
		
		*/
		
		int a1 = 10;
		int b3 = 8;
		
		int share = a1 / b3;  // 몫 1
		int remain = a1%b3;   // 나머지 2
 		
		//xx을 xx로 나눈 몫은 x이고 나머지는 xx이다.
		// a1을 b3로 나눈 몫은 share이고 나머지는 remain이다.
//		System.out.println(a1+"을 "+b3+"로 나눈 몫은 "+share+"이고 나머지는 " + remain+"이다.");
		
		byte b1 = 80;
		byte b2 = 100;
		long lo1 = 642L;
		
		long result1 = lo1+b1;
//		System.out.println(result1);
		
		int result2 = b1 + b2;
//		System.out.println(result2);
		
		
		//byte + byte = int + int -> int
		byte result3 = (byte)(b1+b2);
//		System.out.println(result3);
		
		long lo2 = 60000*80000L;
//		System.out.println(lo2);
		
		
		/*
		4. 쉬프트 연산자 ( <<, >>, >>> )
		  - 정수형 변수에만 사용이 가능하다.
		  - 피연산자의 각자리 (2진수)를 오른쪽 또는 왼쪽으로 이동한다.
		  - 곱셈과 나눗셈을 할 때 연산속도가 매우 뛰어나다.
		  - << : x << n -> x*2^n
		  - >> : x >> n -> x/2^n
		
		*/
		
		
		int shift = 10;
//		System.out.println(shift<<3);        // 80
//		System.out.println(shift<<32);      // 10
//		System.out.println(shift>>3); 		// 1      10 / 2^3
		
		/*
		5. 비교연산자
		  - 두 개의 변수 또는 리터럴을 비교하는데 사용된다.
		  - 주로 조건문과 반복문의 조건식에 사용되며 연산 결과는 true 또는 false이다.
		  - 이항연산자이다. 
		  
		6. 대소비교연산자 ( <, >, <=, >= )
		  - 기본 자료형 중에 boolean 제외한 나머지 자료형에 사용이 가능하다.
		
		7. 등가비교연산자 ( ==, != )
		  - 모든 자료형에 사용이 가능하다.
		
		
			---------------------------------------------------------
			수식		|					연산결과						|
			---------------------------------------------------------
			x>y		|		x가  y보다 클 때만 true, 그 외에는 false
			x<y		|		x가  y보다 작을 때만 true, 그 외에는 false
			x>=y    |		x가  y보다 크거나 같을 때만 때만 true, 그 외에는 false
			x<=y    |		x가  y보다 작거나 같을 때만 true, 그 외에는 false
			x==y    |       x와 y가 같을 때만 true, 그 외에는 false
			x!=y    |       x와 y가 다를 때만 true, 그 외에는 false
			
			
			
			
			
		*/
		
		
		float f01 = 0.1f;
		float f02 = 10.0f;
		double do01 = 0.1;
		double do02 = 10.0;
		
//		String str1 = "화이팅";
		
//		System.out.println(f01==do01);		//double 타입은 2^n 으로 표현 
		
//		System.out.println(f02==do02);
		
//		System.out.println(str1.equals("화이팅"));
		
		
		/*
		8. 비트연산자 ( &,|, ^) and or xor 연산
		  - 이진비트연산을 수행한다.
		  - 실수형을 제외한 모든 곳에 사용 가능하다.
		  
		  | (OR연산) - 피연산자 중 한 쪽의 값이 1이면 1의 결과를 얻는다.
		  & (AND연산) - 피연산자 양쪽 모두 1이면 1의 결과를 얻는다.
		  ^ (XOR연산) - 피연산자의 값이 서로 다르면 1의 결과를 얻는다.
		
		*/
		
		
		int a = 3;
		int b = 5;
		
//		System.out.println(a|b);
//		System.out.println(a&b);
//		System.out.println(a^b);
		
		/*
		9. 논리연산자 ( &&, ||)
		  - 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만 허용한다.
		  - 조건식의 결합에 사용
		  - '&&'이 '||'보다 연산 우선순위가 높다.
		  
		  || (OR)결합 - 피연산자 중 어느 한쪽만 true이면 true의 결과를 얻는다.
		  && (AND)결합 - 피연산자 양쪽 모두 true일 때 true의 결과를 얻는다.
		  
		*/
		
		int a2 = 7;
		// 5이상 ~ 15이하일 때 true
		// 5 <= a2 <= 15
		// 5 <= a2 && a2 <= 15
		
		
//		System.out.println(5 <= a2 && a2 <= 15);
		
		char ch01 = '1';
		
//		System.out.println(ch01 >= 'A' && ch01 <= 'Z');
//		'A' <= ch01 <= 'Z'
//		'A' <= ch01 && <= 'Z'
		
//		System.out.println(ch01 >= 'a' && ch01 <= 'z');
//		'a' <= ch01 <= 'z'
//		'a' <= ch01 <= 'z'
		
//		System.out.println((ch01 >= 'A' && ch01 <= 'Z')||(ch01 >= 'a' && ch01 <= 'z'));
		// 영문자 = 대문자 또는 소문
		
//		System.out.println(ch01 >= '0' && ch01 <= '9');
		// '0' <= ch01 <= '9'
		// '0' <= ch01 && ch01 '9'
		
		
		/*
		10. 삼항연산자
		  - 3 개의 피연산자를 필요로 하기 때문에 삼항연산자로 이름지어 졌다.
		  - 삼항연산자의 조건식에는 연산결과가 true 또는 false인 식이 사용되어야 한다
		  - 기본구조
		  	(조건식) ? true일 때 수행 : false일 때 수행
		*/
		
		int a3 = 10;
		
		int abs = a3 >= 0 ?  a3 : -a3; // true와 false 타입이 같아야 함
//		System.out.println(abs);
		
		
		/*
		11. 대입연산자 ( =, op= )
		  - 변수에 값 또는 수식의 연산결과를 저장하는데 사용한다.
		  - 연산자 중 연산우선순위가 가장 낮다.
		*/
		
		int b4 = 10;
		
		//1. b4의 값에 3을 곱한 결과를 b4에 저장해주세요
		b4 = b4*3;
//		->> b4 *= 3;
		
		char c3 = 'A';
//		 c3 = c3 +5 
		c3 = (char)(c3 + 5);
//		-->> c3 += 5;
		
		//반올림 
		
//		3.141592f;
//		소수점 네번째 자리에서 반올림하여 3번째 자리까지 표현 하여라
		// ->> 3.142
		
		//1000을 곱하면 3141.592
		// + 0.5	-> 3142.092
		// (int) --> 3142
		// 나누기 1000f
		
		float q1 = 3.141592F;
		int aq = (int)(q1 * 1000 + 0.5);
//		System.out.println(aq/1000f);
		
		
		//랜덤
//		0<=Math.random()<1

//		System.out.println(1 <= (int)(Math.random()*6+1) < 7));
		
//		System.out.println((int)(Math.random()*6+1));
		
		
		int x = (int)(Math.random()*100);
		// 0부터 100미만 사이
		// -> 99+1
		
		//43초과 375미만
		// -> 331+44
		
		//5초과 12미만
		// -> 6+6
		
		// 2초과 9미만
		// -> 3이상
		// -> 9-3
		// -> 6+3
		
		// 0 <= Math.random() < 1
		// 0 <= Math.random()*100 < 100
		// 0 <= Math.random()*100 < 100
		// 0 <= (int)(Math.random()*100 < 101
		System.out.println(x);
		
		int x2 = (int)(Math.random()*331+44);
		System.out.println(x2);
		
	}

}
