package project1204;
import java.util.Scanner;

public class Contains_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("아무거나 입력하시오");
		String str = sc.next();
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			String str1 = str.substring(i,i+1) ;
			System.out.println(str1);
		
			String[] num_array = {"1","2","3","4","5","6","7","8","9","0"};
			
			for(int j =0; j<num_array.length; j++) {
				if(str1.equals(num_array[j]) ) {
					System.out.println("숫자가 포함되어 있습니다.");
					count++;
					int num_str = Integer.parseInt(str1);
					sum += num_str;
				}
			}
		}
		System.out.println("숫자는 "+count+"개 입니다.");
		System.out.println("모든 숫자의 합은: "+sum);
		
	/*
		String str= "Yang  Jung";
		
		System.out.println(str.contains("a"));
		if(str.contains("b")) {	//문자열을 포함하는지 
			System.out.println("ㅎㅎ");
		}
		
		int i = str.indexOf("Jung");	//해당 인덱스 반환 if 단어라면 단어의 첫 인덱스 값 반환
			System.out.println(i);
	*/

	}
	

}
