package e_OOP;

public class DiceTest {

	public static void main(String[] args) {

		DoubleDice aa = new DoubleDice(); 		//인스턴스화
		int result = aa.throwDice();		//참조변수명.인스턴스메서드명()
		System.out.println("총 이동 거리는 : " + result + " 칸입니다.");

	}

}

class DoubleDice {
//	int result = num1 + num2;
	// 인스턴스 메서드 명은 throwDice
//	int result = 0;
//	int throwDice(){
//		 int num1 = (int)(Math.random()*6+1); 
//		 int num2 = (int)(Math.random()*6+1);
//		if(num1==num2){
//			System.out.println("주사위1 : "+num1+"\n"+ "주사위2 : "+num2);
//			System.out.println();
//			System.out.println("더블! 한번 더 돌리세요");
//			System.out.println();
//			result += num1 + num2;
//		    throwDice();
//		} else {
//			System.out.println("주사위1 : "+num1+"\n"+ "주사위2 : "+num2);
//			System.out.println();
//			result += num1 +num2;
//			System.out.println("총 이동 거리는 : " + result + " 칸입니다.");
//		}
//		return result;
//		
//	}
	
	
	
	// 주사위 2개를 던진다.
	// 던진 주사위 두 개의 합을 반환
	// 단 , 주사위의 눈이 같은 게 나왔을 때는 한번 더 던진다. (재귀호출이용)
	
	
	int throwDice() {
		int num1 = (int) (Math.random() * 6 + 1);
		int num2 = (int) (Math.random() * 6 + 1);
		
		System.out.println("주사위1 : " + num1 + "\n" + "주사위2 : " + num2);
		System.out.println();
		
		int result = num1 + num2;
		if (num1 == num2) {
			result += throwDice(); 
			
		} 
		return result;

	}
	
}