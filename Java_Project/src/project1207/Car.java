package project1207;
import java.util.*;


public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean turnOn_car = true;
		boolean my_car_choice = true;
		String my_car_name = "";	//마이 카 이름
		int my_car = 0;	//마이 카 선택(숫자)
		int my_car_speed_now = 0;	//마이 카 현재속도
		int my_car_speed = 0;	//마이 카 증가, 감속 스피드
		int max_speed =0; //자동차 최고속도
		Scanner sc = new Scanner(System.in);
		
		car_choice:while(my_car_choice) {
			System.out.println("원하는 차를 선택하시오.  [1] 포르쉐  [2] 벤츠  [3] 소나타 ");
			my_car = sc.nextInt();
			switch(my_car) {	//마이 카 선택
			case 1:		// 마이카 옵션들
				my_car_speed = 10;
				my_car_name = "포르쉐";
				max_speed = 200;
				break car_choice;
			case 2:
				my_car_speed = 8;
				my_car_name = "벤츠";
				max_speed = 180;
				break car_choice;
			case 3:
				my_car_speed = 5;
				my_car_name = "소나타";
				max_speed = 160;
				break car_choice;
			}
		}
		System.out.println("고객님은 "+my_car_name+"을 고르셨습니다.");
		

			System.out.println("출발하시겠습니까?");
			System.out.println("[1]yes  [2]no");
			int start_flag = sc.nextInt();
			turnOn_car:while (turnOn_car) {	//시동을 켰습니다.
				switch (start_flag) {		
				case 1:		//출발!!
					System.out.println("옵션을 선택하시오.");
					System.out.println(("[1] 가속 [2] 감속  [3] 중지"));
					int engine_on_flag = sc.nextInt();
					switch (engine_on_flag) {	//옵션 선택
					case 1:		// 가속
						my_car_speed_now += my_car_speed;
						if(my_car_speed_now >= max_speed) {
							System.out.println("현재 최고 속도("+max_speed+"km)에 도달했습니다.");
							break;
						}
						System.out.println(my_car_name + "의 현재 속도는 " + my_car_speed_now + "km입니다.");
						break;
					case 2:		//감속
						if (my_car_speed_now == 0) {	// 현재 속도가 0일 때
							System.out.println("현재 속도가 0km 입니다. 더 이상 감속할 수 없습니다.");
							continue turnOn_car;
						} else {		//현재 속도가 0보다 클 때
							my_car_speed_now -= my_car_speed;
							if(my_car_speed_now==0) {	//마이 카 스피드- 현재 속도가 0이 될 때 
								System.out.println(my_car_name+"의 속도가 0km가 되었습니다.");
								continue turnOn_car;
							}else {	//마이 카 스피드- 현재 속도가 0보다 클 때
								System.out.println(my_car_name+"의 현재 속도는 "+my_car_speed_now+"km입니다.");
								continue turnOn_car;
							}
						}
					case 3:		//중지
						System.out.println(my_car_name+"을/를 멈춥니다.");
						break turnOn_car;
					}
					break;
				case 2:		//다시 시동 끄기
					System.out.println("시동을 끕니다.");
					break turnOn_car;
				}
			}
			
	}

}
