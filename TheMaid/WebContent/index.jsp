
<%@page import="mantenimiento.gestion_usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page session= "true" %>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date"%>
<%@ page import = "java.io.*" %>

<%@page import="modelo.*"%>
<%@page import="Servlet.*"%>

<!DOCTYPE html>

<html lang="ES">

<head>
<script> (function(b,c){var e=document.createElement('link');e.rel='stylesheet',e.type='text/css',e.href='https://chatboxlive.blahbox.net/static/css/main.css',document.getElementsByTagName('head')[0].appendChild(e); var f=document.createElement('script');f.onload=function(){var g;if(c)g='previewInit';else{var h=document.createElement('div');g='cbinit',h.id='cbinit',document.body.append(h)} console.log(document.querySelector('#'+g)),chatbox.initChat(document.querySelector('#'+g),b,c)},f.src='https://chatboxlive.blahbox.net/static/js/chat-lib.js',document.getElementsByTagName('head')[0].appendChild(f)}) ('5516f711a27d86682893671aa87a1fe7', 0); </script>








<%  HttpSession sesion=request.getSession(); 
	gestion_usuario gesu=new gestion_usuario(); %>

    <meta http-equiv="expires" content="43200" />
    <title>  TheMaid  </title>

    <meta name="description" content="Somos la mejor opcion en empleadas del hogar que necesitas" />

    <meta name="keywords" content="Empleadas,domesticas,para, el, hogar" />

    <link media="all" href="page_resource/autoptimize_ico.css" rel="stylesheet">

    <meta>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" async="" src="page_resource/analytics.js"></script>
    <script async="" src="page_resource/gtm.js"></script>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="apple-touch-icon" sizes="180x180" href="page_resource/logoICO.jpg">
    <link rel="icon" type="image/png" sizes="32x32" href="page_resource/logoICO.jpg">
    <link rel="icon" type="image/png" sizes="16x16" href="page_resource/logoICO.jpg">
    <link rel="mask-icon" href="page_resource/logoICO.jpg" color="#5271ff">
    <meta name="theme-color" content="#5271ff">
	
	<meta property="og:type" content="article">
	<meta property="og:url" content="http://themaid-app.com" />
  	<meta property="og:title" content="TheMaid - Empleadas del hogar">
  	<meta property="og:image" content="http://themaid-app.com/page_resource/logoICO.png">
  	<meta property="og:description" content="TheMaid - Empleadas del hogar">
	<meta property="og:image:alt" content="TheMaid - Empleadas del hogar" />
	<meta property="og:image:alt" content="Empleadas del hogar" />
    <link rel="alternate" hreflang="es" href="https://www.themaid-app.com/">

    <script src="https://kit.fontawesome.com/90d5f27147.js" crossorigin="anonymous"></script>
    <link type="text/css" media="all" href="css_extra.css" rel="stylesheet">
    <link type="text/css" media="all" href="page_resource/autoptimize_ba376f29c4971be0a3c72131ac0434da.css" rel="stylesheet">

    <link rel="canonical" href="https://www.themaid-app.com/">
    <meta name="twitter:card" content="summary">
    <meta name="twitter:description" content="Somos tu mejor opcion">
    <meta name="twitter:title" content="The Maid">


    <script src="page_resource/wp-emoji-release.min.js" type="text/javascript" defer=""></script>
    <script type="text/javascript" src="page_resource/jquery.js"></script>

	<!-- para el svg corazon-->
	
<link type="text/css" media="all" href="css/index.css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
	
	
	
	<!--para el svg corazon

<div class="wrapper">
  <div class="icon">

      <svg version="1.1" id="heart-icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="100%" height="100%" viewBox="0 0 116 117" preserveAspectRatio="xMinYMin meet" class="svg-content">

<path id="shadow" d="M85.844,47.951C83.896,41.432,68.737,57.5,62.75,57.5c-8.727,0-32.605,4.806-28.522,9.092l60.438,73.158
	c0,0,40.168-10.334,42.834-35L85.844,47.951z"/>
    <path id="heart" d="M70.711,36.677c-5.989,0-11.239,2.086-13.919,6.997c-2.68-4.911-7.85-6.997-13.837-6.997
      c-8.727,0-15.799,7.074-15.799,15.799c0,15.788,29.866,30.062,29.866,30.062S86.51,68.264,86.51,52.476
      C86.51,43.751,79.436,36.677,70.711,36.677z"/>
    </svg>
    </div>  
</div>

-->
	
	
    <link type="text/css" media="all" href="css/style.css" rel="stylesheet">
	<style>
		.banner01{		
  background-image: url(galeria/banner_010.png);
		}
		.banner02{
  background-image: url(galeria/codvid.png);
		}
		.banner03{
  background-image: url(galeria/banner_020.png);
		}
		.banner04{
  background-image: url(galeria/banner_030.png);
		}
	

@media(max-width:1200px) {
		.banner01{		
  background-image: url(galeria/banner_md_010.png);
		}
		.banner02{
  background-image: url(galeria/codvid.png);
		}
		.banner03{
  background-image: url(galeria/banner_md_020.png);
		}
		.banner04{
  background-image: url(galeria/banner_md_030.png);
		}}		
		
@media(max-width:700px) {
		.banner01{		
  background-image: url(galeria/banner_m_010.png);
		}
		.banner02{
  background-image: url(galeria/codvid.png);
		}
		.banner03{
  background-image: url(galeria/banner_m_020.png);
		}
		.banner04{
  background-image: url(galeria/banner_m_030.png);
		}}		
		
	</style>
	
	
	
	<!-- para el filtro -->
	<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css'>
	
	
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
</head>
	
	

<body class="home page-template-default page page-id-3554 cookies-not-set" itemscope="" itemtype="http://schema.org/WebPage">
	
<nav role="navigation">
  <div id="menuToggle">

	  
    <input type="checkbox" />
    
  
	  
    <span></span>
    <span></span>
    <span></span>
    
 
    <ul id="menu">
      <a href="#"><li>INICIO</li></a>
      <a href="#"><li>NOSOTROS</li></a>
      <a href="#"><li>INFORMATE</li></a>
      <a href="#"><li>CONTACTO</li></a>
      <a href="/Login"><li>QUIERO UNIRME</li></a>
    </ul>
  </div>
</nav>
	
	
	
	
	
	
	
	
	
		
<div id="carouselExampleCaptions" class="carousel slide ht-banner" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
      <li data-target="#carouselExampleCaptions" data-slide-to="1" class=""></li>
      <li data-target="#carouselExampleCaptions" data-slide-to="2" class=""></li>
      <li data-target="#carouselExampleCaptions" data-slide-to="3" class=""></li>
    </ol>
    <div class="carousel-inner ht-banner">
      <div class="carousel-item active">
        <div class="banner01"></div>
        <div class="carousel-caption d-none d-md-block">
          <h5><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
			  
			  
			  </font></font></h5>
          <p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
			  
			  
			  </font></font></p>
        </div>
      </div>
      <div class="carousel-item" style="position: relative">
        <div class="banner02"></div>
		  
        <div class="carousel-caption d-none d-md-block" style="position: absolute; margin-left: -380px;bottom: 120px">
		  <a href="#"><img src="galeria/verificado.gif" style="width: 80px;border-radius: 900px; margin-bottom: 20px"></a>
          <h1><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">CONSIGUE LA INSIGNIA</font></font></h1>
          <h3><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">INFORMATE SOBRE PREVENCION </font></font></h3>
        </div>
      </div>
      <div class="carousel-item">
        <div class="banner03"></div>
        <div class="carousel-caption d-none d-md-block">
          <h5><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
			  
			  
			  
			  </font></font></h5>
          <p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
			  
			  
			  
			  </font></font></p>
        </div>
      </div>
		<div class="carousel-item">
        <div class="banner04"></div>
        <div class="carousel-caption d-none d-md-block">
          <h5><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
			  
			  
			  
			  </font></font></h5>
          <p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
			  
			  
			  </font></font></p>
        </div>
      </div>
    </div>
    <a class="carousel-control-prev" style="
    z-index: 200!important;" href="#carouselExampleCaptions" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Anterior</font></font></span>
    </a>
    <a class="carousel-control-next" style="
    z-index: 200!important;" href="#carouselExampleCaptions" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">próximo</font></font></span>
    </a>
  </div>
	
	
	
	
	
	
	
	
	
        <div id="page-intro">
            <div class="topos-bg page-content">
               <div class="container">
            <div class="collapsibles">
                 <h1>EMPLEADAS DOMESTICAS</h1>
                <h2><a  class="collapsed">
    Recomendaciones
        </a></h2>
                
            </div>
        </div>
                
            </div>
        </div>

      
	
	
	
	<!-- PARA EL FILTRO -->
	
	
	<input class="variation" id="bluepurple" type="radio" value="1" name="color" checked="checked" />
	<main>
		<section class="results-header">
			<h1>Empleadas Domesticas</h1>
			<div class="results-header__option">
				<div class="option__button2 option--grid selected"><span style="font-size: 20px">CARTAS</span></div>
				<div class="option__button2 option--list"><span  style="font-size: 20px">LISTA</span></div>
			</div>
		</section>
		
		<section class="results-section results--grid">
			
			
			
			 
			
            <%  
              
              ArrayList<modelo_maid> list = gesu.listado();
			
              if(list!=null  ){

                  for(modelo_maid anun :list){
			if(anun.getNombre()!=null){
			%> 
			
			<div class="profile">
				<div class="profile__image">
				
				
				<img src=<%				
				modelo_foto modfot = gesu.Obtener_foto_porID_unica(anun.getId());
				if(modfot!=null && modfot.getTipo()==1){
				%> 
				'<%=modfot.getFoto()%>'
				<%}else{%>
			    'galeria/login_background.jpg'
				<%}	%>
				
				 alt="fotografia del auncio" /></div>
				<div class="profile__info">
					<h3><%=anun.getNombre()%></h3>
					<p class="profile__info__extra"><%=anun.getDescripcion()%></p>
				</div>
				<div class="profile__stats">
					<p class="profile__stats__title"> Edad:</p>
					<h5 class="profile__stats__info">
					
					
					<%
					
					if(anun.getEdad()<36){
					%> 
					menor de 35 años 
					<%
					}else{
					%>			
					mayor de 35 años
					<%
					}
					%>
					
					
					</h5>
				</div>
				<div class="profile__stats">
					<p class="profile__stats__title">Honorarios</p>
					<h5><%=anun.getHonorarios()%></h5>
				</div>
				<div class="profile__stats">
					<p class="profile__stats__title">TestCovid</p>
					<h5 class="profile__stats__info">
					<%if(anun.getVerificacion()==2){
						%>	
						Verificado - negativo - Saludable
						<%
					}else{
						%>	
						Pendiente
						<%
					}
					
					%>
					
					</h5>
				</div>
				<div class="profile__cta">
				
				
				<form  class="login-container" action="Cuenta" method="post">
				<input type="hidden" name="input_usuario" value='<%=anun.getId()%>' style="border-radius: 15px;">
				<button class="button" type="submit" name="opcion" value="seleccionar_VER_maid">
				Contratar para mi o mi familia</button>
				</form>
				
				
				
				</div>
			</div>
			
			
			<%}}}%> 
			

			
			
			
			
		</section>
	</main>
	<footer>
		<div class="social"><a href="#" target="_blank"><i class="icon-social-twitter icons"></i></a>
			<a href="#" target="_blank">
		  <i class="icon-social-github icons"></i></a><a href="#" target="_blank"><i class="icon-social-dribbble icons"></i></a></div>
	</footer>
	
	
	
	
	
	
	
	
	
	
	
		
<section class="topos-bg section-spacing agency-desc" style="
    padding-bottom: 0px;
">
            <div class="container page-content">
                <h2>Gracias</h2>
                
            </div>
        </section>

        
        
        
        
	
	
	
	
	
	
	
	
        
        
        
        <footer class="root">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-md-4 logo-column"> <img src="page_resource/logoICO.jpg" alt="Icono Pre" width="120">
                        <p><strong class="text-primary">TheMaid-APP</p>
                        <p></p>
                    </div>
                    <div class="col-sm-6 col-md-8 footer-widgets">
                        <div class="footer-col first">
                            <div id="text-3" class="widget widget_text">
                                <div class="textwidget">
                                    <h2>INICIO</h2>
                                    <p>NOSOTROS<br> <a href="" target="_blank" rel="noopener noreferrer">INFORMATE</a></p>
                                </div>
                            </div>
                        </div>
                        
                        
                        <div class="footer-col">
                            <h2>INICIO</h2>
                            <p><strong>contactanos@themaid-app.com</strong></p>
                           <p>contactanos@themaid-app.com</p>
                        </div>
                        <div class="footer-col logo-column">
                            <h2>CONTACTO</h2>
                            <p><br><span class="text-primary ljoptimizer ljop-encode">contactanos@themaid-app.com</span></p>


                        
                        <ul id="menu-inferior" class="list-inline">
                            <li id="menu-item-4404" class="ljoptimizer menu-item menu-item-type-post_type menu-item-object-page menu-item-4404"><span rel="nofollow" data-loc="aHR0cHM6Ly93d3cuY2FzdWFsLWVzY29ydHMuY29tL2F2aXNvLWxlZ2FsLw">INFORMATE</span></li>
                            <li id="menu-item-4403" class="ljoptimizer menu-item menu-item-type-post_type menu-item-object-page menu-item-4403"><span rel="nofollow" data-loc="aHR0cHM6Ly93d3cuY2FzdWFsLWVzY29ydHMuY29tL3BvbGl0aWNhLWRlLXByaXZhY2lkYWQv">QUIERO UNIRME</span></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </footer>

    
    
    
    
    <script defer="defer" src="page_resource/autoptimize_9bd092f44c32646038f14bc89245b81f.js"></script>
    <script defer="defer" src="page_resource/jquery2.js"></script>

    
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	
	<!-- para el svg corazon-->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
  <script src='js/script.js'></script>
	
	<!-- para el filtro-->
	<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script>
	
<footer>
	
	
	
	
</footer>

	
	
	</body>
	
</html>
