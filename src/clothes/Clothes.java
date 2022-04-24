package clothes;

import java.util.Scanner;

public class Clothes {
	protected ClothesKind kind = ClothesKind.Clothes;
	protected String category;
	protected String brand;
	protected String color;
	protected String season;
	
	public Clothes() {
		
	}
	public Clothes(String category) {
		this.category = category;
	}
	public Clothes(String category, String brand) {
		this.category = category;
		this.brand = brand;
	}
	public Clothes(String category, String brand, String color) {
		this.category = category;
		this.brand = brand;
		this.color = color;
	}
	
	public Clothes(String category, String brand, String color, String season) {
		this.category = category;
		this.brand = brand;
		this.color = color;
		this.season = season;
	}
	public Clothes(ClothesKind kind, String category, String brand, String color, String season) {
		this.kind = kind;
		this.category = category;
		this.brand = brand;
		this.color = color;
		this.season = season;
	}
	
	public void setKind(ClothesKind kind) {
		this.kind = kind;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public ClothesKind getKind() {
		return kind;
	}
	
	
	public void printInfo() {
		System.out.print("category: "+category);
		System.out.print(" brand: "+ brand);
		System.out.print(" color: "+ color);
		System.out.print(" season: "+ season);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Clothes Category: "); //�� ���� �Է�
		String category = input.next(); 
		this.setCategory(category);
		
		System.out.print("Clothes Brand: "); //�� �귣�� �Է�
		String brand = input.next();
		this.setBrand(brand);
		
		System.out.print("Clothes Color: "); //�� ���� �Է�
		String color = input.next();
		this.setColor(color);
		
		System.out.print("Clothes Season: "); //���� ������ �Է�
		String season = input.next();
		this.setSeason(season);
	}

}
