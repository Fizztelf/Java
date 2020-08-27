package f_OOP2;

public class OverTest {

	public static void main(String[] args) {

		
		OverGo og = new OverGo();
		String result = og.overMethod();
		System.out.println(result);
		
		System.out.println(og.value); //20
		
		//10을출력하고싶음
		int result2 = og.getOverUpValue();
		System.out.println(result2);
		

	}

}

class OverUp{
	
	int value = 10;
	
	String overMethod(){
		return "OverUp Method";
	}
	
}


class OverGo extends OverUp{
	
	int value = 20;
	
	@Override
	String overMethod(){	// 오버라이딩 관계
		return "OverGo Method";	//반환타입이 스트링이고 문자열을 반환해야함
	}
	
	String overMethod(int k){  // 오버로딩 관계
		return k+ "OverGo Method";	//반환타입이 스트링이고 문자열을 반환해야함
	}
	
	int getOverUpValue(){
		return super.value;
	}
	
}
