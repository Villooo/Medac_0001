package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo horden introducido	
		
		Scanner input = new Scanner(System.in);
		
		int[] Numeros = new int[5];
		
		System.out.println("Introduce los 5 numeros que quieras: ");
		
		for (int i = 0;i<5;i++) {
			System.out.println("Digite el numero: ");
			Numeros[i]=input.nextInt();
		}
		

		for(int i:Numeros) {
			System.out.println(i);
		}
		
		
		
		
		
		
	
		
	}

}
