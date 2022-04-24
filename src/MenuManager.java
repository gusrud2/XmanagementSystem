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
		    
		   if(num == 1) { //1일때
			   ClothesManager.AddClothes(); //AddClothes 함수로 이동
		    }
		   else if (num == 2) { //2일때
			   ClothesManager.DeleteClothes(); //DeleteClothtes 함수로 이동
			}
		   else if (num == 3) { //3일때
			   ClothesManager.EditClothes(); //EditClothes 함수로 이동
		   }
		   else if (num == 4) { //4일때
			   ClothesManager.ViewClothes(); //ViewClothes 함수로 이동
		   }
		   else {
			   continue; 
		   }
		
		   System.out.println();
		}
		
	}
	
}
