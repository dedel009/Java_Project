package project1221;
import java.util.*;

public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double one_euro = 1320.48026;
		double one_dollar = 1063.82979;
		System.out.println("유로, 달러 순 입력:");
		int euro = sc.nextInt(), dollar = sc.nextInt();
		System.out.println(euro+"유로 + "+dollar+"달러 = "+(int)(euro*one_euro+dollar*one_dollar));
	}

}
