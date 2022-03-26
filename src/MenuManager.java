import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
			System.out.println("*** Clothes Management System Menu ***");
			System.out.println("1. Add Clothes");
		    System.out.println("2. Delete Clothes");
		    System.out.println("3. Edit Clothes");
		    System.out.println("4. View Clothes");
		    System.out.println("5. Show a Menu");
		    System.out.println("6. Exit");
		    System.out.print("Select one number between 1-6 : "); 
		    num = input.nextInt();
		    
		   if(num == 1) {
			   AddClothes();
		    }
		   else if (num == 2) {
			   DeleteClothes();
			}
		   else if (num == 3) {
			   EditClothes();
		   }
		   else if (num == 4) {
			   ViewClothes();
		   }
		   else {
			   continue;
		   }
		}
		
	}
	
	public static void AddClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes Category: ");
		String category = input.nextLine(); 
		System.out.print("Clothes Brand: "); 
		String brand = input.nextLine();
		System.out.print("Clothes Color: "); 
		String color = input.nextLine();
		System.out.print("Clothes Season: "); 
		String season = input.nextLine();
		
	}
	
	public static void DeleteClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes Category: ");
		String category = input.nextLine();
		
	}
	
	public static void EditClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes Category: ");
		String category = input.nextLine();
		
	}
	
	public static void ViewClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes Category: ");
		String category = input.nextLine();
		
	}
}
