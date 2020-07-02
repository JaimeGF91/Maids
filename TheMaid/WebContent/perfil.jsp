
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page session= "true" %>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page import = "java.io.*,java.util.*" %>

<%@page import="modelo.*"%>
<%@page import="mantenimiento.*"%>
<%@page import="Servlet.servletUsuario"%>
<!DOCTYPE html>

<html lang="ES" prefix="og: http://ogp.me/ns#">

<head>
<%
	HttpSession sesion=request.getSession();
      					gestion_usuario gesu=new gestion_usuario();
                     	String usuM =  (String)sesion.getAttribute("usuMactivo");	
                     	String usuC =  (String)sesion.getAttribute("completar_perfil");  
                     	String necesarioMOD =  (String)sesion.getAttribute("evento_necesario_cancelarMOD");  
						modelo_maid usuario = (modelo_maid)sesion.getAttribute("u"); 	
						if(usuario!=null){
							modelo_maid u_validado = gesu.validarUsuario(usuario.getCorreo(),usuario.getContraseña().toString()); 
							sesion.setAttribute("u",u_validado);     			 usuario = (modelo_maid)sesion.getAttribute("u");						
						}
   						 if(usuM!="MaidActive"){
%> 
   						<meta http-equiv="refresh" content="0;url=/Login" />
   						  <%
   						  	}
   						 
   						if(usuM=="MaidActive"){
   						  %>
   						  
   						  
	<meta http-equiv="expires" content="43200" />
	<title> THEMAID-APP PERFIL </title>

	<meta name="description" content="Somos lo que necesitas" />

	<meta name="keywords" content="Maid,tu maid" />

	<link media="all" href="page_resource/autoptimize_ico.css" rel="stylesheet">

	<meta>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<link rel="apple-touch-icon" sizes="180x180" href="page_resource/logoICO.png">
	<link rel="icon" type="image/png" sizes="32x32" href="page_resource/logoICO.png">
	<link rel="icon" type="image/png" sizes="16x16" href="page_resource/logoICO.png">
	<link rel="mask-icon" href="page_resource/logoICO.png" color="#597899">
	<meta name="theme-color" content="#597899">
	<link rel="alternate" hreflang="es" href="https://www.ELITE.com/">

	<script src="https://kit.fontawesome.com/90d5f27147.js" crossorigin="anonymous"></script>
	

	<link rel="canonical" href="http://themaid-app.com/login.jsp">
	<meta name="twitter:card" content="summary">
	<meta name="twitter:description" content="Somos lo que necesitas">
	<meta name="twitter:title" content="TheMaid">

	<meta property="og:type" content="article">
	<meta property="og:url" content="http://themaid-app.com/login.jsp" />
  	<meta property="og:title" content="Elite - Academia virtual">
  	<meta property="og:image" content="http://themaid-app.com/page_resource/logoICO.png">
  	<meta property="og:description" content="Elite - Academia virtual">
	<meta property="og:image:alt" content="maid" />

	<script src="page_resource/wp-emoji-release.min.js" type="text/javascript" defer=""></script>
	<script type="text/javascript" src="page_resource/jquery.js"></script>


	<link type="text/css" media="all" href="css/perfil.css" rel="stylesheet">
</head>

<body  class="home page-template-default page page-id-3554 cookies-not-set"  >

	<header class="root">


	</header>


	<div class="contenedor_body" style="width: 100%;position: relative">
		
	<div class="body_log ">	</div>
		<div class="content_log ">
			<div class="content_credential_log" style="
    box-shadow: 0 10px 38px rgba(0,0,0,0.30), 0 15px 20px rgba(0,0,0,0.22);">

				
				
					<%	if(usuC == "vista_completarperfil"){%>
				
				<div class="login">  Esta a un solo paso de Completar su perfil<br>
				Desea buscar una MAid o Quiere ser parte de nuestra gran equipo
					<form  class="login-container" action="Cuenta" method="post">
					
					
					<select required="required"  name="input_est_complete" id="">
    						<option selected="" disabled="">¿Que Busco?</option>
    						<option value="1">Soy Maid - Empleada</option>
   							<option value="2">quiero contratar</option>
  					</select>
  				
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							<input  style="background-color: #597899;" required="required" name="input_nom_complete"    class="input_usuario" type="text" placeholder="nombres completos"></p>
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							<input  style="background-color: #597899;" required="required" name="input_desc_complete"   class="input_usuario" type="text" placeholder="descripcion de si mismo"></p>
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							<input  style="background-color: #597899;" required="required" name="input_honor_complete"   class="input_usuario" type="number" placeholder="honorarios"></p>
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							<input  style="color: #fff;background-color: #597899;" required="required" name="input_edad_complete" min="18" max="99" value="18" class="input_usuario" type="number" placeholder="edad"></p>
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							<input style="background-color: #597899;" required="required" name="input_nompila_complete"   class="input_usuario" type="text" placeholder="nombre de pila"></p>
							

						<p><button type="submit" name="opcion" value="Registrar_completo"style="border-radius: 15px;">Completar perfil</button></p>
										
						
					</form>
					<%	 
					if(necesarioMOD!="cancelarMOD"){%>
					<form  class="login-container" action="Cuenta" method="post">
						<p><button type="submit" name="opcion" value="Cancelar_actualizar_sesion"style="border-radius: 15px;">Cancelar</button></p>
					</form>	
					<%}%>
				</div>
					<%}else{%>
					
				
				<div class="login"> Publica tu anuncio (MAID) 
					<form  class="login-container" action="Cuenta" method="post">
					
						
						${mensaje}
					</form>
					
					<%	if(usuario!=null){%>
				
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
						<div style="">nombre : <%= usuario.getNombre()%></div></p> 	
						
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
						<div style="">	tipo de cuenta :  
														
						<%	if(usuario.getEstado() == 1){%>
							Maid - Empleada
						<%	}else if(usuario.getEstado() == 2){%>
							Contratista
						<%}%>
						</div>
						</p>
						
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
						<div style="">	descripcion :  <%= usuario.getDescripcion()%></div></p>
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
						<div style="">		honorarios :  <%= usuario.getHonorarios()%></div></p>							
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
						<div style="">		edad :  <%= usuario.getEdad()%></div></p>
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
						<div style="">		alias :  <%= usuario.getAlias()%></div></p>	
							
							
					<%	}%>
					
				</div>
				
				<%	} %>
				
				
				
				
				
			</div>
			
			
			
			<div class="content_credential_log content_credential_log2" style="
    left: 50%;
    box-shadow: 0 10px 38px rgba(0,0,0,0.30), 0 15px 20px rgba(0,0,0,0.22);
    ">

			
				<div class="login segundologin"> 
					<form  class="login-container" action="Cuenta" method="post">
							
						<p>Crea tu anuncio y sera visible para todos<br>
						<a href="/anunciate">Anunciate con nosotros</a>
						 ..Gracias..
						 <br>
						</p>
																
						<p><button type="submit" name="opcion" value="cerrar_sesion"style="border-radius: 15px;">Cerrar sesion</button></p>
						<%	if(usuC != "vista_completarperfil"){%>
						<p><button type="submit" name="opcion" value="actualizar_sesion"style="border-radius: 15px;">Actualizar datos</button></p>
						<%	} %>
									
						
						
					</form>
					<!-- 
					<%	if(usuario!=null && usuario.getNombre()!=null){%>
				Sus datos son: 
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							nombre : <%= usuario.getNombre()%></p>
						
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							tipo de cuenta // 
														
						<%	if(usuario.getEstado() == 1){%>
							Maid - Empleada
						<%	}else if(usuario.getEstado() == 2){%>
							Contratista
						<%}%>
						
						</p>
						
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							descripcion // <%= usuario.getDescripcion()%></p>
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							honorarios // <%= usuario.getHonorarios()%></p>							
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							edad // <%= usuario.getEdad()%></p>
							
						<p class="p_log"><img class="icouser_logo" src="galeria/ico_mail.png">
							alias // <%= usuario.getAlias()%></p>	
							
							
					<%	}%> -->
					
				</div>
				
				
				
				
				
				
				
				
				
				
				
				
			</div>
	</div>
	
	<img src="galeria/logo_blank.jpg" class="img_blank_log">
		
	</div>


	


	<script defer="defer" src="page_resource/autoptimize_9bd092f44c32646038f14bc89245b81f.js"></script>
	<script defer="defer" src="page_resource/jquery2.js"></script>







</body>
<%}else{ %>
	</head>
	<body style="
	height: 100%;width: auto;min-width: 473px;
    min-height: 950px;
	filter: blur(4px);
	background: linear-gradient(
      rgba(7, 64, 126, 0.6),
      rgba(7, 64, 126, 0.6)   
    ">
	</body>
	
<%} %>

	<%sesion.setAttribute("mensaje", "");%> 
	<%sesion.setAttribute("evento_necesario_cancelarMOD", "");%> 



</html>
