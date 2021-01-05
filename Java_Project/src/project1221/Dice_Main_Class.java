package project1221;

public class Dice_Main_Class {
	
	static int dice_num=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Dice_Class dc = new Dice_Class();
			dice_num = dc.dice_degurrrr();		//다이스 굴리기
			switch(dc.getDice_num()) {
			case 1:
				dc.one();
				break;
			case 2:
				dc.two();
				break;
			case 3:
				dc.three();
				break;
			case 4:
				dc.four();
				break;
			case 5:
				dc.five();
				break;
			}
		}catch(Exception e) {		//에러 >>`다이스값이 1~5가 아닐 때
			System.out.println(e);
		}

	}

}
