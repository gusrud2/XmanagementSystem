package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClothesViewer extends JFrame {

	public ClothesViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Category");
		model.addColumn("Brand");
		model.addColumn("Color");
		model.addColumn("Season");
		
			
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
	}

}
