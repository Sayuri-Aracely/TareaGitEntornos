package TareaGitEntornos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este es el archivo3
		
		   Biblioteca biblioteca = new Biblioteca();

	        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien");
	        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
	        Libro libro3 = new Libro("La Odisea", "Homero");
	     
	        biblioteca.agregarLibro(libro1);
	        biblioteca.agregarLibro(libro2);
	        biblioteca.agregarLibro(libro3);
	    
	        System.out.println("Lista de Libros en la Biblioteca:");
	        for (Libro libro : biblioteca.obtenerLibros()) {
	            System.out.println(libro); 
	        }
	  }
}
