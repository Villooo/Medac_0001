package p10;

import java.util.Scanner;

public class P10_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declaramos las varibles
		int num,cuadrado;
		
		//declaramos el scanner 
		Scanner teclado = new Scanner( System.in );
		
		//pedimos un numero para calcular el cuadrado
		 System.out.print("Introduzca número: ");
		 num=teclado.nextInt();
		
		 //hacemos el while con su condicion para calcular el cuadrado de un numero hasta que este cuadrado de 0
			 while(num>=0){ 
			 cuadrado=num*num;
			 
			 System.out.println(num+ "² es igual a "+ cuadrado);
			 System.out.print("Introduzca otro número: ");
			 
			 num=teclado.nextInt();
			 } 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
