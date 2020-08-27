package z_exam;

public class TotalTest {	//클래스가 Method Area에 메모리할당 된다. 클래스 메서드와 클래스변수가 함께 로드.
	public static void main(String[] args) {	// 클래스가 호출되면서 Method Aread에 TotalTest영역에 같이 로드되며, 
//													메서드가 호출되면서 call stack에  쌓인다.

		TvMaker.color = "Blue"; // 대입연산자가 있기 때문에 왼쪽부터 실행
								// 메서드 호출은 클래스명.메서드
								//TvMaker 클래스가 호출되어서 call stack에 쌓이고 Method Area에 선언된다
								//TvMaker 클래스가 Method Area에서 클래스 변수들과 클래스 메서드가 같이 로드되는데
								// 클래스 변수인 color가 호출되는데, 기본 값은 null 이고 
								// 이것을 "Blue" 값을 바꿔주고 TvMaker.color에 저장된다.
								
		TvMaker tm = new TvMaker();	// 대입연산자가 있기 때문에 왼쪽에서 실행
									// TvMaker 클래스를 호출하는데 이미 Method Area에 있기 때문에 pass
//										call stack에 main() 부분에 지역변수인 tm을 할당을 해주고 
									// 클래스로부터 객체를 생성하는 게 인스턴스화 라고 한다.
									// 클래스명 변수명 = new 클래스명();
									// new는 객체를 생성해주는 부분
									// TvMaker메서드인 인스턴스 메서드를 호출하는데 heap에 할당된다
									// heap Area에 tm의 주소가 생성이 되고 그 안에는 인스턴스 변수와 인스턴스 클래스가 로드된다.
									// 마지막으로 주소 값이 tm에 저장 
		tm.age = 30; //			// 참조변수명.인스턴스변수
								// tm에 있는 인스턴스 변수와 인스턴스 메서드 중에서 age --> age는 인스턴스 변수이고 기본값은 0이다.
								// 30으로 바꿔준다
		// 3. 메서드 호출
		// 3.1
		
		//메서드를 호출할땐, 매개변수 확인. 반환값 확인. 누구의 친구인지 확인한다!
		
		System.out.println(TvControll.channel);		//TvControll 클래스가 Method Area에 생성이 되고 같이 클래스변수와 클래스메서드가 로드된다
													//TvControll 클래스 영역 안에 있는 channel 을 호출하는데 값은 15이다.
													// console에 99가 출력되면 call stack에서 로드되었던 것이 사라진다
		
		TvControll.volumeDown();		//인스턴스 메서드 호출
										//TvControll 클래스 안에 있는 volumeDown메서드를 를 호출시킨다
										// if문에서 조건이 channel == MAX_CHANNE이다.
										// channel 은 99이고 MAX_CHANNE은 100이므로 조건이 일치한다.
										// volume = MIN_VOLUME;
										
		System.out.println(TvControll.channel);	//TvControll 클래스 영역 안에 있는 channel 을 호출하는데 값이 100이고 console에 출력되면서
												// call  stack에 호출되었던 것이 출력되면서 사라진다

		// 3.2
		TvControll tc; 	//객체생성 : 클래스명 변수명;
//								    변수명 = new 클래스명;
						//TvControll이 이미 Method Area에 있으니까 pass
		tc = new TvControll(); // 대입 연산자를 통해서 왼쪽부터, tc가 main()에 지역변수로 선언된다.
								//new는 인스턴스화 시키는 것. heap Area에 tc의 주소가 생성되면서 인스턴스변수와 인스턴스메서드가 함께 로드된다
								
		System.out.println(tc.volume);		//Heap 영역 안에 있는 tc 주소에서 인스턴스변수인 volume  99를 출력한다/ 
		tc.volumeUp();						//tc에 있는 volumeUp volume = MIN_VOLUME;
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);

		//
		Calc cc = new Calc(); // 대입 연산자가 있기 때문에 왼쪽부터
								// Calc 클래스를 Method Area에 로드되고 같이 클래스변수와, 클래스메서드가 함께 로드된다.
								// call stack에 있는 main()에 cc가 지역변수로 선언이 되고 heap에 cc의 주소가 생성되는데,
								// 이곳에는 인스턴스변수와 인스턴스메서드가 로드되고 대입연사자를 통해서 이 값들이 cc에 저장된다.
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {	//TvMaker 클래스가 이미 heap 에 선언 되어있다, 이곳에는  클래스 변수와 클래스 메서드가 함께 로드된다.
	// 1.
	// 1.1
	static String color;		//클래스 변수 초기값은 null
	static int inch;			// 클래스 변수 초기값은 0
	// 1.2
	String name = "";		// 인스턴스메서드 name은 ""
	int age;				//인스턴스 메서드 초기값은 0 

	// 2.
	// 2.1
	
//	this는 
//	메서드를 한번 더 호출하는 것
	TvMaker() {		// 생성자
					// 생성자는 코드를 간편하게 사용하기 위해 사용됨
		this("man", 25); 	//This는 지역변수에서 변수를 찾을 때 이름이 같다면 전역변수에서 찾는데, 이를 헷갈리지 않게 하기 위해서 this를 쓴다.
	}

	// 2.2
	TvMaker(String name, int age) {	//매개변수로 String 타입하나, int 타입 하나로 한다
		this.name = name;		//여기서의 name은 TvMaker에 있는  String name = ""; 이라는 지역변수인데 위의생성자를 통해서 "man"저장
		this.age = age;			//여기서의 age은 TvMaker에 있는  int age; 이라는 지역변수인데 위의 생성자를 통해서 25를 저장한다.
	}
}

class TvControll {
	final int MAX_VOLUME = 100;		// 인스턴스 변수 int타입의 변수, MAX_VOLUME에 100의 값을 저장
	final int MIN_VOLUME = 0;		//인스턴스 변수 int타입의 변수, MIN_VOLUME에 0의 값을 저장
	static final int MAX_CHANNEL = 50;	//클래스 변수 int타입의 변수 MAX_CHANNEL에 50을 저장
	static final int MIN_CHANNEL = 1;		//클래스 변수 int 타입의 변수 MIN_CHANNEL에 1을 저장

	static int channel = 15;		// 클래스 변수 
	int volume = 99;		//인스턴스 변수, heap 영역 cc의 주소에 99

	// 4. return문
	
	// return 문은 
	// 코드가 다 실행이 되면 사라진다.
	// 매개변수 타입, 갯수를 신경써야한다.
	// 반환값이 없다면 void를 써도 됨
	// 반환값이 없다면 return;은 생략이 가능하다.
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}		//main()가 퇴근하면 같이 Method Area가 삭제

class Calc {
	// 5. 
	
	
	int add(int a, int b) {	//return 할때 반환타입을 잘 확인해야 한다. 
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}

// heap area는 g.c를 사용하여 퇴근시킨다.







