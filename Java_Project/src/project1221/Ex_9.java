package project1221;

import java.util.Scanner;

public class Ex_9 {

    public static void main(String[] arguments) {	//공식모르겠어yo~
        // 키보드로부터 입력받기 위한 변수
        Scanner sc = new Scanner(System.in);
        // 중력 가속도
        double gravity = -9.81;
        // 떨어지는 시간
        double fallingTime = sc.nextDouble();
        // 초기 높이
        double initialPosition = 1000.0;
        // x(t) = 0.5at^2 + v0t + x0
        double finalPosition =	initialPosition +fallingTime*gravity;
        System.out.printf("%.2f 초 후, 물체의 고도는 %.2f m\n", fallingTime, finalPosition);
    }

}
