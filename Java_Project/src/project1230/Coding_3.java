package project1230;
import java.util.*;

public class Coding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rdm = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int rdm_num = rdm.nextInt(10)+1;
		int num = sc.nextInt();
		int sum = 0;
		int result = 0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println(rdm_num);
		result = rdm_num*sum;
		System.out.println(result);
	}
}
