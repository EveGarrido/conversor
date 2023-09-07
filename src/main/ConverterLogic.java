package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.management.RuntimeErrorException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ConverterLogic implements ActionListener{
	
	private JTextField enteredValue;
	private JComboBox<String> optionsCoins;

	
	public ConverterLogic(JTextField enteredValue, JComboBox<String> optionsCoins) {
		this.enteredValue = enteredValue;
		this.optionsCoins = optionsCoins;
	}
	
	
	public BigDecimal formatResult (double number) {
		BigDecimal formattedResult = new BigDecimal(number);
		formattedResult = formattedResult.setScale(2, RoundingMode.HALF_UP);
		return formattedResult;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			double enteredValueNum = Double.parseDouble(enteredValue.getText());	
			String optionSelected = (String) optionsCoins.getSelectedItem().toString();

	            
	            switch(optionSelected) {
	            	case "CLP to Dolar":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum * 0.0012) + " Dólares");
	            		break;
	            	case "Dolar to CLP":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum / 0.0012) + " Pesos Chilenos");
	            		break;
	            	case "CLP to Euros":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum * 0.0011) + " Euros");
	            		break;
	            	case "Euros to CLP":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum / 0.0011) + " Pesos Chilenos");
	            		break;
	            	case "CLP to Libras Esterlinas":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum * 0.00092) + " Libras Esterlinas");
	            		break;
	            	case "Libras Esterlinas to CLP":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum / 0.00092) + " Pesos Chilenos");
	            		break;
	            	case "CLP to Yen Japones":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum * 0.17) + " Yen Japones");
	            		break;
	            	case "Yen Japones to CLP":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum / 0.17) + " Pesos Chilenos");
	            		break;
	            	case "CLP to Won - sul-coreano":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum * 1.53) + " Won - sul-coreano");
	            		break;
	            	case "Won - sul-coreano to CLP":
	            		JOptionPane.showMessageDialog(null, formatResult(enteredValueNum / 1.53) + " Pesos Chilenos");
	            		break;
	            	}
	            
	            } catch(NumberFormatException ex) {
	            	JOptionPane.showMessageDialog(
	            			null, 
	            			"Invalid data, please, enter a numerical value",
	            			"Alert", JOptionPane.WARNING_MESSAGE);
	            }
	
	}
	
}
