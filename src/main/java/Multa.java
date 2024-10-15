public class Multa {
	private int monto;
	private String fechaGeneracion;
	private boolean estado;
	private Prestamo prestamo;

	public int getMonto() {
		return this.monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getFechaGeneracion() {
		return this.fechaGeneracion;
	}

	public void setFechaGeneracion(String fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Multa(int monto, String fechaGeneracion, boolean estado, Prestamo prestamo) {
		this.monto = monto;
		this.fechaGeneracion = fechaGeneracion;
		this.estado = estado;
		this.prestamo = prestamo;
	}
}