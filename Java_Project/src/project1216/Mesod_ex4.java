package project1216;
import java.util.*;


public class Mesod_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		int str_length = 0;
		ArrayList<String> sub_str = new ArrayList<String>();
		str = scan();
		str_length = length(str);
		sub_str = sub(str, str_length);		

		for(String s : sub_str) {
			System.out.println(s);
		}
	}

	
	static String scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하시오.");
		String str = sc.nextLine();
		return str;
	}
	
	static int length(String str) {
		int length =  str.length();
		return length;
	}
	
	static ArrayList sub(String str, int length) {
		ArrayList<String> sub_str = new ArrayList<String>();
		for(int i=0; i<length; i++) {
			sub_str.add(str.substring(i, i+1));
		}
		return sub_str;
	}
}
