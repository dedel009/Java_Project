package project1202;
import java.util.*;

public class Coin_ex1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마바꿔주까?");
		int money = sc.nextInt();
		
		int fiveh_coin = (int)(money / 500);
		money = money % 500;
		int oneh_coin = (int)(money / 100);
		money = money % 100;
		int fift_coin = (int)(money / 50);
		money = money % 50;
		int ten_coin = (int)(money / 10);
		money = money % 10;
		
		System.out.println("오백원 개수: "+fiveh_coin);
		System.out.println("백원 개수: "+oneh_coin);
		System.out.println("오십원 개수: "+fift_coin);
		System.out.println("십원 개수: "+ten_coin);
		System.out.println("남은 잔액: "+money);
				
	}

}
