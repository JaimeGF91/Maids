
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page session= "true" %>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page import = "java.io.*,java.util.*" %>

<%@page import="modelo.*"%>
<%@page import="Servlet.servletUsuario"%>
<!DOCTYPE html>

<html lang="ES" prefix="og: http://ogp.me/ns#">

<head>
    <link type="text/css" media="all" href="css/fontcyrillic.css" rel="stylesheet">
    <link type="text/css" media="all" href="css/resetmin.css" rel="stylesheet">
    <link type="text/css" media="all" href="css/login2.css" rel="stylesheet">
<%
	HttpSession sesion=request.getSession();
      					servletUsuario gesu=new servletUsuario();
                     	String usuM =  (String)sesion.getAttribute("usuMactivo");	
   						 if(usuM=="MaidActive"){
%> 
   						<meta http-equiv="refresh" content="0;url=/Perfil" />
   						  <%
   						  	}
   						  %>
   						  
   						  
	<meta http-equiv="expires" content="43200" />
	<title> THEMAID-APP </title>

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
	<link rel="alternate" hreflang="es" href="https://themaid-app.com/">

	<script src="https://kit.fontawesome.com/90d5f27147.js" crossorigin="anonymous"></script>
	

	<link rel="canonical" href="http://themaid-app.com/login.jsp">
	<meta name="twitter:card" content="summary">
	<meta name="twitter:description" content="Somos lo que necesitas">
	<meta name="twitter:title" content="TheMaid">

	<meta property="og:type" content="article">
	<meta property="og:url" content="http://themaid-app.com/login.jsp" />
  	<meta property="og:title" content="themaid - app">
  	<meta property="og:image" content="http://themaid-app.com/page_resource/logoICO.png">
  	<meta property="og:description" content="themaid - app">
	<meta property="og:image:alt" content="maid" />

	<script src="page_resource/wp-emoji-release.min.js" type="text/javascript" defer=""></script>
	<script type="text/javascript" src="page_resource/jquery.js"></script>

<!-- 
	<link type="text/css" media="all" href="css/login.css" rel="stylesheet">
  -->
</head>

<body  class=""  >

	


	
<section class="user">
  <div class="user_options-container">
    <div class="user_options-text">
      <div class="user_options-unregistered">
        <h2 class="user_unregistered-title">¿No tienes una cuenta?</h2>
        <p class="user_unregistered-text">Anunciate como empleada domestica o busca tu nueva trabajadora del hogar para ti y tu familia </p>
        <button class="user_unregistered-signup" id="signup-button">Registrate</button>
      </div>

      <div class="user_options-registered">
        <h2 class="user_registered-title">¿ya tienes cuenta?</h2>
        <p class="user_registered-text">Ingresa rapidamente a tu cuenta para ver el estado de tu perfil</p>
        <button class="user_registered-login" id="login-button">Ingresar</button>
      </div>
    </div>
    
    <div class="user_options-forms" id="user_options-forms">
      <div class="user_forms-login">
        <h2 class="forms_title">Ingresar</h2>
        <form class="forms_form" action="Cuenta" method="post">
          <fieldset class="forms_fieldset">
            <div class="forms_field">
              <input type="email" name="input_usuario" placeholder="Correo electrónico" class="forms_field-input" required="" autofocus="">
            </div>
            <div class="forms_field">
              <input type="password" name="input_contrasena" placeholder="Contraseña" class="forms_field-input" required="">
            </div>
          </fieldset>
          <div class="forms_buttons">
            <button type="button" class="forms_buttons-forgot">Olvidaste tu contraseña?</button>
            <input type="submit" name="opcion" value="Ingresar" class="forms_buttons-action">
          </div>
        </form>
      </div>
      <div class="user_forms-signup">
        <h2 class="forms_title">Crear cuenta</h2>
        <form class="forms_form" action="Cuenta" method="post">
          <fieldset class="forms_fieldset">
            <div class="forms_field">
              <input type="email" name="input_usuario" placeholder="Correo electrónico" class="forms_field-input" required="">
            </div>
            <div class="forms_field">
              <input type="password" name="input_contrasena" placeholder="Contraseña" class="forms_field-input" required="">
            </div>
          </fieldset>
          <div class="forms_buttons">
            <input type="submit" name="opcion" value="Registrate" class="forms_buttons-action">
          </div>
        </form>
      </div>
    </div>
  </div>
</section>




	
<!--  

	<script defer="defer" src="page_resource/autoptimize_9bd092f44c32646038f14bc89245b81f.js"></script>
	<script defer="defer" src="page_resource/jquery2.js"></script>




 -->







	<script defer="defer" src="js/login2.js"></script>



</body>



	<%	sesion.setAttribute("mensaje", "");%> 

<script>

document.getElementById("input_cleanusu").value = "";
document.getElementById("input_cleanpass").value = "";

</script>

</html>
