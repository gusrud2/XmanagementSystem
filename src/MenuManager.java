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
		    	System.out.print("Clothes Category: "); // �� ������ ���� �Է¹޵��� ���
		    	input.nextLine();
		    	String category = input.nextLine(); 
		    	System.out.print("Clothes Brand: "); //�� �귣�忡 ���� �Է¹޵��� ���
		    	String brand = input.nextLine();
		    	System.out.print("Clothes Color: "); //�� ���� ���� �Է¹޵��� ���
		    	String color = input.nextLine();
		    	System.out.print("Clothes Season: "); //��, ����, ����, �ܿ� �� �Է��� �ʿ� �´� ������ �Է��ϵ��� ���
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
