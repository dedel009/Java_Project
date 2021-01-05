package project1216;

public class Exception_ex10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] aa =new int[3];
//		try {
//			aa[2] = 100 / 0;
//			aa[3] = 100;
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 첨자가 배열 크기보다 커요");
//		}catch (ArithmeticException e) {
//			System.out.println(e);
//		}finally {
//			System.out.println("무조건 나옴");
//		}
		

		try {
			String str= "ABCDEF";
			for(int i =0; i<=str.length(); i++) {
				String sub = str.substring(i, i+1);
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			String str= "ABCDEF";
			String str_array[] = new String[5];
			for(int i =0; i<str.length(); i++) {
				String sub = str.substring(i, i+1);
				str_array[i] = sub;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
