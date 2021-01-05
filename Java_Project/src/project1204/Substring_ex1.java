package project1204;

public class Substring_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num_str = "AB345";
		String num_str1 = "12BCD";
		String num_char = "ABC";
		
		num_str = num_str.substring(2);
		System.out.println(num_str);
		int num_str_int = Integer.parseInt(num_str);
		System.out.println(num_str_int);
		
		
		num_str1 = num_str1.substring(0,2);
		System.out.println(num_str1);
		int num_str1_int = Integer.parseInt(num_str1);
		System.out.println(num_str1_int);
		
		
		num_char = num_char.substring(2);
		System.out.println(num_char);		// 
		System.out.println(num_char.getClass().getName());			//변수타입확인
		char num_char_char = num_char.charAt(0);
		System.out.println(num_char_char);		//char 타입의 결과

		
		System.out.println("string형 더하기: "+num_str+num_str1+num_char);
		System.out.println("int형 더하기: "+(num_str_int+num_str1_int+num_char_char)); 
		
		
		
/*		String str = "ABCDEF";
		
		char c = str.charAt(0);
		System.out.println(c);
		
		for(int i=1; i<5; i++) {
			System.out.println(str.substring(i,5));
		}
*/
/*
		String str1 = "ABC";
		String str2 = "abc";
		
		char c_1 = ' ';
		char c_2 = ' ';
		
		for(int i=0; i<str1.length(); i++) {
			c_1 = str1.charAt(i);
			System.out.println(c_1);
		}
		for(int i=0; i<str2.length(); i++) {
			c_2 = str2.charAt(i);
			System.out.println(c_2);
		}
		
		System.out.println(c_1+c_2);
*/
		
/*
		String num_str = "12345";
		System.out.println("String 형: " + num_str);
		int str_num = Integer.parseInt(num_str);
		
		int str_num1 = Integer.valueOf(num_str);
		
		System.out.println("int 형: "+str_num);
		System.out.println("int 형: "+str_num1);
*/
		
		
	}

}
