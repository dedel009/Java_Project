package project1204;
import java.util.Scanner;;

public class Substring_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하시오: ");
		String str = sc.next();
		for(int i = 0 ; i < str.length(); i++) {
			Character[] special_char = {'!', '@','#','?'};		//특수문자 배열
			char str_char = str.charAt(i);	//str 한글자씩 변수에 저장
			
			for(int j = 0; j<special_char.length; j++) {	// 만약 특수문자가 있다면
				
				if(str_char == special_char[j]) {
					System.out.println("문자 "+special_char[j]+"가 포함되었다");	//실행
				}
				
			}
		}
		System.out.println("입력한 문자열:" +str);
	}
}
