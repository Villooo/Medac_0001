package p2;

import javax.swing.JOptionPane;

public class P2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables
		String N1,N2;
		
		N1 = JOptionPane.showInputDialog("Introduce un numero entero");	//Pedimos primer numero
		int n1 = Integer.parseInt(N1); //lo guardamos como int ya que con JOptionPane lo hemos guardado como String
		N2 = JOptionPane.showInputDialog("Introduce otro numero entero y te dire cual es mayor y cual es menor de los numeros que has introducido");		//Pedimos el segundo numero
		int n2 = Integer.parseInt(N2);//lo guardamos como int ya que con JOptionPane lo hemos guardado como String
	
	if(n1>n2) {
		JOptionPane.showMessageDialog(null,+n1+" es mayor que "+n2+".");	//Ponemos lo que pasara si la condición se cumple

	}
	else {
		JOptionPane.showMessageDialog(null,+n2+" es mayor que "+n1+".");	//Ponemos lo que pasara si la condición se cumple

	}
	
	
	
	
	
	
	}

}
