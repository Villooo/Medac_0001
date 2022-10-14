package p8;

import java.util.Scanner;

public class P8_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca número de días: ");
        int dias = sc.nextInt();
     
         //si el mes es correcto
            switch(dias){  //se muestra el nombre mediante una instrucción switch                                  
                case 28: System.out.print("Febrero");
                        break;
                case 30: System.out.print("Abil,junio, septiembre y noviembre.");
                        break;
                case 31: System.out.print("Enero, marzo, mayo, julio, agosto, octubre y diciembre.");
                        break;
            }
            // mostrar si es un mes de 30, 31 0 28 días
            if(dias == 31)   
               System.out.println("son meses de 31 días");
            else if(dias == 2)
                     System.out.println("son meses de 30 días");
                   else
                      System.out.println(" es un mes de 28 días");
        
    }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}


