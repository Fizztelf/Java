package f_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		
		//1. SmartTv 3대를 저장해주세요
		SmartTv stv1 = new SmartTv();		
		SmartTv stv2 = new SmartTv();		
		SmartTv stv3 = new SmartTv();		
		
		SmartTv[] stv = {stv1,stv2,stv3};
		
		
		//2. AfreecaTv 2대를 저장해주세요
		
		
		 AfreecaTv atv1 = new AfreecaTv();
		 AfreecaTv atv2 = new AfreecaTv();
		AfreecaTv[] atv = new AfreecaTv[]{atv1, atv2};
		
		//3. DMBTv를 2대를 저장해주세요
		
		DMBTv dtv1 = new DMBTv();
		DMBTv dtv2 = new DMBTv();
		DMBTv[] dtv = {dtv1, dtv2};
		
		Tv[] t = new Tv[]{stv1,stv2,stv3,atv1, atv2,dtv1, dtv2};
		t[2] = (Tv)stv3; // 부모의 타입으로 바꿨다 해서 up-casting이라 한다
		
		
		//3번방에 있는 변수를 꺼내서 변수에 저장해라
		Tv t2 = t[3];
//		t2.
		
	}
}

class Tv{
	
	int volume;
	String color;
	void changeColor(String color){
		this.color = color;
	}
	
}


class SmartTv extends Tv{
	void internet(){
		
	}
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}


class DMBTv extends Tv{
	void antena(){
		
	}
}















