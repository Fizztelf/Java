package e_OOP;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car();

		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		Car c2 = new Car("Red","Auto",4);
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		Car c3 = new Car("blue");
		System.out.println(c3.color);
		System.out.println(c3.gearType);
		System.out.println(c3.door);
		
	}

}


class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		color = "black";
		gearType = "stick";
		door = 4;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(String color){
		this();	//생성자 내에서 다른 생성자를 호출할 때.
				// 주의해야 할 점. 생성자의 첫 줄에만 기입해야함.
		this.color = color;		//this는 new 생성 이후에만 생성가능.
	}
	
	
}
//블랙, 스틱, 4개창문