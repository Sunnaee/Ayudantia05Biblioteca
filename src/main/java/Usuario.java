import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String identificacion;
	private ArrayList<Multa> multas = new ArrayList<Multa>();
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Usuario(String nombre, String identificacion, ArrayList<Prestamo> prestamos, ArrayList<Multa> multas) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.prestamos = prestamos;
		this.multas = multas;
	}

	public boolean hacerPrestamo(int isbn, String nombreBiblioteca) {
		throw new UnsupportedOperationException();
	}

	public Prestamo buscarPrestamo(int isbn, String nombreBiblioteca) {
		throw new UnsupportedOperationException();
	}

	public boolean comprobarMulta(int isbn, String nombreBiblioteca) {
		throw new UnsupportedOperationException();
	}

	public Multa generarMulta(Prestamo prestamo) {
		throw new UnsupportedOperationException();
	}

	public Multa pagarMulta(int monto, int isbn, String nombreBiblioteca) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarMulta(Multa multa) {
		throw new UnsupportedOperationException();
	}
}