package project1221;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {

			for (int j = 1; j < 6-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
