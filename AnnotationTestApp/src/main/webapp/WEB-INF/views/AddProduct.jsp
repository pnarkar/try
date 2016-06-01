

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form:form commandName="p" action="AddProduct.htm" method="post" enctype="multipart/form-data" >
<p>Product Description:<br>
<form:input type="text" name="productDescription" path="productDescription"/><form:errors path="productDescription"/>
<p>Product Name:<br>
<form:input type="text" name="productname" path="productname"/><form:errors path="productname"/>
<p>Product Price:<br>
<form:input type="number" name="productprice" path="productprice"/><form:errors path="productprice"/>
<p>Seller Quantity:<br>
<form:input type="text" name="sellerQuantity" path="sellerQuantity"/><form:errors path="sellerQuantity"/>
<p>Product Photo:<br>
<p><form:input type="file"  name="photo" path="photo"/> <form:errors path="photo"/>
<p>
                   <input type="submit" name="submit" value="AddProduct" />
                   <input type="hidden" name="action" value="AddProduct1" />
            </p>
            <p></p>
               
</form:form>

     
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
