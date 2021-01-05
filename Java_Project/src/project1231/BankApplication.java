package project1231;

import java.util.*;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("[1]계좌생성 [2]계좌목록 [3]예금 [4]출금 [5]종료");
			System.out.print("선택> ");

			int selectNo = sc.nextInt();

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못선택");
				break;
			}
		}
	}

	private static void createAccount() {

		System.out.println("계좌생성");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.next();
		System.out.print("초기입금금액: ");
		int balance = sc.nextInt();
		Account ac = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = ac;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}

	}

	private static void accountList() {
		int num = 0;
		System.out.println("계좌목록");
		for (int i = 0; i < accountArray.length; i++) {
			if (!(accountArray[i] == null)) {
				num++;
			}else {
				break;
			}
		}
		for(int i=0; i<num; i++) {
			System.out.println(accountArray[i].getAno()+"    "+accountArray[i].getOwner()+"    "+accountArray[i].getBalance());
		}

	}

	private static void deposit() {

		System.out.println("예금");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("예금액: ");
		int balance = sc.nextInt();
		Account ac = findAccount(ano);
		ac.setBalance(ac.getBalance()+balance);
		System.out.println("결과: 예금이 성공되었습니다.");
	}

	private static void withdraw() {
		System.out.println("출금");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("출금액: ");
		int balance = sc.nextInt();
		Account ac = findAccount(ano);
		if(ac.getBalance()<balance) {
			System.out.println("금액 부족");
		}else {
			ac.setBalance(ac.getBalance()-balance);
			System.out.println("결과: 출금이 성공되었습니다.");
		}

	}
	private static Account findAccount(String ano) {
		int count = 0;
		for(int i =0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				count = i;
				break;
			}
		}
		return accountArray[count];
	}
}
