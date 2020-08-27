package e_OOP;

public class MyMath {

	public static void main(String[] args) {


		//12. add1 메서드 호출
		// 입력 값이 없다.. 매개변수가 없다!?
		// 반환값도 없다.
		MathTest.add1();
		
		//13. add2 메서드 호출
		// 인스턴스 변수이기 때문에 인스턴스 화를 시킨다.
//		- 인스턴스를 생성하는 방법
//	    : 클래스명 명수명;  -> 참조변수를 선언
//	    : 변수명 = new 클래스명();  -> 해당 클래스의 인스턴스를 생성 후 인스턴스의 주소를 변수에 저장
		//인스턴스 화 시켰으니까 
		
		//반환해서 출력 값이 없으니까.
		MathTest mt = new MathTest();		//mt는 참조변수
		int result11 = mt.add2();		//1단계 호출, 2단계 매개변수 확인, 3단계 반환
		System.out.println(result11);	//반환이 되기 때문에 변수에 담아야함
		
		//14. add3 메서드 호출
		// 호출 ,, 매개변수 있음,, 반환값 없음
		MathTest.add3(5, 5);		
		 
		//15. add4 메서드 호출
		int result = mt.add4(3,3);
		System.out.println(result);
		
		//16. add5 메서드 호출
		long result1 = mt.add5(5, 123456789L);	//참조변수명.인스턴스메서드()
		System.out.println(result1);
		
		//17. add6 메서드 호출
		//인스턴스 메서드니까 
		//참조변수명. 인스턴스메서드
		long result2 = mt.add6(123456789L,3,7);
		System.out.println(result2);
		
		//18. add7 메서드 호출
//		반환타입이 string 이니까 변수명 하나 만들어서 저장 시킨다.
		String result3 = mt.add7("sbs");
		System.out.println(result3);
		
		
		
		
	}

}
//메서드 만들때
//명칭
//매개변수
//수행부터 시키고
// 내가 뭘? 반환해야할지 생각
//반환할게 없ㅇ므ㅕㄴ 리턴쓰고
//반활할게 있으면 리턴뒤에 씀

//호출 할때는 
// 호출이라는 개념은 누구의 친구이냐
// 원하는게뭔지 확인
// 돌려주는게 있는지 확인


class MathTest{
	
	//1. 클래스 변수 a를 선언하고 10의 값으로 초기화 하여라
	static int a = 10;
	
	//2. 클래스 변수 b를 선언하고 20의 값으로 초기화 하여라
	static int b = 20;
	
	//3. 인스턴스 변수 c를 선언하고 30의 값으로 초기화 하여라
	int c = 30;
	
	//4. 인스턴스 변수 d를 선언하고 40의 값으로 초기화 하여라
	int d = 40;
	
	//5. 클래스메서드 add1, 클래스 변수 a,b의 합을 출력하는 메서드
	static void add1(){
		int result = a+b;
		System.out.println(result);
	}
	
	//6. 인스턴스메서드 add2, 인스턴스변수 c,d 의 합을 반환하는 메서드
	int add2(){
		int result = c + d;
		return result;
	}
	
	
	//7. 클래스메서드 add3, 매개변수 int 타입 두개, 매개변수의 합을 출력하는 메서드
	static void add3(int i, int k){
		int result = i+k;
		System.out.println(result);
	}
	
	//8. 인스턴스 메서드 add4, 매개변수 int 타입 두개 , 매개변수의 합을 반환하는 메서드
	int add4(int i, int k){
		int result = i+k;
		return result;
	}
	
	
	//9. 인스턴스 메서드 add5, 매개변수 int 타입 하나 , long 타입 하나, 매개변수의 합을 반환하는 메서드
	long add5(int i, long k){
		long result = i + k ;
		return result;
	}
	
	
	//10. 인스턴스 메서드 add6, 매개변수 long타입 하나, int 타입 두개 , 매개변수의 합을 반환하는 메서드
	long add6(long i , int k, int j){
		long result = i + k + j;
		return result;
	}
	
	
	//11. 인스턴스 메서드 add7, 매개변수 문자열 하나, 매개변수에 48~94 중 임의의 값과 문자열의 합을 반환하는 메서드
	String add7(String i){
		int result = (int)(Math.random()*47+48);
		String result2 = i + result;
		return result2;
	}
	
	
	
}