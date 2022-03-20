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
		    
		    switch (num) {
		    case 1 :
		    	System.out.print("Clothes Category: "); // 옷 종류에 대해 입력받도록 출력
		    	input.nextLine();
		    	String category = input.nextLine(); 
		    	System.out.print("Clothes Brand: "); //옷 브랜드에 대해 입력받도록 출력
		    	String brand = input.nextLine();
		    	System.out.print("Clothes Color: "); //옷 색깔에 대해 입력받도록 출력
		    	String color = input.nextLine();
		    	System.out.print("Clothes Season: "); //봄, 여름, 가을, 겨울 등 입력한 옷에 맞는 계절을 입력하도록 출력
		    	String season = input.nextLine();
		    	break;
		    	
		    case 2 :
		    	System.out.print("Clothes Category: "); 
		    	input.nextLine();
		    	String category2 = input.nextLine();
		    	break;
		    	
		    case 3 :
		    	System.out.print("Clothes Category: "); 
		    	input.nextLine();
		    	String category3 = input.nextLine();
		    	break;
		    	
		    case 4 :
		    	System.out.print("Clothes Category: "); 
		    	input.nextLine();
		    	String category4 = input.nextLine();
		    	break;
		    	
		    }
		    
		    System.out.println();
		}

	}

}
