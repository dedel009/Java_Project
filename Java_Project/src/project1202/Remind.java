package project1202;
import java.util.*;


public class Remind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 4개를 입력하시오.");
		int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt(), num4 = sc.nextInt();
		int one = num1 + num2;
		int two = num3 - num4;
		int three = one * two;
		
		System.out.println("결과는: " + three);
		
		
	}

}
