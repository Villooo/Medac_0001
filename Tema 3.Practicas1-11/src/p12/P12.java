package p12;


import javax.swing.JOptionPane;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 
		   
		String Numero = JOptionPane.showInputDialog("Dime un numeo de hasta 5 cifras");
		
		int length = Numero.length();
		if (length>5) {
			JOptionPane.showMessageDialog(null, "Este programa solo admite numeros de hasta 5 cifras");
		}
		else {
			int numero = Integer.parseInt(Numero);
		
			if (numero < 0) {
				JOptionPane.showMessageDialog(null,"El numero tiene "+(length -1)+" digitos");
			}else {
		JOptionPane.showMessageDialog(null, "El numero tiene "+length+" digitos");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

