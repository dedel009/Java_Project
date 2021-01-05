package project1214;
import java.util.*;


public class Calculator_ex5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("몇항 계산?");
		int hang_num = sc.nextInt();
		int num_array[] = new int[hang_num];

		for(int i = 0 ; i<hang_num; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하시오.");
			num_array[i] = sc.nextInt();
		}
		
		while(true) {
			System.out.println("연산자를 입력 : ");
			String operator = sc.next();	//연산자 입력받기
			sum = calculator(operator, num_array, sum);
			System.out.println(sum);
			break;
		}
	}	

	
	public static int calculator(String operator, int[] num_array, int sum) {
		switch(operator) {
		case "+":
			for(int i = 0; i<num_array.length; i++) {
				sum += num_array[i];
			}
			break;
		case "-":
			for(int i = 0; i<num_array.length; i++) {
				sum -= num_array[i];
			}
			break;
		case "*":
			for(int i = 0; i<num_array.length; i++) {
				if(i == 0 ) {
					sum = 1;
				}
				sum *= num_array[i];
			}
			break;
		case "/":
			for(int i = 0; i<num_array.length; i++) {
				if(i == 0 ) {
					sum = 1;
				}
				sum /= num_array[i];
			}
			break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
		}
		
		return sum;
	}
	
	
}
