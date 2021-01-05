package project1209;
import java.util.Scanner;
import java.util.ArrayList;

public class Homework_ex1 {

	public static void main(String[] args) {
		// 스캐너로 문자받고 숫자인지 문자인지 구분
		// 숫자이면 숫자로 변환해서 덧셈 문자이면 숫자가 아입니다 출력
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하시오.");
		String str = sc.nextLine();
		int num = 0;
		int sum = 0;
		
		ArrayList<Integer> arrayList_num = new ArrayList<Integer>();
		
		String[] isNum = new String[]{"1","2","3","4","5","6","7","8","9","0"};
		
		//입력받은 글자와 isNum 배열과 비교
		
		for_1:for(int i=0; i<str.length(); i++) {		//a
			for(int j=0; j<isNum.length; j++) {
				if(str.substring(i,i+1).equals(isNum[j])) {	//숫자라면
					num = Integer.parseInt(str.substring(i,i+1));
					arrayList_num.add(num);
					System.out.println(arrayList_num);
					continue for_1;
				}
			}	
			System.out.println(str.substring(i,i+1)+"는 문자가 아닙니다.");
		}
		for(int i=0;i<arrayList_num.size();i++) {		//.size() >>arrayList_num 에 들어있는 원소 갯수 즉, arrayList의 길이
			sum += arrayList_num.get(i);		//값 가져오기
		}
		System.out.println("숫자의 총합: "+sum);
	}

}
