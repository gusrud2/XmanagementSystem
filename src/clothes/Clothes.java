package clothes;

import java.io.Serializable;
import java.util.Scanner;

import Exception.SizeExcetption;

public abstract class Clothes implements ClothesInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8134865206522167233L;
	
	protected ClothesKind kind = ClothesKind.Clothes;
	protected String category;
	protected String brand;
	protected String color;
	protected String season;
	
	public Clothes() {
	}
	
	public Clothes(ClothesKind kind) {
		this.kind = kind;
	}
	public Clothes(String category) {
		this.category = category;
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
	protected int size;
	public Clothes(String category, String brand, String color, int size) {
		this.category = category;
		this.brand = brand;
		this.color = color;
		this.size = size;
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) throws SizeExcetption{
		if(size>300) {
			throw new SizeExcetption();
		}
		this.size = size;
	}
	
	public abstract void printInfo();
	
	public void setClothesCategory(Scanner input) {
		System.out.print("category: ");
    	String category = input.next();
    	this.setCategory(category);
	}
	
	public void setClothesBrand(Scanner input) {
		System.out.print("brand: ");
    	String brand = input.next();
    	this.setBrand(brand);
	}
	
	public void setClothesColor(Scanner input) {
		System.out.print("color: ");
    	String color = input.next();
    	this.setColor(color);
	}
	
	public void setClothesSeason(Scanner input) {
		System.out.print("season: ");
    	String season = input.next();
    	this.setSeason(season);
	}
	
	public void setClothesSize(Scanner input) {
		int size = 301;
		while(size > 300) {
			System.out.print("size: ");
			size = input.nextInt();
			try {
				this.setSize(size);
			} 
			catch (SizeExcetption e ) {
				System.out.println("Incorrect Size(0-300)!!");
			}
		}
    	
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Clothes:
			skind = "Clothes,";
			break;
		case Accessory:
			skind = "Accessory,";
			break;
		case Bag:
			skind = "Bag,";
			break;
		case Shoes:
			skind = "Shoes,";
			break;
		default:
		}
		return skind;
		
	}
	
}
