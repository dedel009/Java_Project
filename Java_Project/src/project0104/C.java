package project0104;
import java.util.*;

public class C {
	private Scanner sc = new Scanner(System.in);
	private B[] bs;
	private int current;
	
	public C() {
		bs = new B[1];
		current = 0;
	}
	
	public void show(C c) {
		for(int i = 0; i<c.current; i++) {
			System.out.println("첫번째 숫자: "+(int)c.bs[i].num_1+" 두번째 숫자: "+(int)c.bs[i].num_2);
			System.out.println("연산자: "+c.bs[i].operator);
			if(c.bs[i].operator.equals("/")) {
				System.out.println("결과갑: "+c.bs[i].d_result);
			}else {
				System.out.println("결과값: "+(int)c.bs[i].result);
			}

			System.out.println("---------------------");
		}

	}
	
	public void cal(C c) {
		System.out.print("값 두개 입력: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		B b = new B();
		b.num_1 = num1;
		b.num_2 = num2;

		System.out.print("연산자 입력: ");
		String operator = sc.next();
		b.operator = operator;
		switch (operator) {
		case "+":
			b.result = (int)(b.num_1 + b.num_2);
			System.out.println(b.result);
			break;
		case "-":
			b.result = (int)(b.num_1 - b.num_2);
			System.out.println(b.result);
			break;
		case "*":
			b.result = (int)(b.num_1 * b.num_2);
			System.out.println(b.result);
			break;
		case "/":
			b.d_result = b.num_1 / b.num_2;
			System.out.println(b.d_result);
			break;
		default:
			break;
		}
		c.bs[c.current] = b;
		c.current++;

		if (c.current == c.bs.length) {
			B[] temp = new B[c.bs.length + 1];
			for (int i = 0; i < c.bs.length; i++) {
				temp[i] = c.bs[i];
			}
			c.bs = temp; // 길이 5를 늘린 temp라는 객체배열을 다시 넣어준다. >>bs를 그냥 쓰면 된다.

		}

	}
	
	
}

