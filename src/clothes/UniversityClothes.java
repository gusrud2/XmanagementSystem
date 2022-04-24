package clothes;

import java.util.Scanner;

public class UniversityClothes extends Clothes {
	
	public void getUserInput(Scanner input) {
		System.out.print("Clothes Category: "); 
		String category = input.next(); 
		this.setCategory(category);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer == 'n' && answer == 'N') {
			System.out.print("Is there a brand for clothes? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Clothes Brand: "); 
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
		
		System.out.print("Clothes Color: "); 
		String color = input.next();
		this.setColor(color);
		
		System.out.print("Clothes Season: "); 
		String season = input.next();
		this.setSeason(season);
	}
	
	

}
