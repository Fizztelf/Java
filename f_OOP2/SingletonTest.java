package f_OOP2;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
		
		
		
	}
}


final class Singleton{
	
	private static Singleton s;
	public Singleton() {	//퍼블릭 대신에 프라이벗이면 조상 클래스에 final을 붙인다
		
	}
	
	static Singleton getInstance(){
		if( s == null){
			s = new Singleton();
		}
		return s;
	}
	
	
	
	
	
}











