package project1203;
import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("한자리 숫자 2개를 입력하시오.");
		int num1 = sc.nextInt(), num2= sc.nextInt();
		if(!((num1<=9 && num1>=1) && (num2<=9 && num1>=1))) {
			System.out.println("한자리 정수를 입력해주세요.");
		}else {
			System.out.println("어떤 연산을 진행하시겠습니까 ex)+ - * / 선택 plz");
			String operator = sc.next();
			if(!(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/"))) {
				System.out.println("잘못입력하셨씁니다.");
			}else {
				System.out.println(operator+"을 연산하겠습니다");
			}
		
			switch(operator) {
				case "+":
					System.out.println(num1+"+"+num2+"="+(num1+num2));
					break;
				case "-":
					System.out.println(num1+"-"+num2+"="+(num1-num2));
					break;
				case "*":
					System.out.println(num1+"*"+num2+"="+(num1*num2));
					break;
				case "/":
					System.out.println(num1+"/"+num2+"="+(num1/num2));
					break;
			}
		}
		

		
	}

}
