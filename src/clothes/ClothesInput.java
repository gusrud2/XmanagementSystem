package clothes;

import java.util.Scanner;

import Exception.SizeExcetption;

public interface ClothesInput {
	
	public String getCategory();
	
	public void setCategory(String category);
	
	public void setBrand(String brand);
	
	public void setColor(String color);
	
	public void setSeason(String season);
	
	public void setSize(int size) throws SizeExcetption;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setClothesCategory(Scanner input);
	
	public void setClothesBrand(Scanner input);
	
	public void setClothesColor(Scanner input);
	
	public void setClothesSeason(Scanner input);
	
	public void setClothesSize(Scanner input);
}
