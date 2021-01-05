package project1202;
import java.util.*;

public class Chance_money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("환전할 돈은 얼마?");
		int money = sc.nextInt();
		System.out.println("현재환율은?");
		int one_dollar = sc.nextInt();
		int change_money = money/one_dollar;
		
		System.out.println("약 "+change_money+"달러입니다.");
	}

}
