package project1229;

import java.util.*;

public class User_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User us = new User();

		run:while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("[1]회원가입 [2]조회 [3]종료");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("아이디 입력");
				us.setId(sc.next());
				System.out.println("이름 입력");
				us.setName(sc.next());
				System.out.println("비밀번호 입력");
				us.setPass(sc.nextInt());
				break;
			case 2:
				System.out.println("아이디: "+us.getId());
				System.out.println("이름: "+us.getName());
				System.out.println("비밀번호: "+us.getPass());
				break;
			case 3:
				System.out.println("종료");
				break run;
			}

		}
	}

}
