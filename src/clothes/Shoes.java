package clothes;

import java.util.Scanner;

public class Shoes extends Clothes {
	
	private String size;
	public Shoes () {
		this.category = category;
		this.brand = brand;
		this.color = color;
		this.size = size;
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Shoes Category: "); 
		String category = input.next(); 
		this.setCategory(category);
		
		System.out.print("Shoes Brand: "); 
		String brand = input.next(); 
		this.setBrand(brand);
		
		System.out.print("Shoes Color: "); 
		String color = input.next();
		this.setColor(color);
		
		System.out.print("Shoes Size: "); 
		String size = input.next();
		this.setSize(size);
		
	}


	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
