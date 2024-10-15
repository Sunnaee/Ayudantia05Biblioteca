import java.util.ArrayList;

public class Libro {
	private String titulo;
	private String autor;
	private int isbn;
	private int anioPublicacion;
	private ArrayList<Biblioteca> biblioteca = new ArrayList<Biblioteca>();
	private Categoria categoria;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return this.isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getAnioPublicacion() {
		return this.anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public Libro(String titulo, String autor, int isbn, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anioPublicacion = anioPublicacion;
	}
}