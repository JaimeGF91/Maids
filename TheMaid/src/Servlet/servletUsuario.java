package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import mantenimiento.*;
import modelo.*;
/**
 * Servlet implementation class gestion_usuario
 */
@WebServlet("/Cuenta")
public class servletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	gestion_usuario gu=new gestion_usuario();
	gestion_anuncio gu2=new gestion_anuncio();
    protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    
		String opcion = request.getParameter("opcion"); 
		
		
	
		switch (opcion) {
		
		case "Ingresar":
				ingresar_usuario_servlet(request, response);
				break;

		case "Registrate":
				registrar_usuario_servlet(request, response);
				break;
		
		case "Registrar_completo":
				registrar_completar_usuario_servlet(request, response);
				break;
		
		case "cerrar_sesion":
				cerrar_sesion_servlet(request, response);
				break;
				
		case "actualizar_sesion":
				actualizar_sesion_servlet(request, response);
				break;
				
		case "seleccionar_VER_maid":
				verMaid_sesion_servlet(request, response);
				break;
				
		case "Cancelar_actualizar_sesion":
			Cancelar_actualizar_sesion_servlet(request, response);
			break;
		}
		
		
		
		
	    
    }


	
	
	private void verMaid_sesion_servlet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession sesion=request.getSession();
		


		String id_Annun = request.getParameter("input_usuario");
		 modelo_maid okanuncio  = gu.Obtener_anuncio_porID(Integer.parseInt(id_Annun));
		  sesion.setAttribute("okanunok", okanuncio);
		
	    response.sendRedirect("/maid");
		
	}




	private void Cancelar_actualizar_sesion_servlet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

		HttpSession sesion=request.getSession();
		sesion.setAttribute("completar_perfil", "");
			sesion.setAttribute("mensaje", "se cancelo su actualizacion");
		    response.sendRedirect("/Perfil");
	}




	private void actualizar_sesion_servlet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession sesion=request.getSession();
		sesion.setAttribute("completar_perfil", "vista_completarperfil");
			sesion.setAttribute("mensaje", "se completo su actualizacion");
		    response.sendRedirect("/Perfil");
	}




	private void cerrar_sesion_servlet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession sesion=request.getSession();
		  sesion.setAttribute("usuMactivo", "");
		  sesion.setAttribute("email", "");
		  sesion.setAttribute("pass", "");
		  sesion.setAttribute("u", "");
		    response.sendRedirect("inicio");
	}

	private void ingresar_usuario_servlet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		HttpSession sesion=request.getSession();
		String usuario, contrasena, mensaje,url;	
		usuario = request.getParameter("input_usuario");
		contrasena = request.getParameter("input_contrasena");
		modelo_maid u= gu.validarUsuario(usuario, contrasena);
		

		if (u!=null) {
			  mensaje = "ingreso correctamente";
			  sesion.setAttribute("u", u);
			  sesion.setAttribute("email", usuario);
			  sesion.setAttribute("pass", contrasena);
			  sesion.setAttribute("usuMactivo", "MaidActive");
			  

				if(u.getEstado()==9) {
			sesion.setAttribute("completar_perfil", "vista_completarperfil");
				}else {
					sesion.setAttribute("completar_perfil", "");}
			  
			  url = "/Perfil";
		} 
			
			else {  // si es incorrecto, realiza una salida en el navegador

				
				sesion.setAttribute("usuMactivo", null);
				sesion.removeAttribute("u");
				sesion.removeAttribute("email");
				sesion.removeAttribute("pass");
				  sesion.setAttribute("usuMactivo", "");
				mensaje = "Puede ser que su correo no este registrado o su contraseña este incorrecta";
				url = "/Login";				
				} 

		
			sesion.setAttribute("mensaje", mensaje);
		    response.sendRedirect(url);
		
		
	}
    
	private void registrar_usuario_servlet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

		HttpSession sesion=request.getSession();
		String usuario, contrasena, mensaje,url;int validfunc;

		usuario = request.getParameter("input_usuario");
		contrasena = request.getParameter("input_contrasena");
		validfunc = gu.registrarUsuario(usuario, contrasena);

		if (validfunc!=0) {

		sesion.setAttribute("evento_necesario_cancelarMOD", "cancelarMOD");	
		mensaje = "Su cuenta se creo correctamente";
		sesion.setAttribute("usuMactivo", "MaidActive");
		modelo_maid u= gu.validarUsuario(usuario, contrasena);	
		sesion.setAttribute("u", u);
		
				if(u.getEstado()==9) {
					sesion.setAttribute("completar_perfil", "vista_completarperfil");
				}else {
					sesion.setAttribute("completar_perfil", "");}
		
				
				
				
				
				
				
				
				
				
				
				
				
				


				
				
				mensaje = "Registro completado - ahora eres parte de la familia The-Maid ";
				
				// Recipient's email ID needs to be mentioned.
				// String to = u.getUsuario(); (usar esto)
			      String to = usuario;
			 
			      // Sender's email ID needs to be mentioned
			      String from = "noresponder@ThaMaid-app.com";
			 
			      // Assuming you are sending email from localhost
			      String host = "localhost";
			 
			      // Get system properties
			      Properties properties = System.getProperties();
			 
			      // Setup mail server
			      properties.setProperty("mail.smtp.host", host);
			 
			      // Get the default Session object.
			      Session session = Session.getDefaultInstance(properties, null);
			      
			      // Set response content type
			      response.setContentType("text/html");
			      PrintWriter out = response.getWriter();

			      try {
			         // Create a default MimeMessage object.
			         MimeMessage message = new MimeMessage(session);
			         
			         // Set From: header field of the header.
			         message.setFrom(new InternetAddress(from,"The Maid APP"));
			         
			         // Set To: header field of the header.
			         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			         
			         // Set Subject: header field
			         message.setSubject("¡Bienvenida a The Maid APP!","UTF-8");
			         
			         // Now set the actual message
			         message.setContent("\r\n" + 
			         		"<!DOCTYPE html>\r\n" + 
			         		"<html lang=\"ES\" >\r\n" + 
			         		"<head>\r\n" + 
			         		"    <meta charset=\"UTF-8\">\r\n" + 
			         		"\r\n" + 
			         		"</head>\r\n" + 
			         		"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\" integrity=\"sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu\" crossorigin=\"anonymous\">\r\n" + 
			         		"\r\n" + 
			         		"<!-- Optional theme -->\r\n" + 
			         		"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css\" integrity=\"sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ\" crossorigin=\"anonymous\">\r\n" + 
			         		"\r\n" + 
			         		"    \r\n" + 
			         		"    \r\n" + 
			         		"<body style=\"background-image: url('https://images.freeimages.com/images/large-previews/4e1/free-technical-background-design-1635196.jpg');no-repeat center center fixed; \r\n" + 
			         		"  -webkit-background-size: cover;\r\n" + 
			         		"  -moz-background-size: cover;\r\n" + 
			         		"  -o-background-size: cover;\r\n" + 
			         		"  background-size: cover;\">\r\n" + 
			         		"    <!-- partial:index.partial.html -->\r\n" + 
			         		"    <div style=\"text-align:center;\" class=\"wrapper\">\r\n" + 
			         		"        <div class=\"rec-prism\">\r\n" + 
			         		"\r\n" + 
			         		"            <div class=\"face face-front\">\r\n" + 
			         		"                <div class=\"content\">\r\n" + 
			         		"                    <h2>¡Bienvenid@ </h2>\r\n" + 
			         		"                   \r\n" + 
			         		"                        <div class=\"field-wrapper\">\r\n" + 
			         		"\r\n" + 
			         		"                            <label>para completar tu registro. <br>\r\n" + 
			         		"                                dale click en <br><br></label>\r\n" + 
			         		"                            <br>\r\n" + 
			         		"                        </div>\r\n" + 
			         		"                        <div class=\"field-wrapper\">\r\n" + 
			         		"                            <p>Esta es tu cuenta</p>\r\n" + usuario + 
			         		"                        \r\n" + 
			         		"                        <p>Esta es tu contraseña</p>\r\n" + contrasena  + 
			         		"                        </div>\r\n" + 
			         		"                  \r\n" + 
			         		"                </div>\r\n" + 
			         		"            </div>\r\n" + 
			         		"\r\n" + 
			         		"            <div class=\"face face-right\">\r\n" + 
			         		"                <div class=\"content\">\r\n" + 
			         		"                    <h2> ¿Quienes somos? </h2>\r\n" + 
			         		"                   \r\n" + 
			         		"                        <div class=\"field-wrapper\">\r\n" + 
			         		"                            <label>Somos la primera pagina de publicidad para trabajadoras del hogar del Peru<br>\r\n" + 
			         		"                            </label> \r\n" + 
			         		"                        <br>\r\n" + 
			         		"                        <span >Gracias por unirse </span>\r\n" + 
			         		"                   \r\n" + 
			         		"                </div>\r\n" + 
			         		"                        </div>\r\n" + 
			         		"\r\n" + 
			         		"            <div class=\"face face-bottom\">\r\n" + 
			         		"                <div class=\"content\">\r\n" + 
			         		"                    <div class=\"thank-you-msg\">\r\n" + 
			         		"                        Thank you!\r\n" + 
			         		"                    </div>\r\n" + 
			         		"                </div>\r\n" + 
			         		"            </div>\r\n" + 
			         		"        </div>\r\n" + 
			         		"    </div>\r\n" + 
			         		"    </div>\r\n" + 
			         		"</body>\r\n" + 
			         		"    \r\n" + 
			         		"</html>\r\n" + 
			         		""
			         		+ "", "text/html; charset=UTF-8" );
			         
			         // Send message
			         Transport.send(message);
			       
			      } catch (MessagingException mex) {
			         mex.printStackTrace();
			         
			         mensaje = "Error de Correo Reflasheado";
			      }
				
		    
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		  url = "/Perfil";	
		  
		  
		  
		}else {
			mensaje = "Puede ser que su correo ya este registrado o este en uso";
			sesion.setAttribute("usuMactivo", "");
			url = "/Login";	
		}

		sesion.setAttribute("mensaje", mensaje);	
	    response.sendRedirect(url);
		
	}

	private void registrar_completar_usuario_servlet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// TODO Auto-generated method stub
		HttpSession sesion=request.getSession();
		String usuario, contrasena,nombre_completo,descripcion, mensaje="",url="",alias;int validfunc,honorarios,edad,estado;

		modelo_maid u = (modelo_maid)sesion.getAttribute("u"); 		
		usuario = u.getCorreo();
		contrasena = u.getContraseña();	
		nombre_completo = request.getParameter("input_nom_complete");	
		descripcion = request.getParameter("input_desc_complete");		
		alias = request.getParameter("input_nompila_complete");	
		honorarios =Integer.parseInt(request.getParameter("input_honor_complete")) ;
		edad =Integer.parseInt(request.getParameter("input_edad_complete")) ;	
		estado =Integer.parseInt(request.getParameter("input_est_complete")) ;		
		
		validfunc = gu.registrarUsuarioCompleto(usuario, contrasena, nombre_completo, descripcion, honorarios, edad,estado,alias);

		
		
		if (validfunc!=0) {
			mensaje = "Felicidades su cuenta esta completa";
			sesion.setAttribute("usuMactivo", "MaidActive");
			   u=  gu.validarUsuario(usuario, contrasena);
			  sesion.setAttribute("u", u);

				if(u.getEstado()==9) {
			sesion.setAttribute("completar_perfil", "vista_completarperfil");
				}else {
			  sesion.setAttribute("completar_perfil", "");
									  }
			  url = "/Perfil";	
			  
			}else {
				mensaje = "ud. ya modifico sus datos como principiante. necesitara ir a modificar perfil";
				url = "/Perfil";	
			}		
						 

		sesion.setAttribute("mensaje", mensaje);	
	    response.sendRedirect(url);
    
	
			}
    
    
    
    
    
}
