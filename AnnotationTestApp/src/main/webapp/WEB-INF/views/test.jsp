<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  
  <title>Top Gear</title>
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  

	<link href='http://fonts.googleapis.com/css?family=Work+Sans:400,600,700' rel='stylesheet' type='text/css'>

	
  <meta name="keywords" content="example, JavaScript Form Validation, Sample registration form"/>  
<meta name="description" content="This document is an example of JavaScript Form Validation using a sample registration form."/>  
<link rel='stylesheet' href='js-form-validation.css' type='text/css' />  
<script src="sample-registration-form-validation.js"></script>  
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link href="http://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <style>
  body {
      font: 20px Montserrat, sans-serif;
      line-height: 1.8;
      color: #ffffff;
	  background-color  :#000000;
	  
  }
  p {font-size: 16px;
  color:#ffffff;}
  .margin {margin-bottom: 45px;}
  .bg-1 { 
      background-color: #1abc9c; 
      color: blue;
  }
  .bg-2 { 
      background-color: #474e5d; 
      color: blue;
  }
  .bg-3 { 
      background-color: #ffffff; 
      color: blue;
  }
  .bg-4 { 
      background-color: #2f2f2f; 
      color: blue;
  }
  .hero-feature {
    margin-bottom: 30px;
	 
}
  #myNavbar{color:#888888;}
  .container{
	 margin-left : 150px;
	  margin-right : 150px;
	  float : left;
  }
  .container-fluid {
      padding-top: 10px;
      padding-bottom: 10px;
	 
	  margin-left:130px;
	  margin-right:130px;
	  
	  margin-bottom  :30px;
	  
	  border-radius : 1em;
  }
  .navbar {
      padding-top: 0;
      padding-bottom: 0;
      border: 2px solid black;
      border-radius: 30px;
      margin-bottom: 0;
      font-size:15px;
      font-weight : bold;
	  display : inline;
  }
  .navbar-nav  li a:hover {
      color: #1abc9c !important;
	  
  }
  
  .thumbnail > img{
  height  :150px;
  width : 1000px;
  }
  .caption{
  color : red;}
  
  p{
  color : black;
  }
  
  .img-rounded{
  border-radius : 1em;
  }
  
  
  .footer-right{
  float : right;
  color : gray;
  float  :center;
  margin-bottom:100px;
  margin-top:-25px}
  
 #videosList {
  max-width: 1400px;
  margin: 0 auto;
  padding: 0px 80px; }
  @media (max-width: 1250px) {
    #videosList {
      padding: 0px 50px; } }
  @media (max-width: 900px) {
    #videosList {
      padding: 60px 20px; } }
  #videosList .video {
    width: 50%;
    display: inline-block;
    float: left;
    position: relative;
    overflow: hidden; }
    @media (max-width: 500px) {
      #videosList .video {
        width: 100%; } }
    #videosList .video .videoSlate {
      width: 100%;
      height: 0;
      padding: 60% 0 0 0;
      -webkit-transition: 5000ms 50ms;
      -moz-transition: 5000ms 50ms;
      transition: 5000ms 50ms; }
      #videosList .video .videoSlate:after {
        content: ' ';
        position: absolute;
        top: 0;
        left: 0;
        display: block;
        width: 100%;
        height: 100%;
        background: rgba(0, 0, 0, 0.3);
        -webkit-transition: 500ms 50ms;
        -moz-transition: 500ms 50ms;
        transition: 500ms 50ms; }
      #videosList .video .videoSlate video {
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        position: absolute; }
    #videosList .video .videoListCopy {
      display: inline-block;
      text-align: center;
      width: 100%;
      z-index: 20; }
 
 
  </style>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#" style="color: #ffffff; font-size : 30px; padding:-5px">Car House</a>
    </div>
	<form action="Login.jsp">
    <div class="collapse navbar-collapse" id="myNavbar">
	 
	<ul class="nav navbar-nav navbar-right">
		 <div>
      <ul class="nav navbar-nav" style="list-style:none;">
	    <li class="height"> <form>
	     <input type="text" onKeyUp="ajaxFunction(this.value)" placeholder="search..." />
	<div id="cars" style="position:absolute; color:#ffffff; list-style:none" ></div>
     </form></li>
        
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Information <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Accessories</a></li>
            <li><a href="#">Models</a></li>
            
          </ul>
        </li>
		<li><a href="#">Shipping and Returns</a></li>
		<li><a href="#">Advanced Search</a></li>
          <li style="margin-top:-1.5px;font-weight:bold;"><a href="loginuser.htm">Login</a></li>
        
      </ul>
    </form> 
</nav>

      <div class="modal fade" id="myModalSignup" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
         <div class="modal-dialog" role="document">
            <div class="modal-content">
               <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Change the number</h4>
               </div>
               
             
               <!--angular validation ends here-->
               <div class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
               </div>
            </div>
         </div>
      </div>
<div class="container-fluid bg-4 ">
	<ul class="nav navbar-nav" style="padding-top : -50px; text-align: center; margin-right : 100px; margin top: -50px;">
	<li><a href="#" style="margin-right:85px; margin-left:10px">Home</a></li>
		<li><a href="#" style="margin-right:130px;">About</a></li>
        <li><a href="#" style="margin-right:110px;">Specials</a></li>
        <li><a href="#"style="margin-right:120px;">New</a></li>
		<li><a href="#" style=" float:right;">Contact</a></li>
	</ul>
	
		 <div id="carousel1" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
            <div class="item active">
                <img alt="Bootstrap template" src="resources/banner4.jpg">
                <div class="carousel-caption">
                   
                </div>
            </div>
            <div class="item">
                <img alt="Bootstrap template" src="resources/banner1.jpg">
                <div class="carousel-caption">
                    <div class="col-lg-12 text-center v-center" style="font-size: 39pt;">
                        <a href="#"><span class="avatar"><i class="fa fa-google-plus"></i></span></a>
                        <a href="#"><span class="avatar"><i class="fa fa-linkedin"></i></span></a>
                        <a href="#"><span class="avatar"><i class="fa fa-facebook"></i></span></a>
                        <a href="#"><span class="avatar"><i class="fa fa-github"></i></span></a>
                    </div>
                </div>
            </div>
            <div class="item">
                <img alt="Bootstrap template" src="resources/banner2.jpg">
                <div class="carousel-caption">
                    
                </div>
            </div>
			 <div class="item">
                <img alt="Bootstrap template" src="resources/banner3.jpg">
                <div class="carousel-caption">
                    
                </div>
            </div>
        </div>
        <ul class="nav nav-pills nav-justified">
            <li data-target="#carousel1" data-slide-to="0" class="active">
                <a href="#">Style</a>
            </li>
            <li data-target="#carousel1" data-slide-to="1">
                <a href="#">Design</a>
            </li>
            <li data-target="#carousel1" data-slide-to="2">
                <a href="#">Class</a>
            </li>
			<li data-target="#carousel1" data-slide-to="3">
                <a href="#">Comfort</a>
            </li>

        </ul>
    </div>
</div>


	
	
	
	
	             <p style="margin-left:580px; color:#ffffff;">Car show room in Boston</p>
	<section><iframe width="500" height="300" src="https://www.youtube.com/embed/4aC9tUuRCrM"  style="margin-left : 150px; float:left; frameborder="0" allowfullscreen="" float:left;></iframe>
              <iframe width="500" height="300" src="https://www.youtube.com/embed/4fqAKeMEGfw" style="margin-left : 50px; float:left; frameborder="0" allowfullscreen="" float:left;></iframe>
                     
                      <a href="https://www.youtube.com/embed/XrlRy4r_b3U"  target="_blank" class="btn btn-1"></a> </section>
	                    





<div class="footer">
 <div class="container">
	
	
	<div class="socialize" style="float:left ; margin-top:20px">
              
               <div>
                  <a href="https://www.facebook.com/pranali.narkar"><img src="resources/fb.png" width="68" height="68" class="facebook" alt="fb" onmouseover=hover(this) onmouseout=unhover(this)></a>
                  <a href="#"><img src="resources/twitter.png" width="68" height="68" class="twitter" alt="twitter" onmouseover=hover(this) onmouseout=unhover(this)></a>
                  <a href="#"><img src="resources/youtube.png" width="68" height="69" class="youtube" alt="youtube" onmouseover=hover(this) onmouseout=unhover(this)></a>
                  <a href="#"><img src="resources/g+.png" width="68" height="68" class="google" alt="g+" onmouseover=hover(this) onmouseout=unhover(this)></a>
                  <a href="mailto:pranali.narkar017@gmail.com"><img src="resources/message.png" width="68" height="68" class="message" alt="message" onmouseover=hover(this) onmouseout=unhover(this)></a>
               </div>
               <!--end of social imgs-->
              
            </div>
	
	<div class="copy" style="float:left ; margin-top:70px; margin-left:320px">
		<p class="link" style="color:#ffffff;">&copy; All rights reserved | Design by&nbsp; <a href="#">PRANALI</a></p>
	</div>
 </div>
</div>




</body>
</html>