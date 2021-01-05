package project1203;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice_menu = 0;
		while(choice_menu != 5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("간단한 계싼기 프로그램");
			System.out.println("메뉴를 선택하시오.");
			System.out.println("[1]덧셈");
			System.out.println("[2]뺄셈");
			System.out.println("[3]곱셈");
			System.out.println("[4]나눗셈");
			System.out.println("[5]종료");
			choice_menu = sc.nextInt();
		}
		System.out.println("계산기 종료");
	}

}
