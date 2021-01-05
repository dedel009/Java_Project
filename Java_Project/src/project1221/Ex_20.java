package project1221;

import java.util.*;

public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ��� ��: ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("���ڿ� �Է�: ");
			String str = sc1.nextLine();
			isMoum(str);
		}
	}

	public static void isMoum(String str) {
		int mo = 0;
		int ja = 0;
		String[] isMoum = { "a", "u", "e", "i", "o", "A", "U", "E", "I", "O" };
		String[] str_array = new String[str.length()];
		for (int j = 0; j < str.length(); j++) {
			str_array[j] = str.substring(j, j + 1);
		}

		for (int i = 0; i < str_array.length; i++) {
			switch (str_array[i]) {
			case "a":
				mo++;
				break;
			case "u":
				mo++;
				break;
			case "e":
				mo++;
				break;
			case "i":
				mo++;
				break;
			case "o":
				mo++;
				break;
			case "A":
				mo++;
				break;
			case "U":
				mo++;
				break;
			case "E":
				mo++;
				break;
			case "I":
				mo++;
				break;
			case "O":
				mo++;
				break;
			case " ":
				break;
				default:
					ja++;
					break;
			}

		}
		System.out.println(str + " : " + mo + " " + ja);
	}

}
