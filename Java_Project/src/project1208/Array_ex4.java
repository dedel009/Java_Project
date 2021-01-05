package project1208;

import java.io.*;

import java.util.Scanner;

public class Array_ex4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\workspace\\google2.txt"); 		// 파일 읽어오기
		File file_1 = new File("C:\\workspace\\google1.txt");		// 파일 저장

		try (FileWriter fileWriter = new FileWriter(file_1)) {		//file_1이라는 경로와 이름을 가진 파일을 만든다.
			Scanner sc = new Scanner(file);		//
			String str = "";
			String array[] = null;
			while(sc.hasNextLine()) {
				str= sc.nextLine();
				array = str.split("-|@| ");
			}

			
			PrintWriter pw = new PrintWriter(fileWriter);		//fileWirter로 만든 파일에 print하겠다.
			for(int i =0; i<array.length;i++) {
				pw.print(array[i]+"||");						//google1에 출력
			}
			pw.close();


		} catch (FileNotFoundException e) { // 파일이 없을 때
			System.out.println(e);
		}
	}

}
