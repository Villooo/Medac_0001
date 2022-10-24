package p18;

import java.util.Scanner;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//DECLARACIÓN DE VARIABLES
		
	Scanner Entrada = new Scanner(System.in);
	int NumeroFinal;
	int Contador =0;
	System.out.println("Hola, ingresa el numero: ");
	NumeroFinal = Entrada.nextInt();
	int Pares;
	
	System.out.println("Los numeros de 1 en uno hasta el "+NumeroFinal+" son:");
	for(int Simple=0;Simple<=NumeroFinal;Simple++) {
		System.out.print(Simple+" ");	
	}
	System.out.println("\n\nLos numeros divisibles entre 2(pares) son: ");
	for( Pares=0;Pares<=NumeroFinal;Pares+=2) {
		System.out.print(Pares+" ");	
	}
	
	
	
	
	
	
	}

}
