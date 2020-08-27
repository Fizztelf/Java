package f_OOP2;

public class SuperTest01 {

	public static void main(String[] args) {
		
	}

}







class Parent2{
	int value = 40;
	
	void method(){
		System.out.println("Parent");
	}
}

class Child2 extends Parent2{
	int value = 30;
	
	void method(int value){
		System.out.println(value); // 매개변수 인자 값 출력, 메인에서 출력해야 해
		System.out.println(this.value); // 30
		System.out.println(super.value); //40
	}
	void method(){
		System.out.println(value); // 30
		System.out.println(this.value); // 40
		System.out.println(super.value); //40
		super.method();
	}
}