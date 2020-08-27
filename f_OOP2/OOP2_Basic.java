package f_OOP2;

public class OOP2_Basic {

	public static void main(String[] args) {

		/*
		1. 상속 (~은 ~이다) : is a
		  - 기존의 클래스를 재사용하여 새로운 클래스를 만든다.
		  - 적은 양의 코드로 새로운 클래스를 작성할 수 있다.
		  - 새로 작성하고자 하는 클래스의 뒤에 상속 받고자 하는 클래스를 키워드 'extends' 와 함께 써주기만 하면 된다
		  
		  class Child extends Parent{
		  
		  }
		  
		  - 상속을 해주는 클래스를 '조상클래스', 상속을 받는 클래스를 '자손클래스' 라고 부른다.
		    : 조상클래스 - 상위클래스, 부모클래스, 기반클래스
		    : 자손클래스 - 하위클래스, 자식클래스, 파생된클래스
		    
		  - 상속을 받을 때는 멤버만 상속 받는다.
		  - 항상 자손클래스가 부모클래스보다 같거나 크다.
		  
		  
		2. 포함(~은 ~을 포함하고 있다) : has a
		  - 상속 이외에 클래스를 재사용하는 방법
		  - 자손클래스의 멤버변수로 다른 클래스를 선언하는 방법
		
		
		3. toString()
		  - 인스턴스의 정보를 제공할 목적으로 사용
		  - 참조변수를 출력하면 참조변수가 가르키고 있는 인스턴스의 toString()를 호출
		  	Tv t = new Tv();
		  	System.out.prinln(t.toString());
		  	
		4. 단일상속
		  - 자바에서는 단일상속(두개이상 불가)만 가능
		    class TVCR extends Tv, VCR{			//허용하지 않는다.
		  	}
		  	
		  	
		  - Tv와 VCR에 동일한 메서드가 존재한다면 어떤 메서드를 상속받는지 알 수 없다
		  - Tv의 메서드 명을 변경한다면 그동안 사용해 온 모든 곳을 수정해주어야 한다	
		  - 클래스 간의 관계가 명확해진다
		
		5. Object 클래스(모든 클래스의 최상위 클래스)
		  - 다른 클래스를 상속받지 않는 클래스는 object 클래스를 상속 받는다.
		    class A (extend object){
		    }
		 
		  - 모든 클래스는 object 클래스를 상속받게 되어 있다.
		  - toString()나 equals()를 사용할 수 있는 것은 object 클래스의 메서드이기 때문이다.
		  
		6. 오버라이딩(Overriding)
		  - 조상 클래스로부터 상속받은 메서드의 내용을 재정의 하는 것. (내용이 마음에 안들어서 재정의)
		  - 오버라이딩이 되기 위한 조건(선언부가 동일하면 된다)
		    : 메서드 명이 동일해야 한다.
		    : 매개변수의 갯수와 타입이 같아야 한다.
		    : 반환타입이 같아야 한다
		    
		  - 부모클래스로부터 상속받는 자손클래스의 
		    : 접근제어자는 부모보다 좁은 범위로 설정할 수 없다. (홈페이지 관리자, 회원, 비회원 같은 차이점)
		    : 예외의 갯수는 조상클래스의 메서드보다 많이 선언할 수 없다.
		  
		   제어자 void method() 예외처리{
		  }
		    
		    
		7. super.
		  - 조상 클래스의 멤버와 자손 클래스의 멤버의 명칭이 중복정의되어 있을 때 구분할 목적으로 사용
		  - 조상의 멤버와 자손의 멤버를 구분한다는 점을 제외하고는 this. 과 동일
		  - this. 은? 클래스 내 지역변수와 인스턴스변수가 명칭이 같을 때 구분 지을 때 사용
		  
		8. super() - 조상클래스의 생성자
		  - this()와 마찬가지로 super()도 생성자 호출이다.
		  - this()는 같은 클래스 내의 생성자에서 다른 생성자를 호출할 때 사용
		  - super()는 자손클래스의 생성자 내에서  부모클래스의 생성자를 호출할 때 사용    
		  
		  
		9. 제어자
		  - 변수, 메서드 그리고 클래스의 선언부에 사용이 된다
		  - 접근 제어자와 그외 제어자로 나뉜다.
		  - 접근제어자
		    : public, protected, default, private 
		  - 그 외 제어자
		    : static, final, abstract, native,... 등등
		  - 일반적으로 접근 제어자를 가장 왼쪽에 써준다
		    public static final int a; 
		  
		  - static (클래스의, 공통적인)
		    : 변수, 메서드, 초기화 블럭에 사용할 수 있다.
		    : 변수나 메서드에 사용시
		      1) 모든 인스턴스에서 공통적으로 사용
		      2) 인스턴스의 생성없이 사용할 수 있다
		      3) 클래스가 Method Area에 로드 될 때 같이 생성한다
		      4) 클래스 멤버에서는 인스턴스 멤버를 호출할 수 없다.
		      
		  - final(마지막의, 변경될 수 없는)
		    : 변수에 사용시 값을 변경할 수 없는 상수가 된다.
		    : 메서드에 사용시 오버라이드 할 수 없는 메서드가 된다.
		    : 클래스에 사용시 상속할 수 없는 클래스가 된다. (부모클래스x)
		    
		  - abstract(추상의, 미완성의)
		    : 메서드와 클래스에만 사용이 가능하다.
		    : 메서드는 선언부와 구현부로 되어있지만 추상메서드는 선언부만 존재
		    : 추상메서드를 가지고 있다면 해당 클래스는 추상 클래스가 되어야 한다
		    
		    abstract class A{
		      abstract void method();
		    }
		    
		    
		    
		10. 접근 제어자
		    - public
		      : 접근제한이 없다
		    - protected
		      : 같은 패키지 + 다른 패키지에 있는 클래스의 자손 클래스에는 접근 가능
		      : 클래스에는 사용 불가
		    - default
		      : 같은 패키지 내에서만 사용가능
		    - private 
		      : 같은 클래스 내에서만 사용가능
		      : 클래스에는 사용 불가
		    
		    
		11. 캡슐화
		  - 접근 제어자를 사용하는 이유
		    : 외부로부터 데이터를 보호하기 위해서
		    : 외부에는 불필요한 부분을 감출 수 있다.
		    
		    
		    
		12. 생성자의 접근 제어자
		  - 인스턴스의 생성을 제한할 수 있다.
		  - 생성자의 접근제어자를 private으로 할 경우
		    : 외부에서는 생성자에 접근할 수 없으므로 인스턴스를 생성할 수 없다.
		    : 다른 클래스의 조상이 될 수 없다.
		    : 다른 클래스의 조상이 될 수 없으므로 final을 붙여 주어야 한다.
		    
		    
		    
		13. 다형성(Polymorphism)
		  - 부모타입의 참조변수로 자식타입의 인스턴스를 참조할 수 있다.		    
		  
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		*/
		

	}

}
