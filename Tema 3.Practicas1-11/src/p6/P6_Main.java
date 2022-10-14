package p6;

import javax.swing.JOptionPane;

public class P6_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las strings
		String n1;
		int N1;
		
		//Pedimos cualquier numero entero
		n1 = JOptionPane.showInputDialog("Dime cualquier numero entero");
		N1 = Integer.parseInt(n1);
		
		//Hacemos el switch para mostrar que nota es la del numero introducido
		switch (N1) {
		case 1: case 2: case 3: case 4:
			JOptionPane.showMessageDialog(null,"Esta nota es insuficiente");
			break;
		case 5:
			JOptionPane.showMessageDialog(null,"Esta nota es suficiente");
			break;
		case 6: case 7:
			JOptionPane.showMessageDialog(null,"Esta nota esta bien ");
			break;
		case 8:
			JOptionPane.showMessageDialog(null,"Esta nota es un notable ");
			break;
		case 9: case 10:
			JOptionPane.showMessageDialog(null,"Esta nota es un sobresaliente");
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
