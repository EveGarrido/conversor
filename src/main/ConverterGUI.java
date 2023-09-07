package main;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class ConverterGUI extends JFrame{
		
		private JPanel panel;
		private JLabel labelConvert;
		private JLabel labelEnter;
		private JTextField valorIngresado;
		private JButton btnConverter;
		private JButton btnFrom;
		private JButton btnTo;
		
        String[] monedas = {
        		"CLP to Dolar", 
        		"CLP to Euros",
        		"CLP to Libras Esterlinas",
        		"CLP to Yen Japones",
        		"CLP to Won - sul-coreano"
        		}; 
 
        String[] monedasReversa = {
        		"Dolar to CLP", 
        		"Euros to CLP",
        		"Libras Esterlinas to CLP",
        		"Yen Japones to CLP",
        		"Won - sul-coreano to CLP"
        		};
		
	
	public ConverterGUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize( 500, 500 );
		setLocationRelativeTo ( null );
		
		
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(500, 500);
        panel.setBackground(new java.awt.Color(186, 215, 0));
        add(panel);
        
        labelConvert = new JLabel("CONVERTER");
        labelConvert.setBounds(215, 30, 100, 30);
        panel.add(labelConvert);
        
        btnFrom = new JButton("From CLP");
        btnFrom.setBounds(100, 100, 100, 30);
        btnFrom.setBackground(new java.awt.Color(45, 45, 45)); 
        btnFrom.setForeground(Color.white);
        btnFrom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.add(btnFrom);
        
        btnTo = new JButton("To CLP");
        btnTo.setBounds(300, 100, 100, 30);
        btnTo.setBackground(new java.awt.Color(45, 45, 45)); 
        btnTo.setForeground(Color.white);
        btnTo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.add(btnTo);
        
        JComboBox<String> comboMonedas = new JComboBox<>(monedas);
        comboMonedas.setBounds(100, 170, 300, 30);
        panel.add(labelConvert);
        panel.add(comboMonedas);
        
        
        btnFrom.addActionListener(e-> {
        	comboMonedas.setModel(new DefaultComboBoxModel<>(monedas));
        });
        
        btnTo.addActionListener( e-> {
        	comboMonedas.setModel(new DefaultComboBoxModel<>(monedasReversa));
        });
            
        
        labelEnter = new JLabel("Ingresa la cifra que deseas convertir:");
        labelEnter.setBounds(150, 210, 1000, 30);
        panel.add(labelEnter);
        
        valorIngresado = new JTextField("");
        valorIngresado.setBounds(150, 250, 200, 30);
        panel.add(valorIngresado);
        
        
        btnConverter = new JButton("Convertir");
        btnConverter.setBounds(175, 350, 150, 30);
        btnConverter.setBackground(new java.awt.Color(3, 130, 0));
        btnConverter.setForeground(Color.white);
        btnConverter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.add(btnConverter);
   
      	btnConverter.addActionListener(new ConverterLogic(valorIngresado, comboMonedas));
       
              
	 }
  
}
	

