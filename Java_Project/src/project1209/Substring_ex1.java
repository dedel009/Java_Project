package project1209;
import java.util.*;

public class Substring_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하시오.");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length()-1; i+=2) {
			if(str.length()%2 == 1) {
				str = str+" ";
			}
			String str_array = str.substring(i, i+2);
			System.out.println(str_array);
		}

	}

}
