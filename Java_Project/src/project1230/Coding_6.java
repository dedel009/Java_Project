package project1230;

public class Coding_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "9B768C";
		String array[] = str.split("");
		int sum =0;
		char c = 0;
		for(String s : array) {
			if(isNum(s)) {		//숫자이면
				sum += Integer.parseInt(s);
			}else {	//문자이면
				c = s.charAt(0);
				sum += c;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isNum(String s) {
		String[] array = {"1","2","3","4","5","6","7","8","9","0"};
		boolean isNum = false;
		for(int i=0; i<array.length; i++) {
			if(s.equals(array[i])) {
				isNum = true;
				break;
			}else {
				isNum = false;
			}
		}
		return isNum;
	}
}
