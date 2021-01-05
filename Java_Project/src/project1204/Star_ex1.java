package project1204;
import java.util.Scanner;

public class Star_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단: ");
		int num = sc.nextInt();
		
		for(int i =0; i <	num; i++) {
			for(int j = 1; j < num-i;  j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<i*2+1;  k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}
}
