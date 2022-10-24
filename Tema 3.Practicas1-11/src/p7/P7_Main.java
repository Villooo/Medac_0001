package p7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class P7_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//declaramos todas las variables 
		String fecha;
		Scanner leer=new Scanner(System.in);
		boolean res=true;
	
	//Pedimos la fecha
	    System.out.println("Dame la fecha");
	    fecha=leer.next();
	 
	//Validamos la fecha
	    res=validarFecha(fecha);
	
	//Creamos el if y el else para mostrar si la fecha es valida o no  
	    if(res==true){
	    	System.out.println("La fecha es valida");
	    	}
	    else
	       System.out.println("La fecha no es valida");
	         }
	 
	
	public static boolean validarFecha(String fecha) {
	    //declaramos el try para ejecutar las sentencias
		try {
	         SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy"); //Es este el formato en el que tienes que introducir la fecha
	         formatoFecha.setLenient(false);
	         formatoFecha.parse(fecha);
	        } catch (ParseException e) {
	            return false;
	        }
	        return true;
	    }
	
	}


