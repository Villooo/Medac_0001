package Teoria;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teoria1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Un array (arreglo) en Java es una estructura de datos
		 que nos permite almacenar un conjunto de datos de un
		 mismo tipo. El tamaño de los arrays se declara en un
		 primer momento y no puede cambiar luego durante la
		 ejecución del programa.*/

	
		
		
		int[] edad = new int[4];
		long[] edad2 = new long[4];
		float[ ] estatura = new float[3];
		double[ ] estatura2 = new double[3];
		boolean[ ] estado = new boolean[5];
		char[ ] sexo = new char[2];
		String[ ] nombre = new String[2];

		
		/*Hay varias maneras de dar valor a las arrays, individualmente y grupalmente:
		
		INDIVIDUALMENTE:      */     
			
		int[] numeros = new int[3];
		numeros[0]=5;
		numeros[1]=7;
		numeros[2]=9;
		
		//A la hora de guardar valores en las arrays, el primer valor se guarda en puesto numero 0, el segundo valor, se guarda en el puesto numero1 y asi continiamente
		
		//GRUPALMENTE:
		
		int[] numeros2= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,25,86,16,17,18,19,20,21,22,23,24,25,26};
		
		//De esta manera no hace falta mas que escribir todo esto
		
		//Para imprimir todos los datos de un array, hay que utilizar bucles
		
		
	/* Creamos un bucle for, dentro de este, creamos una variable igualandola a 0, en la condicion, tenemos que poner
	   que la nueva variable creada dentro del for, sea menor al  ultimo numero que haya en el array
	   pero al ultimo, no al valor mas grande que tenga, luego dentro de las intrucciones del for, hacemos un println
	   del array y dentro de los corchetes de esta, ponemos la variable creada dentro del for */
		
		for(int i=0;i<26;i++) {
			System.out.println(numeros2[i]);
		}
		
		
		 
	
		
		
		
		
		
		
		
	}

}
