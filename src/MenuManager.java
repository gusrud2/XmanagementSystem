import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ClothesManager ClothesManager = new ClothesManager(input);

		int num = 0;
		
		
		while(num != 6) {
			System.out.println("*** Clothes Management System Menu ***");
			System.out.println("1. Add Clothes");
		    System.out.println("2. Delete Clothes");
		    System.out.println("3. Edit Clothes");
		    System.out.println("4. View Clothes");
		    System.out.println("5. Exit");
		    System.out.println("**************************************");
		    System.out.print("Select one number between 1-5: "); 
		    num = input.nextInt();
		    
		   if(num == 1) { //1�϶�
			   ClothesManager.AddClothes(); //AddClothes �Լ��� �̵�
		    }
		   else if (num == 2) { //2�϶�
			   ClothesManager.DeleteClothes(); //DeleteClothtes �Լ��� �̵�
			}
		   else if (num == 3) { //3�϶�
			   ClothesManager.EditClothes(); //EditClothes �Լ��� �̵�
		   }
		   else if (num == 4) { //4�϶�
			   ClothesManager.ViewClothes(); //ViewClothes �Լ��� �̵�
		   }
		   else {
			   continue; 
		   }
		
		   System.out.println();
		}
		
	}
	
}
