package z_exam;

import java.util.Scanner;

public class Exam_03 {
	
	public static void main(String[] args) {
	/*
	[4-1] 다음의 문장들을 조건식으로 표현하라.
	
	(1) int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
	int x = 15;
	if((10< x)&&(x <20)) {
		System.out.println(x);
	}
	
	-> 20 < x <10
	-> ((20 < x) && (x <10))
	
	(2) char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식
	char ch = 'v';
   	if((ch=='') && (ch!='\t')){
      System.out.println(ch);
   	}
	
	-> ch는 공백	그리고  ch는 탭이 아닐때
	-> ch=='' 	and  ch!= '\t'
	->(ch=='') 	&& 	(ch!='\t')
	
	(3) char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
	char ch = 'x';
	if(ch == 'x') || (ch == 'X'){
		System.out.println(ch);
	}
	
	-> ch == 'x' 또는 ch == 'X'
	
	(4) char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식
	char ch = '2';
	if((ch >= '0') && (ch <= '9')) {
		System.out.println(ch);
	}
	
	-> '0' <= ch <= '9'
	-> '0'<=ch && ch <= '9'
	-> ch는 '0'과 '9'사이에 포함되어야 하기 때문에
	
	(5) char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조선식
	 영문자 = 대문자 또는 소문자 
	 -> 'a' <= ch <= 'z'   또는    'A' <= ch <= 'Z'
	 -> ('a' <= ch) && (ch <= 'z') 또는 ('A' <= ch) && (ch <= 'Z')
	 -> (('a' <= ch) && (ch <= 'z')) || (('A' <= ch) && (ch <= 'Z'));
	 
	(6) boolean형 변수 powerOn가 false일 때 true인 조건식
	boolean powerOn = false;
	if(!powerOn){
		System.out.println(powerOn);
	}
	
	-> powerOn 변수가 false이고 조건식에서 !powerOn이 되어야지
	-> 밑에 실행문이 실행이 된다.
	
	(7) 문자열 참조변수 str이 "yes"일 때 true인 조건식
	String str = "yes";
   	if("yes".equals(str)){
      	System.out.println(str);
   	}
	*/
	
	/*
	[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
	*/
//		int sum = 0;
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		//....
//		sum += 19;
//		sum += 20;
//		//시작 : 1, 끝 : 20 , 증감 : 1, 반복 구문 : sum += ?;
//
//		for(int num = 1; num < 21; num++){
//			if(!(num%2==0)||(num%3==0))
//				sum += num;
//		}
//		System.out.println(sum);
		
		/*
		정답 : 73
		풀이 : for문을 통하여 1부터 20까지 하나씩 증가하는 조건문을 작성했다면
			2 또는 3의 배수가 아닌 수의 총합을 구해야 한다.
			본래 1~20까지 정수의 총합은 283이다.
			차례로 1+2+3+4+5+..... 이렇게 더 해 갈텐데
			이중에 2,3배수가 아닌 수를 구해야하기 때문에 
			num값에서 2로 나누었을 때 나머지가 0인 => 2의 배수
			num값에서 3으로 나누었을 때 나머지가 0인 => 3의 배수
			문제에서는 2,3 배수가 아닌 수를 구하라 했으니
			등가비교 연산자를 써준다.
		*/
		
		
		
	/*
	[4-3] 다음의 for문을 while문으로 변경하시오.
	for(int dan = 2; dan < 10; dan++) {
		for (int gob = 1; gob < 10; gob++) {
			System.out.println(dan + " * " + gob + " = " + dan*gob);
		}
	}
	
	*/
		
	/* 
	정답 :
	int dan = 2
	while(dan<10){
	int gob = 1;
		while(gob<10){
			System.out.println(dan + " * " + gob + " = " + dan*gob);
			gob++;
		}
		dan++;
	} 
	
	풀이:
	-----------------------------------------------------------------------------------------------
	for문 ---> while문
	ex)
	
	for(int i = 1; i < 6; i++){				 	int i = 1;
		System.out.println(i);			     	while(i<6){
	}								===>			System.out.println(i);
													i++;
												}
	------------------------------------------------------------------------------------------------
	
	for(int dan = 2; dan < 10; dan++) {									int dan = 2;
	 	System.out.println(dan);					===>				while(dan <10){
	 }																		System.out.println(dan);	
	 																		dan++;
	 																	}
	 ------------------------------------------------------------------------------------------------
	 for (int gob = 1; gob < 10; gob++) {								int gob = 1;
		System.out.println(gob);					===>				while(gob <10){
		}																	System.out.println(dan);
	 																		gob++;
	 																	}
	 
	 위 처럼 while문으로 변경한 상태에서 합쳐주면 된다.
	 
	 */
		
	
//		System.out.println();
		
		
	
	/*
	[4-4] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
	*/

//		for (int num1 = 1; num1 <7; num1++){
//			for(int num =1; num <7; num++){
//				if (num1+num==6){
//					System.out.println("("+num1 + "," + num + ")");
//				}
//			
//			}
//			
//		}
//		System.out.println();
		
		/*	
		풀이 :
		(1,1) (2,1)	... (6,1)		초기 : 1, 조건식:6, 증가량 :1
		(1,2) (2,2) ... (6,2)
		(1,3) (2,3) ... (6,3)
		(1,4) (2,4) ... (6,4)
		(1,5) (2,5) ... (6,5)
		(1,6) (2,6) ... (6,6)
		 
		 두 개의 주사위를 던졌을 때 눈의 합이 6이 되려면
		(1,5)
		(2,4)
		(3,3)
		(4,2)
		(5,1) 총 5개가 나와야한다.
		
		for문에서 조건식을 보면 num1 < 7 이렇게 되어있다. 6으로 바꿔도 되고 안 바꿔도 상관없다.
		어차피 합은 6만 나오면 되기 때문이다.
		for문으로 조건문 2개를 써준다. 각각의 주사위를 의미한다.
		1~6까지 초기값은 :1, 조건식은 6, 증가량은 1이다.
		그 다음 if문을 통해 두 개의 주사위의 합이 6이라면 경우의 수들이 나오게 된다.
		
		
		*/
	
	/*
	[4-5] 방적식 2x+4y = 10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10이다.
	
	*/
//		for(int x = 0; x < 11; x++){
//			for(int y = 0; y <11; y++) {
//				if(2*x+4*y==10){
//			System.out.println("x:" + x + "  y:" + y);
//				}
//			}
//		}
//		System.out.println();
		
		/*
		 정답 : x:1 y:2 , x:3 y:1, x:5 y:0
		풀이 : 
		x y		x y 	x y 				 x y
		0 0		1 0		2 0					10 0
		0 1		1 1		2 1					10 1
		0 2 	1 2		2 2					10 2
		0 3  	1 3		2 3					10 3
		0 4 	1 4		2 4					10 4
		0 5  	1 5		2 5		 ....		10 5
		0 6		1 6		2 6					10 6
		0 7		1 7		2 7					10 7
		0 8		1 8		2 8					10 8
		0 9		1 9		2 9					10 9
		0 10	1 10	2 10				10 10
		
		x -> 초기값 0 , 조건식 10, 증가량 1
		y -> 초기값 0 , 조건식 10, 증가량 1
		
		문제에서 각각의 범위를 알려줬다. 이로써 실수형이 아닌 정수형으로 값을 구할 수 있다.
			for문을 통해 조건식을 쓰고, if문에 방정식을 적는다.
			x,y가 0부터 10까지 하나씩 증가할때.
			2*x + 4*y = 10이 되어야 한다.
			1부터 증감하면서 if문의 조건식에 숫자를 대입한다.
		*/
	
	/*
	[4-6] 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
	
	*/	
		
		//초기값 : 시작, 조건식: 끝, 증가량 :1, 반복구문 : sum *=?;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		int input = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		int input1 = sc.nextInt();
		
		int sum2 = 1;
		if (input < input1) {
			for (int num = input; num < input1+1; num++) {
				sum2 *= num;
			}
		}
		else if (input1 < input) {
			for (int num = input1; num < input+1; num++) {
					sum2 *= num;
				}
		} else {
			sum2 = input;
		}

		
		System.out.println("곱해주면 답은 " + sum2 + " 입니다");
	
	/*
	[4-7] 1 + (1+2) + (1+2+3+) + ... + (1+2+3+...+10)의 결과를 계산하시오.
	// 초기값 : 1, 끝 : 10, 증가량 : 1, 반복구분 : sum1 += ?;
	*/
//		int sum1 = 0;
//		for(int num =1; num <11; num++){
//			for(int num1 = 1; num1 <num+1; num1++){
//				sum1 += num1;
//			}
//			
//		}
//		System.out.println(sum1);
		
		
	/*
	 정답 : 220
	풀이 : 
	1					<- 1
	1 2					<- 2
	1 2 3 				<- 3
	1 2 3 4				<- 4
	.
	.
	.
	1 2 3 4 ... 10		<- 10
	인덱스 보다 하나씩 커진다.
	
		조건문을 사용해 초기값 1부터 조건식 10까지, 증가량은 1이다.
		 단지 이렇게만 값을 계산 한다면 1~10까지 정수의 합밖에 계산되지 않는다.
		 그래서 또 다른 for문을 사용해줘야한다. 초기값은 역시나 똑같이 1이지만 조건식부터 달라진다.
		 조건식은, 첫 번째 변수는 1씩 증가된 두번째 변수 보다 작아야한다.
		 예를 들어 만약 num1이 2라면, num+1 = 3이 된다.   ==>> (1+2+3)이 된다.
		 이 상태에서 맨 처음 선언해준 변수와 두번째 조건문 변수 num1을 더하면 값이 나온다.
		
		
	*/	
		
	
	/*
	[4-8] 1 + (-2) + 3 + (-4) + ... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.
	
	*/
//		int sum11 = 0;  //총합 저장 변수
//		int num = 0;
//		
//		while(true){
//			num++;
//			if(num%2==0){
//				sum11 -= num;
//			}else {
//				sum11 += num;
//			}
//			if(sum11 >= 100){
//				break;
//			}
//		}
//		System.out.println(num);
		
	/*
	정답 : 199	
	풀이 : 초기값은 1이지만 조건식을 모르기 때문에 while(true)를 통해 무한반복을 통해서 값을 구해야 한다.
	 	  짝수 형에만 -가 붙고, 홀수 형에는 +가 있다.
	 	 num값이 짝수일 때는 -를 붙인 상태해서 더하고 그렇지 않을 경우(else) 홀수라면  + 상태에서 sum값에 더한다.
		 if문으로 sum값의 총합이 100 보다 클 때까지 더해주다가 100을 넘어가면 break로 멈춰준다. 
		 
		
	*/	
		
		
	/*
	[4-9] 사용자로부터 입력받은 정수의 각 자리의 합을 더한 결과를 출력하는 프로그램을 작성하시오.
		    예를 들어, 사용자가 53263을 입력하였다면 결과는 19가 되어야 한다.
	*/
//		int s1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("값을 입력해주세요");
//		s1 = sc.nextInt();
//		
//		int summ = 0;
//
//		while(s1 > 0){
//			summ += s1 % 10;	// 예를 들어서 사용자가 123을 입력을 했다면 나누기 해서 나온 나머지 값을 summ에 저장한다
//			s1 /= 10;			// 사용자가 입력한 값에서 나누기 10을 해야 나머지 몫이 나오는데 위와 같이 나머지 나온 값을 계속 반복실행 해서 더하면 된다.
//		}
//		System.out.println("결과는 " + summ + " 입니다.");
	
	/*
	[4-10] 피보나치(Fibonnaci) 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는
	 	   2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다.
	 	   1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 작성하시오.
	*/
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;
//		System.out.print(num1 + "," + num2);
//		
//		for(int i =0; i<8; i++){
//			num3 = num1 + num2;
//			num1 = num2;
//			num2 = num3;
//			System.out.print(","+num3);
//		}
		
	/*	
	풀이 : 앞서 num1~3까지 변수를 초기화 해준다. num1과 num2가 왜 1이냐면, 문제에서 앞서 말했듯이 두 수가 1과 1이어야지 다음 수가 2가 된다.
         	그렇게 되면 2는 num3값이 되고, for문에서 10번째 수까지 출력이 되려면 조건식은 7까지어야 한다.
         	위에 주석을 단 것 처럼 num3값을 출력하면 문제와 같은 식이 나오게 된다.	
         	다시 말해서, 1번째 숫자와 2번째 숫자를 더해서 3번째 숫자가 나오고 그 다음에 2번째 숫자와 3번째 숫자가 더해져서 4번째 숫자가 나오고
         	3번째 숫자와 4번째 숫자가 더해져서 그 다음 5번째 숫자가 나오는 순서이다.
		
	*/	
	/*
	[4-11] 다음은 주어진 문자열(value)이 숫자인지 판별하는 프로그램이다. (1)에 알맞는 코드를 넣어서 완성하시오.
	String value = "12o34";
	char ch = ' ';
	boolean isNumber = true;
	//반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
	for(int i = 0; < value.length(); i++){
	
					(1)
	
	}
	
	if(isNumber){
		System.out.println(value+"는 숫자입니다.");
	} else{
		System.out.println(value+"는 숫자가 아닙니다.");
	}
	
		
	*/
		
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//		//반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
//		for(int i = 0; i < value.length(); i++){
//			
//			ch = value.charAt(i);
//			if(!('0'<=ch&&ch<='9'))
//				isNumber=false;
//		
//		}
//		
//		if(isNumber){
//			System.out.println(value+"는 숫자입니다.");
//		} else{
//			System.out.println(value+"는 숫자가 아닙니다.");
//		}
		
		
		
		
		
		
		
		
		
		
	}
}
