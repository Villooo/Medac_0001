package proyecto;

public class Autor {
	
	private String idAutor;
	private String nombreAutor;
	
	
	
	
	public Autor() {}
	
	public Autor(String idAutor, String nombreAutor){
		this.idAutor = idAutor;
		this.nombreAutor = nombreAutor;
		
	}
	
	public void ImprimirDatosAutor() {
		System.out.println("\n"+"El ID del autor es:... "+idAutor+"\n"+
		"El nombre del autor es:..."+nombreAutor);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
