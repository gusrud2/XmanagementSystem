package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import clothes.ClothesInput;
import manager.ClothesManager;

public class ClothesViewer extends JPanel {

	WindowFrame frame;
	
	ClothesManager ClothesManager;

	public ClothesViewer(WindowFrame frame, ClothesManager ClothesManager) {
		this.frame = frame;
		this.ClothesManager = ClothesManager;
		
		System.out.println("***"+ClothesManager.size()+"***");
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Category");
		model.addColumn("Brand");
		model.addColumn("Color");
		model.addColumn("Season");
		
		for (int i=0; i<ClothesManager.size(); i++) {
			Vector row = new Vector();
			ClothesInput ci = ClothesManager.get(i);
			row.add(ci.getCategory());
			row.add(ci.getBrand());
			row.add(ci.getColor());
			row.add(ci.getSeason());
			model.addRow(row);
		}
		
			
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
