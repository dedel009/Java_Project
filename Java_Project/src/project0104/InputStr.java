package project0104;
import java.util.*;

public class InputStr {
	static Scanner sc = new Scanner(System.in);
	
	public Str input() {
		System.out.println("글자입력");
		String input = sc.next();
		Str str = new Str();
		str.str = input;

		return str;
	}
}
