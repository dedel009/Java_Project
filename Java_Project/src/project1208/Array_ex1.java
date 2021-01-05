package project1208;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i[] = {10, 20, 30, 40, 50, 60};
//		int j = 5;
//		int sum = 0;
//		int leng = i.length;
//		for(int k = 0; k<leng; k++) {
//			sum = i[k]+j;
//			System.out.println("배열 합계 : "+sum);
//		}

//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		int str_leng = str.length();
//		String array_str[] = new String[str_leng];
//		String sub = "";
//
//		for (int i = 0; i < str_leng; i++) {
//			array_str[i] = str.substring(i, i + 1);
//			System.out.println(array_str[i]);
//		}
		
		int longest = 0;
		String word = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한줄 쳐라");
		String b = sc.nextLine();
		String c[] = b.split("@");
		
		for(int i = 0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
