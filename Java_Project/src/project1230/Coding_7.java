package project1230;
import java.util.*;

public class Coding_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번째 숫자: ");
		int num = sc.nextInt();
		int array[] = new int[num];
		int result = 0;
		String operator = "";
		for(int i=0; i<num; i++) {
			System.out.println("숫자입력: ");
			array[i] = sc.nextInt();
			if(i==num-1) {
				System.out.println("연산자 입력: ");
				operator = sc.next();
			}
		}
		switch(operator) {
		case "+":
			result = plus(array);
			break;
		case "-":
			result = min(array);
			break;
		case "*":
			result = mul(array);
			break;
		case "/":
			result = div(array);
			break;
		}
		System.out.println(result);
	}

	public static int plus(int[] array) {
		int result = 0;
		for(int i: array) {
			result += i;
		}
		return result;
	}
	
	public static int min(int[] array) {
		int result = 0;
		for(int i: array) {
			result -= i;
		}
		return result;
	}
	public static int mul(int[] array) {
		int result = 1;
		for(int i: array) {
			result *= i;
		}
		return result;
	}
	public static int div(int[] array) {
		int result = 1;
		for(int i: array) {
			result /= i;
		}
		return result;
	}
	
	
}
