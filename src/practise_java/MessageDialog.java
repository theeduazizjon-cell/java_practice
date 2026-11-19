package practise_java;
import javax.swing.JOptionPane;
import javax.swing.*;

public class MessageDialog {
	public static void main(String[] args) 
	{	
		// showMessageDialog() 
		//has 2 arguments: 
		// - as you can see is null. For the position of the box 
		// - second argument is the message how and what should be 
		// printed
		
		// JOptionPane.showMessageDialog(null,"This is GUI Dialogue Box");
		
		//JOptionPane.showMessageDialog(null, "Try again", "Error", JOptionPane.ERROR_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "Do you want to continue?", "Warning", JOptionPane.WARNING_MESSAGE);
	
		//JOptionPane.showMessageDialog(null, "Plain dialog", "Information", JOptionPane.PLAIN_MESSAGE);
		
		
		// Confirm Dialog Box 
		
		//JOptionPane.showConfirmDialog(null, "Do you want to close?");
		
		
		// Input Dialog Box 
		// The purpose is to read the user entered value and store it in
		// a variable. 
		// for this we use showInputDialog()
		
		//String str = JOptionPane.showInputDialog("Enter the Item name"); 
		
		//int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of item"));
		//System.out.println("You have ordered " + number + " amount");
	
		Double.parseDouble(JOptionPane.showInputDialog("Enter the RATE"));
		
	}
}
