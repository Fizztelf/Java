package c_sentence;

public class Sentence_02 {

	public static void main(String[] args) {
		
		/*
		1. 반복문 (for, while, do-while)
		  - 어떤 작업이 반복적으로 수행되도록 할 때, 사용된다.
		  - 반복문은 주어진 조건이 만족하는 동안 문장을 반복 수행한다.
		  - for문의 경우 반복횟수를 알고 있을 때 사용한다.
		  - while문의 경우 반복 횟수를 모를 때 사용한다.
		  
		2. for문 
		  - 기본 구조
		  for(초기화; 조건식; 증감식) {
		  	조건식이 만족할 때 수행될 문장
		  }
		*/
		
		
		//0~10까지 출력해주세요.
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
	
		//초기화 : , 조건식 : , 증감식 : , 수행문장
		// 0        9        1      System.out.println(x)
		// 조건식 -> 수행 -> 증감식!
		for(int num = 0; num < 10; num++) {
//			System.out.println(num);
		}
		
		//1. 5에서 16까지의 합을 구하여라
		
		int sum = 0;
//		sum += 5;	// sum = sum + 5;		sum = 0 + 5 = 5
//		sum += 6;	// sum = sum + 6;       sum = 5+6 = 11
//		sum += 7;	// sum = sum + 7;		sum = 11 + 7 = 18
//		sum += 8; 	// sum = sum + 8;		sum = 18 + 8 = 26
//		sum += 9;	// sum = sum + 9;		sum = 26 + 9 = 35
//		sum += 10;	// sum = sum + 10;		sum = 35 + 10 = 45
//		sum += 11;	// sum = sum + 11;		sum = 45 + 11 = 56
//		sum += 12;	// sum = sum + 12;		sum = 56 + 12 = 68
//		sum += 13;	// sum = sum + 13;		sum = 68 + 13 = 81
//		sum += 14;	// sum = sum + 14;		sum = 81 + 14 = 95
//		sum += 15;	// sum = sum + 15;		sum = 95 + 15 = 105
//		sum += 16;	// sum = sum + 16;		sum = 105 + 16 = 121 ?????
		// 시작 : 5, 끝 : 16, 증가량 :1, 반복구문 : sum += ?;
		
		for(int num = 5; num < 17; num++){
			sum += num;
		}
//		System.out.println(sum);
				
		
		//1. 0이상 5이하에서 정수를 결과와 같이 출력하여라
		// 0 1 2 3 4 5
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		// 시작 : 0 , 끝 : 5, 증가량 : 1, 반복구문 System.out.println(y);
		
		for (int i = 0; i < 6; i++){
//			System.out.print(i);
		}
				
		//2. 0이상 5이하에서 정수를 결과와 같이 출력하여라
		// 5 4 3 2 1 0
//		System.out.println(5);
//		System.out.println(4);
//		System.out.println(3);
//		System.out.println(2);
//		System.out.println(1);
//		System.out.println(0);
		// 시작 : 5, 끝 : 0, 증가량 : -1 , 반복구문 : System.out.println(x);
		for (int i1 = 5; i1 > -1; i1--){
//			System.out.print(i1);
		}
		
		// 3. 2이상 10 이하에서 정수 합계를 구하라
		// 54
		int num1 = 0;
//		num1 += 2;
//		num1 += 3;
//		num1 += 4;
//		num1 += 5;
//		num1 += 6;
//		num1 += 7;
//		num1 += 8;
//		num1 += 9;
//		num1 += 10;
		
		// 시작 : 2 , 끝 : 10, 증가량 : 1 , 반복구문 : num += ?;
		for (int sum1 = 2; sum1 <11; sum1++){
			num1 += sum1;
		}
		System.out.println(num1);
		
		//4. 5이상 15미만에서 정수의 곱을 구하여라 (overflow)를 고려하라.
		// 3632428800
		
		long num2 = 1L;
//		num2 *= 5;
//		num2 *= 6;
//		num2 *= 7;
//		num2 *= 8;
//		num2 *= 9;
//		num2 *= 10;
//		num2 *= 11;
//		num2 *= 12;
//		num2 *= 13;
//		num2 *= 14;
		// 시작 : 5 , 끝 : 14, 증가량 : 1 , 반복구문 : num2 *= ?;
		for(int sum2 = 5; sum2 < 15; sum2++){
			num2*=sum2;
		}
		System.out.println(num2);
		
		//5. 3이상 4462이하에서 짝수인 정수의 합을 구하여라.
		int a1 = 0;
//		a1 += 3;
//		a1 += 4;
//		a1 += 5;
//		a1 += 6;
//		a1 += 7;
//		//...
//		a1 += 4462;
		// 시작 : 3 , 끝 : 4462 : 증가량 1 , 반복구문 a1 += ?;
		
		for (int s1 = 3; s1 < 4463; s1++) {
			if(s1%2==0){
				a1 += s1;
			}
		}
//		System.out.println(a1);
		
		//6. 7초과 57미만에서 2또는 3의 배수인 정수의 합을 구하라
		int a2 = 0;
//		a2 += 8;
//		a2 += 9;
//		a2 += 10;
//		//.....
//		a2 += 55;
//		a2 += 56;
		// 시작 : 8 , 끝 : 56, 증가량 : 1 ,반복구문 : a2+=?;
		
		for (int s2 = 8; s2 < 57; s2++){
			
			if((s2%2 ==0) || (s2%3==0)) {
				a2 += s2;
			}
			
		}
		
//		System.out.println(a2);
		
		// 0부터 10까지 2의 배수 3의 배수 합
		int s4 = 0;
		for (int s3 = 0; s3 <11; s3++){
			if((s3%2==0) || (s3%3==0)){
				s4 += s3;
			}
				
		}
//		System.out.println(s4);
		
//		// 2 * 1 = 2 (2*1)
//		System.out.println(2 + "*" + 1 + "=" + 2*1);
//		// 2 * 2 = 4 (2*2)
//		System.out.println(2 + "*" + 2 + "=" + 2*2);
//		// 2 * 3 = 6 (2*3)
//		System.out.println(2 + "*" + 3 + "=" + 2*3);
//		// 2 * 4 = 8 (2*3)
//		System.out.println(2 + "*" + 4 + "=" + 2*4);
//		// 2 * 5 = 10 (2*3)
//		System.out.println(2 + "*" + 5 + "=" + 2*5);
//		// 2 * 6 = 12 (2*3)
//		System.out.println(2 + "*" + 6 + "=" + 2*6);
//		// 2 * 7 = 14 (2*3)
//		System.out.println(2 + "*" + 7 + "=" + 2*7);
//		// 2 * 8 = 16 (2*3)
//		System.out.println(2 + "*" + 8 + "=" + 2*8);
//		// 2 * 9 = 18 (2*3)
//		System.out.println(2 + "*" + 9 + "=" + 2*9);
//		System.out.println();
//		// 시작 : 1 , 끝 : 9 , 증가량 1
//	
//		
//		for (int i1 = 2; i1 < 10; i1++){
//			System.out.println(2 + "*" + i1  + "=" + 2*i1);
//		
//		}
//		 
//		
//		// 3 * 1 = 3 (3*1)
//		System.out.println(3 + "*" + 1 + "=" + 3*1);
//		// 3 * 2 = 6 (3*2)
//		System.out.println(3 + "*" + 2 + "=" + 3*2);
//		// 3 * 3 = 9 (3*3)
//		System.out.println(3 + "*" + 3 + "=" + 3*3);
//		// 3 * 4 = 12 (3*4)
//		System.out.println(3 + "*" + 4 + "=" + 3*4);
//		// 3 * 5 = 15 (3*5)
//		System.out.println(3 + "*" + 5 + "=" + 3*5);
//		// 3 * 6 = 18 (3*6)
//		System.out.println(3 + "*" + 6 + "=" + 3*6);
//		// 3 * 7 = 21 (3*7)
//		System.out.println(3 + "*" + 7 + "=" + 3*7);
//		// 3 * 8 = 24 (3*8)
//		System.out.println(3 + "*" + 8 + "=" + 3*8);
//		// 3 * 9 = 27 (3*9)
//		System.out.println(3 + "*" + 9 + "=" + 3*9);
//		System.out.println();
//		
//		
//		for(int num=1; num <10; num++){
//			System.out.println(3 + "*" + num + "=" + 3*num);
//			
//		}

		

//		시작 : 2 , 끝 : 9 , 증가량 : 1
		//반복구문 : 
		//for (int num =1 ; num<10; num++){
//			System.out.println(dan+"*"+num+"="+dan*num);
	//  }
		
//		for(int a = 2; a < 10; a++){
//			for (int b = 1; b <10; b++){
//				System.out.println(a + "*" + b + "=" + a*b);
//			}
//		}
		
		/*
		3. while문 
		  - 반복횟수를 알 수 없을 때 많이 사용.
		  - 조건식과 수행해야할 블럭{}만으로 구성되어 있다.
		  - 기본구조
		  	while(조건식) {
		  		조건식이 true일 때 수행될 문장.
		  	}
		*/
		
		//1~10까지 출력
//		for(int q1 = 1; q1<11; q1++){
//			System.out.println(q1);
//		}
		//1~10까지 출력
//		int q1 = 1;
//		while(q1<11){
//			System.out.println(q1);
//			q1++;
//		}
		
		//1. 3~15까지의 합계를 구해주세요 - while
		// 초기값 : 3, 조건식 : 15, 증감식 1 , 반복구문 : ?+= 3~15;
//		int num3 =3;
//		int sum2 = 0;
//		while(num3<16){
//			sum2+=num3;
//			num3++;
//		}
//		System.out.println(sum2);
		
		// 1~100까지의 정수 중 4의 배수의 합계를 구하라
		// 초기값 : 1 , 조건식 : 100, 증감식 : 1, 반복구문 : ?
		
//		int num4 = 1;
//		int sum3 = 0;
//		while(num4<101){
//			num4++;
//			if(num4%4==0){
//				sum3 += num4;
//			}
//				
//		}
//		System.out.println(sum3);
		
		//3. 구구단을 while문 만을 이용하여 만들어주세요
		
//		int dan = 2;
//		while(dan<10){
//			int gob = 1;
//			while(gob<10){
//				System.out.println(dan + " * " + gob + " = " + dan*gob);
//				gob++;
//			}
//			dan++;
//		} 
		
		//4. 5~? 합계를 구했을 때 합계가 100이상이 되는 ? 값을 구하라.
		// 시작 : 5 , 끝 : ? , 증가량 : 1, 조건 : 합이  100미만
//		int aa1 = 4;
//		int summ = 0;
//		while(summ < 100) {
//			aa1++;	
//			summ += aa1;
//		}
//		System.out.println(aa1);
		//15가 답
		
//		int aa2 = 5;
//		int summ2 = 0;
//		while(true) {	
//			summ2 += aa2;
//			if(summ2 >= 100){
//				break;
//			}
//			aa2++;
//		}
//		System.out.println(aa2);
//		
//		int num8 = 0;
//		while(num8 < 10) {
//			if(num8%2==0){
//				System.out.println(num8);
//			}
//			num8++;
//		}
		
		//이것을 다른 방식으로 풀 수도 있다!
		// -->>
		
//		int num9 = -1;
//		while(num9 < 9){
//			num9++;
//			if(num9%2!=0){
//				continue;
//			}
//			System.out.println(num9);
//			
//		}
		
//		for(int i = 0; i <10; i++) {
//			if(i%2 != 0){
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
