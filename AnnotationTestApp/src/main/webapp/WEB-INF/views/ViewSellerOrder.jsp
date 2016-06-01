
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Car Dealer</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link href="resources/stylesheet.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="layout">
  <div id="titlebg">
    <div class="title">Top</div>
    <div class="title1">Gear</div>
    <div class="title2">WE HAVE</div>
    <div class="title3">THE BEST CARS</div>
   
  </div>
  
  <div id="gradientbg">
  
      
    <div>
<table border="1" cellpadding="5" cellspacing="5">
            <tr>
             
                <td><b>Quantity</b></td>
                <td><b>ProductId</b></td>
                <td><b> Price</b></td>
                <td><b>Shopping cart</b></td>
                <td><b>Total</b></td> 
                 
            </tr>
            <c:forEach var="adv" items="${cartitem}">
                <tr>
                
                    <td>${adv.quantity}</td>
                    <td>${adv.product.productID}</td>
                    <td>${adv.price}</td>
                    <td>${adv.shoppingcart}</td>
                    <td>${adv.total}</td>
                    
                </tr>
            </c:forEach>
            
            
        </table>
        <p><a href="loginuser.htm">Logout</a>
    </div>
    
  </div>
  <div id="bodypart">
    <div id="catalogue">
    <p></p>
      <div class="cat">CATALOGUE</div>
      <div id="cat1"></div>
      <div id="car1"></div>
      <div id="cat2"></div>
      <div id="car2"></div>
    </div>
    <div id="line"></div>
    <div id="ourservices">
      <div class="our">OUR SERVICES</div>
      <div id="pic1"></div>
      <div class="lorem">Lorem ipsum</div>
      <div class="txt">At vero eos et accusam sed diam nonumy eirmod Erat, sed diam voluptua. At vero eos et accusam At vero eos et accusam sed diam nonumy eirmod Erat, sed diam voluptua. At vero eos et accusam Consetetur sadi pscing </div>
    </div>
    <div id="line1"></div>
    <div id="aboutus">
      <div class="abt">ABOUT US</div>
      <div id="pic2"></div>
      <div class="lorem1">Lorem ipsum</div>
      <div class="txt1">At vero eos et accusam sed diam nonumy eirmod Erat, sed diam voluptua. At vero eos et accusam At vero eos et accusam sed diam nonumy eirmod Erat, sed diam voluptua. At vero eos et accusam Consetetur sadi pscing </div>
    </div>
  </div>
  <hr id="hrline1" />
  <div class="foottxt">Copyright &copy; Cars.  Design by <a href="http://www.dotcominfoway.com/" class="foottxt">DOT COM INFOWAY</a>.</div>
</div>
</body>
</html>
