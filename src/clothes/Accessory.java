package clothes;

import java.util.Scanner;

public class Accessory extends Clothes {
	
	public Accessory(ClothesKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Accessory "); 
		setClothesCategory(input);
		System.out.print("Accessory "); 
		setClothesBrandwithYN(input);
		System.out.print("Accessory "); 
		setClothesColor(input);
	}
	
	public void setClothesBrandwithYN(Scanner input) {
		char answer = 'x';
		for(;;) {
			System.out.print("Is there a brand for Accessory? (Y/N): ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setClothesBrand(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setBrand("");
				break;
			}
			else {
				
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		
		System.out.print("kind: "+skind);	
		if (season == null) {
			System.out.print(" category: "+category);
			System.out.print(" brand: "+ brand);
			System.out.print(" color: "+ color);
		}
		else {
			System.out.print(" category: "+category);
			System.out.print(" brand: "+ brand);
			System.out.print(" color: "+ color);
			System.out.print(" season: "+ season);
		}
		
		if (size > 0) {
			System.out.print(" size: "+ size);
		}

	}

}
