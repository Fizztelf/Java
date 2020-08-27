package e_OOP;

public class RecursiveTest {

	public static void main(String[] args) {
		int result = factorial(31);
		System.out.println(result);


	}
	
	static int factorial(int num){		// 4가 인자값 num에 초기화
		int result = 0;
		if(num == 1){
			result = 1;
		} else {
			result = num * factorial(num-1);	//jvm에서  result = 4* 여기까지
												//그 다음 부분은 factorial(3)을 호출하면서 ↑ call stack에 호출.
		}
		return result;
	}
	

}
		
