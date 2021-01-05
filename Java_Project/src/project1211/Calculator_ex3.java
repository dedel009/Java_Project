package project1211;
import java.util.*;

public class Calculator_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자를 입력했을 때 다시 입력할 수 있게 만들기 >> 미결
		Scanner sc = new Scanner(System.in);
		int sum = 0;			//총 수의 합
		ArrayList<Integer> num_arrayList = new ArrayList<Integer>();	//수를 담을 배열리스트
		boolean calSystem = true;
		int num = 0;
		System.out.println("항의 개수를 입력해~");
		int hang_num = sc.nextInt();
		for(int i= 0; i<hang_num; i++) {
	
			System.out.println((i+1)+"번째 숫자를 입력해~");
			try {
				num = sc.nextInt();
				num_arrayList.add(num);	//각 항의 숫자 넣기
			}catch(InputMismatchException e) {		//문자입력했을 때 에러
				System.out.println("숫자가 아닌데?");
				break;
			}
		}
		
		while(calSystem) {		
			System.out.println("연산자를 입력해~");
			Scanner operator_sc = new Scanner(System.in);
			String operator = operator_sc.next();	//연산자 입력받기
			switch(operator) {
			case "+":		//더하기
				for(int i=0; i<num_arrayList.size(); i++) {
					sum += num_arrayList.get(i);
				}
				break;
			case "-":		//빼기
				for(int i=0; i<num_arrayList.size(); i++) {
					sum -= num_arrayList.get(i);
				}
				break;
			case "*":		//곱하기
				sum = 1;
				for(int i=0; i<num_arrayList.size(); i++) {
		
					sum *= num_arrayList.get(i);
				}
				break;
			case "/":		//나누기
				sum = 1;
				for(int i=0; i<num_arrayList.size(); i++) {
			
					sum /= num_arrayList.get(i);
				}
				break;
			default:		//잘못입력
				System.out.println("연산자를 잘못 입력했네? 다시 입력해~");
				continue;
			}
			
			System.out.println("결과는!!?  : "+sum);		//연산 결과
		}

	}

}
