package e_OOP;

public class InitTest {

	public static void main(String[] args) {

		Init it = new Init(30);
		System.out.println(it.action); //명시적초기화 -->> 초기화 블럭
		
		System.out.println(it.action2); // 0 ->> 30
										// 명시적 초기화 -> 초기화 블럭 -> 생성자
		
		
		
		
		
		
		
		
		
	}

}

class Init{
	static int action = 100;		//명시적 초기화
	
	int action2;		//명시적 초기화가 이루어지지 않는 것
	
	Init(int action2){
		this.action2 = action2;
	}
	
	static {		//클래스 초기화 블럭
		action = 4;
	}	// action의 변경 사항은 어떻게 될까요?? 
	
	{
		action2 = 7;
	}
	
	Init(){
		action2 = 7;
	}
	
	
	
	
	
	
	

}