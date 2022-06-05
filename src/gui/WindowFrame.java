package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ClothesManager;


public class WindowFrame extends JFrame{
	
	ClothesManager ClothesManager;
	
	MenuSelection menuselection;
	ClothesAdder clothesadder;
	ClothesViewer clothesViewer;

	public WindowFrame(ClothesManager ClothesManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.ClothesManager = ClothesManager;
		menuselection = new MenuSelection(this);
		clothesadder = new ClothesAdder(this);
		clothesViewer = new ClothesViewer(this, this.ClothesManager);
				
		this.add(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ClothesAdder getClothesadder() {
		return clothesadder;
	}

	public void setClothesadder(ClothesAdder clothesadder) {
		this.clothesadder = clothesadder;
	}

	public ClothesViewer getClothesViewer() {
		return clothesViewer;
	}

	public void setClothesViewer(ClothesViewer clothesViewer) {
		this.clothesViewer = clothesViewer;
	}

}
