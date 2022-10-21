package ejercios;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numero;
	double calculo;
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero y le dire si es par o impar, cuando ponga 0, la secuencia parará"));	
	calculo = numero%2;
	
	while(numero!=0) {
		if (calculo==0) {JOptionPane.showMessageDialog(null, "el numero es par");}
		else {JOptionPane.showMessageDialog(null, "el numero es impar");}
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero, cuando ponga 0, la secuencia parará"));	

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
