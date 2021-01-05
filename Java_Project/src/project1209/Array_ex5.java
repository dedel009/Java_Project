package project1209;
import java.util.*;

public class Array_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자를 입력하시오.");
//		String str = sc.nextLine();
//		String array[] = str.split("@| ");
//		for(int i = 0; i<array.length; i++) {
//			System.out.println(array[i]);
//			for(int j = 0; j<array[i].length(); j++) {
//				System.out.println("각각의 문자는: "+array[i].substring(j, j+1));
//			}
//		}
		
		/*298쪽 7번*/
//		int cc[] = {100, 200, 300, 400, 500};
//		int len;
//		
//		len = cc.length * Integer.BYTES;
//		System.out.println(len);
//		
		/*299쪽 8번*/
		int[][] aa = new int[3][4];
		
		int i=0, k=0;
		int val = 1;
		
		while(true) {
			if(i==2 && k==3) {
				break;
			}else {
				switch(i) {
				case 0:
					val++;
					k++;
					if(k==4) {
						i++;
						k=0;
					}
					break;
				case 1:
					
					val++;
					k++;
					if(k==4) {
						i++;
						k=0;
					}
					break;
				case 2:
					val++;
					k++;
					if(k==4) {
						break;
					}
					break;
				}
			}
		}
		System.out.println(val);
	}
}
