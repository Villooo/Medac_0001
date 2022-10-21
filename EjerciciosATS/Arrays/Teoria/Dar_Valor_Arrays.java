package Teoria;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Dar_Valor_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
//		Para dar valor a las arrays se puede hacer de la siguiente manera:
		
			Scanner entrada = new Scanner(System.in); //Creamos un Scanner con nombre entrada
			
			//Creamos una variable int para almacenar el numero de elementos del array
			int nElementos;
			
			//Preguntamos al usuario cuantos elemenos quiere que haya dentro de ese elemnto
			nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del array"));
			
			//Creamos el array, con el numero de elementos que el usuario ha elegido
			char[] letras = new char[nElementos];
			
			
			//Ahora le pedimos los elemntos del array
			
			System.out.println("digite los elemntos del array");
		//Usamos un bucle for, dentro de el creamos una variable de tipo entera igualandola a 0
			for(int a=0;a<nElementos;a++) {  //En la condición le ponemos que sea menor al numero de elemntos, y luego en la suma ponemos i++
				System.out.println((a+1)+" Digite el caracter"); //En las intrucciones, le pedimos al usuario que digite todos los datos de uno en uno para que se guarden en el array pero hay que contabilizarlo, por eso ponemos a+1, para que el usuario sepa en que puesto del array esta guardando los datos                 
				letras[a] = entrada.next().charAt(0); //Despues igualamos el array con el int creado en el for a el input del usuario, poniendo despues: .next().charAt(0); , El charAt(0), es para que guarde el primer caracter que encuentre
					}
			
		//Ahora mostramos los caracteres 
			
			System.out.println("\n Los caracteres del array son: ");
		
		//Usamos un for de nuevo, y dentro de los parentesis va lo mismo que el for usado para dar valor al objeto
			for (int a=0;a<nElementos;a++) {
				System.out.println(letras[a]+" "); //hacemos un syso del objeto
			}
			
	
												
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
