package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ClothesAdder;
import gui.ClothesViewer;
import gui.WindowFrame;


public class ClothesAdderCancelListener implements ActionListener {
	
	WindowFrame frame;

	public ClothesAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();

	}

}
