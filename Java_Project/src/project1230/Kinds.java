package project1230;
import java.util.*;

public class Kinds extends Company{
	
	public void kinds() {
		Scanner sc= new Scanner(System.in);
		for(String b : brand) {
			System.out.println(b+" ");
		}
		System.out.println("중 선택");
		String brand = sc.next();
		super.choice_brand = brand;
		switch(brand) {
		case "BMW":
			intro_BMW();
			break;
		case "HYDAI":
			intro_HYDAI();
			break;
		case "BENZ":
			break;
		case "AUDI":
			break;
		}
	}

	
}
