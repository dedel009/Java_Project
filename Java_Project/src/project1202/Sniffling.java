package project1202;

import java.util.Scanner;

public class Sniffling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하시오.");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		int sum = num1 + num2;
		
		if(sum%2 == 0) {
			System.out.println("짝수");
		}else if(sum%2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("숫자가 0입니다.");
		}
		
	}

}
