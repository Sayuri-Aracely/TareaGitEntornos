package TareaGitEntornos;

public class Libro {
	//Este es el archivo2
	
	 private String titulo;
	    private String autor;

	    public Libro(String titulo, String autor) {
	        this.titulo = titulo;
	        this.autor = autor;
	    }
	    
	    public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

	    public String getTitulo() {
			return titulo;
		}

		public String getAutor() {
			return autor;
		}

		@Override
	    public String toString() {
	        return "Título: " + titulo + ", Autor: " + autor;
	    }
		public void mesaje() {
			System.out.println("Añadir contenido1");
			System.out.println("Añadir contenido2");
			System.out.println("Añadir contenido3");
		}
}
