package p3;



import javax.swing.JOptionPane;

public class P3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las varibles
		String N1, N2, N3;
		
		N1 = JOptionPane.showInputDialog("Introduce un numero entero");	//Pedimos primer numero
		int n1 = Integer.parseInt(N1); //lo guardamos como int ya que con JOptionPane lo hemos guardado como String
		N2 = JOptionPane.showInputDialog("Introduce otro numero entero y te dire cual es mayor y cual es menor de los numeros que has introducido");		//Pedimos el segundo numero
		int n2 = Integer.parseInt(N2);//lo guardamos como int ya que con JOptionPane lo hemos guardado como String
		N3 = JOptionPane.showInputDialog("Introduce otro numero entero y te dire cual es mayor y cual es menor de los numeros que has introducido");		//Pedimos el segundo numero
		int n3 = Integer.parseInt(N3);//lo guardamos como int ya que con JOptionPane lo hemos guardado como String
	
		if (n1 > n2&& n1 > n3) {
			JOptionPane.showMessageDialog(null,+n1+" > "+n2+" > "+n3);
								}	
		if (n1 > n3&& n3 > n2) {
			JOptionPane.showMessageDialog(null,+n1+" > "+n3+" > "+n2);
								}	
		if (n2 > n1&& n1 > n3) {
			JOptionPane.showMessageDialog(null,+n2+" > "+n1+" > "+n3);
								}	
		if (n2 > n3&& n3 > n1) {
			JOptionPane.showMessageDialog(null,+n2+" > "+n3+" > "+n1);
								}	
		if (n3 > n2&& n2 > n1) {
			JOptionPane.showMessageDialog(null,+n3+" > "+n2+" > "+n1);
								}	
		if (n3 > n1&& n1 > n2) {
			JOptionPane.showMessageDialog(null,+n3+" > "+n1+" > "+n2);
								}	
		
		
		
		
		
		
		
		
		
}	
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner input = new Scanner(System.in);
		
		int[] numeros = new int [100000];
		int t;
		int i;
		int mayor = 0;
		System.out.println("Escriba un numero menor que 100000");
		t = input.nextInt();
		
		for (i = 1;i < t; i++) {
			numeros[i]=i;
		}
			while(t>0){
			if ((t%10)>mayor) {
			mayor=t%10;}
			int t2 = t/10; }
			System.out.println("El digito mayor es "+ mayor); 
			
	}
		
}	
		
		*/
		
		
	

		
		
/*		Scanner teclado = new Scanner(System.in);
		int[] digitos = new int[1000];
		int tecla; 
		int i; 
		int mayor=0;
		System.out.println("Escriba un numero menor que 1000");
		tecla= teclado.nextInt();


		for (i = 1; i < tecla ; i++) {
		digitos[i]=i; }

		while(tecla>0){
		if ((tecla%10)>mayor) {
		mayor=tecla%10;}
		int tecla2 = tecla/10; }
		System.out.println("El digito mayor es "+ mayor); }*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	String N1,N2,N3;
		
		N1 = JOptionPane.showInputDialog("Introduce un numero entero");	//Pedimos primer numero
		int n1 = Integer.parseInt(N1); //lo guardamos como int ya que con JOptionPane lo hemos guardado como String
		N2 = JOptionPane.showInputDialog("Introduce otro numero entero y te dire cual es mayor y cual es menor de los numeros que has introducido");		//Pedimos el segundo numero
		int n2 = Integer.parseInt(N2);//lo guardamos como int ya que con JOptionPane lo hemos guardado como String
		N3 = JOptionPane.showInputDialog("Introduce un numero entero");	//Pedimos primer numero
		int n3 = Integer.parseInt(N3); //lo guardamos como int ya que con JOptionPane lo hemos guardado como String
		
		if(n1>n2&&n2>n3) {
		JOptionPane.showMessageDialog(null,+n1+" es mayor que "+n2+" y "+n2+" es mayor que "+n3+",");	//Ponemos lo que pasara si la condición se cumple
				}
		
		if () {
		JOptionPane.showMessageDialog(null,+n2+" es mayor que "+n1+".");	//Ponemos lo que pasara si la condición se cumple
			}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

