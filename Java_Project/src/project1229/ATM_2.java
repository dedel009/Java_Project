package project1229;
import java.util.*;

public class ATM_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Money user = new Money();

		atm:while(true) {
			menu(user);
			switch(user.getAtm_menu()) {
			case 1:
				input_money(user);
				break;
			case 2:
				output_money(user);
				break;
			case 3:
				print(user);
				break;
			case 4:
				System.out.println("종료");
				break atm;
			}
		}
	}
	public static void menu(Money user) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1]입금 [2]출금 [3]조회 [4]종료");
		user.setAtm_menu(sc.nextInt());
	}

	public static void input_money(Money user) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금 금액: ");
		int input_money = sc.nextInt();
		user.setMoney(user.getMoney()+input_money);
		System.out.println("현재 금액: "+user.getMoney());
	}
	
	public static void output_money(Money user) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출금 금액: ");
		int output_money = sc.nextInt();
		user.setMoney(user.getMoney()-output_money);
		System.out.println("현재 금액: "+user.getMoney());
	}
	
	public static void print(Money user) {
		System.out.println("금액 조회: "+user.getMoney());
	}

}
