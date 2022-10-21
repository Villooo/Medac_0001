package p14;


import java.time.LocalDate;
import javax.swing.JOptionPane;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARACIÇON DE VARIABLES

		String Fechaintroducido= "0000-00-00";
		LocalDate fecha = null;

		try {
			// Pedimos la fecha
			Fechaintroducido = JOptionPane.showInputDialog("Digite la fecha con el siguiente formato: año/mes/dia");

			// igualamos la fecha introducida(era una string) a la variable date
			fecha = LocalDate.parse(Fechaintroducido);
			// Sumamos un dia
			fecha = fecha.plusDays(1);
			// Sumamos un mes
			fecha = fecha.plusMonths(1);
			// Sumamos un año
			fecha = fecha.plusYears(1);
			// Lo imprimimos
			System.out.println(fecha);

		} catch (Exception e) {
			System.out.println("Lo que has introducido es una fecha inválida "+e);
		}

		

	}

}
