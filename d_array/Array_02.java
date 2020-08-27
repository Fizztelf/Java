package d_array;

import java.util.Arrays;

import sun.security.util.Length;

public class Array_02 {

	public static void main(String[] args) {

		/*
		 * 1. 정렬 (sort) - 어떤 데이터를 빠르고 쉽게 찾을 목적으로 일정한 순서대로 데이터를 가지런히 나열하는 작업 -
		 * 버블정렬, 선택정렬, 삽입정렬
		 * 
		 * 2. 버블정렬(Bubble sort)
		 *  - 인접한 데이터 간에 교환이 계속해서 일어난다.
		 *   - 한 회정니 끝나면 가장 큰 값이
		 * 뒤쪽에 확정된다.
		 * 
		 * 3. 선택정렬 (Select sort)
		 *  - 한 회전이 끝나면 가장 작은 값이 앞쪽에 확정된다.
		 *  - 회전수 = 인덱스 값 - 1
		 * 
		 */

//		int sum = 0;
//		int[] num = new int[] { 5, 2, 3, 1, 4 };
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
//		System.out.println();
//
//		for (int i = 1; i < 5; i++) {
//			System.out.println(i + "회전");
//			for (int j = 0; j < num.length - 1; j++) {
//				if (num[j] > num[j + 1]) {
//					int k = num[j];
//					num[j] = num[j + 1];
//					num[j + 1] = k;
//				}
//				for (int a = 0; a < num.length; a++) {
//					System.out.print(num[a] + " ");
//
//				}
//				System.out.println();
//			}
//		}

		// 5,2,3,1,4 를 오름 차순으로 정렬... 선택정렬 이용하기
//		int[] num = new int[] { 5, 2, 3, 1, 4 };
		// System.out.println(num[0]);
		// int min;
		// int temp;
		// int index;
		// for(int a = 0; a<num.length; a++){
		// System.out.print(num[a]+ " ");
		// }
		// System.out.println();
		// int max = num[0];
		// int min = num[0];
//		for (int i = 0; i < num.length; i++) {
			// System.out.print(num[i]+ " ");
//		}
//		System.out.println();
//		for (int i = 1; i < num.length; i++) {
//			int max = num[i]; // 5 2 3 1 4
//			int min = num[i]; // 5 2 3 1 4
//			//
//			for (int j = 0; j < num.length; j++) {
//				if (num[0] < num[1]) {
//					num[0] = num[1];
//					num[1] = num[2];
//					System.out.println(num[j]);
//				} else {
//					System.out.print(num[i]);
//				}
//
//			}
//		}
		
		
//		for (int i = 0; i < num.length-1; i++) {
//			System.out.println(i + "회전");
//			for (int j = 0; j < num.length - 1 - i; j++) {
//				if (num[j] > num[j + 1]) {
//					int k = num[j];
//					num[j] = num[j + 1];
//					num[j + 1] = k;
//				}
//				for (int a = 0; a < num.length; a++) {
//					System.out.print(num[a] + " ");
//
//				}
//				System.out.println();
//			}
//		}
		
		/*
		5 2 3 1 4
		
		
		-- 1 회전(기준이 0번 index)
		1. 기준방에서부터 최소값을 가지고 있는 index를 찾는다.  (3번)
		2. 기준 index와 최소값이 있는 index의 값을 바꿔준다.
		1 2 3 5 4
		
		-- 2 회전(기준이 1번 index)
		1. 기준방에서부터 최소값을 가지고 있는 index를 찾는다.  (1번)
		2. 기준 index와 최소값이 있는 index의 값을 바꿔준다.
		1 2 3 5 4
		
		-- 3 회전(기준이 2번 index)
		1. 기준방에서부터 최소값을 가지고 있는 index를 찾는다.  (2번)
		2. 기준 index와 최소값이 있는 index의 값을 바꿔준다.
		1 2 3 5 4
		
		-- 4 회전(기준이 3번 index)
		1. 기준방에서부터 최소값을 가지고 있는 index를 찾는다.  (4번)
		2. 기준 index와 최소값이 있는 index의 값을 바꿔준다.
		1 2 3 4 5
		*/
	
	
	
		// ↑↑ 선택정렬
		// 시작 : 0 , 끝 : select.length-1, 증가량 : 1
		// 반복구문 : 
		int[] select = {5,2,3,1,4};
		
		for(int j = 0; j<select.length-1; j++){
			int min = select[j];
			int minBang = j;
			for(int i = j+1; i < select.length; i++){
				if(min > select[i]){
					min = select[i];	
					minBang = i;
				}
			}
			
			int temp = select[j];
			select[j] = select[minBang];
			select[minBang] = temp;
			
			System.out.println(Arrays.toString(select));
		}
		
		
		
		/*
				5 2 3 1 4
		1회전		2 5 3 1 4
		2회전		2 3 5 1 4
		3회전		1 2 3 5 4
		4회전		1 2 3 4 5
		
		insert sort!!
		
		*/
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
