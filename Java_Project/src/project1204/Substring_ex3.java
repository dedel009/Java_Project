package project1204;

public class Substring_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234";
		String str_1 = "A123";
		char c = 'E';
		int sum =0;
		
		for(int i=0; i<str.length(); i++) {
			 String str_pice = str.substring(i,i+1);
			 System.out.println("string형: "+str_pice);
			 int str_num = Integer.parseInt(str_pice);
			 System.out.println("int형: "+str_num);
			 System.out.println("char c와의 곱은: "+str_num*c);
			 sum += str_num*c;
		}

		System.out.println("총합은 : "+sum);
	}

}
