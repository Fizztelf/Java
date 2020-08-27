package a_variable;

/**
 * doc주석
 * 
 * @author PC-15 누가만들었는가
 * @since 2020.07.21 언제만들었는가
 */

public class VariableBasic { // class 명 : VariableBasic
	public static void main(String[] args) { // 작업실행공간 , 어떠한 일을 수행(메스드 소괄호 앞)

		// 줄 맞춤 crtl + shift + f

		// 한줄 주석 ctrl + shift + c

		/*
		 * 두줄 주석
		 */

		/*
		 * 1. 변수 
		 *  - 단 하나의 값을 저장할 수 있는 공간이다.
		 * 
		 * 2. 변수의 선언 
		 * 
		 *  [변수타입] 변수명; int name;  같은 영역에서 변수명을 같이 쓸 수 없음.
		 *  ex) byte name;
		 * 
		 * 
		 * 
		 * 3. 변수의 초기화 변수형 = 값;
		 */

		int name;
		name = 10; // 변수의 초기화

		int name2 = 20; // 변수의 선언 및 초기화
		name2 = 40; // 변수 변경

		System.out.println(name2); // 값 출력

		/*
		 * 1. 명명규칙
		 */

		/* 1. 명칭을 줄 때 대소문자를 구분하며, 길이의 제한이 없음
		*
		 * 2. 예약어(keyword, reserved word)는 사용할 수 없음. 
		 *    자주색인 용어들은 다 예약어 ex) int, byte, public 등등
		 *   int tRue; (o) 
		 *   int ture; (x)
		 *
		 * 3. 변수명 앞에는 숫자로 시작하면 안됨.
		 * 	 int top5; (o)
		 * 	 int 5top; (x)
		 *
		 *
		 * 4. 특수문자는 '_' , '$'만 사용가능
		 *   int $sharp; (o)
		 *   int s$_harp; (o)
		 *   int s#arp;(x)
		 */

		
		
		/*
		 * 개발자간의 암묵적인 약속들 (가독성 상향)
		 * 
		 * 1. 클래스명의 첫 글자는 대문자로 쓴다.
		 *  - 변수명과 매스드명은 첫 글자를 소문자로 쓴다.
		 * 
		 * 
		 * 2. 여러 단어로 이루어진 경우에는 첫번째 이후 단어의 첫글자는 대문자로 써야함
		 *  last index of =>  lastIndexOf
		 * 
		 * 
		 * 3. 상수의 이름은 모두 대문자로 써야하고 두 글자 이상일 경우 '_'를 쓴다.
		 *  final int MAX_VALUE = 100;
		 * 
		 * 
		 * 4. 한글은 사용하지 않는다. 
		 * (인코딩 설정 때문, 의미가 애매함) ex) blue : 푸르스름하다. 파랗다 등등
		 */
		
	}
}
