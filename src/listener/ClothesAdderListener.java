package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import clothes.ClothesInput;
import clothes.ClothesKind;
import clothes.NewClothes;
import manager.ClothesManager;

public class ClothesAdderListener implements ActionListener {

	JTextField fieldCategory;
	JTextField fieldBrand;
	JTextField fieldColor;
	JTextField fieldSeason;
	
	ClothesManager ClothesManager;
	
	public ClothesAdderListener(
			JTextField fieldCategory, 
			JTextField fieldBrand,
			JTextField fieldColor,
			JTextField fieldSeason, ClothesManager ClothesManager) {
		this.fieldCategory = fieldCategory;
		this.fieldBrand = fieldBrand;
		this.fieldColor = fieldColor;
		this.fieldSeason = fieldSeason;
		this.ClothesManager = ClothesManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ClothesInput clothes = new NewClothes(ClothesKind.Clothes);
		clothes.setCategory(fieldCategory.getText());
		clothes.setBrand(fieldBrand.getText());
		clothes.setColor(fieldColor.getText());
		clothes.setSeason(fieldSeason.getText());
		ClothesManager.AddClothes(clothes);
		putObject(ClothesManager, "ClothesManager.ser");
		clothes.printInfo();
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
