package clothes;

import java.util.Scanner;

public class Accessory extends Clothes {
	
	public Accessory(ClothesKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Accessory Category: "); 
		String category = input.next(); 
		this.setCategory(category);
		
		char answer = 'x';
		
		for(;;) {
			System.out.print("Is there a brand for Accessory? (Y/N): ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Accessory Brand: "); 
				String brand = input.next();
				this.setBrand(brand);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setBrand("");
				break;
			}
			else {
			}
		}
		
		System.out.print("Accessory Color: "); 
		String color = input.next();
		this.setColor(color);
		
		System.out.print("Accessory Season: "); 
		String season = input.next();
		this.setSeason(season);
	
	}

}
