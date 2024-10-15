public class Prestamo {
	private String fechaPrestamo;
	private String fechaDevolucion;
	private Usuario usuario;
	private Biblioteca biblioteca;
	private Libro libro;

	public String getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Prestamo(String fechaPrestamo, String fechaDevolucion, Biblioteca biblioteca, Libro libro, Usuario usuario) {
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
		this.biblioteca = biblioteca;
		this.libro = libro;
		this.usuario = usuario;
	}
}