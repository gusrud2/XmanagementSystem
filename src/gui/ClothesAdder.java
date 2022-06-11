package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.ClothesAdderCancelListener;
import listener.ClothesAdderListener;
import manager.ClothesManager;

public class ClothesAdder extends JPanel {
	
	WindowFrame frame;
	
	ClothesManager ClothesManager;
	
	public ClothesAdder(WindowFrame frame, ClothesManager ClothesManager) {
		this.frame = frame;
		this.ClothesManager = ClothesManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelCategory = new JLabel("Category: ", JLabel.TRAILING);
		JTextField fieldCategory = new JTextField(10);
		labelCategory.setLabelFor(fieldCategory);
		panel.add(labelCategory);
		panel.add(fieldCategory);
		
		JLabel labelBrand = new JLabel("Brand: ", JLabel.TRAILING);
		JTextField fieldBrand = new JTextField(10);
		labelBrand.setLabelFor(fieldBrand);
		panel.add(labelBrand);
		panel.add(fieldBrand);
		
		JLabel labelColor = new JLabel("Color: ", JLabel.TRAILING);
		JTextField fieldColor = new JTextField(10);
		labelColor.setLabelFor(fieldColor);
		panel.add(labelColor);
		panel.add(fieldColor);
		
		JLabel labelSeason = new JLabel("Season: ", JLabel.TRAILING);
		JTextField fieldSeason = new JTextField(10);
		labelSeason.setLabelFor(fieldSeason);
		
		JButton saveButton= new JButton("save");
		saveButton.addActionListener(new ClothesAdderListener(fieldCategory,fieldBrand,fieldColor,fieldSeason, ClothesManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ClothesAdderCancelListener(frame));
		
		panel.add(labelSeason);
		panel.add(fieldSeason);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}

}
