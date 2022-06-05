package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;


public class MenuManager{
	
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ClothesManager ClothesManager = getObject("ClothesManager.ser");
		if (ClothesManager == null) {
			ClothesManager = new ClothesManager(input);
		} else {
			ClothesManager.input = input;
		}
		
		
		WindowFrame frame = new WindowFrame(ClothesManager);
		selectMenu(input, ClothesManager);	
		putObject(ClothesManager, "ClothesManager.ser");

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
			    	logger.log("add clothes");
			    	break;
			    case 2:
			    	ClothesManager.DeleteClothes(); //DeleteClothtes 함수로 이동
			    	logger.log("delete clothes");
			    	break;
			    case 3:
			    	ClothesManager.EditClothes(); //EditClothes 함수로 이동
			    	logger.log("edit clothes");
			    	break;
			    case 4:
			    	ClothesManager.ViewClothes(); //ViewClothes 함수로 이동
			    	logger.log("edit a list of clothes");
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
	
	public static ClothesManager getObject(String Filename) {
		ClothesManager ClothesManager = null;
		
		try {
			FileInputStream file = new FileInputStream(Filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			ClothesManager = (ClothesManager) in.readObject();
			
			in.close();
			file.close();
		
		} catch (FileNotFoundException e) {
			return ClothesManager;
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ClothesManager;
	}
	
	public static void putObject(ClothesManager ClothesManager, String Filename) {
		try {
			FileOutputStream file = new FileOutputStream(Filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(ClothesManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
