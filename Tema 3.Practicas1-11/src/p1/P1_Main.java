package p1;

import javax.swing.JOptionPane;

public class P1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String N1,N2;
		int resto;
		
		
		N1 = JOptionPane.showInputDialog("Introduce un numero entero");	//Pedimos primer numero
		int n1 = Integer.parseInt(N1); //lo guardamos como int ya que con JOptionPane lo hemos guardado como String
		N2 = JOptionPane.showInputDialog("Introduce otro numero entero y te dire si es multiplo del anterior");		//Pedimos el segundo numero
		int n2 = Integer.parseInt(N2);//lo guardamos como int ya que con JOptionPane lo hemos guardado como String
		resto = n1%n2;
		

		if (resto==0) { //Creamos el if y establecemos su condición
			JOptionPane.showMessageDialog(null,"El numero "+n1+" es multiplo de "+n2);	//Ponemos lo que pasara si la condición se cumple
		}
		else { //creamos el else para que si la condición no se cumple, pase lo que digamos
			JOptionPane.showMessageDialog(null,"El numero "+n1+" no es multiplo de "+n2);	//establecemos lo qeu pasara si la condición no se cumple
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
