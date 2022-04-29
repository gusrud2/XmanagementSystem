import java.util.ArrayList;
import java.util.Scanner;

import clothes.Clothes;
import clothes.ClothesKind;
import clothes.Accessory;
import clothes.Bag;
import clothes.Shoes;

public class ClothesManager {
	ArrayList<Clothes> cloth = new ArrayList<Clothes>();
	Scanner input;
	
	ClothesManager(Scanner input){
		this.input = input;
		
	}
	
	public void AddClothes() { //AddClothes함수 정의
		int kind = 0;
		Clothes clothes;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("------------");
			System.out.println("1 Clothes ");
			System.out.println("2 Accessory");
			System.out.println("3 Bag");
			System.out.println("4 Shoes ");
			System.out.println("------------");
			System.out.print("Select num for Clothes Kind between 1-4: ");
			kind = input.nextInt(); 
			
			if (kind == 1) {
				clothes = new Clothes(ClothesKind.Clothes);
				clothes.getUserInput(input);
				cloth.add(clothes);
				break;
			}
			else if (kind == 2) {
				clothes = new Accessory(ClothesKind.Accessory);
				clothes.getUserInput(input);
				cloth.add(clothes);
				break;
			}
			else if (kind == 3) {
				clothes = new Bag(ClothesKind.Bag);
				clothes.getUserInput(input);
				cloth.add(clothes);
				break;
			}
			else if (kind == 4) {
				clothes = new Shoes(ClothesKind.Shoes);
				clothes.getUserInput(input);
				cloth.add(clothes);
				break;
			}
			else {
				System.out.print("Select num for Clothes Kind between 1-4: ");				
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
			System.out.println("the clothes "+ category1 +" is deledted");
		}
		
		else {
			System.out.println("the clothes has not been registered.");
			return;
		}
		
	}
	
	public void EditClothes() { //EditClothes함수 정의
		System.out.print("Category를 입력하세요: ");
		String category1 = input.next();
		
		for (int i=0; i<cloth.size(); i++) {
			Clothes clothes = cloth.get(i);
			
			if (cloth.get(i).getCategory().equals(category1)) {
				int num = -1;
				while (num != 6) {
					cloth.get(i).printInfo();
					System.out.println();
					System.out.println("---------------------");
					System.out.println("1. Edit Category");
				    System.out.println("2. Edit Brand");
				    System.out.println("3. Edit Color");
				    System.out.println("4. Edit Season");
				    System.out.println("5. Edit Size(shoes)");
				    System.out.println("6. Exit");
				    System.out.println("---------------------");
				    System.out.print("수정할 항목을 선택하세요: "); 
				    num = input.nextInt();
				    if (num == 1) {
				    	System.out.print("수정할 category: ");
				    	String category = input.next();
				    	clothes.setCategory(category);
				    }
				    else if (num == 2) {
				    	System.out.print("수정할 brand: ");
				    	String brand = input.next();
				    	clothes.setBrand(brand);
				    }
				    else if (num == 3) {
				    	System.out.print("수정할 color: ");
				    	String color = input.next();
				    	clothes.setColor(color);
				    }
				    else if (num == 4) {
				    	System.out.print("수정할 season: ");
				    	String season = input.next();
				    	clothes.setSeason(season);
				    }
				    else if (num == 5) {
				    	System.out.print("수정할 size: ");
				    	int size = input.nextInt();
				    	clothes.setSize(size);
				    }
				    else {
				    	break;
				    }				    
				}
				
			}
			
		}
		
	}
	
	public void ViewClothes() { //ViewClothes함수 정의
		for (int i=0; i<cloth.size(); i++) {
			cloth.get(i).printInfo();
			System.out.println();
		}
		
	}

}
