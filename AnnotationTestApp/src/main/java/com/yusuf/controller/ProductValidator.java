package com.yusuf.controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import com.yusuf.pojo.Product;
import com.yusuf.pojo.User;

public class ProductValidator implements Validator {
	public boolean supports(Class aClass)
    {
        return aClass.equals(Product.class);
    }
	 //private static final String IMAGE_PATTERN = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)";
	 String ID_PATTERN = "[0-9]+";
	 String STRING_PATTERN = "[a-zA-Z]+";
    public void validate(Object obj, Errors errors)
    {
    	
        Product p = (Product) obj;
       Pattern pattern = Pattern.compile( STRING_PATTERN);
//        String MOBILE_PATTERN = "[0-9]";  
       Matcher matcher;
      MultipartFile photo;
//       
        String b = p.getProductname();
        String r=   b.replaceAll("[^\\dA-Za-z ]","").replaceAll("\\s+","+").trim();
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "productname", "error.invalid.p", "Product Name Required");
       p.setProductname(r); 
        String a = p.getProductDescription();
        String q=   a.replaceAll("[^\\dA-Za-z ]","").replaceAll("\\s+","+").trim();
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "productDescription", "error.invalid.p", "Product Description Required");
        p.setProductDescription(q);  

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sellerQuantity", "error.invalid.p", "SellerQuantity Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "productprice", "error.invalid.p", " Enter Product Price properly "); 		   
       
        photo = p.getPhoto();
        //matcher = pattern.matcher(photo.getOriginalFilename());
        
        if(0 == photo.getSize()) {
           errors.rejectValue("photo","error.invalid.p","File is empty");
        }
//              if(!matcher.matches()) {
//             errors.rejectValue("photo","error.invalid.p","Invalid Image Format");
//        }
//        
        if(5000000 < photo.getSize()) {
             errors.rejectValue("photo","error.invalid.p","File size is over 5mb !");
        }
        
       	  
        
       
if (!(p.getProductname() != null && p.getProductname().isEmpty())) {  
	   pattern = Pattern.compile(STRING_PATTERN);  
	   matcher = pattern.matcher(p.getProductname());  
	   if (!matcher.matches()) {  
	    errors.rejectValue("productname", "name.containNonChar",  
	      "Enter a valid name");  
	   }  
	  }   
    
    if (p.getProductprice() != null) {  
 	   pattern = Pattern.compile(ID_PATTERN);  
 	   matcher = pattern.matcher(p.getProductprice().toString());  
 	   if (!matcher.matches()) {  
 	    errors.rejectValue("productprice", "productprice.incorrect",  
 	      "Enter a numeric value");  
 	   }  
 
}
   
 
        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "UserType", "error.invalid.user", "UserType Required");
       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email.emailId", "error.invalid.email.emailId", "Email Required");
    }
}