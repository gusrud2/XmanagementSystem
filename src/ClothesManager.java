import java.util.ArrayList;
import java.util.Scanner;

import clothes.Clothes;
import clothes.UniversityClothes;

public class ClothesManager {
	ArrayList<Clothes> cloth = new ArrayList<Clothes>();
	Scanner input;
	
	ClothesManager(Scanner input){
		this.input = input;
		
	}
	
	public void AddClothes() { //AddClothes함수 정의
		int kind = 0;
		Clothes clothes;
		while (kind != 1 && kind != 2) {
			System.out.print("1 for Worker ");
			System.out.println("2 for University ");
			System.out.print("Select num for Clothes Kind between 1 and 2: ");
			kind = input.nextInt(); 
			if (kind == 1) {
				clothes = new Clothes();
				clothes.getUserInput(input);
				cloth.add(clothes);
				break;
			}
			else if (kind == 2) {
				clothes = new UniversityClothes();
				clothes.getUserInput(input);
				cloth.add(clothes);
				break;
			}
			else {
				System.out.print("Select num for Clothes Kind between 1 and 2: ");				
			}
			
		}

		

	}
	
	public void DeleteClothes() { //DeleteClothtes함수 정의 
		System.out.print("Clothes Category: ");
		String category1 = input.next();
		int index= -1;
		for (int i=0; i<cloth.size(); i++) {
			if (cloth.get(i).getCategory().equals(category1)) {
				index = i;
				break;
			}
			
		}
		
		if (index >= 0) {
			cloth.remove(index);
			System.out.println("the clothes"+ category1 +" is deledted");
		}
		else {
			System.out.println("the clothes has not been registered.");
			return;
		}
		
	}
	
	public void EditClothes() { //EditClothes함수 정의
		System.out.print("Clothes Category: ");
		String category1 = input.next();
		for (int i=0; i<cloth.size(); i++) {
			Clothes clothes = cloth.get(i);
			if (cloth.get(i).getCategory().equals(category1)) {
				int num = -1;
				while (num != 5) {
					System.out.println("*** Clothes Management System Menu ***");
					System.out.println("1. Add Clothes");
				    System.out.println("2. Delete Clothes");
				    System.out.println("3. Edit Clothes");
				    System.out.println("4. View Clothes");
				    System.out.println("5. Exit");
				    System.out.println("**************************************");
				    System.out.print("Select one number between 1-5: "); 
				    num = input.nextInt();
				    if (num == 1) {
				    	System.out.print("Clothes category: ");
				    	String category = input.next();
				    	clothes.setCategory(category);
				    }
				    else if (num == 2) {
				    	System.out.print("Clothes brand: ");
				    	String brand = input.next();
				    	clothes.setBrand(brand);
				    }
				    else if (num == 3) {
				    	System.out.print("Clothes color: ");
				    	String brand = input.next();
				    	clothes.setColor(brand);
				    }
				    else if (num == 4) {
				    	System.out.print("Clothes season: ");
				    	String brand = input.next();
				    	clothes.setSeason(brand);
				    }
				    else {
				    	continue;
				    }
				}
				break;
			}
		}
		
	}
	
	public void ViewClothes() { //ViewClothes함수 정의
//		System.out.print("Clothes Category: ");
//		String category1 = input.next();
		for (int i=0; i<cloth.size(); i++) {
			cloth.get(i).printInfo();
		}
		
	}

}
