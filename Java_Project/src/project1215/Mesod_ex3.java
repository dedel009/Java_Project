package project1215;
import java.util.*;


public class Mesod_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first_dice = 0, num = 0, second_dice = 0;
		System.out.println("면체 입력: ");
		num = sc.nextInt();
		first_dice=dice_one(num);
		second_dice = dice_two(first_dice);
		System.out.println("첫 번째 주사위값 : "+first_dice);
		System.out.println("두 번째 주사위값 : "+second_dice);
	}
	
	public static int dice_one(int num) {
		Random rdm = new Random();
		int dice_num = rdm.nextInt(num)+1;
	
		return dice_num;
	}
	
	public static int dice_two(int num) {
		Random rdm = new Random();
		int dice_num = rdm.nextInt(num)+1;

		return dice_num;
	}

}
