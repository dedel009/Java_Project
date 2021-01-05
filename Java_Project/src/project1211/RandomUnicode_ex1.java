package project1211;
import java.util.*;

public class RandomUnicode_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A-Z 65 ~90 , a-z 97 ~ 122
		Scanner sc= new Scanner(System.in);
		Random rdm = new Random();
		ArrayList<String> str = new ArrayList<String>();
		System.out.println("몇번 받을래?");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			int j = rdm.nextInt(58)+65;		//65~122
			int rdm_num = 0;		//걸러진 랜덤 수
			
			if(j>=91 && j<97) {	//거른다 다른문자는..
				System.out.println("A-Z ~ a-z에 포함되지 않아엽! 다시 뽑자~");
				i--;
			}else {		//A-Z ~ a-z까지 랜덤숫자를 담고 String형 arrayList에 넣기 
				rdm_num = j;
				char c = (char)rdm_num;
				str.add(Character.toString(c));
			}
		}
	
		for(String t : str) {		//출력
			System.out.print(t);
		}
	}
}