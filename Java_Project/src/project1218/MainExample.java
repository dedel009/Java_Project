package project1218;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Get_set gs = new Get_set("검은색", 4000, 4);
		System.out.println("1 color : "+gs.color);
		System.out.println("1 cc : "+gs.cc);
		System.out.println("1 door : "+gs.door);
		
		Get_set gs2 = new Get_set("노란색");
		System.out.println("2 color : "+gs2.color);
		System.out.println("2 cc : "+gs2.cc);
		System.out.println("2 door : "+gs2.door);
		
		Get_set gs3 = new Get_set("흰색",2000, 2);
		System.out.println("3 color : "+gs3.color);
		System.out.println("3 cc : "+gs3.cc);
		System.out.println("3 door : "+gs3.door);
		
		Get_set gs4 = new Get_set("흰색",2000);
		System.out.println("4 color : "+gs4.color);
		System.out.println("4 cc : "+gs4.cc);
		System.out.println("4 door : "+gs4.door);
	}

}
