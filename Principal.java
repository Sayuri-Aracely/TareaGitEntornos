package TareaGitEntornos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este es el archivo3
		
		   Biblioteca biblioteca = new Biblioteca();

	        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien");
	        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
	        Libro libro3 = new Libro("La Odisea", "Homero");
	        Libro libro4 = new Libro ("El Quijote","Miguel de Cervantes Saavedra");
	        Libro libro5 = new Libro("Hamlet","William Shakespeare");
	     
	        biblioteca.agregarLibro(libro1);
	        biblioteca.agregarLibro(libro2);
	        biblioteca.agregarLibro(libro3);
	        biblioteca.agregarLibro(libro4);
	        biblioteca.agregarLibro(libro5);
	    
	        System.out.println("Lista de Libros en la Biblioteca:");
	        for (Libro libro : biblioteca.obtenerLibros()) {
	            System.out.println(libro); 
	            System.out.println("Prueba1");
	        }
	        System.out.println("Otra Prueba2");
	        System.out.println("Otra Prueba3");
	        System.out.println("Otra Prueba4");
	  }
	       
}
