package project1230;
import java.util.*;

public class Coding_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			Scanner();
		}
	}
	public static void Scanner() {
		try {
			PhoneNumberBook pnb = new PhoneNumberBook();
			Time tm = new Time();
			Internet it = new Internet();
			Scanner sc = new Scanner(System.in);
			System.out.println("[1]전화번호부 [2]전화걸기 [3]시간확인 [4]인터넷 검색");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("전화번호부 : ");
				for(String s: pnb.getPhonenumber_array()) {
					System.out.println(s);
				}
				break;
			case 2:
				System.out.println("1.영수 2.진수 3.길동");
				int num = sc.nextInt();
				System.out.println(pnb.getPhonenumber_array()[num]+"로 전화 중");
				break;
			case 3:
				tm.check_time();
				break;
			case 4:
				it.search_internet();
				break;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
