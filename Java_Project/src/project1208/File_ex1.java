package project1208;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class File_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\workspace\\number.txt");	//파일 열기
			Scanner sc = new Scanner(file);		//파일 담기
			String str = sc.nextLine();	//str 변수에 파일 내용 저장
			String array[] = str.split(" ");	//배열에 띄어쓰기 기준으로 파일 내용 저장
			for (int i = 0; i < array.length;i+=3) {	//9단 출력 
				System.out.println(array[i] + " * " + array[i + 1] + " = " + array[i + 2]);
			}
		} catch (FileNotFoundException e) {	//파일이 없을 때
			System.out.println("파일 없다 다시해라");
		}

	}

}
