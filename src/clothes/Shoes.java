package clothes;

import java.util.Scanner;

public class Shoes extends Clothes {
	
	public Shoes(ClothesKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Shoes ");
		setClothesCategory(input);
		System.out.print("Shoes ");
		setClothesBrand(input);
		System.out.print("Shoes ");
		setClothesColor(input);
		System.out.print("Shoes ");
		setClothesSize(input);
				
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
