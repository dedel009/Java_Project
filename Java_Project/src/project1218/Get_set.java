package project1218;

public class Get_set {
	private final String brand = "BENZ";
	String color = "";
	int cc = 0;
	int door = 0;

	public Get_set() {
		
	}
	
	public Get_set(String color, int cc, int door) {
		this.color = color;
		this.cc = cc;
		this.door  = door;
	}
	
	public Get_set(String color) {
		this(color, 4000, 4);
	}
	
	public Get_set(String color, int cc) {
		this(color, cc, 4);
	}
		
	
}
