package p4;

import javax.swing.JOptionPane;

public class P4_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables
		String N1;

		N1 = JOptionPane.showInputDialog("Introduce un numero entero");	//Pedimos primer numero
		int n1 = Integer.parseInt(N1); //lo guardamos como int ya que con JOptionPane lo hemos guardado como String
		
		
		if (n1 > 999 && n1 < 9999) {
			JOptionPane.showMessageDialog(null, n1+" tiene 4 cifras");
			}
		if (n1 > 99 && n1 < 999) {
			JOptionPane.showMessageDialog(null, n1+" tiene 3 cifras");
			}
		if (n1 > 9 && n1 < 99) {
			JOptionPane.showMessageDialog(null, n1+" tiene 2 cifras");
			}
		if (n1 > 0 && n1 < 9) {
			JOptionPane.showMessageDialog(null, n1+" tiene 1 cifra");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
