package TareaGitEntornos;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
	//Este es el archivo1//
		
		  private List<Libro> listaLibros;

		    public Biblioteca() {
		        this.listaLibros = new ArrayList<>();
		    }

		    public void agregarLibro(Libro libro) {
		        listaLibros.add(libro);
		    }

		    public List<Libro> obtenerLibros() {
		        return listaLibros;
		    }
		    public void mesaje() {
		    	System.out.println("Otra Prueba1");
		    	System.out.println("Otra Prueba2");
		    	System.out.println("Otra Prueba3");
		    }
}
