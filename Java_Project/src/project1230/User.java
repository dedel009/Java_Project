package project1230;

public class User {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();

		sp.turn_menu();
		while(sp.turn) {
			sp.runing();		//스마트폰 쓰는 중
			break;
		}
		
	}
}
