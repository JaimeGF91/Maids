
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
		<div class="content_log "><!-- crear su propia clase para aliviar el resposnive de 1400px --> 
			<div class="content_credential_log" style="     width: 1400px!important;
    box-shadow: 0 10px 38px rgba(0,0,0,0.30), 0 15px 20px rgba(0,0,0,0.22);">

				
				
				<div class="login">  Esta a un solo paso de Completar su perfil<br>
				Desea buscar una MAid o Quiere ser parte de nuestra gran equipo
				<form  class="login-container" action="AnuncioS" method="post"  enctype="multipart/form-data" accept-charset="UTF-8">
					
				
				<div>HABILIDADES con las que cuenta</div>
  							<div class="">
					<label class=""><input type="checkbox" name="Habilidad" value="lavar">lavar</label>
					<label class=""><input type="checkbox" name="Habilidad" value="planchar">planchar</label>
					<label class=""><input type="checkbox" name="Habilidad" value="trapear">trapear</label>
					<label class=""><input type="checkbox" name="Habilidad" value="pasear perro">pasear perro</label>
					<label class=""><input type="checkbox" name="Habilidad" value="lavar loza">lavar loza</label>
				</div>
				
				
				
				
				<br>
				
				<div>ESPECIALIDADES que logro por experiencia o grado de instruccion</div>
  							<div class="">
					<label class=""><input type="checkbox" name="ESPEC" value="Cocinar">Cocinar</label>
					<label class=""><input type="checkbox" name="ESPEC" value="Atender niños">Atender niños</label>
					<label class=""><input type="checkbox" name="ESPEC" value="instructora">instructora</label>
					<label class=""><input type="checkbox" name="ESPEC" value="veterinaria">veterinaria</label>
					<label class=""><input type="checkbox" name="ESPEC" value="psicologa">psicologa</label>
				</div>
				
				
				
				
				<br>
  					<div>ZONAS en las que puede apersonarse</div>
  							<div class="">
					<label class=""><input type="checkbox" name="dist" value="Ate">Ate</label>
					<label class=""><input type="checkbox" name="dist" value="Barranco">Barranco</label>
					<label class=""><input type="checkbox" name="dist" value="Bellavista">Bellavista</label>
					<label class=""><input type="checkbox" name="dist" value="Breña">Breña</label>
					<label class=""><input type="checkbox" name="dist" value="Callao">Callao</label>
					<label class=""><input type="checkbox" name="dist" value="Carmen de la Legua">Carmen de la Legua</label>
					<label class=""><input type="checkbox" name="dist" value="Chorrillos">Chorrillos</label>
					<label class=""><input type="checkbox" name="dist" value="Comas">Comas</label>
					<label class=""><input type="checkbox" name="dist" value="El Agustino">El Agustino</label>
					<label class=""><input type="checkbox" name="dist" value="Independencia">Independencia</label>
					<label class=""><input type="checkbox" name="dist" value="Jesús María">Jesús María</label>
					<label class=""><input type="checkbox" name="dist" value="La Molina">La Molina</label>
					<label class=""><input type="checkbox" name="dist" value="La Perla">La Perla</label>
					<label class=""><input type="checkbox" name="dist" value="La Punta">La Punta</label>
					<label class=""><input type="checkbox" name="dist" value="La Victoria">La Victoria</label>
					<label class=""><input type="checkbox" name="dist" value="Lima Cercado">Lima Cercado</label>
					<label class=""><input type="checkbox" name="dist" value="Lince">Lince</label>
					<label class=""><input type="checkbox" name="dist" value="Mi Perú">Mi Perú</label>
					<label class=""><input type="checkbox" name="dist" value="Miraflores">Miraflores</label>
					<label class=""><input type="checkbox" name="dist" value="Pueblo Libre">Pueblo Libre</label>
					<label class=""><input type="checkbox" name="dist" value="Puente Piedra">Puente Piedra</label>
					<label class=""><input type="checkbox" name="dist" value="Rímac">Rímac</label>
					<label class=""><input type="checkbox" name="dist" value="San Borja">San Borja</label>
					<label class=""><input type="checkbox" name="dist" value="San Isidro">San Isidro</label>
					<label class=""><input type="checkbox" name="dist" value="SJL">SJL</label>
					<label class=""><input type="checkbox" name="dist" value="SJM">SJM</label>
					<label class=""><input type="checkbox" name="dist" value="San Luis">San Luis</label>
					<label class=""><input type="checkbox" name="dist" value="SMP">SMP</label>
					<label class=""><input type="checkbox" name="dist" value="San Miguel">San Miguel</label>
					<label class=""><input type="checkbox" name="dist" value="Santa Anita">Santa Anita</label>
					<label class=""><input type="checkbox" name="dist" value="Surco">Surco</label>
					<label class=""><input type="checkbox" name="dist" value="Surquillo">Surquillo</label>
					<label class=""><input type="checkbox" name="dist" value="Ventanilla">Ventanilla</label>
					<label class=""><input type="checkbox" name="dist" value="VES">VES</label>
					<label class=""><input type="checkbox" name="dist" value="VMT">VMT</label>
				</div>
  							
  							
  							 <div class="wrapper">
  							 
  							 
  							 VERIFICA QUE ESTAS SALUDABLE - SUBA SU CERTIFICADO DE SALUD
  							 no es un campo obligatorio - solo sera visto para su comprobacion por el area de sistemas
  							  <div id="restablecer01" class="box restablecer01">
                                            <div id="reset_image01" class="js--image-preview"></div>
                                            <div class="upload-options2">
                                                <label>
                                                    <input name="img_name01" onclick="myFunction01()" id="beliminar01" type="file" class="image-upload" accept="image/png, .jpeg, .jpg" />
                                                </label>
                                                <label id="innerBorrar01">
													<p style=" color: #ff3b80;">${ffoto_err}</p>
                                                </label>
                                            </div>
                                        </div>
                                        
                                        
                                        
                                        
                                Suba sus fotos para sus anuncios        
                                        <div id="restablecer01" class="box restablecer01">
                                            <div id="reset_image01" class="js--image-preview"></div>
                                            <div class="upload-options2">
                                                <label>
                                                    <input name="img_name01" onclick="myFunction01()" id="beliminar01" type="file" class="image-upload" accept="image/png, .jpeg, .jpg" />
                                                </label>
                                                <label id="innerBorrar01">
													<p style=" color: #ff3b80;">${ffoto_err}</p>
                                                </label>
                                            </div>
                                        </div>
                                        
                                     <div id="restablecer02" class="box ">
                                            <div id="reset_image02" class="js--image-preview"></div>
                                            <div class="upload-options2">
                                                <label>
                                                    <input name="img_name02" onclick="myFunction02()" id="beliminar02" type="file" class="image-upload" accept="image/png, .jpeg, .jpg" />
                                                </label>
                                                <label id="innerBorrar02">

													<p style=" color: #ff3b80;">${ffoto_err}</p>

                                                </label>
                                            </div>
                                        </div>
                                        
                                        <div id="restablecer03" class="box ">
                                            <div id="reset_image03" class="js--image-preview"></div>
                                            <div class="upload-options2">
                                                <label>
                                                    <input name="img_name03" onclick="myFunction03()" id="beliminar03" type="file" class="image-upload" accept="image/png, .jpeg, .jpg" />
                                                </label>
                                                <label id="innerBorrar03">

													<p style=" color: #ff3b80;">${ffoto_err}</p>

                                                </label>
                                            </div>
                                        </div> 
                                        
                                        
                                        
                                        </div>
  							
  							
  							<div class="form-group">
																		<label for="contact-email"> Videos (proximameente)</label><br>
																		<span class="wpcf7-form-control-wrap contact-email">
<br><br>
                                    <div class="grupo_video">
                                        <div id="grupoV01">
                                          <!-- video-js -->  <video class="video  vjs-default-skin"  controls muted id='localVid' style=""></video>
											<input  name="vid_name01"  onclick="myFunctiovid01()" class="input" type="file" accept="video/mp4, .MOV, .mov, .webm" />
                                            <div id="borrar_video1"></div>
													<p style=" color: #ff3b80;">${vidleoo}</p>
                                        </div> 
                                        <br><!-- partial 
                                        <div id="grupoV02">
                                            
                                            <video class="video2 video-js vjs-default-skin" controls muted id='localVid2' style=""></video>
                                            <input  name="vid_name02"   onclick="myFunctiovid02()" class="input2" type="file" accept="video/mp4, .MOV, .mov" />
                                            <div id="borrar_video2"></div>
                                        </div>
                                        <br>
                                        <div id="grupoV03">
                                            <video class="video3 video-js vjs-default-skin" controls muted id='localVid3' style=""></video>
                                            <input   name="vid_name03"  onclick="myFunctiovid03()" class="input3"  type="file" accept="video/mp4, .MOV, .mov" />
                                            <div id="borrar_video3"></div>
                                        </div>-->
                                    </div>

                                </span>
																	</div>
																	
																	
  							
						<p><button type="submit" name="opcion" value="publicar_empleada_completo"style="border-radius: 15px;">Plublicar anuncio</button></p>
										
						
					</form>
					
					
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
