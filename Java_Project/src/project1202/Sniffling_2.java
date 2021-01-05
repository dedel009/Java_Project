package project1202;
import java.util.Scanner;

public class Sniffling_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하시오.");
		int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
		int mul = num1 * num2;
		
		if(mul%2==1) {
			System.out.println(mul);
		}else if(mul%2==0) {
			System.out.println(mul/num3);
		}else {
			System.out.println("숫자가 0입니다.");
		}
	}
}
