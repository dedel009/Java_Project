package project1203;
import java.util.*;


public class Game_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice_menu = 0;
		String my_wepon = choice_wepon();
		while(choice_menu!=3) {
			System.out.println("랜덤 rpg game~");
			System.out.println("메뉴룰 선택해주세요."); // 첫 무기 sowrd
			System.out.println("[1]게임시작");
			System.out.println("[2]무기변경");
			System.out.println("[3]게임종료");
			Scanner sc = new Scanner(System.in);
			choice_menu = sc.nextInt();
			int monster_hp = monster_hp();
			while(monster_hp > 0) {
				if (choice_menu == 1) { // 게임시작
					System.out.println("현재 무기: "+my_wepon);
					System.out.println("몬스터를 만났습니다.");
					System.out.println("몬스터의 체력: " + monster_hp);
					System.out.println("[1]전투 [2]도망");
					int choice_menu_monster = sc.nextInt();
					if (choice_menu_monster == 1) { // 전투
						if (random() == 10) { // 크리티컬 확률 개낮음
							System.out.println("크리티컬!!");
							monster_hp = monster_hp - 50;
						} else if (random() > 5) { // 공격성공
							System.out.println("공격성공");
							monster_hp = monster_hp - my_wepon_attk(my_wepon);
						} else { // 공격실패
							System.out.println("공격실패");
						}

					} else if (choice_menu_monster == 2) { // 도망
						monster_hp = 0;
						break;
					} else {
						System.out.println("다시 입력해주세용~");
					}
				} else if (choice_menu == 2) { // 무기선택
					System.out.println("선택할 무기를 입력하시오.");
					System.out.println("종류(공격력): sowrd(10), axe(11), hammer(12)");
					String wepon = sc.next();
					my_wepon = choice_wepon(wepon);
					break;
				} else if (choice_menu == 3) {
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
			}
			
		}
		System.out.println("게임종료");
		
	}
	
	static int my_wepon_attk(String my_wepon) {	//내 무기 공격력
		int my_wepon_attack = 10;	//기본 검 공격력
		if(my_wepon.equals("sowrd")) {
			my_wepon_attack = 10;	//검의 공격력
		}else if(my_wepon.equals("axe")) {
			my_wepon_attack = 11;	//도끼의 공격력
		}else if(my_wepon.equals("hammer")) {
			my_wepon_attack = 12;	//망치의 공격력
		}
		return my_wepon_attack;
	}
	
	static int monster_hp() {	//몬스터 hp
		int monster_hp = (int)(Math.random()*100)+1;
		if (monster_hp==101) {
			monster_hp = 100;
		}else if(monster_hp == 0) {
			monster_hp = 1;
		}
		return monster_hp;
	}
	
	 static int random() {					//랜덤 확률 하나 던져주기 
		int random_num= (int)(Math.random()*10);
		return random_num;
	}
	 
	 static String choice_wepon(){
		 return "sowrd";
	 }
	static String choice_wepon(String wepon) {	//무기 선택
		if(wepon.equals("sowrd")) {
			wepon = "sowrd";
			System.out.println("검을 장착하였습니다.");
		}else if(wepon.equals("axe")) {
			wepon = "axe";
			System.out.println("도끼를 장착하였습니다.");
		}else if(wepon.equals("hammer")) {
			wepon = "hammer";
			System.out.println("망치를 장착하였습니다.");
		}else {
			System.out.println("다시입력해주세요");
		}
		return wepon;
	}
	

}
