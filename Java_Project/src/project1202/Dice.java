package project1202;

import java.util.*;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int my_hp = 100, boss_hp = 100;
		Scanner sc = new Scanner(System.in);
		int count = 1;
		
		while (my_hp > 0 && boss_hp > 0) {
			System.out.println("보스를 만났습니다. 공격[1], 회복[2]");
			int choice_menu = sc.nextInt();
			int dice_one = (int) (Math.random() * 6) + 1, dice_two = (int) (Math.random() * 6) + 1; // 1~7
			int dice_sum = dice_one + dice_two;

			
			
			System.out.println(count + "번째 my턴~");
			if (choice_menu == 1) { // 공격

				int attack_persent = (int) (Math.random() * 2); // 공격 확률
				if (dice_one == 7 || dice_two == 7) { // dice가 7일때 -1해주기
					if (dice_one == 7) {
						dice_one = dice_one - 1;
					} else if (dice_two == 7) {
						dice_two = dice_two - 1;
					}
				}

				if (attack_persent == 0) { //my 공격
					boss_hp = boss_hp - dice_sum;
					System.out.println("보스를 공격했습니다. 현재보스체력: " + boss_hp);
				} else if (attack_persent == 1) {
					System.out.println("보스가 피했습니다. 현재보스체력: " + boss_hp);
				}
				
				
				System.out.println("");
				System.out.println(count + "번째 boss턴~");
				attack_persent = (int) (Math.random() * 2);
				dice_one = (int) (Math.random() * 6) + 1;
				dice_two = (int) (Math.random() * 6) + 1;
				
				if (attack_persent == 0) {	//boss 공격
					my_hp = my_hp - dice_sum;
					System.out.println("보스에게 공격당했습니다. 현재my체력: " + my_hp);
				} else if (attack_persent == 1) {
					System.out.println("보스의 공격을 피했습니다.메롱~ 현재my체력: " + my_hp);
				}
			}else if(choice_menu == 2){	//회복
				int heal_persent = (int) (Math.random() * 2); // 회복 확률
				if(heal_persent == 0) {	//회복성공
					System.out.println("회복성공!!");
					if(my_hp >= 100) {
						my_hp = 100;
						System.out.println("최대체력입니다.");
					}else {
						my_hp = my_hp + dice_sum;
						if(my_hp >=100) {
							my_hp = 100;
						}
					}
					System.out.println("현재 체력: "+my_hp);
				}else if(heal_persent == 1) { //회복실패
					System.out.println("회복실패 ㅜㅜ");
					my_hp = my_hp - dice_sum;
					System.out.println("현재 체력: "+my_hp);
				}
			}
			++count; //턴 증가
		}
		if (my_hp <= 0) {
			System.out.println("용사가 졌습니다....");
		} else if (boss_hp <= 0) {
			System.out.println("용사가 이겼습니다.!!~~ ㅊㅋㅊㅋ");
		}

	}

}
