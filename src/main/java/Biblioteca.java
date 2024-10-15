import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Biblioteca(String nombre, String direccion, ArrayList<Libro> libros, ArrayList<Empleado> empleados) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = libros;
		this.empleados = empleados;
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

	public boolean empleadoUnico(String identificacion) {
		throw new UnsupportedOperationException();
	}

	public Empleado buscarEmpleado(String identificacion) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarEmpleado(Empleado empleado) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarEmpleado(String identificacion) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarEmpleado(String identificacion) {
		throw new UnsupportedOperationException();
	}
}