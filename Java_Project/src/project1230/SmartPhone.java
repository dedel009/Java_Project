package project1230;
import java.util.*;

public class SmartPhone extends App{
	boolean turn = true;
	
	public void turn_menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1]켜기 [2]끄기");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			this.turn = turn_on();
			break;
		case 2:
			this.turn = turn_off();
			break;
			default:
				System.out.println("에러");
				break;
		}
	}
	
	public boolean turn_on() {
		return true;
	}
	public boolean turn_off() {
		return false;
	}
	
	public void runing() {		//스마트폰 쓰는 중
		App app = new App();
		Scanner sc= new Scanner(System.in);
		show_App();
		String App_name = sc.next();
		run_App(App_name);
		delete_App();

	}
	
	
}
