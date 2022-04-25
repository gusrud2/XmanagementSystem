package clothes;

import java.util.Scanner;

public class Shoes extends Clothes {
	
	protected int size;
	
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
		int size = input.nextInt();
		this.setSize(size);
		
	}

}
