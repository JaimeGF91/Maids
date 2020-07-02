package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Util.MySQLConexion;
import mantenimiento.gestion_usuario;
import modelo.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * Servlet implementation class ServletAccesos
 */
@WebServlet("/Maid")
public class ServletAccesos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAccesos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		
		HttpSession sesion=request.getSession();
		
		
		
		
		String enlace=request.getRequestURL().toString();

		String enlace2=request.getRequestURL().toString();
	
		
		gestion_usuario ge = new gestion_usuario();

		modelo_maid user = ge.verificar_Usuario_Por_Url(enlace2);
		
		
		String enlace_nick=null;
		String enlace_nick1=null;
		String enlace_nick2=null;
		String enlace_nick3=null;
		String enlace_nick4=null;
		String enlace_nick5=null;
		String enlace_nick6=null;
		String enlace_nick7=null;
		String enlace_nick8=null;
		

		String enlace_nick17=null;
		String enlace_nick18=null;
		String enlace_nick19=null;
		String enlace_nick20=null;
		
		
try {
	 if(enlace2.substring(22).length() > 0 || enlace2.substring(22)!= null) {
		 enlace_nick1=enlace2.substring(22);
	}
} catch (Exception e) {
}				
try {
	 if(enlace2.substring(21).length() > 0 || enlace2.substring(21)!= null){
		  enlace_nick2=enlace2.substring(21);
			}
} catch (Exception e) {
}			
try {
	 if(enlace2.substring(20).length() > 0 || enlace2.substring(20)!= null){
		  enlace_nick3=enlace2.substring(20);
			}
} catch (Exception e) {
}			
try {
	 if(enlace2.substring(19).length() > 0 || enlace2.substring(19)!= null){
		  enlace_nick4=enlace2.substring(19);
			}	
} catch (Exception e) {
}			
try {
	 if(enlace2.substring(18).length() > 0 || enlace2.substring(18)!= null){
		  enlace_nick5=enlace2.substring(18);
			}
} catch (Exception e) {
}			
try {
	 if(enlace2.substring(17).length() > 0 || enlace2.substring(17)!= null){
		  enlace_nick6=enlace2.substring(17);
			}
} catch (Exception e) {
}			
try {
	 if(enlace2.substring(16).length() > 0 || enlace2.substring(16)!= null){
		  enlace_nick7=enlace2.substring(16);
			}
} catch (Exception e) {
}				
try {
	 if(enlace2.substring(15).length() > 0 || enlace2.substring(15)!= null){
		  enlace_nick8=enlace2.substring(15);
			}
} catch (Exception e) {
}


try {
	 if(enlace2.substring(10).length() > 0 || enlace2.substring(10)!= null){
		 enlace_nick20=enlace2.substring(10);
			}
} catch (Exception e) {
}		
try {
	 if(enlace2.substring(9).length() > 0 || enlace2.substring(9)!= null){
		 enlace_nick19=enlace2.substring(9);
			}
} catch (Exception e) {
}	
try {
	 if(enlace2.substring(8).length() > 0 || enlace2.substring(8)!= null){
		 enlace_nick18=enlace2.substring(8);
			}
} catch (Exception e) {
}

try {
	 if(enlace2.substring(7).length() > 0 || enlace2.substring(7)!= null){
		 enlace_nick17=enlace2.substring(7);
			}
} catch (Exception e) {
}




 




		modelo_maid anun1 = ge.verificar_MAID_Por_Url(enlace_nick1);
		modelo_maid anun2 = ge.verificar_MAID_Por_Url(enlace_nick2);
		modelo_maid anun3 = ge.verificar_MAID_Por_Url(enlace_nick3);
		modelo_maid anun4 = ge.verificar_MAID_Por_Url(enlace_nick4);
		modelo_maid anun5 = ge.verificar_MAID_Por_Url(enlace_nick5);
		modelo_maid anun6 = ge.verificar_MAID_Por_Url(enlace_nick6);
		modelo_maid anun7 = ge.verificar_MAID_Por_Url(enlace_nick7);
		modelo_maid anun8 = ge.verificar_MAID_Por_Url(enlace_nick8);


		modelo_maid anun9  = ge.verificar_MAID_Por_Url(enlace_nick17);
		modelo_maid anun10  = ge.verificar_MAID_Por_Url(enlace_nick18);
		modelo_maid anun11 = ge.verificar_MAID_Por_Url(enlace_nick19);
		modelo_maid anun12  = ge.verificar_MAID_Por_Url(enlace_nick20);

		
		sesion.setAttribute("mensaje", "null");
		
		
		modelo_maid AnuncioPorNickvalidador =  null;
		
		if(ge.verificar_MAID_Por_Url(enlace_nick)!=null) {
		AnuncioPorNickvalidador = ge.verificar_MAID_Por_Url(enlace_nick);
		}

		
		if (user!=null){
			
			sesion.setAttribute("usuario", user);
			sesion.setAttribute("u", user);

			response.sendRedirect("/activacion");	
			
			
			
				
		}else if (anun1!=null|| anun2!=null|| anun3!=null|| anun4!=null|| anun5!=null|| anun6!=null|| anun7!=null|| anun8!=null|| anun9!=null|| anun10!=null|| anun11!=null|| anun12!=null){
			
			
			if(anun1!=null) {AnuncioPorNickvalidador=anun1;
			
			}
			if(anun2!=null) {AnuncioPorNickvalidador=anun2;
			
			}
			if(anun3!=null) {AnuncioPorNickvalidador=anun3;
			
			}
			if(anun4!=null) {AnuncioPorNickvalidador=anun4;
			
			}
			if(anun5!=null) {AnuncioPorNickvalidador=anun5;
			
			}
			if(anun6!=null) {AnuncioPorNickvalidador=anun6;
			
			}
			if(anun7!=null) {AnuncioPorNickvalidador=anun7;
			
			}
			if(anun8!=null) {AnuncioPorNickvalidador=anun8;
			
			}
			if(anun9!=null) {AnuncioPorNickvalidador=anun9;
			
			}
			if(anun10!=null) {AnuncioPorNickvalidador=anun10;
			
			}
			if(anun11!=null) {AnuncioPorNickvalidador=anun11;
			
			}
			if(anun12!=null) {AnuncioPorNickvalidador=anun12;
			
			}
			
			
			
			modelo_maid a1 = AnuncioPorNickvalidador;

			sesion.setAttribute("anuncio_encontrado", a1);
			gestion_usuario gesu = new gestion_usuario();
			
			
			/*
			ArrayList<fotos_modelo> okfot = gesu.listadodeFotos(a1.getId_anuncio());
			
			ArrayList<video_modelo> okvid = gesu.listadodeVideos(a1.getId_anuncio());		

			ArrayList<serivicos_modelo> okserv = gesu.listadode_servicios(a1.getId_anuncio(), 1);
			
			ArrayList<serivicos_modelo> okesp = gesu.listadode_servicios(a1.getId_anuncio(), 2);
			
			ArrayList<lugar_atencion_modelo> oklug = gesu.listadode_lugarel_atencion(a1.getId_anuncio());		;
			
			ArrayList<metodo_pago_modelo> okmpg = gesu.listadode_metodo_pago(a1.getId_anuncio());
			

			sesion.setAttribute("okfot", okfot);
			sesion.setAttribute("okvid", okvid);
			sesion.setAttribute("okserv", okserv);
			sesion.setAttribute("okesp", okesp);
			sesion.setAttribute("oklug", oklug);
			sesion.setAttribute("okmpg", okmpg);
			*/
			
			sesion.setAttribute("usuario", AnuncioPorNickvalidador);
			response.setContentType( "text/html; charset=UTF-8" );
			 PrintWriter out = response.getWriter();
			 modelo_maid Anuncio_LLENO = AnuncioPorNickvalidador;
	            out.println("<!DOCTYPE html>");
	            out.println("<html lang=\"es-PE\">");
	            out.println("<head>");
	            out.println("<title>Servlet DisplayServlet</title>");
	            out.println("<meta charset=\"utf-8\">\r\n" + 
	            		"<meta http-equiv=\"Content-Type\" content=\"text/html;\">\r\n" + 
	            		"<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0\">\r\n" + 
	            		"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
	            		"<meta name=\"Keywords\" content=\"\">\r\n" + 
	            		"<meta name=\"Description\" content=\"\"> \r\n" + 
	            		"<!--\r\n" + 
	            		"                                     \r\n" + 
	            		"¿Llegaste hasta aqui? Forma parte de nuestra comunidad.\r\n" + 
	            		"\r\n" + 
	            		"► www.kush.pe/franquicia/\r\n" + 
	            		"\r\n" + 
	            		"-->\r\n" + 
	            		"\r\n" + 
	            		"<title>Kush Peru</title>\r\n" + 
	            		"<link rel=\"icon\" href=\"/favicon.ico\" type=\"image/x-icon\">\r\n" + 
	            		"<link href='css/kush.css' rel='stylesheet'>\r\n" + 
	            		"<link href='css/animate.css' rel='stylesheet'>\r\n" + 
	            		"<link href='css/swiper.css' rel='stylesheet'>\r\n" + 
	            		"<link href='https://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet'>\r\n" + 
	            		"</head>");
	            out.println("<body class=\"perfiljsp\">\r\n" + 
	            		"    <header id=\"menu-ux\">\r\n" + 
	            		"        <div class=\"menu-moviles\" style=\"\">\r\n" + 
	            		"          <ul class=\"kush-mega-menu\">\r\n" + 
	            		"            <li class=\"li-inicio\"><a href=\"http://kush.pe/\">.</a></li>\r\n" + 
	            		"            <li class=\"li-buscar\"><div class=\"menu-busqueda\">\r\n" + 
	            		"                  <span>Buscar</span>\r\n" + 
	            		"                  <input class=\"busqueda-in\" type=\"text\" name=\"firstname\" placeholder=\"Buscar\">\r\n" + 
	            		"                </div></li>\r\n" + 
	            		"            <li class=\"li-buscar-movil\" style=\"display: none;\"><a href=\"#\">Buscar</a></li>\r\n" + 
	            		"            <li class=\"li-acceder\"><a href=\"http://kush.pe/acceder.jsp\">Anunciar</a></li>\r\n" + 
	            		"            <li class=\"li-contacto\"><a href=\"#\">Contacto</a></li>\r\n" + 
	            		"            <li class=\"li-legal\"><a href=\"#\">Legal</a></li>\r\n" + 
	            		"          </ul>\r\n" + 
	            		"        </div>\r\n" + 
	            		"        \r\n" + 
	            		"    </header>  <div id=\"perfil\" style=\"\">\r\n" + 
	            		"\r\n" + 
	            		"    <div class=\"visual\">\r\n" + 
	            		"\r\n" + 
	            		"      <div class=\"card card1\">\r\n" + 
	            		"\r\n" + 
	            		"  	     <div class=\"card-header\">\r\n" + 
	            		"\r\n" + 
	            		"  		      <div class=\"card-nacionalidad\">\r\n" + 
	            		"\r\n" + 
	            		"              <img src=\"https://cdn.countryflags.com/thumbs/united-kingdom/flag-button-round-250.png\"/>\r\n" + 
	            		"\r\n" + 
	            		"            </div>\r\n" + 
	            		"\r\n" + 
	            		"  		<div class=\"card-nombre\">"+Anuncio_LLENO.getAlias()+"</div>\r\n" + 
	            		"\r\n" + 
	            		"      <span class=\"verificada\"></span>\r\n" + 
	            		"\r\n" + 
	            		"      <span class=\"disponible-ahora\"></span>\r\n" + 
	            		"\r\n" + 
	            		"  	</div><div class=\"card-img\"><div class=\"swiper-container\">\r\n" + 
	            		"\r\n" + 
	            		"    <!-- Additional required wrapper -->\r\n" + 
	            		"\r\n" + 
	            		"    <div class=\"swiper-wrapper\">\r\n" + 
	            		"\r\n" + 
	            		"        <!-- Slides -->");

	         /*  
 				ArrayList<fotos_modelo> lista = okfot;
	            if(lista!=null){
	            for(fotos_modelo fotlist :lista){

	            out.println("<div class=\"swiper-slide\"><img src="+"'"+fotlist.getRuta()+"'"+"></div>");  
	            

	            }}

	            out.println("</div><!-- If we need pagination -->\r\n" + 
	            		"    <div class=\"swiper-pagination\"></div><!-- If we need navigation buttons -->"
	            		+ "<div class=\"swiper-button-prev\"></div>\r\n" + 
	            		"    <div class=\"swiper-button-next\"></div></div></div>"
	            		+ "<div class=\"card-footer\">\r\n" + 
	            		"  		<div class=\"card-info\">\r\n" + 
	            		"        <div class=\"card-distrito\">"+Anuncio_LLENO.getDistrito()+"</div>\r\n" + 
	            		"        <div class=\"card-precio\">"+Anuncio_LLENO.getTarifaHora()+"</div>\r\n" + 
	            		"      </div><div class=\"card-botonesdeaccion\">"
	            		+ "<a href=\"tel:"+Anuncio_LLENO.getCelular()+"\"><div class=\"card-llamada card-llamada animated pulse infinite\">LLAMAR</div></a>"
	            		+ "<a href=\"#\">\r\n" + 
	            		"          <div class=\"card-wame\">\r\n" + 
	            		"          <img src=\"http://kush.pe/resource/img_content/wsp.png\">\r\n" + 
	            		"          </div>\r\n" + 
	            		"        </a></div></div></div></div><div class=\"textual\"><button class=\"accordion\">Ver detalles</button><div class=\"panel\">"
	            		+ " <span class=\"edad\">");
	            
	            Date fechaNac=null;
	            String calculo_edad = Anuncio_LLENO.getFecha_nac();
	            try {
					fechaNac = new SimpleDateFormat("yyyy-MM-dd").parse(calculo_edad);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				*/
	            
	            
	            
	            int a�o=0;
	            Calendar fechaNacimiento = Calendar.getInstance();
	            //Se crea un objeto con la fecha actual
	            Calendar fechaActual = Calendar.getInstance();
	            //Se asigna la fecha recibida a la fecha de nacimiento.
	            
	            

	            out.println("</u1></div></div></div>"
	            		+ "</body>");
	            
	            
	            
	           
	            out.println("</html>");
	        
	            out.close();
			
			
			
			
		}else {
			 response.sendRedirect("inicio");			
		}
		
		
	}

		}
