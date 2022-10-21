package ejercios;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Ejercicio 2:Leer un número eindicar si es positivo o negativo. El proceso se repetirá hasta quese introduzca un 0.

		int numero;
		numero=	Integer.parseInt(JOptionPane.showInputDialog("Digite un numero y le dire si es posivo o negativo hasta que introduzca un 0 ")); 

		if (numero>0){JOptionPane.showMessageDialog(null, "El numero es positivo");}
		if (numero<0){JOptionPane.showMessageDialog(null, "El numero es negativo");}
	
		
		while (numero!=0) {
			
			numero=	Integer.parseInt(JOptionPane.showInputDialog("Digite un numero y le dire si es posivo o negativo hasta que introduzca un 0 ")); 

			if (numero>0){JOptionPane.showMessageDialog(null, "El numero es positivo");}
			if (numero<0){JOptionPane.showMessageDialog(null, "El numero es negativo");}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
					
		}
	
	}


