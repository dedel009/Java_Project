package project1217;
import java.util.*;

public class ATM {
	static String in_card = "";
	static int all_money = 0;
	
	public ATM(String card) {		//생성자 : 카드받기
		this.in_card = card;
	}
	
	public void ATM_system() {
		try {
			ATM:while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("[1]입금 [2]출금 [3]조회 [4]종료");
				int ATM_menu = sc.nextInt();
				switch(ATM_menu) {
				case 1:
					System.out.println("입금 금액: ");
					int in_money = sc.nextInt();
					in_money(in_money);
					break;
				case 2:
					System.out.println("출금 금액: ");
					int out_money = sc.nextInt();
					out_money(out_money);
					break;
				case 3:
					card_lookup();
					break;
				case 4:
					System.out.println("ATM기를 종료합니다.");
					break ATM;
				}
			}				
		}catch(Exception e) {		//에러발생시
			System.out.println(e);
		}	
	}
	
	public void in_money(int money) {		//카드 입금
		System.out.println(money+"원을 입금합니다.");
		this.all_money += money;
		System.out.println("현재 카드의 총 금액: "+all_money+"원");
	}
	
	public void out_money(int money) {		//카드 출금
		if(all_money <money) {
			System.out.println("현재 카드에 돈이 부족합니다.");
		}else {
			System.out.println(money+"원을 출금합니다.");
			this.all_money -= money;
			System.out.println("현재 카드의 총 금액: "+all_money+"원");
		}
	}

	public void card_lookup() {		//카드조회
		System.out.println(in_card+"의 총 금액 : "+all_money);
	}
}
