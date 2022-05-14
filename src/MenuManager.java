import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ClothesManager ClothesManager = new ClothesManager(input);
		
		selectMenu(input, ClothesManager);	

	}
	
	public static void selectMenu(Scanner input, ClothesManager ClothesManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
			    num = input.nextInt();
			    
			    switch(num) {
			    case 1:
			    	ClothesManager.AddClothes(); //AddClothes 함수로 이동
			    	break;
			    case 2:
			    	ClothesManager.DeleteClothes(); //DeleteClothtes 함수로 이동
			    	break;
			    case 3:
			    	ClothesManager.EditClothes(); //EditClothes 함수로 이동
			    	break;
			    case 4:
			    	ClothesManager.ViewClothes(); //ViewClothes 함수로 이동
			    	break;
			    default:
			    	continue;
			    }
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1-5!");
				if (input.hasNext() ) {
					input.next();
				}
				num = -1;
			}
		   System.out.println();
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Clothes Management System Menu ***");
		System.out.println("1. Add Clothes");
	    System.out.println("2. Delete Clothes");
	    System.out.println("3. Edit Clothes");
	    System.out.println("4. View Clothes");
	    System.out.println("5. Exit");
	    System.out.println("**************************************");
	    System.out.print("Select one number between 1-5: ");
	}
	
}
