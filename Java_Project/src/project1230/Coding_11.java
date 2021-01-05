package project1230;
import java.util.*;

public class Coding_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		String str_s[] = new String[len];
		
		for(int i=0; i<len; i++) {
			str_s[i] = str.substring(i, i+1);
		}
		System.out.println(Arrays.toString(str_s));
	}

}
