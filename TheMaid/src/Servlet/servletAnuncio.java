package Servlet;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
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
import javax.servlet.http.Part;

import mantenimiento.*;
import modelo.*;
/**
 * Servlet implementation class gestion_anuncio
 */
@WebServlet("/AnuncioS")
@MultipartConfig(fileSizeThreshold=1024*1024*2,	// 2MB
maxFileSize=1024*1024*10,		// 10MB
maxRequestSize=1024*1024*50)	// 50MB
public class servletAnuncio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletAnuncio() {
        super();
        // TODO Auto-generated constructor stub
    }


	gestion_usuario gu=new gestion_usuario();
	gestion_anuncio gu2=new gestion_anuncio();
    protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    
		String opcion = request.getParameter("opcion"); 
		
		
	
		switch (opcion) {
		
		case "publicar_empleada_completo":
			publicar_empleada_completo_servlet(request, response);
				break;
				

		case "buscar_empleada_completo":
			buscar_empleada_completo_servlet(request, response);
				break;
				
		}
		
		
		
		
	    
    }
	private void buscar_empleada_completo_servlet(HttpServletRequest request, HttpServletResponse response) throws IOException {


		HttpSession sesion=request.getSession();
		modelo_maid usuario = (modelo_maid)sesion.getAttribute("u"); 
		
		int id_Annun = Integer.parseInt(request.getParameter("id_ussAnnun")) ; 
		modelo_maid usuarioIDobj = gu.Obtener_anuncio_porID(id_Annun);
		
		if(usuario!=null) {

		ArrayList<modelo_foto> okzon  = gu.listadodezonas(id_Annun);
		ArrayList<modelo_foto> okhab  = gu.listadodehabiliaddes(id_Annun);
		ArrayList<modelo_foto> okesp  = gu.listadodeespecialidades(id_Annun);
		ArrayList<modelo_foto> okfot  = gu.listadodeFotos(id_Annun);
		ArrayList<modelo_video> okvid = gu.listadodeVideos(id_Annun);

		sesion.setAttribute("okzon", okzon);
		sesion.setAttribute("okhab", okhab);
		sesion.setAttribute("okesp", okesp);
		sesion.setAttribute("okfot", okfot);
		sesion.setAttribute("okvid", okvid);
		
		
		response.sendRedirect("/Anuncio");
		}else{
			response.sendRedirect("/index");
		}
		
		
	}
	private void publicar_empleada_completo_servlet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		HttpSession sesion=request.getSession();
		modelo_maid usuario = (modelo_maid)sesion.getAttribute("u"); 	

		modelo_zonas mod_zona = new modelo_zonas();	
		modelo_habilidades mod_habilidades=new modelo_habilidades();
		modelo_especialidades mod_especialidades=new modelo_especialidades();
		modelo_foto mod_foto=new modelo_foto();
		modelo_video mod_video=new modelo_video();


		int codigo_usumodel =  usuario.getId();
		
		
		
		String distrito[]= request.getParameterValues("dist");
		mod_zona.setId_usuario(codigo_usumodel);
		mod_zona.setTipo(1);
		 
	 int oko1=0;
	        if(distrito != null){
	        	for(int i=0; i<distrito.length; i++){
	        		mod_zona.setZona(distrito[i]);
	       		 	oko1 = gu2.registrar_zona_mult(mod_zona);
	        }}
		
		

			
		String habilidades[]= request.getParameterValues("Habilidad");
		mod_habilidades.setId_usuario(codigo_usumodel);
		mod_habilidades.setTipo(1);
			 
	 int oko2=0;
		        if(habilidades != null){
		        	for(int i=0; i<habilidades.length; i++){
		        		mod_habilidades.setHabilidades(habilidades[i]);
		       		 	oko2 = gu2.registrar_habilidad_mult(mod_habilidades);
		        }}

				
		String especialidades[]= request.getParameterValues("ESPEC");
		mod_especialidades.setId_usuario(codigo_usumodel);
		mod_especialidades.setTipo(1);
					 
			 int oko3=0;
				        if(especialidades != null){
				        	for(int i=0; i<especialidades.length; i++){
				        		mod_especialidades.setEspecialidades(distrito[i]);
				       		 	oko3 = gu2.registrar_especialidad_mult(mod_especialidades);
				        }}
				     
				        
				        
				        
				        
				        
				        
				        
						
						
						//GALERIA - USUARIO - ANUNCIO

						String SAVE_DIR_USUARIO = codigo_usumodel+"";//"codigo_NOMBRE_USUARIO_VARIABLE";
						String SAVE_DIR_ANUNCIO = codigo_usumodel+1+"";//"codigo_ANUNCIO_VARIABLE";
				        String catalinaHome = System.getProperty("catalina.home");
				        String catalinaBase = System.getProperty("catalina.base");
				        			
				        			String appPath = request.getServletContext().getRealPath("");


				        			String appPath2 = new File(catalinaHome + "/../../TheMaid.themaid-app.com").getCanonicalPath();
				        			String appPath3 = new File(catalinaBase + "/../../TheMaid.themaid-app.com").getCanonicalPath();
				        			

				        			// constructs path of the directory to save uploaded file
				        			
				        	String savePath1 = appPath3 + File.separator + "Galeria" + File.separator +SAVE_DIR_USUARIO;

				        	
				        	
				        	
				        	
				        	int posv=0;	int posf=0;
				        	// creates the save directory if it does not exists
				        		File fileSaveDir = new File(savePath1);
				        		if (!fileSaveDir.exists()) {
				        		fileSaveDir.mkdir();
				        		}
				        		
				        		
				        		
				        		

				        	String savePath2 = appPath3 +  File.separator + "Galeria" + File.separator +SAVE_DIR_USUARIO + File.separator +SAVE_DIR_ANUNCIO;
				        			
				        	// creates the save directory if it does not exists
				        			File fileSaveDir2 = new File(savePath2);
				        			if (!fileSaveDir2.exists()) {
				        				fileSaveDir2.mkdir();
				        			}
				        			for (Part part : request.getParts()) {
				        				if (part != null) {
				        				String fileName = extractFileName(part);
				        				fileName = new File(fileName).getName();
				        				if (fileName.length() > 0) {
				        				// refines the fileName in case it is an absolute path
				        				part.write(savePath2 + File.separator + fileName);
				        				String ubicacion_elemento=savePath2 + File.separator + fileName;
				        				//AGREGAR METODO PARA AGREGAR UBICACION DE IMAGEN
				        				
				        				char valorextencion=fileName.charAt(fileName.length()-1);
				        					posv++;
				        					
				        					if(valorextencion=='4'||valorextencion=='v'||valorextencion=='V'||valorextencion=='M'||valorextencion=='m') {
				        					posf++;
				        					mod_video.setId_usuario(codigo_usumodel);
				        					mod_video.setPosicion(posf);
				        					mod_video.setTipo(1);
				        					mod_video.setVideo("https://TheMaid.themaid-app.com/Galeria" + File.separator +SAVE_DIR_USUARIO + File.separator +SAVE_DIR_ANUNCIO+ File.separator + fileName);
				        					
				        					int ok2=gu2.registrar_video(mod_video);
				        								}else{
				        					posf++;
				        					mod_foto.setId_usuario(codigo_usumodel);
				        					mod_foto.setPosicion(posf);
				        					mod_foto.setTipo(1);
				        					mod_foto.setFoto("https://TheMaid.themaid-app.com/Galeria" + File.separator +SAVE_DIR_USUARIO + File.separator +SAVE_DIR_ANUNCIO+ File.separator + fileName);
				        						
				        					int ok1=gu2.registrar_foto(mod_foto);				
				        								}
				        					
				        					
				        											}
				        								 }
				        			}
				        		
				        			
				        			
				        			
				        			
				        			
				        			

				       			 response.sendRedirect("/Perfil");			
				        			
				        			
				        			
				        			
				        			
				        
				        
				        
				        
				        
				        
				        
				        
				        
		
	}

	
	
	
	
	
	
	

	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length()-1);
			}
		}
		return "";
	}
    

	
	
	
	
	
	
	
	
	
	
	
	
}
