package proyecto;

public class Ventas {

	private String idVenta;
	private String fechaDeVenta;
	private String libro;
	private String vendedor;
	
	
	public Ventas() {}
	
	public Ventas(String idVenta,String fechaDeVenta,String libro,String vendedor) {
		
		this.idVenta = idVenta;
		this.fechaDeVenta = fechaDeVenta;
		this.libro = libro;
		this.vendedor = vendedor;
	}
		
		public void ImprimirDatosVentas(){
			System.out.println("el ID de la venta es:..."+idVenta+"\n");
			System.out.println("LA fecha de la venta fue el:..."+fechaDeVenta+"\n");
			System.out.println("El libro es:..."+libro+"\n");
			System.out.println("El vendedor del libro es:..."+vendedor);
			
		}
		
	
	
	
	
	
	
	
	
	
	
}
