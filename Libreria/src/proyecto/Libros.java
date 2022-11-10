package proyecto;

public class Libros {
	
	
	public String idLibro;
	public String precio;
	public String autorLibro;
	public String generoLibro;
	
	
	public Libros() {}
	
	public Libros(String idLibro,String precio,String autorLibro,String generoLibro) {
		this.idLibro = idLibro;
		this.precio = precio;
		this.autorLibro = autorLibro;
		this.generoLibro = generoLibro;
	
	}
	
	public void ImprimirDatosLibro(){
		System.out.println("\n"+"el id del libro es:... "+idLibro+"\n"+
				"El precio del libro es:... "+precio+"\n"+
				"el autor del libro es:... "+"\n"+autorLibro+
				"el Genero del libro es:..."+generoLibro);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
