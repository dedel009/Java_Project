package project1210;
import java.util.*;
import java.util.ArrayList;

public class Mosbuho_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하시오.");
		String str = sc.nextLine();
		String str_2 = "";	//2진수 스트링변수
		ArrayList<String> str_2_num = new ArrayList<String>();		//2진수 받을 배열리스트
		
		
		for(int i=0; i<str.length(); i++) {
			str_2_num.clear();	//ArrayList 초기화
			char char_str = str.charAt(i);
			//System.out.println(char_str);
			str_2 = Integer.toBinaryString(char_str);	//2진수로 변환 후 스트링변수에 담기
			System.out.println(str_2);
			
			for(int k=0; k<str_2.length(); k++) {	
				str_2_num.add(str_2.substring(k, k+1));	//2진수를 배열리스트에 하나씩 넣기

				if(str_2_num.get(k).equals("1")) {	//1일 때
					str_2_num.set(k, "o");
				}else {	//2일 때
					str_2_num.set(k, "-");
				}
			}
			for(int j = 0; j<str_2_num.size(); j++) {
				System.out.print(str_2_num.get(j));		//모스부호 찍어내기
			}
			System.out.println();
		}
	}

}
