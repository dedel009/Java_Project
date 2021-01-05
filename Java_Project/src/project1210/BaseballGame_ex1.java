package project1210;
import java.util.*;

public class BaseballGame_ex1 {

	public static void main(String[] args) {
		// 속도 추가>>>>>투속 100이면 100% 안타 투속 150이면 10%안타
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();	
		boolean baseballGame_start = true;
		int hart = 0;		//타자 목숨
		int player_place = 0;	//주자 위치
		int score = 0;	// 점수

		while(baseballGame_start) {		//게임시작
			int random_ball = rdm.nextInt(9)+1;	//1~9까지의 랜덤 수
			int ball_speed = rdm.nextInt(51)+100; //공의 속도 100~150까지	
			
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("|    1    |    2    |    3    |");
			System.out.println("|    4    |    5    |    6    |");
			System.out.println("|    7    |    8    |    9    |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("몇 번 위치를 치겠습니까?");
			int player_num = sc.nextInt();
			int heat_persent = rdm.nextInt(10)+1;	//1~10	안타칠 확률
			if(random_ball == player_num) {	//숫자를 맞췄을 때 >>타자가 쳤을 때
				System.out.println("Wow~ 구속이 "+ball_speed+" 나왔습니다.");
				if(ball_speed== 100) {		//100%안타
					System.out.println("안타~~!");
					hart =0;
					player_place++;
					if(player_place ==4) {
						score++;
						System.out.println("점수가 올랐습니다! 현재 점수: "+score);
					}
					continue;
				}else if(ball_speed >100 && ball_speed < 150) {	//50% 안타
					if(heat_persent <=5) {		//안타일 때
						System.out.println("안타~~!");
						hart =0;
						player_place++;
						if(player_place ==4) {
							score++;
							System.out.println("점수가 올랐습니다! 현재 점수: "+score);
						}
						continue;
					}else {		//헛스윙일 때
						System.out.println("헛스윙~~ 스트라이크~~!");
						hart++;
						System.out.println("현재 타자 "+hart+"스트라이크!");
						if(hart ==3) {
							System.out.println("삼진아웃~~!");
							break;
						}
						continue;
					}
				}else {	  //10%안타

					if(heat_persent <=1) {		//안타일 때
						System.out.println("안타~~!");
						hart =0;
						player_place++;
						if(player_place ==4) {
							score++;
							System.out.println("점수가 올랐습니다! 현재 점수: "+score);
						}
						continue;
					}else {		//헛스윙 일 때
						System.out.println("헛스윙~~ 스트라이크~~!");
						hart++;
						System.out.println("현재 타자 "+hart+"스트라이크!");
						if(hart ==3) {
							System.out.println("삼진아웃~~!");
							break;
						}
						continue;
					}
				}
	
			}else {	//헛스윙
				System.out.println("스트라이크~~!");
				hart++;
				System.out.println("현재 타자 "+hart+"스트라이크!");
				if(hart ==3) {
					System.out.println("삼진아웃~~!");
					break;
				}
				continue;
			}
		}

		
		
		
	}

}
