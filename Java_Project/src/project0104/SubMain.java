package project0104;

import java.util.*;

public class SubMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		InputStr is = new InputStr();
		Str str;
		String s;
		int result = 0;
		str = is.input();
		for (int i = 0; i < str.str.length(); i++) {
			s = str.str.substring(i, i + 1);
			System.out.println(s);
			result += Integer.parseInt(s);
		}
		System.out.println(result+str.c);
	}

}
