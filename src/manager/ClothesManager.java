package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import clothes.Clothes;
import clothes.ClothesInput;
import clothes.ClothesKind;
import clothes.NewClothes;
import clothes.Accessory;
import clothes.Bag;
import clothes.Shoes;


public class ClothesManager implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6418587571774776437L;
	
	ArrayList<ClothesInput> cloth = new ArrayList<ClothesInput>();
	transient Scanner input;
	
	ClothesManager(Scanner input){
		this.input = input;
		
	}
	
	public void AddClothes(String category, String brand, String color, String season ) {
		ClothesInput clothesInput = new NewClothes(ClothesKind.Clothes);
		clothesInput.getUserInput(input);
		cloth.add(clothesInput);
	}
	
	public void AddClothes(ClothesInput clothesInput) {
		cloth.add(clothesInput);
	}
	
	
	public void AddClothes() { //AddClothes함수 정의
		int kind = 0;
		ClothesInput clothesInput;
		while (kind < 1 || kind > 4) {
			try {
				System.out.println("------------");
				System.out.println("1 Clothes   ");
				System.out.println("2 Accessory ");
				System.out.println("3 Bag       ");
				System.out.println("4 Shoes     ");
				System.out.println("------------");
				System.out.print("Select num for Clothes Kind between 1-4: ");
				kind = input.nextInt(); 
				
				if (kind == 1) {
					clothesInput = new NewClothes(ClothesKind.Clothes);
					clothesInput.getUserInput(input);
					cloth.add(clothesInput);
					break;
				}
				else if (kind == 2) {
					clothesInput = new Accessory(ClothesKind.Accessory);
					clothesInput.getUserInput(input);
					cloth.add(clothesInput);
					break;
				}
				else if (kind == 3) {
					clothesInput = new Bag(ClothesKind.Bag);
					clothesInput.getUserInput(input);
					cloth.add(clothesInput);
					break;
				}
				else if (kind == 4) {
					clothesInput = new Shoes(ClothesKind.Shoes);
					clothesInput.getUserInput(input);
					cloth.add(clothesInput);
					break;
				}
				else {
					System.out.print("Select num for Clothes Kind between 1-4: ");				
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1-4!");
				if (input.hasNext() ) {
					input.next();
				}
				kind = -1;
			}
		}

	}
	
	public void DeleteClothes() { //DeleteClothtes함수 정의 
		System.out.print("Clothes Category: ");
		String category1 = input.next();
		int index = findIndex(category1);
		removefromClothes(index, category1);
	}
	
	public int findIndex(String category1) {
		int index= -1;
		for (int i=0; i<cloth.size(); i++) {
			if (cloth.get(i).getCategory().equals(category1)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromClothes(int index, String category1) {
		if (index >= 0) {
			cloth.remove(index);
			System.out.println("the clothes "+ category1 +" is deledted");
			return 1;
		}
		else {
			System.out.println("the clothes has not been registered.");
			return -1;
		}
	}
	
	public void EditClothes() { //EditClothes함수 정의
		System.out.print("Category를 입력하세요: ");
		String category1 = input.next();
		
		for (int i=0; i<cloth.size(); i++) {
			ClothesInput clothesInput = cloth.get(i);
			
			if (clothesInput.getCategory().equals(category1)) {
				int num = -1;
				while (num != 6) {
					cloth.get(i).printInfo();
					showEditMenu();
				    num = input.nextInt();
				    switch(num) {
				    case 1:
				    	clothesInput.setClothesCategory(input);
				    	break;
				    case 2:
				    	clothesInput.setClothesBrand(input);
				    	break;
				    case 3:
				    	clothesInput.setClothesColor(input);
				    	break;
				    case 4:
				    	clothesInput.setClothesSeason(input);
				    	break;
				    case 5:
				    	clothesInput.setClothesSize(input);
				    	break;
				    default:
				    	continue;
				    }
								    
				}
				break;				
			}
			
		}
		
	}
	
	public void ViewClothes() { //ViewClothes함수 정의
		for (int i = 0; i < cloth.size(); i++) {
			cloth.get(i).printInfo();
			System.out.println();
		}
		
		System.out.println();
	}
	
	public int size() {
		return cloth.size();
	}
	
	public ClothesInput get(int index) {
		return cloth.get(index);
	}
	
	public void showEditMenu() {
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
	}

}
