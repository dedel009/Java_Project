package project1221;

public class Ex_10 {

    public static void printSquare(int x) {
        System.out.println(x * x);
    }
    public static void main(String[] args) {
        int value = 2;		//int 형 변수선언
        System.out.println(value);	//변수 출력
        printSquare(value);	//printSquare에 파라미터로 value넣고 value제곱 출력
        printSquare(3);	//3 제곱출력
        printSquare(value * 2);		//4의 제곱 출력
    }
}
