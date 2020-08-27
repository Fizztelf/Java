package e_OOP;

public class Ex3_5 {

	public static void main(String[] args) {
		
		
		//classMethod 메서드 호출
		Ex.classMethod(2);
		
		// Ex 클래스의 객체를 인스턴스화 하여 생성하시오 
		Ex e = new Ex();
		
		// instanceMethod 호출
		int result = e.instanceMethod(5, 6);
		System.out.println(result);
	}

}

class Ex{
	
	// 클래스 변수 int형 하나이며 출력하는 클래스메서드 classMethod를 만드시오
	static void classMethod(int a){
		System.out.println(a);
	}
	// 인스턴스 변수 int형 두 개의 곱을 반환하는 인스턴스메서드 instanceMethod 만드시오
	int instanceMethod(int a, int b){
		int result = a*b;
		return result;
	}
	
	
}