package clothes;

import java.util.Scanner;

public class Clothes {
	protected ClothesKind kind = ClothesKind.Worker;
	protected String category;
	protected String brand;
	protected String color;
	protected String season;
	
	public Clothes() {
		
	}
	public Clothes(String category, String brand) {
		this.category = category;
		this.brand = brand;
	}
	
	public Clothes(String category, String brand, String color, String season) {
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
		System.out.println("category: "+category);
		System.out.println("brand: "+ brand);
		System.out.println("color: "+ color);
		System.out.println("season: "+ season);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Clothes Category: "); //¿Ê Á¾·ù ÀÔ·Â
		String category = input.next(); 
		this.setCategory(category);
		
		System.out.print("Clothes Brand: "); //¿Ê ºê·£µå ÀÔ·Â
		String brand = input.next();
		this.setBrand(brand);
		
		System.out.print("Clothes Color: "); //¿Ê »ö±ò ÀÔ·Â
		String color = input.next();
		this.setColor(color);
		
		System.out.print("Clothes Season: "); //¿ÊÀÇ °èÀýÀ» ÀÔ·Â
		String season = input.next();
		this.setSeason(season);
	}

}
