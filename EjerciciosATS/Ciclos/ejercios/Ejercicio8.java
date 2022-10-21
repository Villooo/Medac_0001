package ejercios;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*pedir 10 numeros. Mostrar la media de los 10 numeros positivos,
		la media de los numeros negativos y la cantidad de ceros.*/
		
		
		int numero, suma_pos=0, contador_pos=0,suma_neg=0, contador_neg = 0, cantidad0=0;
		float media_pos, media_neg;
		
		for(int i=1;1<=10;i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
		
		
		if (numero==0) { //Si el numero es cero
			cantidad0++;//Aumentamos en 1 el conteo de ceros
		}
		else if(numero>0) {//Si el numero es positivo
			suma_pos+=numero;//Suma iterativa de positivos
			contador_pos++;
			}
		else {//Si el numero es negativo
			suma_neg+=numero;
			contador_neg++;
			}
		}
	
		
	
		//Tratamos con los positivos
	/*	if (contador_pos==0){
			System.out.println("No se puede sacar la media de los positivos.");
			}
	*/
	
	}

}

