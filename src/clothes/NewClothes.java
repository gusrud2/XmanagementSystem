package clothes;
import java.util.Scanner;

public class NewClothes extends Clothes {
	
	public NewClothes(ClothesKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Clothes ");
		setClothesCategory(input);
		System.out.print("Clothes ");
		setClothesBrand(input);
		System.out.print("Clothes ");
		setClothesColor(input);
		System.out.print("Clothes ");
		setClothesSeason(input);	
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
