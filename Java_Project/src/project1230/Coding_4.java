package project1230;
import java.util.*;

public class Coding_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Channel cn = new Channel();
		Volum vm = new Volum();
		Tv_onoff tvonoff = new Tv_onoff();
		boolean tv = true;
		
		while(tv) {
			Scanner sc = new Scanner(System.in);
			System.out.println("[1]채널선택 [2]볼륨조절 [3]TV 끄고 켜기");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("몇 번 채널: ");
				int channel_num = sc.nextInt();
				cn.setChannel_num(channel_num);
				break;
			case 2:
				vm.change_volum();
				break;
			case 3:
				System.out.println("[1]킨다 [2]끈다");
				int turn_menu = sc.nextInt();
				switch(turn_menu) {
				case 1:
					tv = tvonoff.tv_on();
					break;
				case 2:
					tv = tvonoff.tv_off();
					break;
				}
				default:
					break;
			}
		}
		
	}

}
