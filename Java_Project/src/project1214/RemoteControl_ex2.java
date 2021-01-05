package project1214;

import java.util.Scanner;

public class RemoteControl_ex2 {
	
	public static int channel_up(int channel) {
		if (channel == 100) {
			System.out.println("채널이 100번입니다.");
		} else {
			channel += 1;
			System.out.println("채널 +1");
			System.out.println("현재 채널: " + channel);
		}
		return channel;
	}
	
	public static int channel_down(int channel) {
		if (channel == 0) {
			System.out.println("채널이 0번입니다.");
		} else {
			channel -= 1;
			System.out.println("채널 -1");
			System.out.println("현재 채널: " + channel);
		}
		return channel;
	}
	
	public static int channel_change() {
		Scanner sc = new Scanner(System.in);
		System.out.println("채널을 입력하시오.");
		int channel_num = sc.nextInt();
		System.out.println(channel_num+"번으로 채널변경!!");
		return channel_num;
	}
	
	public static void error_message() {
		System.out.println("원하시는 메뉴를 다시 입력해 주세요.");
	}

	
	public static int sound_up(int sound) {
		if (sound == 40) {
			System.out.println("현재 음량이 40입니다.");
		} else {
			sound += 1;
			System.out.println("음량 +1");
			System.out.println("현재 음량은 " + sound + "입니다.");
		}
		return sound;
	}
	
	public static int sound_double_up(int sound) {
		if (sound == 40) {
			sound = 40;
			System.out.println("현재 음량이 40입니다.");
		} else {
			sound += 2;
			System.out.println("음량 +2");
			System.out.println("현재 음량은 " + sound + "입니다.");
		}
		return sound;
	}
	
	public static int sound_down(int sound) {
		if (sound == 0) {
			System.out.println("음량이 0입니다.");
		} else {
			sound -= 1;
			System.out.println("음량 -1");
			System.out.println("현재 음량은 " + sound + "입니다.");
		}
		return sound;
	}
	
	public static int sound_double_down(int sound) {
		if (sound <= 0) {
			sound = 0;
			System.out.println("음량이 0입니다.");
		} else {
			sound -= 2;
			System.out.println("음량 -2");
			System.out.println("현재 음량은 " + sound + "입니다.");
		}
		return sound;
	}
	
	public static int youtube_menu_up(int content_idx) {
		content_idx ++;
		if(content_idx > 4) {
			content_idx = 0;
		}
		return content_idx;
	}
	
	public static int youtube_menu_down(int content_idx) {
		content_idx --;
		if(content_idx < 0 ) {
			content_idx = 4;
		}
		return content_idx;
	}
	
	public static boolean tv_state(boolean tv_state) {
		if (tv_state) { // tv가 켜져있을 때
			tv_state = false; // tv 끄기
			System.out.println("tv를 껐습니다.");
	
		} else { // tv가 꺼져있을 때
			System.out.println("이미 tv가 꺼져있습니다.");
		}
		return tv_state;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean remoteControl = true;
		boolean tv_state = false; // tv 꺼져있슴
		boolean sound_menu = true; // 음량 메뉴
		boolean channel_menu = true; // 채널 메뉴
		int now_sound = 20; // 음량 초기값
		int now_channel = 45; // 채널 초기값
		String content[] = {"노래", "먹방", "게임", "라디오", "공부"};		//유튜브 콘텐츠 메뉴
		int content_idx = 0;
		Scanner sc = new Scanner(System.in);

		remote_menu: while (remoteControl) { // 리모컨 전원 메뉴
			System.out.println("[1] 전원 ON [2] 전원 OFF");
			int tv = sc.nextInt();
			switch (tv) {
			case 1: // 전원 ON
				tv_state = true; // tv 켜기
				main_menu: while (tv_state) { // 메인 메뉴
					System.out.println("[1] 음량 조절 [2] 채널 변경 [3] 유튜브 [4] 상위메뉴 ");
					int choice_menu = sc.nextInt();
					switch (choice_menu) {
					case 1: // 음량 조절
						System.out.println("현재 음량은 " + now_sound + "입니다.");
						while (sound_menu) { // 음량 메뉴
							System.out.println("음량 : [1] ▲ [2] ▲▲ [3] ▼ [4] ▼▼ [5] 상위메뉴");
							int soundControl = sc.nextInt();
							switch (soundControl) { // 음량 컨트롤
							case 1: // 음량 +1올
								now_sound = sound_up(now_sound);
								continue;
							case 2: // 음량 +2
								now_sound = sound_double_up(now_sound);
								continue;
							case 3: // 음량 -1
								now_sound = sound_down(now_sound);
								continue;
							case 4: // 음량 -2
								now_sound	= sound_double_down(now_sound);
								continue;
							case 5: // 상위 메뉴 즉 메인 메뉴로 이동
								System.out.println("메인 메뉴로 이동합니다.");
								continue main_menu;
							default: // 잘못입력
								error_message();
								continue;
							}

						}

					case 2: // 채널 변경
						System.out.println("현재 채널은 " + now_channel + "입니다.");
						while (channel_menu) { // 채널 메뉴
							System.out.println("[1]채널 ▲ [2]채널 ▼ [3] 채널 입력 [4] 상위메뉴");
							int channelControl = sc.nextInt();
							switch (channelControl) {
							case 1: // 채널 +1
								now_channel = channel_up(now_channel);
								continue;
							case 2: // 채널 -1
								now_channel = channel_down(now_channel);
								continue;
							case 3: // 임의의 채널 입력 0~100까지
								now_channel = channel_change();
								continue;
							case 4: // 상위 메뉴 즉 메인 메뉴로 이동
								System.out.println("메인 메뉴로 이동합니다.");
								continue main_menu;
							default: // 잘못입력
								error_message();
								continue;
							}
						}

					case 3: // 유튜브 메뉴
						System.out.println("유튜브 메뉴로 이동합니다.");
						for (String s : content) {
							System.out.print(s + " ");
						}
						System.out.println();
						System.out.println("현재 콘텐츠: " + content[content_idx]);
						while (true) {
							System.out.println("[1] 상 [2] 하 [3]상위메뉴");
							int youtube_menu = sc.nextInt();
							switch (youtube_menu) {
							case 1: // 상
								content_idx = youtube_menu_up(content_idx);
								System.out.println("현재 콘텐츠: " + content[content_idx]);
								break;
							case 2: // 하
								content_idx = youtube_menu_down(content_idx);
								System.out.println("현재 콘텐츠: " + content[content_idx]);
								break;
							case 3: // 상위메뉴
								continue main_menu;
							default:
								error_message();
								continue;
							}
						}
						
					case 4: //상위 메뉴 즉 전원 메뉴로 이동
						System.out.println("전원 메뉴로 돌아갑니다.");
						continue remote_menu;
					default: // 잘못 입력
						error_message();
						continue;
					}
				}

			case 2: // 전원 OFF
				tv_state = tv_state(tv_state);
				break;
			default: // 잘못 입력
				error_message();
				continue;
			}
			break;
		}

	}
}
