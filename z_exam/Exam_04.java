package z_exam;

public class Exam_04 {
	public static void main(String[] args) {
		
		/*
		[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.
		
		(1) int[] arr[];
		(2) int[] arr = {1,2,3,};		// arr.length는 3이다.
		(3) int[] arr = new int[5];
		(4) int[] arr = new int[5]{1,2,3,4,5};
		(5) int arr[5];
		(6) int[] arr[] = new int[3][]; 
		
		정답 : 4, 5
		풀이 : 배열의 선언은 이렇게 한다.
		
			  1) 1차 배열 선언
		 	   변수타입[] 변수명;
			   변수타입 변수명[];
			   
			  2) 2차 배열 선언
			  변수타입[][] 변수명;
			  변수타입 변수명[][];
			  변수타입[] 변수명[];
		
			그러므로 4번에서 [5]와 같이 숫자를 넣으면 안된다. {}의 데이터 개수에 따라 결정된다
			그러므로 5번에서는 int arr[]; 이면 정답이지만 []안에 숫자를 넣으면 크기가 지정되기 때문에 틀리다.
		*/
		
		
		
		/*
		[5-2] 다음과 같은 배열이 있을 때,
		(1) arr[3].length의 값은 얼마인가?
		(2) arr.length의 값은 얼마인가?
		(3) System.out.println(arr[4][1])의 출력 결과는 얼마인가?
		
		int[][] arr = {
						{ 5, 5, 5, 5, 5},
						{ 10, 10, 10},
						{ 20, 20, 20, 20},
						{ 30, 30}
					  };
						
		풀이 :
		(1) {5,5,5,5,5} 부분을 1부터 숫자를 세면 안된다. 0부터 세서 3은 {30,30}이기 때문에 값은 2이다.
		(2) 윗 문제와 마찬가지로 0,1,2,3 이기 때문에 값은 4이다.
		(3) 계속 말했듯이 arr[3]까지만 있기 때문에 arr[4]는 오류다.
		
		
		*/
		
		/*
		[5-3]배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오
		
		// 결과  :  sum =150
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		//sum += arr[0];
		               ?
		
		System.out.println("Sum = "+sum);
		
		정답 : for(int i = 0; i < arr.length; i++){
			  	sum += arr[i];
			  }
		
		풀이 : //sum += arr[0];
			 //sum += arr[0];
			 //sum += arr[0];
			 //sum += arr[0];
			 //sum += arr[0];
			 시작 0 , 끝 4 , 증가량 1
			 반복구문 : sum += arr[i];
		*/
		
		
		/*
		[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		
		// 결과   :  
		// total =201
		// Average = 16.75
		
		int[][] arr = {
					{ 5, 8, 13, 5, 2 },
					{ 22, 13, 28 },
					{ 2, 18, 23, 62 }
				  };
		int total = 0;	// 총 합계 저장 변수
		float average = 0; 	//평균 변수
		
		
		
					(1)
					
					
		System.out.println("total = "+total);
		System.out.println("Average = "+average);			
				
		정답 : 
		int index = 0; // 평균을 구하려면 개수로 나눠야 하기 때문에 필요한 변수
		for(int i = 0; i < arr.length; i++){	//0부터 arr 인덱스만큼 1씩 증가
			for(int j = 0; j < arr[i].length; j++){ //0부터 각 길이의 인덱스만큼 1씩 증가
				total += arr[i][j];	// arr의 모든 값을 total에 저장
			}
			index += arr[i].length; // 배열의 모든 수를 index에 저장
		}
		average = ((int)((float)total/index*100+0.5))/100f;	// 소수점 3째 자리에서 반올림 한 평균 avg에 저장
		*/
		
	
		/*
		[5-5] 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
			    단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다. (1)에 알맞는 코드를 넣어서 프로그램을 완성하시오.
			    
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2790;
		
		
		int mok = 0; //몫을 저장하는 변수
		for(int i = 0; i < coinUnit.length; i++){
			mok = money/coinUnit[i]; // 500, 100, 50, 10 을 차례차례 2970로 나눈다.
									 // 2790을 500으로 나누면 몫은 5
									 // 나머지는 290
									 // 290을 100으로 나누면 몫은 2
									 // 90원을 50으로 나눈 몫은 1
									 // 40을 10으로 나눈 몫은 4
									
			money -= (coinUnit[i]*mok);		//윗 주석처럼 큰 수 부터 나누고 남은 나머지 수를 money에 저장
			System.out.println(coinUnit[i]+"원 : " + mok + "개");
		}
		풀이 :
		
		반복구문!
		
		500원.
		mok = money / coinUnit[0]
		money -= (coinUnit[0]*gu
		
		100원.
		mok = money / coinUnit[1]
		money -= (coinUnit[1]*gu
		
		50원
		mok = money / coinUnit[2]
		money -= (coinUnit[2]*gu
		
		10원
		mok = money / coinUnit[3]
		money -= (coinUnit[3]*gu
		
		*/
		
		
		
		/*
		[5-6] 다음은 1과 9사이의 중복되지 않는 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
			    ※ 임의의 값을 사용했기 때문에 실행결과를 다룰 수 있다.
		
		//결과 :
		 6
		 8
		 2
			    
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		
		// ballArr의 index 순서대로 index의 요소와 임의의 요소를 골라서 값을 바꾼다.
		
		// ballArr의 앞에서 3개를 ball3로 복사한다.
		 

 		// ball3의 값을 출력한다.
 	
		
		*/
		
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		
//		for(int i = 0; i < ballArr.length; i++){
//			int random = (int)(Math.random() * 9+1);
//			int tmp = 0;
//			tmp = ballArr[i];
//			ballArr[i] = ballArr[random];
//			ballArr[random] = tmp;
//			System.out.println(ballArr[i]);
//		}
//		for(int i = 0; i < 3; i++){
//			ball3[i] = ballArr[i];
//		}
//		
//		for(int i = 0; i <ball3.length; i++){
//			System.out.println(ball3[i]);
//		}
		
		
		
		
		
		
		/*
		[5-7] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램이다.
		
		// 결과 :  
		//	1 : 3개 ***
		//	2 : 2개 **
		//	3 : 2개 **
		//  4 : 2개 **
		  
		int[] answer = { 1, 4, 3, 2, 1, 2, 3, 2, 1, 4};
		int[] counter = new int[4];		// counter = {0,0,0,0}
		
		//answer의 요소들 중 1이면 counter의 0번방을 증가, 2이면 counter의 1번방을 증가
		// 3이면 counter의 2번방을 증가, 4이면 counter의 3번방을 증가.
		  
		  
		// counter에 저장된 요소를 결과와 같이 출력하라  
		
		
		
		// hide : answer의 값의 범위를 측정하여 최대 5개의 통계 만들기
		
		*/
//		int[] answer = { 1, 4, 3, 2, 1, 2, 3, 2, 1, 4};
//		int[] counter = new int[4];
//		
//		for(int i =0; i <answer.length; i++){
//			counter[answer[i]-1]++;
//			}		
//		for(int i1 = 0; i1 < counter.length; i1++){
//			System.out.print(counter[i1]+"개 ");
//			for(int j = 0; j < counter[i1]; j++){
//			
//				System.out.print("*");
//				}	
//			System.out.println();
//		}
		/*
		[5-8] 문제 5-5에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면,
				'거스름돈이 부족합니다.'라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
				(1)에 알맞는 코드를 넣어서 프로그램을 완성하시오.
				
		if(args.length!=1){
			System.out.println("한 개의 숫자만 입력해주세요");
			System.exit(0);
		}
		
		int money = Integer.parseInt(args[0]);
		System.out.println("money="+money);
		int[] coinUnit = {500, 100, 50, 10};	// 동전의 단위
		int[] coin = {5,5,5,5};					// 단위별 동전의 개수
		
		for(int i = 0; i < coinUnit.length; i++){
			int coinNum =0;
			
		   (1) 아래의 로직에 맞게 코드를 작성하시오.
			
			1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
			2. 배열 coin에서 coinNum 만큼의 동전을 뺀다
			(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
			3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			
			System.out.println(coinUnit[i]+"원:" + coinNum);
		}
		
		if(money > 0){
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); 	// 프로그램 종료
		}
		
		System.out.println("=남은 동전의 개수 =");
		for(int i = 0; coinUnit.length; i++){
			System.out.println(coinUnit[i]+"원:"+coin[i]);
		}
		
		
		
		*/
		
		
		/*
		[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성 하시오.
		
			
		char[][] star = {
						{'*','*',' ',' ',' '},
						{'*','*',' ',' ',' '},
						{'*','*','*','*','*'},
						{'*','*','*','*','*'}
						};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i = 0; i < star.length; i++){
			for(int j = 0; j < star.length; j++){
				System.out.println(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i = 0; i < star.length; i++){
			for(int j = 0; j < star.length; j++){
				
				 (1)
				
		}
		System.out.println();
		
		
		for(int i = 0; i < result.length; i++){
			for(int j = 0; j < result.length; j++){
				System.out.println(result[i][j]);
			}
			System.out.println();
		}
		
		
		
		
				출력 결과
		
		 		**
		 		*
		 		*****
		 		*****
		 		****
		 		****
		 		**
		 		**
		 		**
		
		0,0		0,1		0,2		0,3		0,4
		1,0		1,1		1,2		1,3		1,4
		2,0		2,1		2,2		2,3		2,4
		3,0		3,1		3,2		3,3		3,4
		
		x y 	   y 3-x		x->y
		3,0 	=> 0, 0
		2,0 	=> 0, 1
		1,0 	=> 0, 2
		0,0 	=> 0, 3
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
}
