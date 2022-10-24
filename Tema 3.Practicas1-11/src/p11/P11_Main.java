package p11;

import javax.swing.JOptionPane;

public class P11_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	//Declaramos las variables	
	
	String DiaDeLaSemana;
	String DiaDeLaSemana_minuscula;
	 
	//Creamos el JOptionPane para preguntar el dia de la semana
	DiaDeLaSemana = JOptionPane.showInputDialog("Introduce el dia de la semana  como texto, es decir : Lunes, Martes, Miercoles...., ");
	//Hacemos el toLowerCase para que el usuario pueda pueda introducir el dia en mayuscula o minuscula
	DiaDeLaSemana_minuscula=DiaDeLaSemana.toLowerCase(); 
	
	//creamos el switch con su condicion 
	switch (DiaDeLaSemana_minuscula) {
		case "lunes":
		JOptionPane.showMessageDialog(null, DiaDeLaSemana+" es el primer dia de la semana.");
		break;
		
		case "martes":
			JOptionPane.showMessageDialog(null, DiaDeLaSemana+" es el segundo dia de la semana.");
			break;
		
		case "miercoles":
			JOptionPane.showMessageDialog(null, DiaDeLaSemana+" es el tercer dia de la semana.");
			break;	
			
		case "jueves":
			JOptionPane.showMessageDialog(null, DiaDeLaSemana+" es el cuarto dia de la semana.");
			break;	
		
		case "viernes":
			JOptionPane.showMessageDialog(null, DiaDeLaSemana+" es el quinto dia de la semana.");
			break;
			
		case "sabado":
			JOptionPane.showMessageDialog(null, DiaDeLaSemana+" es el sexto dia de la semana.");
			break;	
			
		case "domingo":
			JOptionPane.showMessageDialog(null, DiaDeLaSemana+" es el septimo dia de la semana.");
			break;	
			
			
	}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Object toLowerCase(String string) {
		// TODO Auto-generated method stub
		return null;
	}


}
