package project1203;

public class Rotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rotto = new int[6];	//rotto번호가 들어있는 통
		System.out.println("당신의 로또 번호 뽑는 중 ....");
		for(int i = 0; i < 6; i++) {
			rotto[i] = (int)(Math.random()*44)+1;
			System.out.println("추첨 된 숫자: "+rotto[i]);
			if(i>0) {		//두번째 숫자부터 비교
				for(int j=0;j<i;j++) {
					if(rotto[j]==rotto[i]) { //새로뽑은 숫자가 기존 숫자들 중 하나와 같을 때
						System.out.println((j+1)+"와 "+(i+1)+"번째 숫자가 같습니다. 다시뽑습니다.");
						rotto[i] = (int)(Math.random()*44)+1;
					}
				}
			}
		}
		System.out.println("최종 숫자는...");
		for(int k = 0; k < 6; k++)
			System.out.println(rotto[k]);
		}
}
