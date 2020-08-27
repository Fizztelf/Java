package e_OOP;

public class CardTest {

	public static void main(String[] args) {
		//문제 3-1
				//1. Card 클래스의 폭을 출력하여라
				System.out.println(Card.width);		//다른 클래스를 부를 때는 먼저 생각해야 되는 것! 클래스 변수인지 인스턴스 변수인지 확인함.
				// 클래스 변수 호출 방식 : 클래스.클래스변수
//				Card 클래스를 호출되서 어느영역? 메서드 area에 갔더니 클래스 변수를 찾아보니까,,,
				
				//2. Card 클래스의 높이를 출력하여라
				System.out.println(Card.height);
				//Card 클래스를 호출
				//메서드 영역에서 클래스 변수를 찾아서 가져온다.
				
				
				//3. Card 클래스의 객체를 생성해주세요. 변수명 : cd1
				Card cd1 = new Card();
				//객체생성방식 : 클래스명 변수명 = new 클래스명()
				// 대입연산자가 있기 때문에 왼쪽부터
				// 인스턴스 화를 시키기 위해서 class 명을 넣어줘야 한다
				// Card는 메서드 영역에 이미 있으니까 로드하지 않고서
				// Card cd1를 메인 메서드 내에 지역 변수 선언
				// new Card() 인스턴스 화, 인스턴스 생성. 인스턴스는 heap에 만듦
				// 인스턴스 변수와 인스턴스 메서드가 같이 올라간다
				// 오른쪽 값을 왼쪽 cd1에 저장
				// heap에서는 처음 cd1의 주소만 가지고 있음
				// 인스턴스가 생성되었으니까 클래스나 메서드를 heap에 생성
				
				//4. 변수 cd1의 이름을 "Daniel"로 변경하여라.
				cd1.name = "Daniel";
				//참조변수명.인스턴스변수명 = ;
				//인스턴스 변수를 사용하려면 객체생성을 해야함.
				
				//5. 변수 cd1의 직원 번호를 "19961210"로 변경하여라
				cd1.number = 19961210;
				
				//6. Card 클래스의 객체를 생성해주세요. 변수명 : cd2
				Card cd2 = new Card();
				
				//7. 변수 cd2의 이름을 "nayeon"로 변경하여라.
				cd2.name = "nayeon";
				
				//8. 변수 cd2의 직원 번호를 "19950922"로 변경하여라
				cd2.number = 19950922;
				
				//9. 결과의 출력1과 같이 출력하라
				System.out.println("출력1");
				System.out.println("\t"+"1번 카드의 이름은 "+cd1.name+", 직원번호는 "+cd1.number+", 폭은 "
						+Card.width+", 높이는 "+Card.height+"이다.");
				System.out.println("\t"+"1번 카드의 이름은 "+cd2.name+", 직원번호는 "+cd2.number+", 폭은 "
						+Card.width+", 높이는 "+Card.height+"이다.");
				//인스턴스는 독립적으로 구성가능하다.
				
				//10. Card 클래스의 폭을 70으로 변경하여라
				Card.width = 70;
//				클래스명. 클래스변수
				
				//11. Card 클래스의 높이를 100으로 변경하여라.
				Card.height = 100;
				//12. 결과의 출력2와 같이 출력하여라.
				System.out.println("출력2");
				System.out.println("\t"+"2번 카드의 이름은 "+cd1.name+", 직원번호는 "+cd1.number+", 폭은 "
						+Card.width+", 높이는 "+Card.height+"이다.");
				System.out.println("\t"+"2번 카드의 이름은 "+cd2.name+", 직원번호는 "+cd2.number+", 폭은 "
						+Card.width+", 높이는 "+Card.height+"이다.");
				
				
			}

		}

class Card {
	String name;		//인스턴스 변수
	int number;
	static int width = 100;
	static int height = 250;
	}
