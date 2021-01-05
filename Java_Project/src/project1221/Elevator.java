package project1221;
import java.util.*;

public class Elevator {
	private int floor;		//층
	private int max_kg = 100; 	//최대무게
	private static int men_kg; 	//탑승한 1명의 무게
	private static int all_kg; 	//모든 사람의 무게
	private static int people = 0;		//사람수
	
	public Elevator() {
		people++;
		System.out.println(people+"명 엘리베이터에 탑승");
		if(max_kg-all_kg<men_kg) {
			System.out.println("무게초과입니다.");
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("몇층 가실래염?");
			floor = sc.nextInt();		//층 선택
		}
	}
	
	public int getFloor() {
		return floor;
	}
	
	public void setFloor(int choice_floor) {
		this.floor = choice_floor;
		System.out.println(floor+"층으로 gogo!");
	}
	
	public int getAll_kg() {
		return all_kg;
	}

	public void setAll_kg(int men_kg) {
		this.men_kg = men_kg;
		this.all_kg += men_kg;
	}


	
	
	
	
}
