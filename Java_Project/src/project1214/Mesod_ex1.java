package project1214;

public class Mesod_ex1 {
	static int i = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first(i);
		
	}
		
	public static void first(int i) {
		i += 10;
		if(i == 100) {
			System.out.println("100이다.");
		}else {
			System.out.println(i);
			second(i);
		}
	}
	
	public static void second(int i) {
		i += 10;
		if(i == 90) {
			therd(i);
		}
		System.out.println(i);
		first(i);

}
	
	public static int therd(int i ) {
		int num = i;
		System.out.println("num 는"+num);
		return num;
	}
	
}

