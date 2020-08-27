package f_OOP2;

import java.util.Arrays;
import java.util.Scanner;



public class DeckTest {

	public static void main(String[] args) {
//		
//		Card c1 = new Card();	// 1,1
//		System.out.println(c1);	//SPADE_4
//		
//		Card c2 = new Card(2,5);	// 1,1
//		System.out.println(c2);		//DIAMOND_5
		
		
		
		
		
		//9. 카드 한 벌의 객체 생성
		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));
		
		
		//10. 0번 index의 카드 한 장을 뽑기
		Card cd = d.pick(0);
		System.out.println(cd);
		
		//11. 임의의 index 카드 한 장을 뽑기
		Card c1 = d.pick();
		System.out.println(c1);
		
		//12. 카드를 자동 섞기
		d.shuffle();
		
		//13. 0번 index의 카드 한 장을 뽑기
		Card cc = d.pick();
		System.out.println(cc);
		
		//14. 카드 1000번 섞기
		d.shuffle(1000);
		
		//15. 0번 index의 카드 한 장을 뽑기
		Card cs = d.pick();
		System.out.println(cs);
	}

}

class Card extends Object{
	
	static final int KIND_MAX = 4; 
	static final int NUM_MAX = 13;
	
	static final int SPADE = 1; 
	static final int DIAMOND = 2; 
	static final int HEART = 3;; 
	static final int CLOVER = 4;; 
	
	
	
	static int width = 100;
	static int height = 250;
	
	
	int kind;
	int number;
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	Card(){
		this(SPADE, 1);
	}
	
	@Override
	public String toString(){
		
		String kind = "";
		String number = "";
		
		switch(this.kind){
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMOND";
			break;
		case 3:
			kind = "HEART";
			break;
		default:
			kind = "CLOVER";
			break;
		}
		
		
		
		switch(this.number) {
		case 1:
			number = "ACE";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default :
			number += this.number;
			break;
		}
		
		
		
		
		return kind+"_" + number;
	}
	
}


class Deck{
	
	//2. 카드의 수량을 저장할 수 있는 변수 CARD_NUM을 선언하고 
	// 카드 클래스의 상수를 이용하여 초기화 하여라
	static final int CARD_NUM = Card.KIND_MAX*Card.NUM_MAX;
	
	
	//3. 카드 52장을 저장할 수 있는 변수 c를 선언 및 생성하여라.
	Card[] c = new Card[CARD_NUM];
	
	
	
	//4. 기본생성자를 만들어라. c의 방들의 값을 1,1 ~~~~ 4,13까지의 카드를 초기화 하여라
	Deck(){
		for(int i = 1; i < Card.KIND_MAX; i++){
			for(int j = 1; j < Card.NUM_MAX; j++){
				c[(i*13)+j] = new Card(i+1,j+1);
			}
		}
	}
	
	// 사용자로부터 입력받은 index번째 카드 한장을 반환하는 메서드 pick
	Card pick(int index){
		Card r = c[index];
		return r;
	}
	
	
	
	
	
	
	
	//5. c에서 임의의 index 번째 카드 한 장을 반환하는 메서드(pick)를 작성하여라
	//단, 4번에서 만든 pick 메서드를 활용해주세요
	Card pick(){
		int random = (int)(Math.random()*CARD_NUM);
		Card re = pick(random);
		return re;
	}
	
	//6. 사용자로부터 입력받은 index번째 카드 한 장을 반환하는 메서드(pick)을 작성하여라
	//단, 입력받은 값이 0~51 사이의 정수라면 입력받은 index 번째 카드 한 장을 반환하고 
	//그렇지 않는 경우에은 "랜덤번호"를 출력하고 임의의 한 장을 반환하도록 하여라
/*	Scanner sc = new Scanner(System.in);
	int jj = sc.nextInt();*/
	
//	Card pick(int jj){
//		
//		if(jj >= 0 && jj <= 51){
//			return c[jj];
//		} else {
//			Card pick = c[(int)(Math.random()*CARD_NUM)];
//			System.out.println("랜덤번호");
//			return pick;
//		}
//		
//	}
	
	//7. c의 카드를 섞는 메서드(shuffle)을 작성하여라 - 자동섞기
	// 단, 카드 섞는 법 : 연습 문제 5-6의 방법을 활용
	void shuffle(){
		for(int i =0; i< CARD_NUM; i++) {
					int random = (int)(Math.random()*c.length);
					Card tmp = c[i];
					c[i] = c[random];
					c[random]= tmp;		
			
		}
	
	}
	
	// 메서드 shuffle, 랜덤번째 index와 랜덤번째 index의 Card를 교환
	// 사용자가 입력한 수만큼
	
	void shuffle(int cycle){
		for(int i= 0; i < CARD_NUM; i++){
			int random = (int)(Math.random()*CARD_NUM);
			int random1 = (int)(Math.random()*CARD_NUM);
			Card tmp = c[random];
			c[random] = c[random1];
			c[random1] = tmp;
		}
	}
	
	
	
	//8. 사용자로부터 입력받은 횟수만큼 c의 카드를 섞는 메서드(shuffle)을 작성하여라
	//단, 임의의 방 두개를 뽑아 두 개의 index번째 요소의 위치를 바꾼다. 이를 사용자로부터 입력받은 횟수만큼 반복한다
	
//	void shuffle(int kk) {
//		while (kk > 0) {
//			for (int i = 0; i < CARD_NUM; i++) {
//				int random = (int) (Math.random() * CARD_NUM);
//				Card tmp = c[i];
//				c[i] = c[random];
//				c[random] = tmp;
//			}
//			kk--;
//		}
	}

