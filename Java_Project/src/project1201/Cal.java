package project1201;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int i = 10;
		int j = 20;
		
		int sum = i + j;
		
		i++;
		++i;
		
		sum++;
		++sum;
		
		int k = sum * i;
		
		System.out.println("i: "+i);
		
		System.out.println(sum);
		
		System.out.println(k);
*/
		int i = 80;
		int j = 20;
		float sum = (float)j/(float)i;
		
		System.out.println("덧셈: "+(i+j));
		System.out.println("뺄셈: "+(i-j));
		System.out.println("곱셈: "+(i*j));
		System.out.println("나머지: "+(i%j));
		System.out.println("퍼센트: "+(int)(sum*100)+"%");
	}

}
