package project1209;

import java.io.*;
import java.util.*;

public class Split_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\workspace\\number_1.txt");
			Scanner sc = new Scanner(file);
			String str = sc.nextLine();
			String sub = "";
			String array_str[] = str.split("\\+|-|\\*");
			int idx[] = new int[array_str.length-1];

			for (int i = 0; i < str.length(); i++) {
				sub = str.substring(i, i + 1);
				//System.out.println(sub);
				int sid = sub.indexOf("+");
				if(sid != -1) {
					idx[i] = i;
				}else {
					continue;
				}

			}
			for(int i = 0; i<idx.length; i++) {
				System.out.println(idx[i]);
			}

			/* split contain 사용 */
//			String array_str[] = str.split("-|\\*");
//			
//			for(int i=0; i<array_str.length; i++) {	//출력
//				System.out.println(array_str[i]);
//				String str_num_array[]=array_str[i].split("\\+");
//				for(int j=0; j <str_num_array.length ;j+=2)
//				if(array_str[i].contains("+")) {
//					//System.out.println(str_num_array[j]+" // ");
//					int num1 = Integer.parseInt(str_num_array[j]), num2 = Integer.parseInt(str_num_array[j+1]);
//					int sum = num1 + num2;
//					System.out.println("합: "+sum);
//				}
//			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
