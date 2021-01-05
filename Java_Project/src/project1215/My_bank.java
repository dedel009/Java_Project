package project1215;

public class My_bank {
	int money =0;
	String name = "";
	
	public My_bank(int money, String name) {
		this.money = money;
		this.name = name;
		String ac_num = "112-123-45682";	//계좌번호

	}
	
	public void pri() {
		System.out.println("나의 머니는"+money);
	}
	
}
