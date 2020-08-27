package e_OOP;

public class TvTest {

	public static void main(String[] args) {	
		
		System.out.println(Tv.color); 	//String의 기본값은 null			프린트엘엔 시스템클래스의 클래스 메서드
		Tv.color = "black";
		System.out.println(Tv.color);	//Tv 클래스를 호출되서 어느영역? 메서드 area에 갔더니 이미 tv가 있으니까 pass
		Tv.changeColor();	//메서드 호출되었다. 그러면 call stack에 넣기
		System.out.println(Tv.color);	//Tv 클래스에 있는 호출되었으니까 메서드 area에 갔었는데 이미 load 되어있다. 로드는 안시키고 color를 yellow를 출력해라.
		
		
		
		Tv t = new Tv();	//인스턴스 화를 시키기 위해 타입은 class명을 넣어줘야 한다
		//대입연선자가 있으니까 왼쪽부터 만들어야함.
		//Tv 메서드 영억에 이미 있음 로드시키지 않고 다음으로 ㄱㄱ
		//Tv t 변수선언.....s
		// 메인 메서드 내에서 선언 ! ,, 지역변수!
		// new Tv() 인스턴스 화, 인스턴스가 생성  인스턴스는 heap 영역에 만듦
		//인스턴스 변수와 인스턴스 메서드가 같이 올라가야 함.
		// 오른쪽의 값을 왼쪽 t에다가 저장
		// t의 주소만 가지고 있음..
		System.out.println(t.channel); // 출력하여라. t에 있는 주소한테 가면 channel 의 값을 출력하라.
		t.channel = 10;	// t의 주소에 있는 channel을 10으로 바꿔라.
		System.out.println(t.channel);
		t.channelUp();	// callStack에 호출
		System.out.println(t.channel);
		t.volume = 15;	//t에 있는 볼륨을 15로 바꿔라
		System.out.println(t.volume);
		t.volumeUp(); //메서드 호출 call stack
		System.out.println(t.volume);

		
//		인스턴스 생성 해 놓고 참조변수명.메서드명
		
		
		
		
		
		
	}	// main 메서드가 닫힘. 사라짐 지역변수

}	// 클래스 닫힘 tv 메모리 지워짐.

class Tv{ 
	//전역변수(멤버변수)
	// static이 붙은 거는 class 친구  => 클래스변수
	static String color;			
	
	//인스턴스 변수
	int channel;
	int volume;
	
	//클래스 메서드
	static void changeColor(){
		color = "yellow";
	}
	
	//인스턴스 메서드
	void channelUp(){
		channel++;
	}
	//인스턴스 메서드
	void volumeUp(){
		volume++;
	}
	
	
}

//메인 퇴근하면 , G.C를 이용하여 HEAP 영역을 다 지워짐 
