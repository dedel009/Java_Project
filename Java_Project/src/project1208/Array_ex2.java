package project1208;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Array_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문자입력한 뒤 split으로 구분지어서 출력하기*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자를 입력하시오.");
//		String str = sc.nextLine();
//		String str_array[] = str.split(" |@");		// or 사용가능
//		for(int i=0; i<str_array.length; i++) {
//			System.out.println("str_array : "+str_array[i]);
//			for(int j=0; j<str_array[i].length(); j++) {
//				String split_array=str_array[i].substring(j, j+1);
//				System.out.println("split_array는 "+split_array);
//			}
//		}
		
		
		
		try {
			File file = new File("C:\\workspace\\google1.txt");		//파일 읽어오기
			Scanner sc = new Scanner(file);	//스캐너로 파일열기
	
			while(sc.hasNextLine()) {				//sc에 값 있는지 없는지
				String str = sc.nextLine();
				String array[] = str.split(" |@|,");
				for(int i =0; i<array.length; i++) {
					System.out.println("각 글자는 :"+array[i]);
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
