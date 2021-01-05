package project1204;

public class For_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int result = 0;
		for(int i=0; i<10; ) {
			System.out.println(i++);
		}
		System.out.println("----------");
		for(int i=0; i<10; ) {
			System.out.println(++i);
		}
		System.out.println("-----------");
		for(int i=1; i<=100; i++) {
			result += i;
			System.out.println("합은"+result);
		}

		int i=0, j=0;
		
		String[] arrays = { "a", "b", "c", "d" };
		i = 0;
		j = 0;
		for (String s : arrays) {
			i++;
			System.out.println("i = " + i + ", s = " + s);
		}
		for (String s : arrays) {
			++j;
			System.out.println("j = " + j + ", s = " + s);
		}
	*/	
		
		//구구단 만들기
		for(int i=2; i<10; i++) {
			for(int j = 1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			if(i<10) {
				System.out.println(i+"단 끝!");
			}
		}
		
	
//		int[] gugudan_row = {1,2,3,4,5,6,7,8,9};
//		int[] gugudan_cal = {2,3,4,5,6,7,8,9};
//		
//		for(int i : gugudan_cal) {
//			for(int j : gugudan_row) {
//				System.out.println(i+" * "+j+" = "+(i*j));
//			}
//		}
		

		
	}

}
