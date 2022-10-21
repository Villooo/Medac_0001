package operadores;

import java.util.Scanner;

public class Video1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner Horas = new Scanner(System.in);
		float horas,salario,total;
		System.out.println("Digite cuanta horas semanales traba usted.");
	
		Scanner Salario = new Scanner(System.in);
		System.out.println("Digite cuanto cobra usted por hora.");

		salario=Salario.nextFloat();
		horas=Horas.nextFloat();

		total = salario*horas;
		System.out.println(total);
		
		
		
	}

}
