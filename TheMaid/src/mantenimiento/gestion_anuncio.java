package mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Interface.anuncioInterface;
import Util.MySQLConexion;
import modelo.*;

public class gestion_anuncio implements anuncioInterface  {
	
	
	

	public int registrar_zona_mult(modelo_zonas ma) {
		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call 	usp_registrar_zona(?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, ma.getId_usuario());
			pst.setInt (2, ma.getTipo());
			pst.setString(3, ma.getZona());
			
			rs = pst.executeUpdate();
			
			System.out.println("logramos ejecutar");
			
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
	
	
	
	
	
	

	

	public int registrar_habilidad_mult(modelo_habilidades ma) {
		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call 	usp_registrar_habilidad(?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, ma.getId_usuario());
			pst.setInt (2, ma.getTipo());
			pst.setString(3, ma.getHabilidades());
			
			rs = pst.executeUpdate();
			
			System.out.println("logramos ejecutar");
			
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
	
	
	
	
	
	

	
	
	
	
	

	

	public int registrar_especialidad_mult(modelo_especialidades ma) {
		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call 	usp_registrar_especialidad(?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, ma.getId_usuario());
			pst.setInt (2, ma.getTipo());
			pst.setString(3, ma.getEspecialidades());
			
			rs = pst.executeUpdate();
			
			System.out.println("logramos ejecutar");
			
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
	
	

	
	
	
	

	
	
	
	

	public int registrar_video(modelo_video ma) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_agregar_video(?,?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, ma.getId_usuario());
			pst.setString(2, ma.getVideo());
			pst.setInt(3, ma.getTipo());
			pst.setInt(4, ma.getPosicion());
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
	
	
	
	


	


	public int registrar_foto(modelo_foto ma) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_agregar_foto(?,?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1,ma.getId_usuario());
			pst.setString(2, ma.getFoto());
			pst.setInt(3, ma.getTipo());
			pst.setInt(4, ma.getPosicion());
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
	
	
	
	
	

	
	

	/*

	@Override
	public int registrar_auncio(modelo_anuncio ma) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_registrar_anuncio_completo(?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, ma.getCodigo_usuario());
			pst.setInt(2, ma.getCodigo_estado());
			pst.setInt(3, ma.getNumero());
			pst.setInt(4, ma.getEdad());
			pst.setInt(5, ma.getCodigo_departamento());
			pst.setInt(6, ma.getCodigo_provincia());
			pst.setInt(7, ma.getCodigo_distrito());
			pst.setString(10, ma.getIndependiente());
			pst.setInt(11, ma.getCodigo_foto());
			pst.setInt(12, ma.getCodigo_video());
			pst.setString(13, ma.getNombre_chica().toString().trim());
			pst.setString(14, ma.getUbicacion_referencia().toString().trim());
			pst.setString(15, ma.getTitulo_anuncio().toString().trim());
			pst.setString(16, ma.getDescripcion_anuncio().toString().trim());
			pst.setString(17, ma.getTallas().toString().trim());
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

	public int registrar_auncio_03(modelo_anuncio ma) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_registrar_anuncio_04(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, ma.getCodigo_usuario());
			pst.setInt(2, ma.getCodigo_estado());
			pst.setInt(3, ma.getNumero());
			pst.setInt(4, ma.getEdad());
			pst.setInt(5, ma.getCodigo_departamento());
			pst.setInt(6, ma.getCodigo_provincia());
			pst.setInt(7, ma.getCodigo_distrito());
			
			if(ma.getIndependiente().equalsIgnoreCase("1")) {
			pst.setString(8, ma.getIndependiente());}else {pst.setString(8, "0");}
			
			pst.setString(9, ma.getNombre_chica().toString().trim());
			pst.setString(10, ma.getUbicacion_referencia().toString().trim());
			pst.setString(11, ma.getTitulo_anuncio().toString().trim());
			pst.setString(12, ma.getDescripcion_anuncio().toString().trim());
			pst.setString(13, ma.getNacionalidad().toString().trim());
			pst.setString(14, ma.getTallas().toString().trim());
			pst.setString(15, ma.getMedidas().toString().trim());
			pst.setString(16, ma.getSexo().toString().trim());
			rs = pst.executeUpdate();
			
			System.out.println("logramos ejecutar");
			
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
	
	public int registrar_auncio_02(modelo_anuncio ma) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_registrar_anuncio_02(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, ma.getCodigo_usuario());
			pst.setInt(2, ma.getCodigo_estado());
			pst.setInt(3, ma.getNumero());
			pst.setInt(4, ma.getEdad());
			pst.setInt(5, ma.getCodigo_departamento());
			pst.setInt(6, ma.getCodigo_provincia());
			pst.setInt(7, ma.getCodigo_distrito());
			
			if(ma.getIndependiente().equalsIgnoreCase("1")) {
			pst.setString(8, ma.getIndependiente());}else {pst.setString(8, "0");}
			
			pst.setString(9, ma.getNombre_chica().toString().trim());
			pst.setString(10, ma.getUbicacion_referencia().toString().trim());
			pst.setString(11, ma.getTitulo_anuncio().toString().trim());
			pst.setString(12, ma.getDescripcion_anuncio().toString().trim());
			pst.setString(13, ma.getNacionalidad().toString().trim());
			pst.setString(14, ma.getTallas().toString().trim());
			pst.setString(15, ma.getMedidas().toString().trim());
			rs = pst.executeUpdate();
			
			System.out.println("logramos ejecutar");
			
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
	
	public int registrar_tarifa(modelo_tarifa mt) {
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_registrar_tarifa(?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, mt.getCodigo_anuncio());
			pst.setInt(2, mt.getHora());
			pst.setInt(3, mt.getTarifa());
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
	
	
	public int registrar_servadi(modelo_servadi msv) {
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_registrar_Servadi_foto(?,?,?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, msv.getCodigo_anuncio());
			pst.setInt(2, msv.getTipo());
			pst.setString(3, msv.getNombre());
			pst.setInt(4, msv.getTarifa());
			pst.setString(5, msv.getDireccion());
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
	
	
	
	public int registrar_horario(modelo_horario mh) {
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_registrar_Horario(?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, mh.getCodigo_anuncio());
			pst.setString(2, mh.getDia());
			pst.setInt(3, mh.getTurno());
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
	
	
	public modelo_anuncio obtener_anuncio(String numero) {
		modelo_anuncio u = null;
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_Obtener_anuncio_portelefono(?)";

			pst = c.prepareStatement(sql);
			pst.setString(1, numero);
			rs = pst.executeQuery();
			while (rs.next()) {
				u = new modelo_anuncio();
				u.setCodigo_anuncio(rs.getInt(1));
				u.setCodigo_usuario(rs.getInt(2));
				u.setCodigo_estado(rs.getInt(3));
				u.setNumero(rs.getInt(4));
				u.setEdad(rs.getInt(5));
				u.setCodigo_departamento(rs.getInt(6));
				u.setCodigo_provincia(rs.getInt(7));
				u.setCodigo_distrito(rs.getInt(8));
				u.setIndependiente(rs.getString(9));
				u.setNombre_chica(rs.getString(10));
				u.setUbicacion_referencia(rs.getString(11));
				u.setTitulo_anuncio(rs.getString(12));
				u.setDescripcion_anuncio(rs.getString(13));
				u.setCreacion(rs.getString(14));
				u.setNacionalidad(rs.getString(15));
				u.setTallas(rs.getString(16));
				u.setMedidas(rs.getString(17));
				
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
	
	public int obtener_Codanuncio(int numero) {
		int rsult=0;
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_Obtener_Codanuncio_portelefono(?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, numero);
			rs = pst.executeQuery();
			while (rs.next()) {
			rsult =rs.getInt(1);
				
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
		return rsult;
		
		
	}


	public int registrar_foto(modelo_foto ma) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_registrar_foto(?,?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, ma.getId_anuncio());
			pst.setString(2, ma.getUbicacion());
			pst.setInt(3, ma.getPosicion());
			pst.setString(4, ma.getNombre_imagen());
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



	public int registrar_video(modelo_video ma) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_registrar_video(?,?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, ma.getId_anuncio());
			pst.setString(2, ma.getNombre());
			pst.setString(3, ma.getUbicacion());
			pst.setInt(4, ma.getPosicion());
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
	
	public int registrar_nacionalidad(int cod_anuncio, String nacionalidad) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call 	usp_registrar_nacionalidad(?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, cod_anuncio);
			pst.setString(2, nacionalidad);
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



	public String obtener_fotoprincipal(int cod_anuncio) {
		String rsult="";
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_Obtener_fotoPrincipal(?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, cod_anuncio);
			rs = pst.executeQuery();
			while (rs.next()) {
			rsult =rs.getString(1);				
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
		return rsult;
		
		
	}

	
	public String obtener_video_principal(int cod_anuncio) {
		String rsult="";
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_Obtener_videoPrincipal(?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, cod_anuncio);
			rs = pst.executeQuery();
			while (rs.next()) {
			rsult =rs.getString(1);				
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
		return rsult;
		
		
	}
	
	public String obtener_distrito(int cod_anuncio) {
		String rsult="";
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call busca_distrito(?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, cod_anuncio);
			rs = pst.executeQuery();
			while (rs.next()) {
			rsult =rs.getString(1);				
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
		return rsult;
	}
	public String obtener_departamento(int cod_anuncio) {
		String rsult="";
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call 	busca_departamento(?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, cod_anuncio);
			rs = pst.executeQuery();
			while (rs.next()) {
			rsult =rs.getString(1);				
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
		return rsult;
	}public String obtener_provincia(int cod_anuncio) {
		String rsult="";
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call busca_provincia(?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, cod_anuncio);
			rs = pst.executeQuery();
			while (rs.next()) {
			rsult =rs.getString(1);				
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
		return rsult;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public ArrayList<modelo_foto> listadodeFotos(int codigo_anuncio) {
		
		ArrayList<modelo_foto> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
		con = MySQLConexion.getConexion();
		String sql = "call usp_obetener_fotos_porcod(?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, codigo_anuncio);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_foto a = new modelo_foto();
			a.setId_foto(rs.getInt(1));
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


	
	
	
	
	@Override
	public ArrayList<modelo_servadi> listadoservadi(int codigo_anuncio) {
		
		ArrayList<modelo_servadi> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
		con = MySQLConexion.getConexion();
		String sql = "call usp_Obtener_servadi_list(?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, codigo_anuncio);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_servadi a = new modelo_servadi();
			a.setCodigo_servadi(rs.getInt(1));
			a.setCodigo_anuncio(rs.getInt(2));	
			a.setTipo(rs.getInt(3));
			a.setNombre(rs.getString(4));
			a.setTarifa(rs.getInt(5));
			a.setDireccion(rs.getString(6));
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
	public ArrayList<modelo_video> listadodeVideos(int codigo_anuncio) {
		
		ArrayList<modelo_video> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
		con = MySQLConexion.getConexion();
		String sql = "call usp_obetener_videos_porcod2(?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, codigo_anuncio);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_video a = new modelo_video();
			a.setId_video(rs.getInt(1));
			a.setNombre(rs.getString(3));
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

	public ArrayList<modelo_horario> listadoHDia(int codigo_anuncio) {
		
		ArrayList<modelo_horario> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
		con = MySQLConexion.getConexion();
		String sql = "call usp_Obtener_HDia(?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, codigo_anuncio);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_horario a = new modelo_horario();
			a.setDia(rs.getString(1));	
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


	public ArrayList<modelo_horario> listadoHTurno(int codigo_anuncio , String dia) {
		
		ArrayList<modelo_horario> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
		con = MySQLConexion.getConexion();
		String sql = "call usp_Obtener_HTurno(?,?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, codigo_anuncio);
		pst.setString(2, dia);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_horario a = new modelo_horario();
			a.setCodigo_horario(rs.getInt(1));
			a.setCodigo_anuncio(rs.getInt(2));
			a.setDia(rs.getString(3));	
			a.setTurno(rs.getInt(4));
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
	
	
	

	public ArrayList<modelo_tarifa> listadoTarifa(int codigo_anuncio) {
		
		ArrayList<modelo_tarifa> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
		con = MySQLConexion.getConexion();
		String sql = "call usp_Obtener_Tarifa(?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, codigo_anuncio);
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_tarifa a = new modelo_tarifa();
			a.setCodigo_tarifa(rs.getInt(1));	
			a.setCodigo_anuncio(rs.getInt(2));	
			a.setHora(rs.getInt(3));	
			a.setTarifa(rs.getInt(4));	
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
	public int registrar_auncio_01(modelo_anuncio ma) {
		// TODO Auto-generated method stub
		return 0;
	}


	public ArrayList<modelo_anuncio> listadotelefonos() {
		
		ArrayList<modelo_anuncio> lista = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
		con = MySQLConexion.getConexion();
		String sql = "call usp_listar_numero_anuncio(1)";
		rs = pst.executeQuery();
		
		lista = new ArrayList<>();
		while(rs.next()) {
			modelo_anuncio a = new modelo_anuncio();
			a.setNumero(rs.getInt(1));	
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

	public String Validar_totelefono(String tefe) {
		String rsult="";
		Connection c = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_busar_numero_validar(?)";

			pst = c.prepareStatement(sql);
			pst.setString(1, tefe);
			rs = pst.executeQuery();
			while (rs.next()) {
			rsult =rs.getString(1);				
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
		return rsult;
		
		
	}
	
	
public modelo_valoracion listar_valoracion(int codigo_anuncio) {
		
		modelo_valoracion lista11 = null;
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
		con = MySQLConexion.getConexion();
		String sql = "call listar_valoracion(?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, codigo_anuncio);
		rs = pst.executeQuery();
		
		while(rs.next()) {
			 lista11 = new modelo_valoracion();
			lista11.setId_valoracion(rs.getInt(1));	
			lista11.setId_anuncio(rs.getInt(2));	
			lista11.setPuntos(rs.getInt(3));	
			lista11.setVistas(rs.getInt(4));	
			lista11.setFecha_actualizacion(rs.getString(5));	
			lista11.setOtro2(rs.getString(6));	
			lista11.setOtro3(rs.getString(7));	
			lista11.setObservacion(rs.getString(8));	
			lista11.setEstado(rs.getString(9));
			lista11.setFecha_creacion(rs.getString(10));
			lista11.setOtro(rs.getString(11));
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
		return lista11 ;
	}

	public int actualizarvaloracion(int valoracion ,int fecha_actual,int cod_anun) {
		int rs = 0;
		// TODO Auto-generated method stub
		Connection c = null;
		PreparedStatement pst= null; //solo se pone si hay consulta
		// OBSERVACION - HAY 3 ATRIBUTOS EL PRIMERO ES EL ID-SESSION DE LA CUENTA 'codigo'
		try {
			c = MySQLConexion.getConexion();
			String sql = "call actualizar_valoracion(?,?,?)";
			pst = c.prepareStatement(sql);
			pst.setInt(1, valoracion);
			pst.setInt(2, fecha_actual);
			pst.setInt(3, cod_anun);
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

	public int registrarvaloracion(int cod_anun) {
		int rs = 0;
		// TODO Auto-generated method stub
		Connection c = null;
		PreparedStatement pst= null; //solo se pone si hay consulta
		// OBSERVACION - HAY 3 ATRIBUTOS EL PRIMERO ES EL ID-SESSION DE LA CUENTA 'codigo'
		try {
			c = MySQLConexion.getConexion();
			String sql = "call Registrar_valoracion(?)";
			pst = c.prepareStatement(sql);
			pst.setInt(1, cod_anun);
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


	public int actualizarvaloracion(int valoracion,String fechaVal, int cod_anun) {
		int rs = 0;
		// TODO Auto-generated method stub
		Connection c = null;
		PreparedStatement pst= null; //solo se pone si hay consulta
		// OBSERVACION - HAY 3 ATRIBUTOS EL PRIMERO ES EL ID-SESSION DE LA CUENTA 'codigo'
		try {
			c = MySQLConexion.getConexion();
			String sql = "call 	actualizar_valoracion(?,?,?)";
			pst = c.prepareStatement(sql);
			pst.setInt(1, valoracion);
			pst.setString(2, fechaVal);
			pst.setInt(3, cod_anun);
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
	public int registrar_bancaria(modelo_bancaria mb) {

		int rs = 0;
		Connection c = null;
		PreparedStatement pst= null;
		//Estado 2 es ya realizado - Estado 1 significa pendiente
		//Estado 3 CUENTA ELIMINADA (OCULTA)
		//AQUI SE REGISTRAN DOS TABLES TB-USUARIO TB-PERSONA
		try {
			c = MySQLConexion.getConexion();
			String sql = "call usp_registrar_bancaria(?,?,?,?)";

			pst = c.prepareStatement(sql);
			pst.setInt(1, mb.getId_anuncio());
			pst.setString(2, mb.getBanco());
			pst.setString(3, mb.getCuenta_bancaria());
			pst.setString(4, mb.getCuenta_interbancaria());
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
	
	
	*/
	
	
	
	
	
}
