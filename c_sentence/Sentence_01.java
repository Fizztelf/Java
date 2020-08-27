package c_sentence;

public class Sentence_01 {

	public static void main(String[] args) {
		/*
		1. 조건문 (if문, switch문)
		  - 조건식과 문장을 포함하는 블럭{}으로 구성되어 있다.
		  - 조건식의 연산결과에 따라 프로그램의 실행흐름을 변경할 수 있다.
		
		2. if문
		  - 구조
		    if(조건식){
		    	조건식이 true일 때, 수행될 문장
		    }
		    
		- 변형
		     if(조건식) {
		     	조건식이 true일 때 수행
		     } else {
		     	조건식이 false일 때 수행
		     }
		   
		- 2단 번형
		 	 if(조건식1) {
		     	조건식이 true일 때 수행
		     } else if(조건식2) {
		     	조건식1이 false이고 조건식2가 true일 때 수행
		     } else {
		     	조건식1 과 조건식2가 모두 false일 때 수행
		     }
		    
		*/
		
		boolean power = true;
		// power가 true이면 "켜져있음"을 출력, false이면 꺼져있음
		// 조건식 : power == true , 수행될 문장 : System.out.println("켜져있음");
		if (power) {
			System.out.println("켜져있음");
		} else {
			System.out.println("꺼져있음");
		}
		
		
		int a1 = 10;
		//a1의 값이 0보다 크면 "양수"를 
		//a1의 값이 0보다 작으면 "음수"를
		//a1의 값이 0이면 "0"를 출력해주세요
		
		if (a1 > 0) {
			System.out.println("양수");
		} else if (a1 <0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		
		//[문제 2-16] score의 값이 90이상이면 "A"출력, 80점이상 90점 미만이면 B를 출력
		// 70이상 80점 미만이면 "C" 출력, 60~70이면 "D"
		// 60점 미만이면 "F"를 출력
		int score = (int)(Math.random()*101);
		// 0 <= Math.random() < 101
		// 0 <= x <101
		// 정수의 개수 101개, 시작 0
		
		System.out.println(score);
		
//		if(score >= 90){
			System.out.print("A");
			// 95이상이면 "+", 95미만이면 "-"
//			if(score >= 95){
				System.out.println("+");
//			} else{
				System.out.println("-");
//			}
//		} else if(80 <= score){	// score < 90 && score >= 80
//			System.out.print("B");
//			if(85 <= score){
//				System.out.println("+");
//			} else{
//				System.out.println("-");
//			}
//		} else if(70 <= score){	// score < 80 && score >= 70
//			System.out.print("C");
//			if(75 <= score){
//				System.out.println("+");
//			} else{
//				System.out.println("-");
//			}
//		} else if(60 <= score){	// score < 70 && score >= 60
//			System.out.print("D");
//			if(65 <= score){
//				System.out.println("+");
//			} else{
//				System.out.println("-");
//			}
//		} else{					// score < 60
//			System.out.println("F");
//		}
		
		/*
		3.  switch-case문
		  - 조건의 경우의 수가 많을 때, if문 보다는 switch문을 사용하는 것이 좋다.
		  - 조건의 결과값으로 int형 범위의 정수값을 허용한다.
		  
		  - 구조
		  	
			switch(조건식) {
				case 값1 :	//조건식의 값 == 값1
					조건식 == 값1일 때 수행될 문장
					break;
				
				case 값2 :	//조건식의 값 == 값2
					조건식 == 값2일 때 수행될 문장
					break;
					
				default :
					조건식과 만족하는 값이 없을 때 수행되는 문장
				
			}
		*/
//		int random = (int)(Math.random()*5+1);
		// 1 <= Math.random() < 6
		// 정수의 개수 : 6-1, 시작 : 1
//		switch(random) {
//		case 1:
//			System.out.println("아파트");
//			break;
//		case 2:
//			System.out.println("자동차");
//			break;
//		case 3: 
//			System.out.println("노트북");
//			break;
//		case 4: 
//			System.out.println("자전거");
//			break;
//		default:
//			System.out.println("다음기회에");
//		}
		
		
		int random1 = (int)(Math.random()*101);
		System.out.println(random1);
		
		switch(random1/10){
		case 10:
		case 9:
			System.out.print("A");		
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6: 
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
