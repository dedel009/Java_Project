package project1211;

import java.util.*;

public class FootballGame_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		boolean FootballGame_Start = true;
		int score = 0;
		System.out.println("Game Start !!!");
		while (FootballGame_Start) {
			System.out.println("-----------------------------");
			System.out.println("|   1    |    2    |    3   |");
			System.out.println("|   1    |    2    |    3   |");
			System.out.println("-----------------------------");
			System.out.println("설 자리를 고르시오.  1~3까지");
			int my_block = sc.nextInt(); // 내가 막을 위치 `1~3
			int p_ball = rdm.nextInt(6) + 1; // 컴퓨터가 공을 찰 위치 1~6
			int random = rdm.nextInt(10) + 1; // 1~10 랜덤 수
			switch (my_block) { // 막을 위치
			case 1:
				random = rdm.nextInt(10) + 1; // 1~10 랜덤 수
				if (p_ball == 1) { // 1번으로 찰 때
					if (random >= 5) { // 50% 확률
						System.out.println("OMG~! 컴퓨터가 골을 넣어부렸따!");
						score++;
						break;
					} else {
						System.out.println("So Easy ~! 골을 막아부렸따!");
						break;
					}
				} else { // 4번으로 찰 때 >> 100%확률
					System.out.println("So Easy ~! 골을 막아부렸따!");
					break;
				}
			case 2:
				random = rdm.nextInt(10) + 1; // 1~10 랜덤 수
				if (p_ball == 2) { // 2번으로 찰 때
					if (random >= 5) { // 50% 확률
						System.out.println("OMG~! 컴퓨터가 골을 넣어부렸따!");
						score++;
						break;
					} else {
						System.out.println("So Easy ~! 골을 막아부렸따!");
						break;
					}
				} else { // 5번으로 찰 때 >> 100%확률
					System.out.println("So Easy ~! 골을 막아부렸따!");
					break;
				}
			case 3:
				random = rdm.nextInt(10) + 1; // 1~10 랜덤 수
				if (p_ball == 3) { // 3번으로 찰 때
					if (random >= 5) { // 50% 확률
						System.out.println("OMG~! 컴퓨터가 골을 넣어부렸따!");
						score++;
						break;
					} else {
						System.out.println("So Easy ~! 골을 막아부렸따!");
						break;
					}
				} else { // 6번으로 찰 때 >> 100%확률
					System.out.println("So Easy ~! 골을 막아부렸따!");
					break;
				}
			default:
				System.out.println("다시 입력해~");
				continue;
			}

			System.out.println("먹힌 점수는 " + score + "입니다.");
		}

	}

}
