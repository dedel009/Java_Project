package project1216;

public class Calculator_ex5 {
	public Calculator_ex5(int num1, int num2, String operator) {
		int sum =0;
		switch(operator) {
		case "+":
			sum = num1+num2;
			break;
		case "-":
			sum = num1- num2;
			break;
		case "*":
			sum = num1*num2;
			break;
		case "/":
			sum = num1/num2;
			break;
			default:
				break;
		}
	System.out.println("sum : "+sum);
	}
	
	public int cal(int num1, int num2, String operator) {
		int sum =0;
		switch(operator) {
		case "+":
			sum = num1+num2;
			break;
		case "-":
			sum = num1- num2;
			break;
		case "*":
			sum = num1*num2;
			break;
		case "/":
			sum = num1/num2;
			break;
			default:
				break;
		}
		return sum;
	}
}
