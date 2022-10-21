package p15;

import java.text.ParseException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class P15 {

	public static <equals> void main(String[] args) {
		// TODO Auto-generated method stub

	
	int repeticiones=0;
	int NumeroIntroducido=0;
	int NumeroIntroducidoEnINT=0;

		
		repeticiones = Integer.parseInt(JOptionPane.showInputDialog("Cua ntos numeros quiere introducir?"));
		try {
		for( int i=0 ;i<repeticiones; i++) {
			
				
					NumeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero y te dire si es possitivo o negativo si quiere finalizar el programa escriba finalizar o pulse el .\n Escriba números entre el -1000 y el 1000")); 
					
					NumeroIntroducidoEnINT = NumeroIntroducido;
					
					if (NumeroIntroducidoEnINT>0&&NumeroIntroducidoEnINT<1000) {
						JOptionPane.showMessageDialog(null,  ("El numero introducido es positivo"));
					}
					
					else if (NumeroIntroducidoEnINT<0&&NumeroIntroducidoEnINT>-1000) {
						JOptionPane.showMessageDialog(null,  ("El numero introducido es negativo"));
					}
					
					
					
				
				}
		}
			 catch (Exception e) {

					JOptionPane.showMessageDialog(null,  ("Programa finalizado"));
		}
		
	}

}

















[1][2][15][1]
[1][2][15][1]		