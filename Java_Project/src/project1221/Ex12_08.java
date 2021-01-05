package project1221;


abstract class Car{
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
}

class Sedan extends Car{
	int speed = 5;
	
	public Sedan() {
		System.out.println(super.speed);
		System.out.println(this.speed);
	}
}

class Truck extends Car{
}


public class Ex12_08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan();
		System.out.println("승용차 인스턴스 생성~~");
		Truck truck1 = new Truck();
		System.out.println("트럭 인스턴스 생성~");
		System.out.println();
	}
}
