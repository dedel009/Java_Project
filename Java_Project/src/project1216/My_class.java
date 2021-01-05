package project1216;
import java.util.*;

import project1217.Santafe;

public class My_class {
	static boolean phone = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Phone i = new Phone();
//		Scanner sc = new Scanner(System.in);
//
//		My_class.phone = i.Phone_turnOn();		//전원 키기
//		System.out.println("[1]카카오톡 [2]카트라이더 [3]메세지 [4]전화");
//		int app_menu = sc.nextInt();		//앱 선택
//		i.app_run(app_menu);
		
		Calculator_ex5 cal1= new Calculator_ex5(5, 10, "+");
		
		System.out.println(cal1.cal(10, 5, "-"));
		
	}

}
