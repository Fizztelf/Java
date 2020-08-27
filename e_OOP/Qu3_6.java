package e_OOP;

class Data {
	int x;
}

public class Qu3_6 {

	public static void main(String[] args) {

		//1. Data 클래스의 객채를 생성하라. 변수명은 d1
		Data d1 = new Data();
		//2. 참조변수 d1의 x값을 10으로 변경하여라
		d1.x = 10;
		//3. 참조변수 d1의 x값을 출력하여라
		System.out.println(d1.x);
		//4. 인자값으로 참조변수 d1의 x값을 가지는 change메서드를 호출하라
		Qu3_6.change(d1.x);		// 
		//change(d1.x)도 가능
		
		//5. 참조변수 d1의 x값을 출력하여라
		System.out.println(d1.x);
		//6. Data 클래스의 객체를 생성하여라. 변수명은 d2
		Data d2 = new Data();			// Data 클래스가 호출되었으니까 어디 영역에 올려야 해 ? Method Area 에있으니까 pass
		//7. 참조변수 d2의 x값을 10으로 변경하여라
		d2.x = 10;
		//8. 참조변수 d2의 x값을 출력하여라
		System.out.println(d2.x);
		//9. 인자값으로 참조변수 d2를 가지는 change메서드를 호출하라
		change(d2);
		//1. 누구 친구인가?
		//2. 매개변수는 ?
		//3. 반환값은 있는가
		
		//10. 참조변수 d2의 x값을 출력하여라
		System.out.println(d2.x);		


	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() 기본형 : " +x);
	}
	
	static void change(Data d1) {	//참조변수는 지역변수의 일종... 매개변수 있음 
//									매개변수라 하는 이유는 지역변수와 매개해준다
		d1.x = 1000;			// d2의 주소값.
		System.out.println("change() 참조형 " +d1.x);
	}

}
