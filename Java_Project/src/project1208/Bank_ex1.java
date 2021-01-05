package project1208;
import java.util.*;

public class Bank_ex1 {
	public static String change_won(int money) {		//만 천 원 단위로 바꾸기
		String change_money = "";
		if(money>=10000) {
			int man_change = money / 10000;
			int chon_change = (money % 10000) / 1000;
			if(money%10000==0) {
				change_money =man_change +"만원";
			}else {
				if(chon_change==0) {	//천 단위가 0일 때
					change_money = man_change+"만 "+ (money % 10000) %1000+"원";
				}else {	// 0이 아닐 때
					change_money = man_change+"만 "+chon_change+"천 "+ (money % 10000) %1000+"원";
				}

			}

		}else if(money>=1000 && money<10000) {
			int chon_change = money/1000;
			if(chon_change == 0) {	//천단위가 0일 때
				change_money=chon_change%1000+"원";
			}else {	//0이 아닐때
				change_money = chon_change+"천 "+chon_change%1000+"원";
			}

		}else {
			change_money = money+"원";
		}
		
		return change_money;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int user_money = 0;	//사용자 돈
		boolean bankSystemOn = true;	
		
		bankMenu:while( bankSystemOn) {	//뱅킹 시스템 시작
			System.out.println("[1] 입금 [2] 출금 [3] 조회 [4]종료");
			int menu_choice = sc.nextInt();
			
			switch(menu_choice) {
			
			case 1:	//입금할 때
				System.out.println("얼마를 입금하시겠습니까?");
				int input_money = sc.nextInt();
				user_money += input_money;		 
				System.out.println("현재 계좌의 총 금액: "+change_won(user_money));
				continue bankMenu;
				
			case 2:	//출금할 때
				System.out.println("얼마를 출금하시겠습니까?");
				int output_money = sc.nextInt();
				if(user_money == 0) {		//현재 계좌에 돈이 0원일 때 >> 출금 불가능
					System.out.println("현재 계좌에 금액이 없습니다. ");
					continue bankMenu;
				}else if(output_money > user_money) {	// 출금 금액이 현재 가진 금액보다 클 때 >> 출금 불가능
					System.out.println("현재 계좌에 출금할 금액이 부족합니다.");
					System.out.println("현재 계좌 금액: "+change_won(user_money));
					continue bankMenu;
				}else {		//출금가능할 때
					System.out.println(change_won(output_money)+"를 인출하겠습니다.");
					user_money -= output_money;
					System.out.println("현재 계좌에 남은 금액은 "+change_won(user_money)+"입니다.");
					continue bankMenu;
				}
				
			case 3:	//조회할 때
				System.out.println("현재 계좌의 금액은 "+change_won(user_money)+"입니다.");
				continue bankMenu;
				
			case 4:	//종료할 때
				break bankMenu;
			}
		}
	}

}
