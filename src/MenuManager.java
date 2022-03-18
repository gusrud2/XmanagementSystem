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
		    
		    if (num == 1) {
		    	System.out.print("Clothes Category: ");
		    	input.nextLine();
		    	String category = input.nextLine();
		    	System.out.print("Clothes Brand: ");
		    	String brand = input.nextLine();
		    	System.out.print("Clothes Color: ");
		    	String color = input.nextLine();
		    	System.out.print("Clothes Season: ");
		    	String season = input.nextLine();
		    }
		}

	}

}
