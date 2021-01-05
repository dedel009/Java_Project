package project1217;

public class Santafe {	
	String model = "Santafe";			//필드값
	String brand = "Hyundai";
	String owner = "";
	int km = 0;
	int maxSpeed = 200;
	
	public Santafe(String owner, int j, int maxSpeed) {
		this.owner = owner;
		km += j;
		this.maxSpeed = maxSpeed;
		car_impormation();

	}
	
	
	public void car_impormation() {
		System.out.println("모델명 : "+model);
		System.out.println("브랜드 : "+brand);
		System.out.println("차주 : "+owner);
		System.out.println("연식 : "+km);
		System.out.println("최대속력 : "+maxSpeed);
	}
	
	public int up() {
		if(km >2) {
			return 1;
		}
		return 5;
	}
	
	public void print() {
		System.out.println("km : "+km);
	}
	
}
