package p9;

import javax.swing.JOptionPane;

public class P9_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Declaramos las variables
		String n1;
		int N1;
		
		//declaro el JOptionPane para pedir el numero
		n1 = JOptionPane.showInputDialog("Dime cualquier numero entero entre el 0 y el 10");
		N1 = Integer.parseInt(n1);
		
		//Declaramos el switch con su condición 
		switch (N1) {
		case 0:
			JOptionPane.showMessageDialog(null,"CERO");
			break;
		case 1: 
			JOptionPane.showMessageDialog(null,"UNO");
			break;
		case 02:
			JOptionPane.showMessageDialog(null,"DOS");
			break;
		case 3: 
			JOptionPane.showMessageDialog(null,"TRES");
			break;
		case 4:
			JOptionPane.showMessageDialog(null,"CUATRO");
			break;
		case 5: 
			JOptionPane.showMessageDialog(null,"CINCO");
			break;
		case 6:
			JOptionPane.showMessageDialog(null,"SEIS");
			break;
		case 7: 
			JOptionPane.showMessageDialog(null,"SIETE");
			break;
		case 8:
			JOptionPane.showMessageDialog(null,"OCHO");
			break;
		case 9: 
			JOptionPane.showMessageDialog(null,"NUEVE");
			break;
		case 10:
			JOptionPane.showMessageDialog(null,"DIEZ");
			break;
		
		default: JOptionPane.showMessageDialog(null,"El numero introducido no esta entre el 0 y el 10."); 
}}}