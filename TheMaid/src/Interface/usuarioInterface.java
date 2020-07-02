package Interface;

import modelo.modelo_maid;

public interface usuarioInterface {
	
	modelo_maid validarUsuarioporcorreo(String usuario);

	int registrarUsuario(String usu, String pass);

	modelo_maid validarUsuario(String usuario, String clave);

	int registrarUsuarioCompleto(String usu, String pass, String nombre, String descripcion, int honorarios, int edad,
			int estado, String aliass);


}
