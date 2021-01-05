package project1208;

public class Array_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5,6};
		
		String str = "ABCDE";
		char c= ' ';
		int num = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.equals("D")) {
				c = str.charAt(3);
				break;
			}
			if(nums[i]==4) {
				num = nums[i];
				break;
			}
		}
		System.out.println(num+c);
	}

}
