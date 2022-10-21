package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuación realizar 
	   la media de los numeros positivos, la media de los numeros 
	   negativos y contar el numero de ceros */
		
		Scanner input = new Scanner(System.in);
	
		float array[] = new float[5];
		
		float suma_pos=0 ,suma_neg=0 ,media_pos,media_neg;
		int conteo_pos=0,conteo_neg=0,conteo_ceros=0;
		
		
		System.out.println("Digite 5 numeros");
		
		for(int i=0;i<5;i++) {
			array[i]=input.nextFloat();
			
			if(array[i] == 0) {
				conteo_ceros++;
			}
			
			else if(array[i]>0) {
				suma_pos += array[i];
				conteo_pos++;
			}
			else if(array[i]<0) {
				suma_neg-=array[i];
				conteo_neg++;
			}
		
			//Medias de los numeros
			
			if(conteo_pos==0) {
				System.out.println("No se puede sacar la media de los numeros positivos, ya que no hay numeros positivos");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
}
