package project1207;
import java.util.*;

public class Calculator_ex1 {
	public static void main(String[] args) {
		/*	연산자를 숫자로 입력받기*/
//		boolean operation = true;
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("연산자를 입력하시오. [1]+   [2] -  [3] *   [4] /   ");
//		int operator = sc.nextInt();
//		System.out.println("숫자 두개를 입력하시오.");
//		int num1 = sc.nextInt(), num2 = sc.nextInt();
//		int sum =0;
//		
//		oper:while(operation) {
//			switch(operator) {
//			case 1:
//				sum = num1 + num2;
//				System.out.println("두 수의 합은: "+sum);
//				break oper;
//			case 2:
//				sum = num1 - num2;
//				System.out.println("두 수의 뺄셈은 "+sum);
//				break oper; 
//			case 3:
//				sum = num1 * num2;
//				System.out.println("두 수의 곱은:"+sum);
//				break oper;
//			case 4:
//				sum = num1 / num2;
//				System.out.println("두 수의 나눗셈은:"+sum);
//				break oper;
//			}
//	
//		}
		
		/*연산자를 문자로 입력받기*/
		boolean operation = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("연산자를 입력하시오. +, -, *, /  ");
		String operator = sc.next();
		System.out.println("숫자 두개를 입력하시오.");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		int sum =0;
		
		oper:while(operation) {
			switch(operator) {
			case "+":
				sum = num1 + num2;
				System.out.println("두 수의 합은: "+sum);
				break oper;
			case "-":
				sum = num1 - num2;
				System.out.println("두 수의 뺄셈은 "+sum);
				break oper; 
			case "*":
				sum = num1 * num2;
				System.out.println("두 수의 곱은:"+sum);
				break oper;
			case "/":
				sum = num1 / num2;
				System.out.println("두 수의 나눗셈은:"+sum);
				break oper;
			}
	
		}
	}
}
