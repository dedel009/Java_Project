package project1210;

import java.util.*;

public class BurgerOrder_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean orderSystem = true;
		ArrayList<String[]> order_food = new ArrayList<String[]>(); // 최종 주문 목록, 가격이 들어갈 2차원 배열리스트

		orderSystem:while (orderSystem) {
			System.out.println("햄버거를 주문하시겠습니까?");
			System.out.println("[1]버거 [2]음료 [3]주문");
			Scanner sc = new Scanner(System.in);
			int choice_menu = sc.nextInt();
			int sum_price = 0;		//총 가격
			switch (choice_menu) {
			case 1: // 버거 선택
				boolean set_order = true;
				while (set_order) {
					System.out.println("[1]불고기버거 3000원 [2]치즈버거 3500원 [3]베토디 5500원 ");
					int burger_choice = sc.nextInt();
					String burger_choice_food = "";		//버거 이름
					String burger_price = "";			//버거 가격
					switch (burger_choice) {
					case 1:
						burger_choice_food = "불고기버거";
						burger_price = "3000";
						break;
					case 2:
						burger_choice_food = "치즈버거";
						burger_price = "3500";
						break;
					case 3:
						burger_choice_food = "베토디";
						burger_price = "5500";
						break;
					default:
						System.out.println("버거를 다시 골라주세요.");
						continue;
					}
					System.out.println(burger_choice_food + "를 추가했습니다.");
					order_food.add(new String[] {burger_choice_food, burger_price});
					continue orderSystem;
				}
			case 2:  // 음료 선택
				boolean drink_order = true;
				orderSet:while (drink_order) {
					System.out.println("[1]콜라 1500원 [2]환타 2000원 [3]사이다 1500원 ");
					int drink_choice = sc.nextInt();
					String drink_choice_food = "";		//음료 이름 
					String drink_price = "";		//음료 가격
					switch (drink_choice) {
					case 1:		//콜라
						drink_choice_food = "콜라";
						drink_price = "1500";
						break;
					case 2:		//환타
						drink_choice_food = "환타";
						drink_price = "2000";
						break;
					case 3:		//사이다
						drink_choice_food = "사이다";
						drink_price = "1500";
						break;
					default:
						System.out.println("음료를 다시 골라주세요.");
						continue;
					}
					System.out.println(drink_choice_food + "를 추가했습니다.");
					order_food.add(new String[] {drink_choice_food, drink_price});
					continue orderSystem;
				}
			case 3: // 주문
				for(int i=0; i<order_food.size();i++) {

					if(i==order_food.size()-1) {
						System.out.println(order_food.get(i)[0]+"를 주문하겠습니다.");
					}else {
						System.out.print(order_food.get(i)[0]+", ");
					}
					sum_price += Integer.parseInt(order_food.get(i)[1]);		//총 가격
				}
				System.out.println("결제하실 총 금액은 "+sum_price+"원 입니다.");
				break orderSystem;	//주문 종료
			default:	//메뉴 잘못 선택했을 시
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
		}
	}
}
