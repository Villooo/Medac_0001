package p5;

import javax.swing.JOptionPane;

public class P5_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables 
		String n1;
		int N1;
		
		//Pedimos cualquier numero
		n1 = JOptionPane.showInputDialog("Dime cualquier numero entero");
		N1 = Integer.parseInt(n1);
		
		//hacemos este claculo para saber el resto del numero que ha introducido el usuario
		int resto = N1%2;
		
		//hacemos el if con esta condicon ya que si el resto es igual a 0, el numero es par 
		if(resto==0) {
			JOptionPane.showMessageDialog(null, N1+" Es par.");
						}
		else {
			JOptionPane.showMessageDialog(null, N1+" Es impar.");

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
