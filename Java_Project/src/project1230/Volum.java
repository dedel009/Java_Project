package project1230;
import java.util.*;

public class Volum {
	private int volum;
	
	public void change_volum() {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("+  -");
			String volum_menu = sc.next();
			switch(volum_menu) {
			case "+":
				volum_up();
				break;
			case "-":
				volum_down();
				break;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public void volum_up() {
		this.volum +=1;
		System.out.println("불륨이 올라갔습니다. 현재 볼륨은 "+this.volum+"입니다.");
	}
	
	public void volum_down() {
		if(volum ==0) {
			System.out.println("현재볼륨이 0입니다");
		}else {
			this.volum -=1;
			System.out.println("불륨이 내려갔습니다. 현재 볼륨은 "+this.volum+"입니다.");
		}
		
	}
}
