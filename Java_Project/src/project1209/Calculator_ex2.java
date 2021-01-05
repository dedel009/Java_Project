package project1209;

import java.util.*;

public class Calculator_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] result_array = {""}; // 최종 식을 담을 배열 
		String result_str = ""; // 최종 식
		String str_plus = "";
		
		int count = 0;
		int result = 0;

		boolean cal_menu = true;

		cal:while (cal_menu) {		//계산기 메뉴
			System.out.println("[1]계산 [2]조회 [3]종료 ");
			
			int choice_menu = sc.nextInt();
			switch (choice_menu) {
			
			case 1:  // 계산하기
				Scanner sw = new Scanner(System.in);
				System.out.println("연산식을 넣으시오.");
				String operator = sw.nextLine();
				System.out.println(operator);
				String[] num_array = operator.split("\\+|-|\\*|/");	//스트링 숫자를 배열에 넣기
				int[] array = new int[num_array.length];
				for (int i = 0; i < array.length; i++) { // 스트링형 숫자를 인트형 숫자로 변환후 인스형 배열에 넣기
					array[i] = Integer.parseInt(num_array[i]);	
				}
				if (operator.contains("+") || operator.contains("-") || operator.contains("*")|| operator.contains("/")) {		//연산자가 있으면
					if (operator.indexOf("+") != -1) {		//더하기 연산자
						int int_plus = operator.indexOf("+");
						str_plus = operator.substring(int_plus, int_plus + 1);
						result = array[0] + array[1];
					} else if (operator.indexOf("-") != -1) {	//뺴기 연산자
						int int_minus = operator.indexOf("-");
						str_plus = operator.substring(int_minus, int_minus + 1);
						result = array[0] - array[1];
					} else if (operator.indexOf("*") != -1) {	//곱하기 연산자
						int int_mul = operator.indexOf("*");
						str_plus = operator.substring(int_mul, int_mul + 1);
						result = array[0] * array[1];
					} else {		//나누기 연산자
						int int_div = operator.indexOf("/");	
						str_plus = operator.substring(int_div, int_div + 1);
						result = array[0] / array[1];
					}
					result_str = num_array[0] + " " + str_plus + " " + num_array[1] + " = " + result;		//최종식 스트링 변수에 넣기
					
					result_array[count] = result_str;	//최종식 스트링 배열에 넣기
					System.out.println("연산식 출력: "+result_array[count]);
					

				} else {		//연산자가 없을 때
					System.out.println("연산자가 없습니다.");
				}

				continue cal;		//while로 돌아가기
			
			case 2:  // 조회하기
				for(int i = 0; i<1; i++) {
					System.out.println("이전 연산식: "+result_array[i]);	//이전 연산식 조회
				}
				continue cal;
				
			case 3:		//종료하기
				break cal;

			default:	//메뉴를 잘못선택 했을 때
				System.out.println("잘못입력하셨습니다. 다시입력하세요.");
				continue cal;
			}

		}

	}

}
