package project0104;

import java.util.*;

public class A {

	public static void main(String[] args) { // 계산기
		Scanner sc = new Scanner(System.in);
		C c = new C();

		while (true) {
			System.out.println("[1]계산 [2]조회");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				c.cal(c);
				break;
			case 2:
				c.show(c);
				break;
				default:
					break;
			}

		}
	}


//	public static void input(C c) {
//		System.out.print("첫번째 값입력: ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 값입력: ");
//		int num2 = sc.nextInt();
//		System.out.print("세번째 값입력: ");
//		int num3 = sc.nextInt();
//
//		B b = new B(); // 객체생성
//		b.num_1 = num1;
//		b.num_2 = num2;
//		b.num_3 = num3;
//
//		c.bs[c.current] = b;
//		c.current++;
//
//		if (c.current == c.bs.length) {
//			B[] temp = new B[c.bs.length + 1];
//			for (int i = 0; i < c.bs.length; i++) {
//				temp[i] = c.bs[i];
//			}
//			c.bs = temp; // 길이 5를 늘린 temp라는 객체배열을 다시 넣어준다. >>bs를 그냥 쓰면 된다.
//
//		}
//
//	}
//
//	public static void output(C c) {
//		for (int i = 0; i < c.current; i++) {
//			System.out.println(c.bs[i].num_1);
//			System.out.println(c.bs[i].num_2);
//			System.out.println(c.bs[i].num_3);
//			System.out.println("-----------");
//		}
//	}
}
