package z_exam;

public class Exam_01 {

	public static void main(String[] args) {
		
		/*
		 [2-1] 다음 표의 빈 칸에 8개의 기본형을 알맞는 자리에 넣으시오.
		 
		-------------------------------------------------------------------- 
		|			|		1byte	  |		2byte	|	4byte	|	8byte	|
		--------------------------------------------------------------------
		|    논리형	|		boolean	  |		        |           | 			|
		-------------------------------------------------------------------- 
		|    문자형	|				  |		char    |           |			|
		--------------------------------------------------------------------
		|    정수형      |		byte	  |		short	|	int		|	long	|
		--------------------------------------------------------------------
		|    실수형	|				  |				|	float	|	double	|
		--------------------------------------------------------------------
		 */
		 
		 /*
		 [2-2] 다음의 문자에서 리터럴, 변수, 상수, 키워드를 적으시오.
		 
		 int i = 100;
		 long l = 100L;
		 final float PI = 3.14f;
		 
		 - 리터럴 : 100, 100L, 3.14f           //리터럴 : 그 자체로 값을 의미하는 것
		 - 변수 : i, l                  		//변수 : 단 하나의 값을 저장할 수 있는 공간
		 - 키워드 : int, long, final, float    // 예약어
		 - 상수 : PI                      	//개발자들 간의 암묵적 규칙으로 상수는 대문자로 표기 
		 									//값을 한번만 저장할 수 있는 공간
		 */
		
		/*
		[2-3] 다음 중 기본형이 아닌 것은?
		1. int
		2. Byte
		3. double
		4. boolean
		
		정답 : 2
		풀이 : 기본형은 boolean, char, byte, short, int, long, float, double
			  정답이 2번인 이유는 'b'가 대문가 'B'로 표기되었기 때문이다.
		
		
		*/
		
//		 [2-4] 다음 문장들의 출력 결과를 적으세요.
		 System.out.println("1"+"2");
		   // 문자열 String + String -> String 
		   // "1" + "2" -> 12
		  
		 System.out.println(true + "");
		  	// boolean + String => String
		 	// boolean이 String으로 변환되고, "" 값은 null값은 아니지만 빈 공간이지만 문자가 존재
		 	// String + String -> String
			// "true" + "" -> "true"
		 
		 System.out.println('A' + 'B');
		 	// char + char = int + int 가 되는데
		 	// 4byte는 밑으로는 자동으로 int로 바뀜
		  	// ASCII CODE로 A는 65, B는 66이기 때문에
		  	// 정답은 131이 나온다.
 
		 System.out.println('1' + 2);
		 	// char + int = int --> int + int = int
		  	// ASCII CODE로는 1은 49이다.
		 	// 정답은 51이다.

		 System.out.println('1' + '2');
		 	// char + char = int + int 가 되는데
		 	// 4byte는 밑으로는 자동으로 int로 바뀜
		 	// ASCII CODE 로는 1은 49, 2는 50이다.
		 	// 정답은 99이다.

		 System.out.println(4 + 24.3715F);
		 	// int + float ==> float + float = float
		 	// 4개의 정수에서 실수 24.3715를 더하면 답은 28.3715가 나온다.
		  
		 System.out.println('A'+3.14);
		 	// char + double => double + double = double
		  	// ASCII CODE로는 A는 65에서 3.14를 더하면 68.14가 나온다.
		 
		 System.out.println('J'+"ava");
		 	// char + String => String + String = String
		 	// "J"+"ava"
		    // 정답은 Java이다.
		 
//		 System.out.println(true + null);
		 	//true는 boolean, null은 참조형이라 주인이 누군지 몰라서 물음표가 나온다.
		 	//계산을 할 수가 없으므로 오류가 나온다.
		 
		 /*
		 [2-5] 다음 중 키워드가 아닌 것은? (모두 고르시오)
		 1. if
		 2. True
		 3. Null
		 4. Class
		 5. System
		 
		 정답 : 2,3,4,5
		  이유 : 키워드란 변수타입을 의미하는데,
		   		True는 앞이 대문자라서 키워드가 아니고
		  		Null, Class 또한 위의 이유와 마찬가지이다.
		  		System를 변수로 쓴다면 출력이 되지 않기 때문에 예약어가 아니다. 
		  */

		 /*
		 [2-6] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
		 1. $ystem			//명명규칙으로 특수문자는 '_','$'만이 사용가능하다.
		 2. channel#5		//위와 같은 이유로 특수문자 #은 사용 불가하다.
		 3. 7eleven			//명명규칙으로 변수앞에 숫자는 올 수 없다.
		 4. If				//본래 if였다면 사용하지 못하지만 앞글자가 대문자라면 사용가능하다.
		 5. 자바				//한글도 사용가능하긴 하지만 개발자들 간의 암묵적 규칙으로 한글은 사용하지 않는다.
		 6. new				//new는 예약어이기 때문에 변수로 쓰려면 앞글자 n을 N으로 바꿔야 사용가능하다.
		 7. $MAX_NUM			//특수 문자 '$'를 사용했고 상수이기 때문에 글자가 길어지므로 '_'를 쓴다.
		 8. hellow@com		//명명규칙으로 특수문자는 '_', '$'만이 사용가능하다.
		
		  정답 : 1,4,5,7
		  */
		 
		 /*
		  [2-7] 참조형 변수와 같은 크기의 기본형은 ? (모두 고르시오)
		  [Hint] 참조형 변수의 크기는 4byte이다.
		  1. int
		  2. long
		  3. short
		  4. float
		  5. double
		  
		    정답 : 1,4
		    
		    풀이 : 기본형 타입의 크기 (1byte = 8bit)
		    	- 1byte : boolean, byte
		    	- 2byte : char, short
		    	- 4byte : int, float
		    	- 8byte : long, double
		  */
		 
		  /* 
		  [2-8] 다음 중 형변환을 생략할 수 있는 것은? 
		  byte b = 10;
		  char ch = 'A';
		  int i = 100;
		  long l = 1000L;
		  
		  1. b = (byte)i;		// int -> byte로 가려면 형변환 연산자를 사용해야 한다.
		  2. ch = (char)b;		// byte -> char도 형변환 연산자가 필요하다.
		  3. short s = (short)ch;	// char -> short도 형변환 연산자가 필요하다.
		  4. float f = (float)l;	// long -> float은 형변환 연산자가 없어도 된다.
		  5. i = (int)ch;			// char -> int은 형변환 연산자가 없어도 된다.
		  							// int -> 4byte -> 32bit -> 31칸 -> -2^31 ~ +2^31-1
		  
		    정답 : 4,5
		    풀이 : byte -> short -> int -> long -> float -> double
		  				char -> int ---------------------------
		  */
		 
		 /* 
		 [2-9] char 타입의 변수에 저장될 수 있는 정수 값의 범위는?
		 풀이 : 2byte => 16byte => 16칸 => 0~2^16-1
		 
		 [2-10] 다음 중 변수를 잘못 초기화 한 것은? (모두 고르시오)
		 1. byte b =256;		// byte -> 1byte -> 8bit -> 7칸 -> -2^7 ~ +2^7-1 이기 때문에 범위가 초과된다.
		 2. char c = '';		// char에서는 ''의 안에 반드시 한 개의 문자열을 지정해야 한다.
		 3. char answer = 'no'; // char에서는 두 개의 문자열은 사용하지 못한다.
		 4. float f = 3.14		// 3.14뒤에 f를 붙이고 ;까지 써야한다.
		 5. double b = 1.4e3f;	// 1.4e3f; 앞에 (double)를 넣어줘야 하지만 생략이 가능하다. 
		 							byte -> short -> int -> long -> float -> double
		  									 char -> int ---------------------------
		 							이기 때문에 형변환 연산자가 없어도 된다
		 정답 : 1,2,3,4
		*/
		
	}

}
