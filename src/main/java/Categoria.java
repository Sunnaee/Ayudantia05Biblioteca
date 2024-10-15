import java.util.ArrayList;

public class Categoria {
	private String nombre;
	private String descripcion;
	private ArrayList<Libro> libros = new ArrayList<Libro>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria(String nombre, String descripcion, ArrayList<Libro> libros) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.libros = libros;
	}

	public boolean libroUnico(int isbn) {
		throw new UnsupportedOperationException();
	}

	public Libro buscarLibro(int isbn) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarLibro(Libro libro) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarLibro(int isbn) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarLibro(int isbn) {
		throw new UnsupportedOperationException();
	}
}