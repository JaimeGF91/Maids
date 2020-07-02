package mantenimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Interface.usuarioInterface;
import Util.MySQLConexion;
import modelo.*;
public class gestion_usuario implements usuarioInterface {

	@Override
	public modelo_maid validarUsuario(String usuario, String clave) {
		// TODO Auto-generated method stub
		modelo_maid u = null ;
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null; //solo se pone si hay consulta
		// OBSERVACION - HAY 3 ATRIBUTOS EL PRIMERO ES EL ID-SESSION DE LA CUENTA 'codigo'
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_validarUsuario(?,?)"; //EN EXISTENCIA
			pst = c.prepareStatement(sql);
			pst.setString(1, usuario);
			pst.setString(2, clave);
			rs = pst.executeQuery();
			while (rs.next()) {
				u = new modelo_maid();
				u.setId(rs.getInt(1));
				u.setCorreo(rs.getString(2));
				u.setContraseña(rs.getString(3));
				u.setNombre(rs.getString(4));		
				u.setDescripcion(rs.getString(5));	
				u.setVerificacion(rs.getInt(6));		
				u.setUrl(rs.getString(7));		
				u.setHonorarios(rs.getInt(8));	
				u.setEdad(rs.getInt(9));	
				u.setEstado(rs.getInt(10));	
				u.setPuntaje(rs.getInt(11));		
				u.setCreacion(rs.getString(12));	
				u.setUltima_actualizacion(rs.getString(13));	
				u.setAlias(rs.getString(14));		
			}			
			
		} catch (Exception e) {
			System.out.println("Error en la validacion:" + e.getMessage());
			
		} finally {
			try {
				c.close();
				pst.close();
				rs.close();
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("Error al cerrar" + ex.getMessage());
			}
		}
		return u ;
		
	}

	@Override
	public int registrarUsuario(String usu, String pass) {
		// TODO Auto-generated method stub

		int rs = 0;
		// TODO Auto-generated method stub
		Connection c = null;
		PreparedStatement pst= null; //solo se pone si hay consulta
		// OBSERVACION - HAY 3 ATRIBUTOS EL PRIMERO ES EL ID-SESSION DE LA CUENTA 'codigo'
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_Registrar_Usuario(?,?)";
			pst = c.prepareStatement(sql);
			pst.setString(1, usu);
			pst.setString(2,pass);
			rs = pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error en la validacion:" + e.getMessage());
			
		} finally {
			try {
				c.close();
				pst.close();
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("Error al cerrar" + ex.getMessage());
			}
		}
		return rs;
	}

	@Override
	public int registrarUsuarioCompleto(String usu, String pass, String nombre, String descripcion, int honorarios, int edad, int estado, String aliass) {
		// TODO Auto-generated method stub

		int rs = 0;
		// TODO Auto-generated method stub
		Connection c = null;
		PreparedStatement pst= null; //solo se pone si hay consulta
		// OBSERVACION - HAY 3 ATRIBUTOS EL PRIMERO ES EL ID-SESSION DE LA CUENTA 'codigo'
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_Registrar_UsuarioCompleto(?,?,?,?,?,?,?,?)";
			pst = c.prepareStatement(sql);
			pst.setString(1, usu);
			pst.setString(2,pass);
			pst.setString(3,nombre);
			pst.setString(4,descripcion);
			pst.setInt(5,honorarios);
			pst.setInt(6,edad);
			pst.setInt(7,estado);
			pst.setString(8,aliass);
			rs = pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error en la validacion:" + e.getMessage());
			
		} finally {
			try {
				c.close();
				pst.close();
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("Error al cerrar" + ex.getMessage());
			}
		}
		return rs;
	}

	
	
	
	
	
	
	

	
	
	public ArrayList<modelo_foto> listadodezonas(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<modelo_foto> listadodehabiliaddes(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<modelo_foto> listadodeespecialidades(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<modelo_foto> listadodeFotos(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<modelo_video> listadodeVideos(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public modelo_maid validarUsuarioporcorreo(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public modelo_maid verificar_Usuario_Por_Url(String enlace2) {
		// TODO Auto-generated method stub
		return null;
	}

	public modelo_maid verificar_MAID_Por_Url(String enlace_nick1) {
		// TODO Auto-generated method stub
		return null;
	}

	public modelo_maid Obtener_anuncio_porID(int id_Annun) {

		modelo_maid u = null;
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "SELECT * FROM `tb_maid` WHERE id = (?) ";

			pst = c.prepareStatement(sql);
			pst.setInt(1, id_Annun);
			rs = pst.executeQuery();
			while (rs.next()) {
				u = new modelo_maid();
				u.setId(rs.getInt(1));
				u.setCorreo(rs.getString(2));
				u.setNombre(rs.getString(4));
				u.setDescripcion(rs.getString(5));
				u.setVerificacion(rs.getInt(6));
				u.setUrl(rs.getString(7));
				u.setHonorarios(rs.getInt(8));
				u.setEdad(rs.getInt(9));
				u.setEstado(rs.getInt(10));
				u.setPuntaje(rs.getInt(11));
				u.setCreacion(rs.getString(12));
				u.setUltima_actualizacion(rs.getString(13));
				u.setAlias(rs.getString(14));
				
			}	
			
		} catch (Exception e) {
			System.out.println("Error en registrar:" + e.getMessage());
			
		} finally {
			try {
				c.close();
				pst.close();
				rs.close();
			
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("Error al cerrar" + ex.getMessage());
			}
		}
		
		return u;
	}


	public modelo_foto Obtener_fotos_porID(int id_Annun) {

		modelo_foto u = null;
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "SELECT * FROM `tb_foto` WHERE `id_usuario` = (?) ";

			pst = c.prepareStatement(sql);
			pst.setInt(1, id_Annun);
			rs = pst.executeQuery();
			while (rs.next()) {
				u = new modelo_foto();
				u.setId_usuario(rs.getInt(2));
				u.setTipo(rs.getInt(3));
				u.setFoto(rs.getString(4));
				u.setPosicion(rs.getInt(5));
				
			}	
			
		} catch (Exception e) {
			System.out.println("Error en registrar:" + e.getMessage());
			
		} finally {
			try {
				c.close();
				pst.close();
				rs.close();
			
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("Error al cerrar" + ex.getMessage());
			}
		}
		
		return u;
	}
	
	public modelo_foto Obtener_foto_porID_unica(int id_Annun) {

		modelo_foto u = null;
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "SELECT * FROM `tb_foto` WHERE `id_usuario` = (?)  and `posicion` = 1";

			pst = c.prepareStatement(sql);
			pst.setInt(1, id_Annun);
			rs = pst.executeQuery();
			while (rs.next()) {
				u = new modelo_foto();
				u.setId_usuario(rs.getInt(2));
				u.setTipo(rs.getInt(3));
				u.setFoto(rs.getString(4));
				u.setPosicion(rs.getInt(5));
				
			}	
			
		} catch (Exception e) {
			System.out.println("Error en registrar:" + e.getMessage());
			
		} finally {
			try {
				c.close();
				pst.close();
				rs.close();
			
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("Error al cerrar" + ex.getMessage());
			}
		}
		
		return u;
	}

	
	

	
	
	
	
public ArrayList<modelo_maid>listado(){
		
		ArrayList<modelo_maid> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try { 
		con = MySQLConexion.getConexion();
		String sql = "SELECT * FROM `tb_maid`";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_maid u = new modelo_maid();
			u.setId(rs.getInt(1));
			u.setCorreo(rs.getString(2));
			u.setNombre(rs.getString(4));
			u.setDescripcion(rs.getString(5));
			u.setVerificacion(rs.getInt(6));
			u.setUrl(rs.getString(7));
			u.setHonorarios(rs.getInt(8));
			u.setEdad(rs.getInt(9));
			u.setEstado(rs.getInt(10));
			u.setPuntaje(rs.getInt(11));
			u.setCreacion(rs.getString(12));
			u.setUltima_actualizacion(rs.getString(13));
			u.setAlias(rs.getString(14));
			lista.add(u);
		}		}
			catch (Exception e) {
			// TODO: handle exception
				System.out.println("Error en el listado" + e.getMessage());
		}			
		 finally {
			 MySQLConexion.closeConexion(con);
			// TODO: handle finally clause
		}
		System.out.println("Exito del listado " );
		return lista ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public int registrar_usuariopendiente(modelo_maid u) {
				int rs = 0;
				Connection c = null;
				PreparedStatement pst= null;
				//Estado 2 es ya realizado - Estado 1 significa pendiente
				//Estado 3 CUENTA ELIMINADA (OCULTA)
				//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
				try {
					c = MySQLConexion.getConexion();
					String sql = "call usp_registrarUsupendiente(?,?)";

					pst = c.prepareStatement(sql);
					pst.setString(1, u.getCorreo());
					pst.setString(2, u.getUrl());
					rs = pst.executeUpdate();
					
					
				} catch (Exception e) {
					System.out.println("Error en registrar:" + e.getMessage());
					
				} finally {
					try {
						c.close();
						pst.close();
					
					} catch (Exception ex) {
						// TODO: handle exception
						System.out.println("Error al cerrar" + ex.getMessage());
					}
				}
				
				return rs;
	}
	
	@Override
	public int registrarUsuario(String usu, String pass) {
		int rs = 0;
		// TODO Auto-generated method stub
		Connection c = null;
		PreparedStatement pst= null; //solo se pone si hay consulta
		// OBSERVACION - HAY 3 ATRIBUTOS EL PRIMERO ES EL ID-SESSION DE LA CUENTA 'codigo'
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_Registrar_Usuario2(?,?)";
			pst = c.prepareStatement(sql);
			pst.setString(1, usu);
			pst.setString(2,pass);
			rs = pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error en la validacion:" + e.getMessage());
			
		} finally {
			try {
				c.close();
				pst.close();
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("Error al cerrar" + ex.getMessage());
			}
		}
		return rs;
		
	}

	
	


	
	
	
	@Override
	public modelo_maid validarUsuarioporcorreo(String usuario) {
		// TODO Auto-generated method stub
		modelo_maid u = null ;
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null; //solo se pone si hay consulta
		// OBSERVACION - HAY 3 ATRIBUTOS EL PRIMERO ES EL ID-SESSION DE LA CUENTA 'codigo'
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_validarUsuarioporcorreo(?)";
			pst = c.prepareStatement(sql);
			pst.setString(1, usuario);
			rs = pst.executeQuery();
			while (rs.next()) {
				u = new modelo_maid();
				u.setId(rs.getInt(1));
				u.setCorreo(rs.getString(2));
				u.setContraseña(rs.getString(3));
				u.setEstado(rs.getInt(4));		
				u.setUrl(rs.getString(5));		
			}			
			
		} catch (Exception e) {
			System.out.println("Error en la validacion:" + e.getMessage());
			
		} finally {
			try {
				c.close();
				pst.close();
				rs.close();
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("Error al cerrar" + ex.getMessage());
			}
		}
		return u ;
		
	}
	
	

	public modelo_maid validarUrlCuenta(String enlace2) {
		


		modelo_maid u = null;
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null; //solo se pone si hay consulta
		// OBSERVACION - HAY 3 ATRIBUTOS EL PRIMERO ES EL ID-SESSION DE LA CUENTA 'codigo'
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_Usuario_Por_Url(?)";
			pst = c.prepareStatement(sql);
			//parametros
			pst.setString(1, enlace2);
			rs = pst.executeQuery();
			while (rs.next()) {
				u = new modelo_maid();
				u.setId(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setContraseña(rs.getString(3));
				u.setEstado(rs.getInt(4));		
				u.setUrl(rs.getString(5));	
			}		
			
		} catch (Exception e) {
			System.out.println("Error en la validacion del url:" + e.getMessage());
			
			
		} finally {
			try {
				c.close();
				pst.close();
				rs.close();
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("Error al cerrar" + ex.getMessage());
			}
		}
		return u ;
		
	}
	
	@Override
	public ArrayList<modelo_maid>listadoanuncios(){
		
		ArrayList<modelo_maid> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try { 
		con = MySQLConexion.getConexion();
		String sql = "call usp_Obtener()";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_maid a = new modelo_maid();
			a.setCodigo_anuncio(rs.getInt(1));
			a.setCodigo_usuario(rs.getInt(2));	
			a.setCodigo_estado(rs.getInt(3));
			a.setNumero(rs.getInt(4));
			a.setEdad(rs.getInt(5));	
			a.setCodigo_departamento(rs.getInt(6));
			a.setCodigo_provincia(rs.getInt(7));
			a.setCodigo_distrito(rs.getInt(8));	
			a.setIndependiente(rs.getString(9));	
			a.setNombre_chica(rs.getString(10));	
			a.setUbicacion_referencia(rs.getString(11));	
			a.setTitulo_anuncio(rs.getString(12));	
			a.setDescripcion_anuncio(rs.getString(13));	
			a.setNacionalidad(rs.getString(15));	
			a.setTallas(rs.getString(16));	
			a.setMedidas(rs.getString(17));	
			lista.add(a);
		}		}
			catch (Exception e) {
			// TODO: handle exception
				System.out.println("Error en el listado" + e.getMessage());
		}			
		 finally {
			 MySQLConexion.closeConexion(con);
			// TODO: handle finally clause
		}
		System.out.println("Exito del listado " );
		return lista ;
		
	}
	
	
	@Override
	public ArrayList<modelo_maid> listado_habilidades(String habilidades_especialidades) {
		
		ArrayList<modelo_maid> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
		con = MySQLConexion.getConexion();
		String sql = "SELECT * FROM tb_anuncio INNER JOIN tb_serv_especial WHERE tb_anuncio.id_anuncio = tb_serv_especial.id_anuncio and tb_serv_especial.descripcion = (?)";
		pst.setString(1, habilidades_especialidades);
		rs = pst.executeQuery();
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_maid a = new modelo_maid();
			a.setCodigo_anuncio(rs.getInt(1));
			a.setCodigo_usuario(rs.getInt(2));	
			a.setCodigo_estado(rs.getInt(3));
			a.setNumero(rs.getInt(4));
			a.setEdad(rs.getInt(5));	
			a.setCodigo_departamento(rs.getInt(6));
			a.setCodigo_provincia(rs.getInt(7));
			a.setCodigo_distrito(rs.getInt(8));	
			a.setIndependiente(rs.getString(9));	
			a.setNombre_chica(rs.getString(10));	
			a.setUbicacion_referencia(rs.getString(11));	
			a.setTitulo_anuncio(rs.getString(12));	
			a.setDescripcion_anuncio(rs.getString(13));	
			a.setNacionalidad(rs.getString(15));	
			a.setTallas(rs.getString(16));	
			a.setMedidas(rs.getString(17));	
			lista.add(a);
		}		}
			catch (Exception e) {
			// TODO: handle exception
				System.out.println("Error en el listado" + e.getMessage());
		}			
		 finally {
			 MySQLConexion.closeConexion(con);
			// TODO: handle finally clause
		}
		System.out.println("Exito del listado " );
		return lista ;
		
	}
	
	
	
	@Override
	public ArrayList<modelo_maid> listado_x(String servadi) {
		

		
		ArrayList<modelo_maid> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try { 
		con = MySQLConexion.getConexion();
		String sql = "call usp_Obtener_x('?')";		
		//parametros
		pst.setString(1, servadi);
		rs = pst.executeQuery();
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_maid a = new modelo_maid();
			a.setCodigo_anuncio(rs.getInt(1));
			a.setCodigo_usuario(rs.getInt(2));	
			a.setCodigo_estado(rs.getInt(3));
			a.setNumero(rs.getInt(4));
			a.setEdad(rs.getInt(5));	
			a.setCodigo_departamento(rs.getInt(6));
			a.setCodigo_provincia(rs.getInt(7));
			a.setCodigo_distrito(rs.getInt(8));	
			a.setIndependiente(rs.getString(9));	
			a.setNombre_chica(rs.getString(10));	
			a.setUbicacion_referencia(rs.getString(11));	
			a.setTitulo_anuncio(rs.getString(12));	
			a.setDescripcion_anuncio(rs.getString(13));	
			a.setNacionalidad(rs.getString(15));	
			a.setTallas(rs.getString(16));	
			a.setMedidas(rs.getString(17));	
			lista.add(a);
		}		}			
			catch (Exception e) {
			// TODO: handle exception
				System.out.println("Error en el listado" + e.getMessage());
		}			
		 finally {
			 MySQLConexion.closeConexion(con);
			// TODO: handle finally clause
		}
		System.out.println("Exito del listado " );
		return lista ;
		
		
	}
	
	
	
public ArrayList<modelo_foto> listado_foto(int codUsuario) {
		
		ArrayList<modelo_foto> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try { 
		con = MySQLConexion.getConexion();
		String sql = "select * from tb_foto ORDER BY id_foto ASC where id_anuncio =(?)";		
		//parametros
		pst.setInt(1, codUsuario);
		rs = pst.executeQuery();
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_foto a = new modelo_foto();
			a.setId_foto(rs.getInt(1));
			a.setId_anuncio(rs.getInt(2));	
			a.setUbicacion(rs.getString(3));
			a.setPosicion(rs.getInt(4));
			a.setNombre_imagen(rs.getString(5));
			lista.add(a);
		}		}			
			catch (Exception e) {
			// TODO: handle exception
				System.out.println("Error en el listado" + e.getMessage());
		}			
		 finally {
			 MySQLConexion.closeConexion(con);
			// TODO: handle finally clause
		}
		System.out.println("Exito del listado " );
		return lista ;
		
	}
	


public ArrayList<modelo_video> listado_video(int codUsuario) {
		
		ArrayList<modelo_video> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try { 
		con = MySQLConexion.getConexion();
		String sql = "select * from tb_video ORDER BY id_video ASC where id_anuncio =(?)";		
		//parametros
		pst.setInt(1, codUsuario);
		rs = pst.executeQuery();
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_video a = new modelo_video();
			a.setId_video(rs.getInt(1));
			a.setId_anuncio(rs.getInt(2));
			a.setNombre(rs.getNString(3));	
			a.setUbicacion(rs.getString(4));
			a.setPosicion(rs.getInt(5));
			lista.add(a);
		}		}			
			catch (Exception e) {
			// TODO: handle exception
				System.out.println("Error en el listado" + e.getMessage());
		}			
		 finally {
			 MySQLConexion.closeConexion(con);
			// TODO: handle finally clause
		}
		System.out.println("Exito del listado " );
		return lista ;
		
	}
	
	public modelo_usuario validarAliasCuenta(String substring) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public modelo_usuario recuperar_DatosPorCorreo(modelo_usuario u) {
		// TODO Auto-generated method stub
		return null;
	}

public ArrayList<modelo_anuncio> listado() {
		
		ArrayList<modelo_anuncio> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try { 
		con = MySQLConexion.getConexion();
		String sql = "SELECT * FROM `tb_anuncio` ORDER BY fecha_creacion DESC";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_anuncio a = new modelo_anuncio();
			a.setCodigo_anuncio(rs.getInt(1));
			a.setCodigo_usuario(rs.getInt(2));	
			a.setCodigo_estado(rs.getInt(3));
			a.setNumero(rs.getInt(4));
			a.setEdad(rs.getInt(5));	
			a.setCodigo_departamento(rs.getInt(6));
			a.setCodigo_provincia(rs.getInt(7));
			a.setCodigo_distrito(rs.getInt(8));	
			a.setIndependiente(rs.getString(9));	
			a.setNombre_chica(rs.getString(10));	
			a.setUbicacion_referencia(rs.getString(11));	
			a.setTitulo_anuncio(rs.getString(12));	
			a.setDescripcion_anuncio(rs.getString(13));	
			a.setCreacion(rs.getString(14));	
			a.setNacionalidad(rs.getString(15));	
			a.setTallas(rs.getString(16));	
			a.setMedidas(rs.getString(17).toString().trim());	
			a.setSexo(rs.getString(18).toString().trim());	
			lista.add(a);
		}		}
			catch (Exception e) {
			// TODO: handle exception
				System.out.println("Error en el listado" + e.getMessage());
		}			
		 finally {
			 MySQLConexion.closeConexion(con);
			// TODO: handle finally clause
		}
		System.out.println("Exito del listado " );
		return lista ;
		
	}

	
	*/
	
	
	
	
	
}
