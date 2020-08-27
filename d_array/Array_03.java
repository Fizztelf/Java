package d_array;

public class Array_03 {

	public static void main(String[] args) {
		
		/*
		1. 다차원배열
		  - 자바에서는 1차원 배열뿐만 아니라 다차원 배열도 허용한다.
		
		2. 이차원 배열의 선언
		  - 변수타입[][] 변수명; 	int[][] arr;
		  - 변수타입[] 변수명[];
		  - 변수타입 변수명[][];
		
		3. 이차원 배열의 생성
		  - 변수타입[][] 변수명; ==    변수명 = new 변수타입[크기1][크기2];
		  - 변수타입 변수명[][]; = {{1,2},{2,3}};
		  - 변수타입 변수명[][] = new 변수타입 [][] {{1,2},{2,3}}
		*/
		
//		int[][] arr = new int[2][3];
		
//		{
//			{0,0,0},	//0번째		00	01	02
//			{0,0,0}		//1번째		10	11	12
//		}
		
//		// arr.length : 2
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1][1]);
//		
//		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);y 
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		
//		for(int i = 0; i < arr.length; i++){
//			for(int j =0; j< arr[i].length; j++){
//				System.out.println(arr[i][j]);
//			}
//		}
		
		
		int[][] arr2 = {
						{10,20,30},
						{40,50,60}
					   };
		
		for(int i = 0; i < arr2.length; i++){
			for(int j =0; j< arr2[i].length; j++){
//				System.out.println(arr2[i][j]);
			}
		}
		
		
		
		int[][] arr3 = new int[3][];
//		{
//			null,
//			null,
//			null,
//
//		}
//		System.out.println(arr3[0]);
		
		arr3[0] = new int[2];
//		{
//			{0,0},
//			null,
//			null
//
//		}
		
		arr3[1] = new int[3];
//		{
//			{0,0},
//			{0,0,0},
//			null
//
//		}
		
		arr3[2] = new int[4];
//		{
//			{0,0},
//			{0,0,0},
//			{0,0,0,0}
//
//		}
		
		arr3[0] = new int[3];
		arr3[1] = new int[2];
		arr3[2] = new int[4];
//		{
//			{0,0,0},
//			{0,0},
//			{0,0,0,0}
//
//		}
		
	
		//3. 변수 names를 선언하고 주변 친구 6명의 이름으로 초기화 하여라.
		String[] names = {"박찬","전진원","김선준","김성준","서대철","송찬중"};
		
		//4. 7과목 subjects 까지 국영수사과 .... 출력하라.
		String[] subjects = {"국어","영어","수학","사회","과학","도덕","일어"};
		
		
		
		
		//1. 6명의 7과목을 저장할 수 있는 배열 score을 선언 및 생성해주세요
//		int[][] score = new int[6][7];
		int[][] score = new int[names.length][subjects.length];
				
		
		
		//2. score 각 방을 0~100점 사이의 임의의 정수의 값을 저장하여라.
		
		for (int num = 0; num < score.length; num++) {
			for (int mum = 0; mum < score[num].length; mum++) {	
				score[num][mum] = (int)(Math.random()*101);
			}
		}
		
		
		
		//5. 사람 별 점수 합계
		int[] sum = new int[names.length];
		for(int num = 0; num < names.length; num++){
			for(int mum = 0; mum < subjects.length; mum++){
				sum[num] += score[num][mum];
			}
		}
		
		//6. 사람 별 평균 소수점 3번째에서 2번째까지.
		float[] avg = new float[names.length];
		for(int num = 0; num < names.length; num++){
			avg[num] = (int)(float)((sum[num]/subjects.length*100+0.5)/100f);
		}
		
		//7. 과목별 합계를 구하라
		int[] sum1 = new int[subjects.length];
		for(int num = 0; num < subjects.length; num++){
			for(int mum = 0; mum < names.length; mum++){
				sum1[num] += score[mum][num];
			}
		}
		
		//8. 과목별 평균을 구하라
		float[] avg1 = new float[subjects.length];
		for(int num = 0; num < subjects.length; num++){
			avg1[num] = (int)(float)((sum[num]/names.length*100+0.5)/100f);
		}
		
		//9. 사람별 석차를 구하라
		
		//10. 성적순으로 sort하라
		
		//0. 아래와 같이 출력해주세요
		
//		0	0	0	0	0	0	0
//		0	0	0	0	0	0	0
//		0	0	0	0	0	0	0
//		0	0	0	0	0	0	0
//		0	0	0	0	0	0	0
//		0	0	0	0	0	0	0
		
		
		for(int num = 0; num < subjects.length; num++){
			System.out.print("\t"+subjects[num]);
		}
		System.out.print("\t"+"합계");
		System.out.print("\t"+"평균");
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t");
	
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(sum[i] + "\t" + avg[i]);
			System.out.println();
		}
		
		System.out.print("합계");
		for(int k = 0; k < subjects.length; k++){
			
			System.out.print("\t"+sum1[k]);
		}
		System.out.println();
		
		for(int a = 0; a < subjects.length; a++){
			System.out.println(avg1[a]);
		}
		System.out.println("평균");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
