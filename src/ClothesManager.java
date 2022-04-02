import java.util.Scanner;

public class ClothesManager {
	Clothes clothes;
	Scanner input;
	
	ClothesManager(Scanner input){
		this.input = input;
		
	}
	
	public void AddClothes() { //AddClothes함수 정의
		clothes = new Clothes();
		System.out.print("Clothes Category: "); //옷 종류 입력
		clothes.category = input.next(); 
		System.out.print("Clothes Brand: "); //옷 브랜드 입력
		clothes.brand = input.next();
		System.out.print("Clothes Color: "); //옷 색깔 입력
		clothes.color = input.next();
		System.out.print("Clothes Season: "); //옷의 계절을 입력
		clothes.season = input.next();
		
	}
	
	public void DeleteClothes() { //DeleteClothtes함수 정의 
		System.out.print("Clothes Category: ");
		String category1 = input.next();
		if (clothes.category.equals(null)) {
			System.out.println("the clothes has not been registered");
			return;
		}
		if (clothes.category.equals(category1)) {
			clothes = null;
			System.out.println("the clothes is deleted");
		}
		
	}
	
	public void EditClothes() { //EditClothes함수 정의
		System.out.print("Clothes Category: ");
		String category1 = input.next();
		if (clothes.category.equals(category1)) {
			System.out.println("the clothes to be edited is "+ category1);
		}
		
	}
	
	public void ViewClothes() { //ViewClothes함수 정의
		System.out.print("Clothes Category: ");
		String category1 = input.next();
		if (clothes.category.equals(category1)) {
			clothes.printInfo();
		}
		
	}

}
