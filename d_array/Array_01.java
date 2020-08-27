package d_array;

public class Array_01 {

	public static void main(String[] args) {

		/*
		1. 배열 (array)이란?
		  - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
		  
		2. 배열의 선언 
		  - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 []를 붙이면 된다.
		   	변수타입[] 변수명;		int[] arr;		참조형은 주소를 저장함
		   	변수타입 변수명[];		int arr[];
		   	
		3. 배열의 생성
		  - 배열을 선언한 다음에는 배열을 생성해야 한다.
		  - 배열을 생성하기 위해서는 연산자 'new'와 함께 배열의 타입와 크기를 지정해 주면된다.
		  	ex) 변수명 = new 변수타입[3];
		  		변수명 = new 변수타입[]{10, 20, 30, 40};
		
		4. 배열의 초기화
		- 배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화 된다.
		*/
		
		//1. int형 값을 4개 저장할 수 있는 변수 arr을 선언 및 생성해주세요
		
//		int[] arr;
//		arr = new int[1];
		
		int[] arr = new int[4]; // {0,0,0,0}
		
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		// 시작 0 ,끝 3, 증가량 1 
		// System.out.println(arr[num]);
		for (int num = 0; num < arr.length; num++){
			System.out.println(arr[num]);
		}
		
		//2. 0번 index(방)에 10, 1번 index에 20, 2번 index에 30, 3번 index에 40
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
		// 시작 0 끝 40 증가량 10			x = (x+1)*10
		
//		for (int num = 0; num < arr.length; num++){
//			arr[num] += (num+1)*10;
//		}
//		
//		for (int num = 0; num < arr.length; num++){
//			System.out.println(arr[num]);
//		}
//		
		
		int[] arr2 = new int[]{1,3,5,7,9};
		int[] arr3 = {1,3,5,7,9};   // 선언 및 생성이 동시에 될 떄
		
		//1. arr3의 모든 방의 합계를 구하라
		
		
//		int sum = 0;
//		sum += arr3[0];
//		sum += arr3[1];
//		sum += arr3[2];
//		sum += arr3[3];
//		sum += arr3[4];
		//시작 : 0 , 끝 : 4, 증가량 :1
		//반복구문 : sum+=arr3[num];
			
//		for (int num = 0; num < arr3.length; num++){
//			sum += arr3[num];
//		}
//		System.out.println(sum);
//		
		
		
//		//1. 6과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성해주세요
//		int[] score = new int[6];
//				
//		//2. score 각 방을 0~100 사이의 임의의 정수값으로 변경하여라.
//		for(int num = 0; num < score.length; num++){
//			score[num] = (int)(Math.random()*101);
//		}
//		
//		//3. score의 각 방의 값을 출력하여라.
//		for(int num = 0; num < score.length; num++){
//			System.out.println(score[num]);
//		}
//		
//		//4. 방의 합계를 구하시오
//		
//		int sum = 0;
//		for(int num = 0; num < score.length; num++){
//			sum += score[num];
//		}
//		System.out.println(sum);
//		//5. score 값들의 평균. 단 소수점 3번째 자리에서 두번째 자리까지 반올림 해서 표현
//		
//		float avg = 0f;
//				
//		avg = (float)sum/score.length;
//		System.out.println((int)(avg*100+0.5)/100f);
//		
//		
//		//6. score의 값들 중 최대값을 구해주세요
//		//단, 최대값을 0으로 초기화 노노
//		int max = score[0];
//		int min = score[0];
//		
//		for(int num = 1; num < score.length; num++){
//			if(score[num] < max){
//				max = score[num];
//			}
////			sum += score[num];
//			if(min < score[num]){
//				min = score[num];
//			}
//		}
//		System.out.println(min);
//		System.out.println(max);
//		
		//7. score의 값들 중 최소값을 구해주세요
		//단, 최소값을 100으로 초기화 노노
		
		
		
		
		
		
		
		
		
	}

}
