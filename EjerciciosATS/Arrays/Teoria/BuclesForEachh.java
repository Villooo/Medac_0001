package Teoria;

public class BuclesForEachh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int	Contador=1;	
		
		
		String[] nombres = {"Víctor","Maria","Ana","Patricia","Sara","Dueso"};	
		
		for(int i=0;i<nombres.length;i++){
			System.out.println(nombres[i]);
		}
		
		for(String i:nombres) {
			System.out.println(Contador+" "+i);
			Contador++;
		}
		
		
		
		
		
		
		
		
		
	}

}
