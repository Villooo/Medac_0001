package p13;

import javax.swing.JOptionPane;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Declaramos las variables y objetos
		int comprar;
		Object[] opcionCompra = { "Si", " No "};
		int NumeroDeDecimos;
		int Administración;
		int PremioAdmin;
		int Probabilidad=0;
		int ComproAñoPasado;
		
		
		//Creamos el primer JOptionPane con un showOptionDialog para que solo pueda mostrar las opciones que queramos, en este caso son solo 2: Si o No
		comprar = JOptionPane.showOptionDialog(null,"Selector de opciones","Quiere comprar loteria?",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionCompra, null);
		//Creamos un switch para la primera opcción por si hemos comprado loteria o no
		switch (comprar) {
		//El caso 0 es por si el usuario si que ha comprado loteria
			case 0:
				//Preguntamos si ha comprado mas de un decimo
				 NumeroDeDecimos = JOptionPane.showOptionDialog(null,"Selector de opciones","¿Ha comprado mas de un decimo?",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionCompra, null);
				Probabilidad++;
				 //Creamos un switch por si el usuario ha comprado mas de un decimo	
				switch (NumeroDeDecimos) {
				case 0: 
					Probabilidad+=2;
					//Le preguntamos si ha comprado en mas de una administración
					Administración = JOptionPane.showOptionDialog(null,"Selector de opciones","¿Ha comprado en mas de una administración?",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionCompra, null);
					
					if (Administración==0) {
						Probabilidad+=2;
				}
					PremioAdmin = JOptionPane.showOptionDialog(null,"En alguna de esas administraciones a tocado algun premio","",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionCompra, null);
					
					if (PremioAdmin==0) {
						Probabilidad+=2;
					}
					
					ComproAñoPasado = JOptionPane.showOptionDialog(null,"Compro loteria el año pasado??","",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionCompra, null);
					if (ComproAñoPasado==0) {
						Probabilidad+=2;
					}
					else {
						Probabilidad++;
						System.out.println("Hola");
					}
					
					//break del caso 0 del switch de NumeroDeDécimos
					break;
				//el caso 1 es por si el usuario no ha comprado en mas de una administración	
				case 1:
					Administración = JOptionPane.showOptionDialog(null,"En esa adminisración ha tocado mas de un décimo?","",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionCompra, null);
					//Si si que compro, sumamos 1 a la probabilidad de ganar
					if (Administración==0) {
						Probabilidad++;
					}
					ComproAñoPasado = JOptionPane.showOptionDialog(null,"En esa adminisración ha tocado mas de un décimo?","",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionCompra, null);
					//Si si que compro loteria el año pasado, sumamos 1 a la probabilidad 
					if (ComproAñoPasado==0) {
						Probabilidad++;
					}
					//este break es porara el caso 1 del swich NumeroDedecimos	
					break;
					
				}
				
				System.out.println(Probabilidad);
				
			

			
			
			
			
			//Break para el case 0 del primer switch (Si hemos comprado o no la loteria)
			break;
			
		//El caso 1 es por si el usuario no ha comprado loteria
		case 1:
		
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}	
		
	