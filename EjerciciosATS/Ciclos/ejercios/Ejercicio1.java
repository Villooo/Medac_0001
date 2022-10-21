package ejercios;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Ejercicio 1: Leer un número y mostrar su cuadrado, repetir elproceso hasta que se introduzcaun número negativo.

	int NumeroIntroducido, resultado;
	NumeroIntroducido =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero y le calculare su cuadrado hasta que este sea negativo"));
	resultado = (int)Math.pow(NumeroIntroducido, 2);
	JOptionPane.showMessageDialog(null, "El cuadrado de "+NumeroIntroducido+" es: "+resultado);
	
	while(NumeroIntroducido>=0) {
		
		NumeroIntroducido =Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
		resultado = (int)Math.pow(NumeroIntroducido, 2);
		JOptionPane.showMessageDialog(null, "El cuadrado de "+NumeroIntroducido+" es: "+resultado);		
	}
	
	
	
	
	
	
	
	
	}

}
