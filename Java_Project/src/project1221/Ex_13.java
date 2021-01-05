package project1221;
import java.util.Scanner;

public class Ex_13 {

    public static String getRole(int age) {
        if(age<=5) {
            return "애기";
        }else if(age>5 && age<13) {
            return "유딩";
        }else if(age>=13 && age<18) {
            return "청소년";
        }else{
            return "성인";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String role = getRole(age);
        System.out.println(role);
    }

}
