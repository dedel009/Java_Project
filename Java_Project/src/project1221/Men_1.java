package project1221;


public class Men_1 {
	static int floor;
	static int men1_kg=60;
	static int men2_kg=80;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Elevator men1 = new Elevator();	//남자1 엘리베이터 탑승
			men1.setAll_kg(men1_kg);
			floor = men1.getFloor();
			men1.setFloor(floor);

			
			Elevator men2 = new Elevator();	//남자2 탑승
			men2.setAll_kg(men2_kg);
			

			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
