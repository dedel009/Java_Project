package project1201;
import java.util.Scanner;

public class Cal_sc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 연습
		  Scanner sc = new Scanner(System.in); System.out.println("숫자 3개 입력: "); int i
		  = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
		  
		  int sum = i + j; float persant = (float) sum / k * 100;
		  
		  System.out.println("퍼센트: " + (int) persant + "%");
		*/
		/* 두수 받아서 사칙연산하기
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num != 5) {
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("5. 게라웃");
			System.out.println("메뉴를 고르시오.");
			num = sc.nextInt();
			if (num == 5) {
				System.out.println("종료");
			} else {
				System.out.println("숫자 2개 입력: ");
				int i = sc.nextInt(), j = sc.nextInt();
				switch (num) {
				case 1:
					System.out.println("두수의 덧셈은: " + (i + j));
					break;
				case 2:
					System.out.println("두수의 뺼셈은: " + (i - j));
					break;
				case 3:
					System.out.println("두수의 곱셈은: " + (i * j));
					break;
				case 4:
					System.out.println("두수의 나눗셈은: " + ((int)((double)i/j)));
					break;
				}
			}
		}
		*/
		
		// 값 3개 받고 앞의 값 두개를 더하고 뒤의 한개 값을 더한 값에서 빼라 / 빤 값에서 5로 나누어서 나머지를 구해라
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("값 세개를 입력하시오");
		int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
		
		System.out.println("나머지 값 : "+(i+j-k)%5);	
		*/
	}
}
