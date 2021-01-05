package project1221;
import java.util.*;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 :");
		int num = sc.nextInt();
		int  num_100= 0, num_10 = 0, num_1 = 0;
		num_100 = num/100; //백의자리
		num_10 = num%100/10;	//십의자리
		num_1 = num%100%10;		//일의자리
		System.out.println(num_100+num_10+num_1);
	}

}
