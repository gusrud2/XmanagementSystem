import java.util.Scanner;

public class ClothesManager {
	Clothes clothes;
	Scanner input;
	
	ClothesManager(Scanner input){
		this.input = input;
		
	}
	
	public void AddClothes() { //AddClothes�Լ� ����
		clothes = new Clothes();
		System.out.print("Clothes Category: "); //�� ���� �Է�
		clothes.category = input.next(); 
		System.out.print("Clothes Brand: "); //�� �귣�� �Է�
		clothes.brand = input.next();
		System.out.print("Clothes Color: "); //�� ���� �Է�
		clothes.color = input.next();
		System.out.print("Clothes Season: "); //���� ������ �Է�
		clothes.season = input.next();
		
	}
	
	public void DeleteClothes() { //DeleteClothtes�Լ� ���� 
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
	
	public void EditClothes() { //EditClothes�Լ� ����
		System.out.print("Clothes Category: ");
		String category1 = input.next();
		if (clothes.category.equals(category1)) {
			System.out.println("the clothes to be edited is "+ category1);
		}
		
	}
	
	public void ViewClothes() { //ViewClothes�Լ� ����
		System.out.print("Clothes Category: ");
		String category1 = input.next();
		if (clothes.category.equals(category1)) {
			clothes.printInfo();
		}
		
	}

}
