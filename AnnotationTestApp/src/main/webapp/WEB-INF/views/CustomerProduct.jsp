

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
    <div class="title4" align="center"> Links: <a target="_blank" href="http://jigsaw.w3.org/css-validator/" class="title4">CSS VALIDATOR</a></div>
  </div>
 
  <div id="gradientbg">
  
      
    <div>

<table border="1" cellpadding="5" cellspacing="5">
            <tr>
                <td><b>Product Name</b></td>
                <td><b>Product Description</b></td>
                <td><b>Product Price</b></td>
                
                 <td><b>Seller Quantity</b></td>
                 <td><b>Product Image</b></td>
                <td><b> Additional Option</b>
            </tr>
            <c:forEach var="adv" items="${product}">
                <tr>
                    <td>${adv.productname}</td>
                    <td>${adv.productDescription}</td>
                    <td>${adv.productprice}</td>
                     <td>${adv.sellerQuantity}</td>
                    <td><img src="resources/${adv.photoName}"></td>
                    
                 
                   <td> <a href="addToCart.htm?productID=${adv.productID}&sellerQuantity=${adv.sellerQuantity}">Add to Cart</a></td>
                 
                </tr>
            </c:forEach>
        </table>
        
        <p><a href="loginuser.htm">Logout</a>
    </div>
    
  
</body>
</html>
