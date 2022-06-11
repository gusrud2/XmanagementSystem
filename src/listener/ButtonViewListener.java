package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.ClothesViewer;
import gui.WindowFrame;
import manager.ClothesManager;


public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ClothesViewer clothesViewer = frame.getClothesViewer();
		ClothesManager ClothesManager = getObject("ClothesManager.ser");
		clothesViewer.setClothesManager(ClothesManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(clothesViewer);
		frame.revalidate();
		frame.repaint();

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

}
