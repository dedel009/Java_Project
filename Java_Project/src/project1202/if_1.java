package project1202;

import java.util.Scanner;

public class if_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		int sum = num1 + num2;
		
		if(sum > 50 && sum <= 60) {
			System.out.println(sum/3);
		}else if(sum > 60 && sum <= 100) {
			System.out.println(sum/6);
		}else if(sum > 100) {
			System.out.println("나눌 숫자 입력: ");
			int num3 = sc.nextInt();
			System.out.println(sum/num3);
		}else {
			System.out.println("50이하 입니다.");
		}
		

	}

}
