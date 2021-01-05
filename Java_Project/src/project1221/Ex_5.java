package project1221;

public class Ex_5 {
	public static void main(String[] args) {
		int donggas_price = 8000;
		int calguksu_price = 6000;
		int kingmandu_price = 5000;
		int donggas_num  = 16;
		int calguksu_num = 8;
		int kingmandu_num = 1;
		int sum = 0;
		
		System.out.printf("돈까스 x %2d = %6d\n", donggas_num, donggas_price*donggas_num);
		System.out.printf("칼국수 x %2d = %6d\n", calguksu_num, calguksu_price*calguksu_num);
		System.out.printf("왕만두 x %2d = %6d\n", kingmandu_num, kingmandu_price*kingmandu_num);
		System.out.println("=================");
		sum = donggas_price*donggas_num+calguksu_price*calguksu_num+kingmandu_price*kingmandu_num;
		System.out.println("총합 : "+sum);
	}
}
