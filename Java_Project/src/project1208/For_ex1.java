package project1208;

public class For_ex1 {

	public static void main(String[] args) {
		int j = 2;
		// TODO Auto-generated method stub
		for(int i = 1; i<=10; i++) {
			System.out.println(j+"*"+i+"="+i*j);
			if(i==9) {
				i=0;
				j+=1;
				if(j==10) {
					break;
				}
			}
			
		}
	}

}
