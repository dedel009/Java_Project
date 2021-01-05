package project1215;
import java.util.*;


public class Mesod_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자입력");
		String str = sc.nextLine();

		int str_length = length(str);		//str의 길이
		
		String str_array[] = new String[str.length()];
		
		str_array =sub(str, str_array);	//str_array
		print(str_array);
		
	}
	
	public static int length(String str) {
		int str_length = str.length();
		return str_length;
	}
	public static String[] sub(String str, String[] str_array) {
		for(int i = 0; i< str.length(); i++) {
			 str_array[i] = str.substring(i, i+1);
		}
		return str_array;
	}
	public static void print(String[] str_array) {
		for(String s: str_array) {
			System.out.println(s);
	
		}
		
	}
	
}
