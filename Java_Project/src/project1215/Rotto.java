package project1215;

import java.util.*;

public class Rotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] rotto_num_array = new int[6];
		System.out.println("로또 번호추첨");
		rotto_num_array = rdm_num();
		for (int i : rotto_num_array) {
			System.out.println(i);
		}
	}

	public static int[] rdm_num() {
		int[] rdm_num_array = new int[6];
		int random_num = 0;

		Random rdm = new Random();
		for (int i = 0; i < rdm_num_array.length; i++) { // 로또 번호 배열에 담기
			random_num = rdm.nextInt(45) + 1; // 1~45 추첨
			rdm_num_array[i] = random_num; // 배열에 로또번호 넣기
			if(i>0) {
				for (int j = 0; j < i ; j++) { //
					while(rdm_num_array[i] == rdm_num_array[j]) {
						System.out.println("전 숫자 "+rdm_num_array[i]);
						random_num = rdm.nextInt(45) + 1; // 1~45 추첨
						rdm_num_array[i] = random_num;
						System.out.println("다시뽑은 숫자 "+random_num);
						j=0;
					}
				}
			}
		}
		return rdm_num_array;
	}

}
