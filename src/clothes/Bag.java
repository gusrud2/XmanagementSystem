package clothes;

import java.util.Scanner;

public class Bag extends Clothes {
	
	public Bag(ClothesKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Bag Category: "); 
		String category = input.next(); 
		this.setCategory(category);
		
		System.out.print("Bag Brand: "); 
		String brand = input.next(); 
		this.setBrand(brand);
		
		System.out.print("Bag Color: "); 
		String color = input.next();
		this.setColor(color);
		
	}

	
}
