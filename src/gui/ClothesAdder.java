package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ClothesAdder extends JFrame {
	
	public ClothesAdder() {
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
		panel.add(labelSeason);
		panel.add(fieldSeason);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
