package p17;

import javax.swing.JOptionPane;

public class P17 {



	public static void main(String[] args) {
				// TODO Auto-generated method stub

		
		

				
			int NumeroAAdivinar = (int) (Math.random()*100), Contador = 0, tries;
			tries =  Integer.parseInt(JOptionPane.showInputDialog("Bienvenido!!! \n"
					+ "Vamos a jugar a un juego, vas a intentar adivinar un numeros aleatorio entre el 0 al 100 \n"
					+ "y vas a tener que competir con tus amigos, quien menos intentos tenga, gana \n "
					+ "Introduce tu primer numero")); 
			
				while (NumeroAAdivinar != tries) {
					Contador++;
					if (NumeroAAdivinar<tries) {JOptionPane.showMessageDialog(null, "El numero que buscas es menor");}
					else if (NumeroAAdivinar>tries) {JOptionPane.showMessageDialog(null, "El numero que buscas es mayor");}
					if (tries>100||tries<0) {JOptionPane.showMessageDialog(null, "El numero introducido no esta entre el 0 y el 100, vuelve a intentarlo");}	
				
				tries =  Integer.parseInt(JOptionPane.showInputDialog("Venga, introduce un nuevo otra vez"));		}

				JOptionPane.showMessageDialog(null, "ENORABUENA \n"
					+ "El numero correcto es "+NumeroAAdivinar+" y lo has acertado, enorabuena crack lo has hecho en "+Contador+" intentos");
				
				
				
				

		
		
		
		
		
		
		
		
	}

}
