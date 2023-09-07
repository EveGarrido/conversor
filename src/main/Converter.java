package main;

import javax.swing.*;


public class Converter {	 
	
	public static void main(String args[]) {  
		SwingUtilities.invokeLater(()->{
			JFrame frame = new ConverterGUI();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
		});
	}
	
}


    
	
	

