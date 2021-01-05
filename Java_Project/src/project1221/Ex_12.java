package project1221;

public class Ex_12 {

	public static void printSquare(double x) {
		System.out.println(x * x);
	}

	public static void main(String[] args) {
		printSquare(3);			//printSquare메소드에 int형을 넣어도 자동으로 double형으로 변환이 된다.
	}

}
