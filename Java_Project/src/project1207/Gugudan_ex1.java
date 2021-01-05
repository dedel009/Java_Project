package project1207;
import java.util.Scanner;

public class Gugudan_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?");
		int col = sc.nextInt();
		
		while(run) {
			for(int j =1; j<10; j++) {
					System.out.println(col+" * "+j+" = "+col*j);
			}
			run = !run;
		}
		
	}

}
