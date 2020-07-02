package modelo;

public class modelo_observaciones {

	int id_observaciones ,  id_usuario, tipo;
	String observaciones, ultima_actualizacion ;
	public int getId_observaciones() {
		return id_observaciones;
	}
	public void setId_observaciones(int id_observaciones) {
		this.id_observaciones = id_observaciones;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getUltima_actualizacion() {
		return ultima_actualizacion;
	}
	public void setUltima_actualizacion(String ultima_actualizacion) {
		this.ultima_actualizacion = ultima_actualizacion;
	}
	
	
	
}
