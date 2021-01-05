package project1216;
import java.util.*;
public class Length_dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> dice_nums = new ArrayList<Integer>();
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("문자입력");
		str= sc.nextLine();
		dice_nums = length(str);
		for(int i : dice_nums) {
			System.out.println("내가뽑은 숫자: "+i);
		}
	}

	static ArrayList<Integer> length(String str) {
		ArrayList<Integer> dice_nums = new ArrayList<Integer>();
		int length = str.length();
		if(length % 2 == 0) {
			for(int i=0; i<dice6().size(); i++) {
				System.out.println("다이스6의 사이즈는"+dice6().size());
				dice_nums.add(dice6().get(i));
				System.out.println(dice_nums);
			}

		}else {
			for(int i=0; i<dice7().size(); i++) {

				dice_nums.add(dice7().get(i));
				System.out.println(dice_nums);
			}
		}

		return dice_nums;
	}
	
	static ArrayList<Integer> dice6() {
		Random rdm = new Random();
		int count = 0;
		ArrayList<Integer> dice_num = new ArrayList<Integer>();
		while(count < 2) {
			int dice = rdm.nextInt(6)+1;		//1~6
			dice_num.add(dice);
			count++;
		}

		return dice_num;
		
	}
	
	static ArrayList<Integer> dice7() {
		Random rdm = new Random();
		int count = 0;
		ArrayList<Integer> dice_num = new ArrayList<Integer>();
		while(count < 2) {
			int dice = rdm.nextInt(7)+1;		//1~7
			dice_num.add(dice);
			System.out.println("다이스 넘은?"+dice_num);
			count++;
		}

		return dice_num;
	}
}
