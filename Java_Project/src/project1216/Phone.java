package project1216;
import java.util.*;

public class Phone {
	
	public boolean Phone_turnOn() {
		boolean phone = true;
		System.out.println("전원을 킵니다.");
		return phone;
	}
	
	public void app_run(int app_menu) {		//앱 실행 메소드
		String app_name = "";
		switch (app_menu) {
		case 1:
			app_name = "카카오톡";
			System.out.println(app_name+" 실행");
			cacaotalk();
			break;
		case 2:
			app_name = "카트라이더";
			System.out.println(app_name+" 실행");
			break;
		case 3:
			app_name = "메세지";
			System.out.println(app_name+" 실행");
			break;
		case 4:
			app_name = "전화";
			System.out.println(app_name+" 실행");
			call();
			break;
			default:
				break;
		}

	}
	public static void cacaotalk() {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("[1]친구 [2]채팅 [3]뉴스 [4]더보기");
			int ct_menu = sc.nextInt();
			switch(ct_menu) {
			case 1:
				System.out.println("친구 목록들~~~");
				break;
			case 2:
				System.out.println("채팅 목록들~~~");
				break;
			case 3:
				System.out.println("뉴스보기~~");
				break;
			case 4:
				System.out.println("더보기~~~");
				break;
				default:
					continue;
			}
			break;
		}

	}
	public static void call() {
		Scanner sc= new Scanner(System.in);
		System.out.println("[1]즐겨찾기 [2]최근 통화 [3]연락처 [4]키패드 [5]음성 사서함");
		while(true) {
			int call_menu = sc.nextInt();
			switch(call_menu) {
			case 1:
				System.out.println("즐겨찾기 목록");
				call_menu_one();
				break;
			case 2:
				System.out.println("최근 통화 목록");
				break;
			case 3:
				System.out.println("연락처 목록");
				break;
			case 4:
				System.out.println("키패드 목록");
				break;
			case 5:
				System.out.println("음성 사서함 목록");
				break;
				default:
					continue;
			}
			break;
		}
	}
	public static void call_menu_one() {		//즐겨찾기 목록 조회
		Scanner sc= new Scanner(System.in);
		String[] favorite_name = {"유재석", "정준하", "박명수", "하하", "노홍철"};
		for(String s : favorite_name) {
			System.out.println(s);
		}
	}
	
	
}
