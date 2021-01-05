package project1211;

import java.util.*;

public class RemoteControl_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean remoteControl = true;
		boolean tv_state = false; // tv 꺼져있슴
		boolean sound_menu = true; // 음량 메뉴
		boolean channel_menu = true; // 채널 메뉴
		int sound = 20; // 음량 초기값
		int channel = 45; // 채널 초기값
		Scanner sc = new Scanner(System.in);

		remote_menu: while (remoteControl) { // 리모컨 전원 메뉴
			System.out.println("[1] 전원 ON [2] 전원 OFF");
			int tv = sc.nextInt();
			switch (tv) {
			case 1: // 전원 ON
				tv_state = true; // tv 켜기

				main_menu: while (tv_state) { // 메인 메뉴
					System.out.println("[1] 음량 조절 [2] 채널 변경 [3] 상위메뉴 ");
					int choice_menu = sc.nextInt();
					switch (choice_menu) {
					case 1: // 음량 조절
						System.out.println("현재 음량은 " + sound + "입니다.");
						while (sound_menu) { // 음량 메뉴
							System.out.println("음량 : [1] ▲ [2] ▲▲ [3] ▼ [4] ▼▼ [5] 상위메뉴");
							int soundControl = sc.nextInt();
							switch (soundControl) { // 음량 컨트롤
							case 1: // 음량 +1올

								if (sound == 40) {
									System.out.println("현재 음량이 40입니다.");
								} else {
									sound += 1;
									System.out.println("음량 +1");
									System.out.println("현재 음량은 " + sound + "입니다.");
								}
								continue;
							case 2: // 음량 +2
								if (sound == 40) {
									sound = 40;
									System.out.println("현재 음량이 40입니다.");
								} else {
									sound += 2;
									System.out.println("음량 +2");
									System.out.println("현재 음량은 " + sound + "입니다.");
								}
								continue;
							case 3: // 음량 -1

								if (sound == 0) {
									System.out.println("음량이 0입니다.");
								} else {
									sound -= 1;
									System.out.println("음량 -1");
									System.out.println("현재 음량은 " + sound + "입니다.");
								}
								continue;
							case 4: // 음량 -2

								if (sound <= 0) {
									sound = 0;
									System.out.println("음량이 0입니다.");
								} else {
									sound -= 2;
									System.out.println("음량 -2");
									System.out.println("현재 음량은 " + sound + "입니다.");
								}
								continue;
							case 5: // 상위 메뉴 즉 메인 메뉴로 이동
								System.out.println("메인 메뉴로 이동합니다.");
								continue main_menu;
							default: // 잘못입력
								System.out.println("원하시는 메뉴를 다시 입력해 주세요.");
								continue;
							}

						}

					case 2: // 채널 변경
						System.out.println("현재 채널은 " + channel + "입니다.");
						while (channel_menu) { // 채널 메뉴
							System.out.println("[1]채널 ▲ [2]채널 ▼ [3] 채널 입력 [4] 상위메뉴");
							int channelControl = sc.nextInt();
							switch (channelControl) {
							case 1: // 채널 +1
								if (channel == 100) {
									System.out.println("채널이 100번입니다.");
								} else {
									channel += 1;
									System.out.println("채널 +1");
									System.out.println("현재 채널: " + channel);
								}
								continue;
							case 2: // 채널 -1
								if (channel == 0) {
									System.out.println("채널이 0번입니다.");
								} else {
									channel -= 1;
									System.out.println("채널 -1");
									System.out.println("현재 채널: " + channel);
								}
								continue;
							case 3: // 임의의 채널 입력 0~100까지
								System.out.println("채널을 입력하시오.");
								int channel_num = sc.nextInt();
								channel = channel_num;
								System.out.println("현재 채널: " + channel);
								continue;
							case 4: // 상위 메뉴 즉 메인 메뉴로 이동
								System.out.println("메인 메뉴로 이동합니다.");
								continue main_menu;
							default: // 잘못입력
								System.out.println("원하시는 메뉴를 다시 입력해 주세요.");
								continue;
							}
						}

					case 3: // 상위 메뉴 즉 전원 메뉴로 이동
						System.out.println("전원 메뉴로 돌아갑니다.");
						continue remote_menu;
					default: // 잘못 입력
						System.out.println("원하시는 메뉴를 다시 입력해 주세요.");
						continue;
					}
				}

			case 2: // 전원 OFF
				if (tv_state) { // tv가 켜져있을 때
					tv_state = false; // tv 끄기
					System.out.println("tv를 껐습니다.");
					break;
				} else { // tv가 꺼져있을 때
					System.out.println("이미 tv가 꺼져있습니다.");
					break;
				}
			default: // 잘못 입력
				System.out.println("원하시는 메뉴를 다시 입력해 주세요.");
				continue;
			}
			break;
		}

	}

}
