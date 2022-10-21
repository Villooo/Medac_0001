package ciclo_for;

import java.util.Scanner;

public class Ciclos_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/* 
 
 		CICLOS FOR	
		
		
		for(inicialización ; condición ; auomento o decremento) {
			intrucciones;
		}
	
	*/	
		
		
//Ejemplo 1
		
		/*Aqui lo que hacemos es crear el for con su iniciador que en este caso en una int con su valor,
		 le ponemos una condicion "a<=5"(Mientras a sea igual o menor a 5) y luego su aumento que en esete caso es de 1 en uno*/
		for(int a=1; a<=5; a++) {
			System.out.println(a);
		}
		
//Ejemplo 1.1
	
		/*Aqui lo que hacemos es crear el for con su iniciador que en este caso en una int con su valor,
		 le ponemos una condicion "b>=10"(Mientras b sea igual o mayor a 1) y luego su decremento que en esete caso es de 1 en uno*/
		for(int b=10; b>=1;b-- ) {
			System.out.println(b);
		}
		
//Ejemplo 2
	
		/*Aqui lo que hacemos es pedir por consola al usuario hasta cuantos numeros quiere que aprazca y luego hcemos el for con su 
		 * condicion y un aumento de 2 en 2  */
		Scanner entrada = new Scanner(System.in);
		int contador;
		
		System.out.println("Digite la cantidad de terminos: ");
		contador= entrada.nextInt();
		
		for (int i=2; i<contador ; i+=2) {
			     System. out.println (i);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
