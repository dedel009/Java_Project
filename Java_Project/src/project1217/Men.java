package project1217;
import java.util.*;

public class Men {
	static String[] my_card = {"신한카드", "카카오카드", "부산카드"};

	public static void main(String[] args) {
		
		Santafe my_car = new Santafe("김도윤", 2, 250);		//신차 뽑기
		Santafe my_car2 = new Santafe("김도윤", 3, 250);		//신차 뽑기
		System.out.println(my_car.up());
		System.out.println(my_car2.up());
//		my_car.print();
//		my_car2.up();
//		my_car2.print();
//		Buggerking bk = new Buggerking();		//버거킹 가기
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("어떤 버거를 고르시겠습니까?");
//		try {
//			String choice_bugger = sc.next();
//			//버거 비교 코드
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		Scanner sc = new Scanner(System.in);
//
//		for(String s : my_card) {
//			System.out.print(s+" ");
//		}
//		System.out.println("중 넣고싶은 카드를 입력하시오.");
//		String choice_card = sc.next();		//카드고르기
//		System.out.println(choice_card+"선택");
//		
//		ATM atm = new ATM(choice_card);	//ATM기 사용
//		atm.ATM_system(); //ATM기 사용하기
		
		
	}
	
}
