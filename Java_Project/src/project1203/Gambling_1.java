package project1203;
import java.util.Scanner;

public class Gambling_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int my_money = 5000; //가진돈 5000원 시작
		int pan_money = 0;
		while (my_money >= 0) {
			int dice_one = (int)(Math.random()*6)+1, dice_two = (int)(Math.random()*6)+1; // 랜덤 6면체 주사위 2개
			System.out.println("현재 가존 돈:" +my_money);
			System.out.println("얼마를 거실라요?");
			pan_money = sc.nextInt(); // 판돈
			if(pan_money>my_money) {
				System.out.println("판돈이 가진돈보다 많어~");
			}else {
				System.out.println("게임을 시작하지.");
				System.out.println("당신의 주사위는... "+dice_one +"와"+ dice_two + "가 걸렸다!!");
				if (dice_one == 1 && dice_two == 1) { // 주사위가 1,1
					my_money = my_money+(pan_money * 2);
					System.out.println("2배 이득!! 현재 MONEY: " + my_money);
				} else if (dice_one == 2 && dice_two == 6) { // 주사위가 2,6
					my_money = my_money+(pan_money * 4);
					System.out.println("4배 이득!! 현재 MONEY: " + my_money);
				} else if (dice_one == 6 && dice_two == 6) { // 주사위가 6,6
					my_money = my_money-(pan_money / 2);
					System.out.println("oh my god~ 꽝임다 현재 MONEY: " + my_money);
				} else {
					System.out.println("본전입니다. 현재 MONEY: " + my_money);
				}
			}
		}
		System.out.println("파산");
	}

}
