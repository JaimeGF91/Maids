package Interface;

import modelo.modelo_especialidades;
import modelo.modelo_foto;
import modelo.modelo_habilidades;
import modelo.modelo_video;
import modelo.modelo_zonas;

public interface anuncioInterface {
	
	
	
	public int registrar_zona_mult(modelo_zonas ma);
	

	public int registrar_habilidad_mult(modelo_habilidades ma);	

	public int registrar_especialidad_mult(modelo_especialidades ma);

	public int registrar_video(modelo_video ma);
	
	public int registrar_foto(modelo_foto ma);
	

}
