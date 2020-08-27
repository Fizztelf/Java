package z_exam;

public class Exam_02 {

	public static void main(String[] args) {
		
		/*
		[3-1] 다음 중 형변환을 생략할 수 있는 것은?
		byte b = 10;
		char ch = 'A';
		int in = 100;
		long lo = 1000L;
		
		(1) b = (byte)in;
		(2) ch = (char)b;
		(3) short s = (short) ch;
		(4) float f = (float) lo;
		(5) in = (int)ch;
		
		
		정답 : 4,5
		풀이 : byte -> short -> int -> long -> float -> double
		  			  char -> int ---------------------------
		  			  
		    (1) int -> byte 형변환 연산자가 필요하다.
			(2) byte -> char 형변환 연산자가 필요하다.
			(3) char -> short 형변환 연산자가 필요하다.
			(4) long -> float 생략 가능하다.
			(5) char -> int 생략 가능하다.
	
		*/
		
		/*
		[3-2] 다음 연산의 결과를 적으시오.
		*/
		int x = 2;
		int y = 5;
		char c = 'A';	// 'A'의 문자코드 65
		System.out.println(1 + x << 33);
		// 3 << 33
		// 3 X 2 X 2^32
		// 정답은 6
		
		System.out.println(y >= 5 || x < 0 && x > 2);
		// 5>=5 또는 2<0 그리고 2>2
		// '&&'이 '||'보다 연산 우선순위가 높다.
		// 2 < 0 && 2 > 2 ====>> false
		// 5>=5   ===> true
		// true || flase 
		// ==>> true
		
		System.out.println(y += 10 - x++);
		// 증감연산자가 먼저 우선 순위로 계산을 해야한다.
		// x는 2로 계산이 되고, 3의 값이 저장된다.
		// 10에서 2를 빼면 8이고, 그렇게 된다면 y = 5+8이 된다
		// 그래서 답은 13
		// 답은 13.
	
		System.out.println(x += 2);
		// x += 2  (x=2)
		// 단, 위의 식과 같이 x++에 대입 후 계산을 해줘서 3으로 계산이 된다.
		// x = 3+2
		// x = 5
		
		System.out.println( !('A' <= c && c <= 'Z') );
		//'A' <= c   ==>> true
		// c <= 'Z'  ==>> true
		// true && true ==> true
		// !ture 이라면 '!'는 논리부정연산자로써 반대를 의미하기 때문에 값이 반대로 바뀐다.
		// 그래서 정답은 false
		
		System.out.println('C' - c);
		// c = 'A';
		// 4byte 보다 작은 타입들은 int로 변환해야 한다.
		// char - char = int - int =>> int
		// 'C' - 'A'
		// ASCII CODE로 나타낸다면 , A = 65, C = 67
		// 67 - 65 = 2
		
		System.out.println('5' - '0');
		// 4byte 보다 작은 타입들은 int로 변환해야 한다.
		// char - char = int - int =>> int
		// '5' - '0'
		// ASCII CODE로 나타낸다면 , 0 = 48, 5 = 53
		// 53 - 48 = 5
		
		System.out.println(c+1);
		// c = 'A';
		// char + int = int + int ==> int
		// ASCII CODE로 A = 65
		// 65 + 1 = 66
		
		System.out.println(++c);
		// ++c는 전위증감연산자로 c의 값에 1을 증가시킨다.
		// 단, 증감연산자들은 단항 연산자로써 int로 변환되지 않는다.
		// c = 'A';
		// 문자 값이 그대로 먼저 저장시키고 출력한다.
		// 정답은 B
		
		System.out.println(c++);
		//c++는 후위증감연산자로써 c의 값을 1증가시킨다.
		// 후위형인 경우에는 변수 c가 출력되고 난 후에 c에 저장된 값이 증가된다.
		// 그래도 값은 B가 나온다
		
		System.out.println(c);
		// 위 문제에서 출력이 끝나고 c에 저장된 값이 증가했다.
		// 그러므로 c가 나온다.
		
		
		
		/*
		[3-3] 아래는 변수 num의 값에 따라 "양수", "음수", "0"을 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞는 코드를 넣으시오
		
		class Exercise3_2{
			public static void main(String[] args){
				int num = 10;
				String result = 	(1)		;
				System.out.println(result);
	
			}	
		}
		
		정답 : num > 0 ? "양수" : (num < 0 ? "음수" : "0")
		풀이 : num보다 값이 크면 양수를 출력하고 끝나지만, num의 값이 0보다 작거나 같으면 삼항연산자가 수행된다.
			 num의 값이 0보다 작으면 음수가 출력되고, 그렇지 않다면 0이 출력된다.
		
		
		*/
		
		/*
		[3-4] 이래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 
			   만일 사과의  수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면  13개의 바구니가 필요할 것이다.
			  (1)에 알맞는 코드를 넣으시오.
		*/
		
		int apples = 123;
		int bucket = 10;
		int numOfBucket = (      (1)       );
		System.out.println("필요한 바구니의 수 : "+numOfBucket);
		// 정답 : apples/bucket + (apples%bucket> 0 ? 1: 0)
		/* 풀이 : 사과 개수를 바구니 개수로 나누면 12가 나온다.
		 		정확히는 12.3개가 나오는데, 정수와 정수를 나눗셈을 하면 소수점 자리는 모두 버린다.
		 		그렇게 되면 사과가 3개가 남개 되는데, 나머지 연산자를 사용해서 바구니 개수 1개를 더해줘야 한다.
		 		그렇게 해서 13개의 필요한 바구니 수가 나온다.
		*/ 
		
		
		
		
		/*
		[3-5] 아래의 코드는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다/
				(1)에 알맞는 코드를 넣으시오.
		*/
		
		int num = 456;
		int result = num/100*100;
		System.out.println(result);
		// 정답 : num/100*100
		/* 풀이 : 윗 문제에서 말했듯이 정수와 정수를 나눗셈을 하면 소수점 자리는 모두 버린다.
		  		num/100 = 4.56
		  		4.56에서 100을 곱하면 456이 맞지만 소수점 자리는 버리기때문에
		  		400이 나온다.
		*/
		
		
		
		/*
		[3-6] 아래 코드의 문제점을 수정해서 실행 결과와 같은 결과를 얻도록 하시오.
		
		*/
		
		byte b = 20;
		byte a = 10;
		byte c1 = (byte)(a+b);
		char ch = 'A';
		ch = (char) (ch+2);
		float f = 3/2f;
		long  l= 3000L * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result1 =(float) d==f2;
		
		System.out.println("c="+c1);
		System.out.println("ch" + ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result1);
		/*
		추가된 코드, 문제점 수정 및 풀이
		1. byte a = 10;
		-> a 변수를 선언해줘야 c1값이 나온다.
		
		2. byte c = a+b;  ===>>  byte c1 = (byte)(a+b);
		-> byte + byte = int + int => int
		-> int -> byte는 형변환 연산자를 사용해야만 쓸 수 있다.
		
		3. ch = ch + 2; ===>> ch = (char)(ch+2);
		-> char + int = int + int => int
		-> int -> char 는 형변환 연산자를 사용해야만 쓸 수 있다.
		
		4. float f = 3/2;  ==> ; 앞에 f 붙이기
		-> int / int ==> int 
		-> 출력 결과를 보면  소수점이기 때문에 뒤에 f를 붙여줘야 한다.
		
		5. long l = 3000*3000*3000; ==> ; L붙이기
		-> int * int = > int (900만)
		-> int(900만) * int => int
		-> 사용할 수 있는 범위가 넘어섰다.
		-> overflow가 되기 때문에 L을 붙여줘야 한다.
		-> 연산을 할 때는 앞의 숫자에 붙여주는게 좋다
		
		6. boolean result1 = d ==f2;     ===>     boolean result = (float)d==f2;
		-> float + double = double + double => double
		-> double -> float은 형변환 연산자를 사용해야 한다.
		*/
		
		
		
		
		
		/*
		[3-7] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다. 예를 들어,
			  24의 크면서도 가장 가까운 10의 배수는 30이다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는
			  6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞는 코드를 넣으시오.
		
		*/
		int num1 = 24;
		int result2 = 10-num1%10;
		System.out.println( "result2 : " + result2);
		
		// 정답 : 10-num1%10
		/* 풀이 : num1 값이 24이고  6이 결과로 나와야 한다면
		 		24를 10으로 나눈 나머지 값 '%'은 4이다.
		 		그러므로 10-4 = 6이 나온다.
 		
			
		*/
			
		
		/*
		[3-8] 아래는 화씨를 섭씨로 변환하는 코드이다. 변환공식이 'C = 5/9 X (F-32)'라고 할 때, (1)과 (2)에 알맞는 코드를 넣으시오.
			   단, 변환 결과값은 소수점 셋째 자리에서 반올림해야한다.
		*/
		
		int fahrenheit = 100;	//화씨
		float formula = (5/9f*(fahrenheit-32)); 	//변환공식 활용
		float celcius =((int)(formula*100+0.5))/100f;  //formula 소수점 셋째자리에서 반올림
		System.out.println( "Fahrenheit :" + fahrenheit);
		System.out.println( "Celcius : " +  celcius);
		
		/*
		정답 (1) : 5/9f*(fahrenheit-32)
		정답 (2) : ((int)(formula*100+0.5))/100f
		   
		풀이 : (1)에서 문제에서 주어진 변환공식을 이용한다. 
			 	F에 fahrenheit 변수를 넣어준다.
			 	5/9 X (100-32) = float * int = float * float => float
			 	5/9의 결과는 0이기 때문에 실수 형태의 결과를 얻어야 한다.
			  	그래서 정수형 리터럴인 9를 대신해서 형변환 연산자를 이용해 9f를 붙여준다.
			  
			 (2)float formula = (5/9f*(fahrenheit-32)); 값은 37.7778이 나온다.
			 	formula 값에서 취득하고자 하는 자리까지 정수로 변경해준다. formula*100을 해주면
			 	3777.78이고 반올림하기 위해 0.5를 더하면 3778.28나온다
			 	int형으로 형변환을 해서 필요없는 소수점 자리를 버린다.
			 	이제 정수로 변경되었던 소수점 부분을 다시 소수점으로 변경하기 위해 소수점 셋째 자리까지인 100f로 나눠준다.
			 	
			 	37.7779에서 100을 곱한 값
			 	-> 3777.79
			 	-> 3777.79 + 0.5
			 	-> 3778.29 => 3778 (소수점 다 버림)
			 	-> 3778/100 => 37.78
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
