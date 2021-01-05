package project1221;

import java.util.Random;

public class Dice_Class {
	
	private int dice_num = 0;
	
	public int dice_degurrrr() {	//다이스 굴리기
		Random rdm = new Random();
		this.dice_num = rdm.nextInt(5) + 1; // 1~5
		return dice_num;
	}

	public int getDice_num() {
		return dice_num;
	}

	public void setDice_num(int dice_num) {
		this.dice_num =  dice_num;
	}

	public void one() {
		System.out.println("숫자 "+dice_num+"을 뽑았습니다.");
	}

	public void two() {
		System.out.println("숫자 "+dice_num+"를 뽑았습니다.");
	}

	public void three() {
		System.out.println("숫자 "+dice_num+"을 뽑았습니다.");
	}

	public void four() {
		System.out.println("숫자 "+dice_num+"를 뽑았습니다.");
	}

	public void five() {
		System.out.println("숫자 "+dice_num+"를 뽑았습니다.");
	}

}
