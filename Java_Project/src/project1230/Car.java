package project1230;

import java.util.*;

public class Car extends Color {
	private String brand;
	private String color;
	private String kinds;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor( ) {
		Scanner sc = new Scanner(System.in);
		for(String c : carColor) {
			System.out.print(c+" ");
		}
		System.out.println("중 고르시오.");
		String color = sc.next();
		this.color = color;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	

}
