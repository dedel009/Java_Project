package project1211;

import java.util.*;

public class Calculator_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> result_arrayList = new ArrayList<Integer>(); // 결과를 담을 배열리스트
		int cnt = 0; // 결과를 가져오기위한 배열리스트의 인덱스
		boolean Cal_On_first = true;
		boolean Cal_On_next = true;

		System.out.println("첫 번째 숫자를 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("연산자를 입력하시오.");
		String operator = sc.next();
		System.out.println("두 번째 숫자를 입력하시오.");
		int num2 = sc.nextInt();
		String end = sc.next();

		while (Cal_On_first) {
			if (end.equals("=")) {
				switch (operator) { // 연산자 스위치문
				case "+":
					result_arrayList.add(num1 + num2);
					break;
				case "-":
					result_arrayList.add(num1 - num2);
					break;
				case "*":
					result_arrayList.add(num1 * num2);
					break;
				case "/":
					result_arrayList.add(num1 / num2);
					break;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
			} else {
				System.out.println("=을 입력하시오.");
				continue;
			}
			System.out.println("결과: " + result_arrayList.get(cnt));
			cnt++;
			break;
		}
			//두번째 계산시작
			
		while(Cal_On_next) {
			System.out.println("연산자를 입력하시오.");
			operator = sc.next();
			System.out.println("숫자를 입력하시오.");
			num2 = sc.nextInt();
			end = sc.next();
			if (end.equals("=")) {
				switch (operator) { // 연산자 스위치문
				case "+":
					result_arrayList.add(result_arrayList.get(cnt - 1) + num2);
					break;
				case "-":
					result_arrayList.add(result_arrayList.get(cnt - 1) - num2);
					break;
				case "*":
					result_arrayList.add(result_arrayList.get(cnt - 1) * num2);
					break;
				case "/":
					result_arrayList.add(result_arrayList.get(cnt - 1) / num2);
					break;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
			} else {
				System.out.println("=을 입력하시오.");
				continue;
			}
			System.out.println("결과: " + result_arrayList.get(cnt));
			cnt++;
		}

		

	}

}
